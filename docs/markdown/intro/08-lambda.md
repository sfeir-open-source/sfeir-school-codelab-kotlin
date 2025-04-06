# Expressions Lambda

Kotlin offre un support puissant pour la programmation fonctionnelle.


```kotlin
// Lambda basique
val sum = { a: Int, b: Int -> a + b }
println(sum(5, 3)) // 8

// Avec collections
val numbers = listOf(1, 2, 3, 4, 5)
val doubled = numbers.map { it * 2 }
val sum = numbers.reduce { acc, i -> acc + i }

// Référence de fonction
val isEven: (Int) -> Boolean = { it % 2 == 0 }
val evenNumbers = numbers.filter(isEven)


```
