package fr.sfeir.codelab.codelab_blog.controller

import fr.sfeir.codelab.codelab_blog.model.BlogArticle
import fr.sfeir.codelab.codelab_blog.model.CreateBlogArticleRequest
import fr.sfeir.codelab.codelab_blog.service.BlogArticleService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.util.UUID

@RestController
@RequestMapping("/api/articles")
class BlogArticleController(private val blogArticleService: BlogArticleService) {

  @GetMapping
  fun getAllArticles(): ResponseEntity<List<BlogArticle>> {
    TODO()
  }
}
