package fr.sfeir.codelab.todolist

import fr.sfeir.codelab.todolist.driven.AllTodoList
import fr.sfeir.codelab.todolist.driving.AddTodo
import fr.sfeir.codelab.todolist.driving.AddTodo.AddCommand
import fr.sfeir.codelab.todolist.driving.AddTodo.AddTodoResult
import fr.sfeir.codelab.todolist.driving.AddTodo.AddTodoResult.AlreadyExists
import fr.sfeir.codelab.todolist.driving.AddTodo.AddTodoResult.Success

class AddTodoUseCase(
  private val todoList: AllTodoList
) : AddTodo {
  override fun add(command: AddCommand): AddTodoResult {
    val todos = todoList.getAllOf(command.userId)
    return when {
      (todos != null && todos.any { it.id == command.todo.id }) -> {
        AlreadyExists
      }

      else -> {
        with(todoList) {
          command.userId add command.todo
        }
        Success
      }
    }
  }
}
