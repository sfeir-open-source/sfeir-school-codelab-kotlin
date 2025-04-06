package fr.sfeir.codelab.todolist

import fr.sfeir.codelab.todolist.driven.AllTodoList
import fr.sfeir.codelab.todolist.model.Todo
import fr.sfeir.codelab.todolist.model.TodoId
import fr.sfeir.codelab.todolist.model.UserId

class InMemoryTodoList : AllTodoList {

  private val todoList = mutableMapOf<UserId, List<Todo>>()

  override fun UserId.add(todo: Todo) {
    val todos = todoList[this] ?: emptyList()
    todoList[this] = todos + todo
  }

  override fun getBy(userId: UserId, todoId: TodoId): Todo? = todoList[userId]?.find { it.id == todoId }

}
