# Scope functions (let, also, apply, run, with)

Let et Also

Ces fonctions utilisent l'objet comme argument (it) et diffèrent par leur valeur de retour.

```kotlin
// let: transforme l'objet (retourne le résultat du lambda)
val nameLength = person.let {
  println("Name length calculation")
  it.name.length
} // retourne un Int

// also: actions supplémentaires sur l'objet (retourne l'objet lui-même)
val samePerson = person.also {
  println("Logging: $it")
  saveToDatabase(it)
} // retourne person

```
