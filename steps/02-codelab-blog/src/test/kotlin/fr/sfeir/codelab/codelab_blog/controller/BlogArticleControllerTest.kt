package fr.sfeir.codelab.codelab_blog.controller

import com.fasterxml.jackson.databind.ObjectMapper
import fr.sfeir.codelab.codelab_blog.model.CreateBlogArticleRequest
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.http.MediaType
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status

@SpringBootTest
@AutoConfigureMockMvc
class BlogArticleControllerTest {

    @Autowired
    private lateinit var mockMvc: MockMvc

    @Autowired
    private lateinit var objectMapper: ObjectMapper

    @Test
    fun `should create a blog article`() {
        // Given
        val request = CreateBlogArticleRequest(
            title = "Test Article",
            content = "This is a test article content",
            author = "Test Author"
        )

        // When & Then
        mockMvc.perform(
            post("/api/articles")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(request))
        )
            .andExpect(status().isCreated)
            .andExpect(jsonPath("$.title").value(request.title))
            .andExpect(jsonPath("$.content").value(request.content))
            .andExpect(jsonPath("$.author").value(request.author))
            .andExpect(jsonPath("$.id").exists())
            .andExpect(jsonPath("$.createdAt").exists())
    }
}
