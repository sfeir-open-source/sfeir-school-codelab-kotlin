package fr.sfeir.codelab.todolist.model

import java.util.*

@JvmInline
value class UserId(val id: String) {
  init {
    require(id.isNotBlank()) { "UserId cannot be blank" }
  }

  companion object {
    fun String.toUserId() = UserId(this)
    fun random() = UUID.randomUUID().toString()
  }

  override fun toString() = id
}
