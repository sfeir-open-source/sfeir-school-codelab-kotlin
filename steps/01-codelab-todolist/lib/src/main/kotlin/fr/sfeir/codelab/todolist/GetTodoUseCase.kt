package fr.sfeir.codelab.todolist

import fr.sfeir.codelab.todolist.driven.AllTodoList
import fr.sfeir.codelab.todolist.driving.GetTodo
import fr.sfeir.codelab.todolist.driving.GetTodo.GetQuery
import fr.sfeir.codelab.todolist.driving.GetTodo.GetTodoResult
import fr.sfeir.codelab.todolist.driving.GetTodo.GetTodoResult.UserDoesNotExist

class GetTodoUseCase(
  private val todoList: AllTodoList
) : GetTodo {

  override fun get(query: GetQuery): GetTodoResult {
    val result = todoList.getAllOf(query.userId) ?: return UserDoesNotExist
    return result.firstOrNull { it.id == query.todoId }?.let {
      GetTodoResult.Success(it)
    } ?: GetTodoResult.TodoDoesNotExist
  }

}
