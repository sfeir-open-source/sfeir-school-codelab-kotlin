# Objets Anonymes

Les objets anonymes permettent d'implémenter des interfaces à la volée.

```kotlin
val clickListener = object : OnClickListener {
  override fun onClick(view: View) {
    // Traitement du clic
  }

  // Peut contenir des propriétés et méthodes supplémentaires
  val clickCount = 0
  fun logClick() = println("Clicked!")
}

// Expressions d'objets pour des interfaces simples
button.setOnClickListener { view -> /* code */ }


```

Les objects sont un concept puissant en Kotlin qui simplifie la création de patterns comme le singleton et offre une alternative élégante aux méthodes statiques de Java.

