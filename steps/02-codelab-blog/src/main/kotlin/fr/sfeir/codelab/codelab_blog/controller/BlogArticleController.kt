package fr.sfeir.codelab.codelab_blog.controller

import fr.sfeir.codelab.codelab_blog.model.BlogArticle
import fr.sfeir.codelab.codelab_blog.model.CreateBlogArticleRequest
import fr.sfeir.codelab.codelab_blog.model.UpdateBlogArticleRequest
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
        return ResponseEntity.ok(blogArticleService.getAllArticles())
    }

    @GetMapping("/{id}")
    fun getArticleById(@PathVariable id: UUID): ResponseEntity<BlogArticle> {
        val article = blogArticleService.getArticleById(id)
        return if (article != null) {
            ResponseEntity.ok(article)
        } else {
            ResponseEntity.notFound().build()
        }
    }

    @PostMapping
    fun createArticle(@RequestBody request: CreateBlogArticleRequest): ResponseEntity<BlogArticle> {
        val createdArticle = blogArticleService.createArticle(request)
        return ResponseEntity.status(HttpStatus.CREATED).body(createdArticle)
    }

    @PutMapping("/{id}")
    fun updateArticle(
        @PathVariable id: UUID,
        @RequestBody request: UpdateBlogArticleRequest
    ): ResponseEntity<BlogArticle> {
        val updatedArticle = blogArticleService.updateArticle(id, request)
        return if (updatedArticle != null) {
            ResponseEntity.ok(updatedArticle)
        } else {
            ResponseEntity.notFound().build()
        }
    }

    @DeleteMapping("/{id}")
    fun deleteArticle(@PathVariable id: UUID): ResponseEntity<Unit> {
        val deleted = blogArticleService.deleteArticle(id)
        return if (deleted) {
            ResponseEntity.noContent().build()
        } else {
            ResponseEntity.notFound().build()
        }
    }
}
