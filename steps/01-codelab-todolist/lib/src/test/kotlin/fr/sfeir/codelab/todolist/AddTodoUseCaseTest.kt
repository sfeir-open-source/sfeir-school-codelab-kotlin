package fr.sfeir.codelab.todolist

import fr.sfeir.codelab.todolist.driving.AddTodo.AddCommand.Companion.toAddCommand
import fr.sfeir.codelab.todolist.driving.AddTodo.AddTodoResult.Success
import fr.sfeir.codelab.todolist.model.State
import fr.sfeir.codelab.todolist.model.Todo
import fr.sfeir.codelab.todolist.model.TodoId.Companion.toTodoId
import fr.sfeir.codelab.todolist.model.UserId.Companion.toUserId
import io.kotest.matchers.shouldBe
import io.kotest.matchers.types.shouldBeInstanceOf
import kotlin.test.Test

class AddTodoUseCaseTest {

  val inMemoryTodoList = InMemoryTodoList()
  val useCase = AddTodoUseCase(inMemoryTodoList)

  @Test
  fun `should add a new todo to an unknown user`() {
    val result = useCase.add(
      ("1".toUserId() to Todo(
        id = "1".toTodoId(),
        title = "title",
        description = "description",
        state = State.TODO,
      )).toAddCommand()
    )
    result.shouldBeInstanceOf<Success>()
    inMemoryTodoList.getBy("1".toUserId(), "1".toTodoId()).shouldBeInstanceOf<Todo>()
  }

  @Test
  fun `should add a new todo to an existing user`() {
    Todo(
      id = "1".toTodoId(),
      title = "title",
      description = "description",
      state = State.TODO,
    ).also {
      with(inMemoryTodoList) { "1".toUserId() add it }
    }

    val newTodo = Todo(
      id = "2".toTodoId(),
      title = "title2",
      description = "description2",
      state = State.TODO,
    )

    val result = useCase.add(("1".toUserId() to newTodo).toAddCommand())

    result.shouldBeInstanceOf<Success>()
    inMemoryTodoList.getBy("1".toUserId(), "1".toTodoId()).shouldBeInstanceOf<Todo>()
  }

  @Test
  fun `can't add an existing todo`() {
    Todo(
      id = "1".toTodoId(),
      title = "title",
      description = "description",
      state = State.TODO,
    ).also {
      with(inMemoryTodoList) { "1".toUserId() add it }
    }

    val result = useCase.add(
      ("1".toUserId() to
        Todo(
          id = "1".toTodoId(),
          title = "title",
          description = "description",
          state = State.TODO,
        )).toAddCommand()
    )

    result.shouldBeInstanceOf<Success>()
    inMemoryTodoList.getBy("1".toUserId(), "1".toTodoId())?.let {
      it.title shouldBe "title"
      it.description shouldBe "description"
      it.state shouldBe State.TODO
    } ?: run {
      throw AssertionError("Todo not found")
    }
  }

}
