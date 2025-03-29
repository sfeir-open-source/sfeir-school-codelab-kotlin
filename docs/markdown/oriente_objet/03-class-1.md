# Classes et Héritage

En Kotlin, les classes sont déclarées avec le mot-clé class. 

Contrairement à Java, les classes sont final par défaut et l'héritage doit être explicitement autorisé avec le mot-clé open.


```kotlin

// Classe de base
open class Animal(val name: String) {
  open fun makeSound() = "..."
}

// Héritage
class Dog(name: String, val breed: String) : Animal(name) {
  override fun makeSound() = "Woof!"

  fun fetch() = "$name is fetching the ball!"
}

// Constructeur secondaire
class Cat : Animal {
  val lives: Int

  constructor(name: String, lives: Int = 9) : super(name) {
    this.lives = lives
  }

  override fun makeSound() = "Meow!"
}


```
