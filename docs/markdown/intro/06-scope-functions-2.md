# Scope functions (let, also, apply, run, with)

Run et Apply

Ces fonctions utilisent l'objet comme récepteur (this) et diffèrent par leur valeur de retour.

```kotlin
// run: exécute des opérations sur l'objet (retourne le résultat du lambda)
val isAdult = person.run {
  name = "Alice" // this est implicite
  age = 30
  age >= 18 // dernière expression = valeur de retour
} // retourne un Boolean

// apply: configure l'objet (retourne l'objet lui-même)
val configuredPerson = person.apply {
  name = "Bob"
  age = 25
} // retourne person modifié

```
