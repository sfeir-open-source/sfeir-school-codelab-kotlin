package fr.sfeir.codelab.codelab_blog.service

import fr.sfeir.codelab.codelab_blog.model.BlogArticle
import fr.sfeir.codelab.codelab_blog.model.CreateBlogArticleRequest
import fr.sfeir.codelab.codelab_blog.model.UpdateBlogArticleRequest
import org.springframework.stereotype.Service
import java.time.LocalDateTime
import java.util.UUID
import java.util.concurrent.ConcurrentHashMap

@Service
class BlogArticleService {
    private val articles = ConcurrentHashMap<UUID, BlogArticle>()

    fun getAllArticles(): List<BlogArticle> {
        return articles.values.toList()
    }

    fun getArticleById(id: UUID): BlogArticle? {
        return articles[id]
    }

    fun createArticle(request: CreateBlogArticleRequest): BlogArticle {
        val article = BlogArticle(
            title = request.title,
            content = request.content,
            author = request.author
        )
        articles[article.id] = article
        return article
    }

    fun updateArticle(id: UUID, request: UpdateBlogArticleRequest): BlogArticle? {
        val existingArticle = articles[id] ?: return null

        val updatedArticle = existingArticle.copy(
            title = request.title ?: existingArticle.title,
            content = request.content ?: existingArticle.content,
            updatedAt = LocalDateTime.now()
        )

        articles[id] = updatedArticle
        return updatedArticle
    }

    fun deleteArticle(id: UUID): Boolean {
        return articles.remove(id) != null
    }
}
