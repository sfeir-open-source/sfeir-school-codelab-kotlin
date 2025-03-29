# Avantages par rapport au Switch de Java

- C'est une expression qui retourne une valeur
- Pas besoin de break pour éviter la cascade d'exécution
- Peut tester des conditions complexes, pas seulement l'égalité
- Vérification d'exhaustivité avec les types scellés


```kotlin
// Regroupement de cas
when (number) {
  1, 2, 3 -> "Petit nombre"
  in 4..10 -> "Nombre moyen"
  !in 100..999 -> "Pas un nombre à 3 chiffres"
  else -> "Grand nombre"
}

// Vérification de type
when (obj) {
  is String -> obj.length  // Smart cast automatique
  is List<*> -> obj.size
  else -> -1
}


```

Le when de Kotlin représente une évolution majeure du concept de switch, offrant plus de sécurité et d'expressivité.

