# Coroutines

Les coroutines permettent de gérer l'asynchronicité de manière séquentielle.


```kotlin
import kotlinx.coroutines.*

fun main() = runBlocking {
  // Lance une coroutine
  launch {
    delay(1000L)
    println("World!")
  }

  println("Hello,")
  delay(2000L)
}

// Fonctions suspendues
suspend fun fetchData(): String {
  delay(1000L) // Ne bloque pas le thread
  return "Data"
}

// Parallélisme
val result1 = async { fetchData() }
val result2 = async { fetchData() }
println("Results: ${result1.await()} and ${result2.await()}")
```
