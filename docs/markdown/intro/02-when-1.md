# le "When" en Kotlin

En Kotlin, il n'existe pas de structure switch comme en Java. Elle est remplacée par l'expression when


```kotlin

val result = when (day) { //fonctionne avec l'inférence de type
  "Monday" -> "Début de semaine"
  "Friday" -> "Fin de semaine"
  else -> "Milieu de semaine"
}

// ou aussi 
val result = when { // boolean only
  day == "Monday" -> "Début de semaine"
  day == "Friday" -> "Fin de semaine"
  else -> "Milieu de semaine"
}
```
