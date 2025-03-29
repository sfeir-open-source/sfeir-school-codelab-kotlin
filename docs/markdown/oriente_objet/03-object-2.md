# Object Companion

Les objets compagnons permettent d'ajouter des méthodes statiques et des factory methods à une classe.


```kotlin

class User(val name: String) {
  companion object {
    private var counter = 0

    fun createAnonymous(): User {
      counter++
      return User("Anonymous$counter")
    }

    const val MAX_NAME_LENGTH = 50
  }

  init {
    require(name.length <= MAX_NAME_LENGTH) { "Name too long" }
  }
}

// Utilisation
val anonymous = User.createAnonymous()
val maxLength = User.MAX_NAME_LENGTH


```
