package fr.sfeir.codelab.codelab_blog.controller

import fr.sfeir.codelab.codelab_blog.service.Article
import fr.sfeir.codelab.codelab_blog.service.BlogArticleService
import fr.sfeir.codelab.codelab_blog.service.CreateResponse
import fr.sfeir.codelab.codelab_blog.service.DeleteResponse
import org.springframework.http.ResponseEntity
import org.springframework.http.ResponseEntity.created
import org.springframework.http.ResponseEntity.ok
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.net.URI
import java.util.*

@RestController
@RequestMapping("/api/articles")
class BlogArticleController(
  private val blogArticleService: BlogArticleService,
) {

  @GetMapping
  fun getAllArticles(): ResponseEntity<List<RestArticle>> = ok(blogArticleService.all().toRest())

  @PostMapping
  fun createArticle(@RequestBody article: RestArticle): ResponseEntity<Any> {
    return when(val result = blogArticleService.create(article.toDomain())){
      is CreateResponse.AlreadyExist -> ok(result.message)
      CreateResponse.Created -> created(URI.create("/api/articles/${article.id}")).body(article)
    }
  }

  @DeleteMapping
  fun deleteArticle(@RequestBody article: RestArticle): ResponseEntity<RestArticle> {
    return when(blogArticleService.delete(article.id)){
      DeleteResponse.Deleted -> ResponseEntity.ok().build<RestArticle>()
      is DeleteResponse.Unknown -> ResponseEntity.notFound().build<RestArticle>()
    }
  }
}

private fun RestArticle.toDomain(): Article = Article(
  id = id,
  title = title,
  description = description,
)

private fun List<Article>.toRest(): List<RestArticle> = map { it.toRest() }

private fun Article.toRest(): RestArticle = RestArticle(
  id = id,
  title = title,
  description = description,
)

data class RestArticle(
  val id: UUID,
  val title: String,
  val description: String,
)
