# Function

Les fonctions en Kotlin sont déclarées avec le mot-clé fun.

```kotlin

// Fonction simple
fun hello(name: String): String {
  return "Hello, $name!"
}

// Fonction avec expression unique
fun hello(name: String) = "Hello, $name!"

// Paramètres par défaut
fun greet(name: String, greeting: String = "Hello") = "$greeting, $name!"

// Appel avec paramètres nommés
greet(greeting = "Hi", name = "John") // "Hi, John!"


```
