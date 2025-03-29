# Sealed Classes (2/2)


Les sealed classes sont particulièrement utiles avec l'expression when car le compilateur peut vérifier l'exhaustivité des branches.

Elles offrent la sécurité du type pour les hiérarchies fermées tout en permettant le polymorphisme.

Contrairement aux énumérations, les sous-classes des sealed classes peuvent contenir des états et avoir plusieurs instances,
ce qui les rend plus flexibles pour modéliser des concepts complexes comme les états d'une UI ou les résultats d'opérations.


```kotlin

sealed class Result {
  data class Success(val data: Any) : Result()
  data class Error(val message: String, val exception: Exception? = null) : Result()
  object Loading : Result()
  object Empty : Result()
}

// Utilisation avec when
fun handleResult(result: Result) = when(result) {
  is Result.Success -> displayData(result.data)
  is Result.Error -> showError(result.message)
  is Result.Loading -> showProgressBar()
  is Result.Empty -> showEmptyState()
  // Pas besoin de else car le compilateur sait que tous les cas sont couverts
}

```
