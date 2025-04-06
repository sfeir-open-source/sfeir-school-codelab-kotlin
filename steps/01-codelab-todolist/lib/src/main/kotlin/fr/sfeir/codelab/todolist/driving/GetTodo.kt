package fr.sfeir.codelab.todolist.driving

import fr.sfeir.codelab.todolist.model.Todo
import fr.sfeir.codelab.todolist.model.TodoId
import fr.sfeir.codelab.todolist.model.UserId

interface GetTodo {
  fun get(query: GetQuery): GetTodoResult

  data class GetQuery(
    val userId: UserId,
    val todoId: TodoId
  ) {
    companion object {
      fun Pair<UserId, TodoId>.toGetQuery() = GetQuery(first, second)
    }
  }

  interface GetTodoResult {
    class Success(val todo: Todo) : GetTodoResult
    object UserDoesNotExist : GetTodoResult
    object TodoDoesNotExist : GetTodoResult
  }
}
