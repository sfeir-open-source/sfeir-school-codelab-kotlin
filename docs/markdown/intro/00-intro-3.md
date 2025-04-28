# Hello World


```kotlin

fun main() { // pas de type pour main (inférence de type), Ici `Unit`
  val name = "Kotlin" // pas de type pour name (inférence de type)
  println("Hello, $name!") // string interpolation
}

```

- Pas de `new`
- Pas besoin de déclarer le type (inférence de type) (methode, variable, parametre, etc.)
- Pas de point-virgule


```java

public class Main { // En Java, le point d'entrée principal doit être dans une classe
    public static void main(String[] args) { // Signature standard de la méthode main en Java (public static void, prend un tableau de String)
        final String name = "Java"; // Déclaration explicite du type (String) et utilisation de 'final' pour simuler l'immutabilité de 'val'
        System.out.println("Hello, " + name + "!"); // Concaténation de chaînes car Java ne supporte pas directement l'interpolation $variable dans les littéraux de chaîne standard (avant les Text Blocks de Java 15+)
    }
}

```
