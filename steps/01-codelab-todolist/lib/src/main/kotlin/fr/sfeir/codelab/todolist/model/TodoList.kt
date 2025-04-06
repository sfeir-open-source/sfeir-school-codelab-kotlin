package fr.sfeir.codelab.todolist.model

import fr.sfeir.codelab.todolist.model.State.TODO
import java.util.*

@JvmInline
value class TodoId(val id: String) {
  init {
    require(id.isNotBlank()) { "TodoId cannot be blank" }
  }

  companion object {
    fun String.toTodoId() = TodoId(this)
    fun random() = UUID.randomUUID().toString()
  }

  override fun toString() = id
}

data class Todo(
  val id: TodoId,
  val title: String,
  val description: String,
  val state: State = TODO, // maybe use State pattern
) {
  // TODO
}

enum class State {
  TODO,
  IN_PROGRESS,
  DONE
}
