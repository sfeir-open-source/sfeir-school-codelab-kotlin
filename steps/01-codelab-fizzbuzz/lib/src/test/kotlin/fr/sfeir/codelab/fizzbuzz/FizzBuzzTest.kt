package fr.sfeir.codelab.fizzbuzz

import io.kotest.matchers.shouldBe
import kotlin.test.Test

class FizzBuzzTest {

  @Test
  fun `when giving 2 to FizzBuzz, compute() should return 1, 2`() {
    val fizzBuzz = FizzBuzz()
    fizzBuzz.compute(2) shouldBe listOf("1", "2")
  }
/*
  @Test
  fun `when giving 3 to FizzBuzz, compute() should return 1, 2, Fizz`() {
    val fizzBuzz = FizzBuzz()
    fizzBuzz.compute(3) shouldBe listOf("1", "2", "Fizz")
  }

  @Test
  fun `when giving 4 to FizzBuzz then `() {
    val fizzBuzz = FizzBuzz()
    fizzBuzz.compute(4) shouldBe listOf("1", "2", "Fizz", "4")
  }

  @Test
  fun `when giving 5 to FizzBuzz then `() {
    val fizzBuzz = FizzBuzz()
    fizzBuzz.compute(5) shouldBe listOf("1", "2", "Fizz", "4", "Buzz")
  }

  @Test
  fun `when giving 15 to FizzBuzz then `() {
    val fizzBuzz = FizzBuzz()
    fizzBuzz.compute(15) shouldBe listOf("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz")
  }
*/
}
