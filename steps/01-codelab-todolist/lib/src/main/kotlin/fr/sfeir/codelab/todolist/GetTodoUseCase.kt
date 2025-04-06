package fr.sfeir.codelab.todolist

import fr.sfeir.codelab.todolist.driven.AllTodoList
import fr.sfeir.codelab.todolist.driving.GetTodo
import fr.sfeir.codelab.todolist.driving.GetTodo.GetQuery
import fr.sfeir.codelab.todolist.driving.GetTodo.GetTodoResult

class GetTodoUseCase(
  private val todoList: AllTodoList
) : GetTodo {

  override fun get(query: GetQuery): GetTodoResult {
    TODO("Not yet implemented")
  }

}
