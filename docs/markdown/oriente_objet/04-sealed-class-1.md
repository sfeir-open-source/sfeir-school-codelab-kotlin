# Sealed Classes (1/2)

Les sealed classes représentent des hiérarchies de classes restreintes où toutes les sous-classes doivent être définies 
dans le même fichier que la classe scellée. 

Elles sont parfaites pour représenter des états ou des types limités.

```kotlin

sealed class Result {
  data class Success(val data: Any) : Result()
  data class Error(val message: String, val exception: Exception? = null) : Result()
  object Loading : Result()
  object Empty : Result()
}

```
