package fr.sfeir.codelab.codelab_blog.repository

import fr.sfeir.codelab.codelab_blog.service.Article
import org.springframework.stereotype.Repository
import java.util.UUID

@Repository
class ArticleRepositoryInMemory {
  val state: MutableMap<UUID, Article> = mutableMapOf()

  fun all(): List<Article> = state.map { it.value }

  fun add(article: Article) {
    state.put(article.id, article)
  }

  fun exist(id: UUID): Boolean {return state.contains(id)}
  fun delete(id: UUID) {
    state.remove(id)
  }

}
