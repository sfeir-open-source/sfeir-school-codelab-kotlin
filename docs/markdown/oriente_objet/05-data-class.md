# Les Data Classes en Kotlin

Les data classes sont conçues pour contenir des données sans logique complexe. Elles offrent automatiquement plusieurs fonctionnalités utiles.

Les data classes sont l'un des outils les plus pratiques de Kotlin, réduisant considérablement le code boilerplate par rapport aux classes Java équivalentes.

```kotlin
// Déclaration simple
data class User(val name: String, val email: String, var age: Int = 0)

// Création d'instance
val user = User("Alice", "alice@example.com", 30)


```

#### Fonctionnalités Automatiques
Avec une seule ligne de code, Kotlin génère automatiquement :
- Méthodes equals() et hashCode() basées sur les propriétés
- Méthode toString() formatée ("User(name=Alice, email=alice@example.com, age=30)")
- Méthode copy() pour créer des copies modifiées
- Fonctions componentN() pour la décomposition

#### Restrictions et Bonnes Pratiques

Les data classes ont quelques restrictions :
- Doivent avoir au moins un paramètre dans le constructeur primaire
- Les paramètres doivent être marqués val ou var
- Ne peuvent pas être abstract, open, sealed ou inner
