package fr.sfeir.codelab.todolist

import fr.sfeir.codelab.todolist.driven.AllTodoList
import fr.sfeir.codelab.todolist.driving.AddTodo
import fr.sfeir.codelab.todolist.driving.AddTodo.AddTodoResult
import fr.sfeir.codelab.todolist.driving.AddTodo.AddCommand

class AddTodoUseCase(
  private val todoList: AllTodoList
) : AddTodo {
  override fun add(command: AddCommand): AddTodoResult {
    TODO("Not yet implemented")
  }
}
