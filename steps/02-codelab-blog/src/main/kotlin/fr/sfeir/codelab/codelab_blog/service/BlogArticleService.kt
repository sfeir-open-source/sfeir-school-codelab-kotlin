package fr.sfeir.codelab.codelab_blog.service

import fr.sfeir.codelab.codelab_blog.controller.RestArticle
import fr.sfeir.codelab.codelab_blog.repository.ArticleRepositoryInMemory
import org.springframework.stereotype.Service
import java.util.UUID

@Service
class BlogArticleService(
  val allArticles: ArticleRepositoryInMemory,
) {

  fun all(): List<Article> = allArticles.all()
  fun create(article: Article): CreateResponse {
    return if (!allArticles.exist(article.id)) {
      allArticles.add(article)
        .let { CreateResponse.Created }
    }
    else CreateResponse.AlreadyExist("UID known")
  }

  fun delete(id: UUID): DeleteResponse {
    return if(allArticles.exist(id)){
      allArticles.delete(id)
      DeleteResponse.Deleted
    }else DeleteResponse.Unknown("Unknown UID")
  }
}

sealed interface CreateResponse {
  data class AlreadyExist(
    val message: String
  ): CreateResponse

  object Created : CreateResponse
}

sealed interface DeleteResponse {
  data class Unknown(
    val message: String
  ): DeleteResponse

  object Deleted : DeleteResponse
}

data class Article(
  val id: UUID,
  val title: String,
  val description: String,
)
