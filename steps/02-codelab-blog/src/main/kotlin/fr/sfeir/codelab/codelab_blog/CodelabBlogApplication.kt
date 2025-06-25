package fr.sfeir.codelab.codelab_blog

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CodelabBlogApplication

fun main(args: Array<String>) {
	runApplication<CodelabBlogApplication>(*args)
}
