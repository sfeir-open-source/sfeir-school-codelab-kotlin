package fr.sfeir.codelab.codelab_blog.model

import java.time.LocalDateTime
import java.util.UUID

data class BlogArticle(
    val id: UUID = UUID.randomUUID(),
    val title: String,
    val content: String,
    val author: String,
    val createdAt: LocalDateTime = LocalDateTime.now(),
    val updatedAt: LocalDateTime? = null
)

data class CreateBlogArticleRequest(
    val title: String,
    val content: String,
    val author: String
)

data class UpdateBlogArticleRequest(
    val title: String? = null,
    val content: String? = null
)
