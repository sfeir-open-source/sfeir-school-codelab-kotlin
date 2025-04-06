package fr.sfeir.codelab.todolist

import fr.sfeir.codelab.todolist.driving.GetTodo.GetQuery.Companion.toGetQuery
import fr.sfeir.codelab.todolist.driving.GetTodo.GetTodoResult.Success
import fr.sfeir.codelab.todolist.driving.GetTodo.GetTodoResult.TodoDoesNotExist
import fr.sfeir.codelab.todolist.driving.GetTodo.GetTodoResult.UserDoesNotExist
import fr.sfeir.codelab.todolist.model.State
import fr.sfeir.codelab.todolist.model.Todo
import fr.sfeir.codelab.todolist.model.TodoId.Companion.toTodoId
import fr.sfeir.codelab.todolist.model.UserId.Companion.toUserId
import io.kotest.matchers.shouldBe
import io.kotest.matchers.types.shouldBeInstanceOf
import kotlin.test.Test

class GetTodoUseCaseTest {
  val inMemoryTodoList = InMemoryTodoList()
  val useCase = GetTodoUseCase(inMemoryTodoList)

  @Test
  fun `get an existing todo`() {
    Todo(
      id = "1".toTodoId(),
      title = "title",
      description = "description",
      state = State.TODO,
    ).also {
      with(inMemoryTodoList) { "1".toUserId() add it }
    }

    val result = useCase.get(("1".toUserId() to "1".toTodoId()).toGetQuery())
    result.shouldBeInstanceOf<Success>()
    result.todo.title shouldBe "title"
  }

  @Test
  fun `can't get an unknown user`() {
    val result = useCase.get(("1".toUserId() to "1".toTodoId()).toGetQuery())
    result.shouldBeInstanceOf<UserDoesNotExist>()
  }

  @Test
  fun `can't get an unknown todo of an existing user`() {
    Todo(
      id = "1".toTodoId(),
      title = "title",
      description = "description",
      state = State.TODO,
    ).also {
      with(inMemoryTodoList) { "1".toUserId() add it }
    }

    val result = useCase.get(("1".toUserId() to "2".toTodoId()).toGetQuery())
    result.shouldBeInstanceOf<TodoDoesNotExist>()
  }

}
