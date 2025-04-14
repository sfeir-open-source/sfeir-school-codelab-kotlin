# 'Object'

En Kotlin, le mot-clé object permet de créer facilement des singletons, des objets anonymes et des objets compagnons.



```kotlin
// Déclaration d'un singleton
object UserManager {
  private val users = mutableListOf<User>()

  fun addUser(user: User) = users.add(user)
  fun getUsers() = users.toList()
  fun clearUsers() = users.clear()
}

// Utilisation directe sans instanciation
UserManager.addUser(User("Alice"))


```
