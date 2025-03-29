# Smart cast

Kotlin effectue des conversions intelligentes après vérification du type.


```kotlin
fun demo(x: Any) {
  if (x is String) {
    // x est automatiquement casté en String
    print(x.length) // Pas besoin de (String)x comme en Java
  }
}

```
