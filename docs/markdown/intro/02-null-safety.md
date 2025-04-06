# Null Safety

Kotlin introduit une gestion des nulls en toute sécurité, éliminant ainsi les NullPointerException courantes en Java.

Les types de données peuvent être non-nullables par défaut, et vous devez explicitement indiquer si une variable peut être nulle.

```kotlin

fun main() {
  var name: String = "Kotlin"
    // name = null // Compilation error

  var nullableName: String? = "Kotlin"
  nullableName = null // No compilation error, code is safe but this a code smell. 
    // Use it only if you need it (like Optionnal in Java)

  val length = nullableName?.length ?: 0 // Safe call operator & Elvis operator
  val length2 = nullableName!!.length // Not safe, throws NullPointerException if nullableName is null
    // bang bang operator is a code smell...
  
}

```
