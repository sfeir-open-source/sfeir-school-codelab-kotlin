# Classes et Propriétés

Les classes Kotlin sont concises.


```kotlin
// Classe avec constructeur primaire
class Person(
  val firstName: String, 
  var age: Int
) {
  // Propriété avec accesseur personnalisé
  val isAdult: Boolean get() = age >= 18

  // Initialisation
  init {
    println("Personne créée: $firstName")
  }

  // Méthode
  fun introduce() = "Je m'appelle $firstName et j'ai $age ans"
}

// Utilisation
val person = Person("Alice", 30)
println(person.firstName) // Getter implicite
person.age = 31 // Setter implicite car age est une 'var


```
