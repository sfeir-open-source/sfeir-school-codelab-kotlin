# Collections

Kotlin distingue les collections mutables et immutables.


```kotlin
// Collections immutables
val numbers = listOf(1, 2, 3)
val map = mapOf("a" to 1, "b" to 2)

// Collections mutables
val mutableList = mutableListOf(1, 2, 3)
mutableList.add(4)

// Opérations fonctionnelles
val doubled = numbers.map { it * 2 }
val filtered = numbers.filter { it > 2 }
val grouped = numbers.groupBy { it % 2 == 0 }

// Extensions utiles
val sum = numbers.sum()
val joined = listOf("a", "b", "c").joinToString(", ")

```
