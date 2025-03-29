# le "When" en Kotlin

En Kotlin, il n'existe pas de structure switch comme en Java. Elle est remplacée par l'expression when, plus puissante et flexible.


```kotlin

// Équivalent Java:
// switch(day) {
//   case "Monday": return "Début de semaine";
//   case "Friday": return "Fin de semaine";
//   default: return "Milieu de semaine";
// }

val result = when (day) {
  "Monday" -> "Début de semaine"
  "Friday" -> "Fin de semaine"
  else -> "Milieu de semaine"
}


```
