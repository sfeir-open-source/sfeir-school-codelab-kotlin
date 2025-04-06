package fr.sfeir.codelab.todolist.driven

import fr.sfeir.codelab.todolist.model.Todo
import fr.sfeir.codelab.todolist.model.TodoId
import fr.sfeir.codelab.todolist.model.UserId

interface AllTodoList {
  infix fun UserId.add(todo: Todo)
  fun getBy(userId: UserId, todoId: TodoId): Todo?
}
