# Extensions de fonctions

Kotlin permet d'étendre des classes existantes sans héritage.


```kotlin

// Ajouter une méthode à String
fun String.addExclamation(): String = "$this!"

// Utilisation
val message = "Hello".addExclamation() // "Hello!"

// Très utile avec les classes Java existantes
fun java.util.Date.isFuture(): Boolean {
  return this.time > System.currentTimeMillis()
}


```
