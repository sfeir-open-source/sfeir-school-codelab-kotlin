# Interopérabilité avec Java

Kotlin est entièrement interopérable avec Java. 

Vous pouvez appeler du code Java depuis Kotlin et vice versa. 

Cela permet une transition en douceur pour les projets existants en Java.

```kotlin

// Kotlin code calling Java code
import java.util.ArrayList

fun main() {
  val list = ArrayList<String>()
  list.add("Kotlin")
  list.add("Java")
  println(list)
}

// Utilisation d'une classe Java depuis Kotlin
val date = java.util.Date()
val calendar = java.util.Calendar.getInstance()

// Annotations pour l'interopérabilité
@JvmName("calculateTotal")
fun calculate(items: List<Item>): Double {
  // ...
}

// Propriétés statiques pour Java
class Config {
  companion object {
    @JvmStatic val API_URL = "https://api.example.com"
  }
}

```
