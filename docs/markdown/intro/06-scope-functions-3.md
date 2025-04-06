# Scope functions (let, also, apply, run, with)

With

Similaire à run mais avec une syntaxe différente.

```kotlin
// with: opérations sur un objet sans chaînage (retourne le résultat du lambda)
val result = with(person) {
  println("$name is $age years old")
  age * 2 // valeur de retour
} // retourne un Int

```
