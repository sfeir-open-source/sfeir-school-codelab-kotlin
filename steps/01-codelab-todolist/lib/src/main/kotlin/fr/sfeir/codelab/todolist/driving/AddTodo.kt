package fr.sfeir.codelab.todolist.driving

import fr.sfeir.codelab.todolist.model.Todo
import fr.sfeir.codelab.todolist.model.UserId

interface AddTodo {
  fun add(command: AddCommand): AddTodoResult

  data class AddCommand(
    val userId: UserId,
    val todo: Todo
  ) {
    companion object {
      fun Pair<UserId, Todo>.toAddCommand() = AddCommand(first, second)
    }
  }

  interface AddTodoResult {
    object Success : AddTodoResult
    object AlreadyExists : AddTodoResult
  }
}
