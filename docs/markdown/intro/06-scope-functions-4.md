# Scope functions (let, also, apply, run, with)

Tableau Comparatif
| Fonction | Référence à l'objet | Retourne | Cas d'usage typique |
|----------|---------------------|----------|---------------------|
| let      | it (argument)       | Lambda   | Transformation, nullables |
| also     | it (argument)       | Objet    | Actions additionnelles |
| run      | this (récepteur)    | Lambda   | Opérations et calculs |
| apply    | this (récepteur)    | Objet    | Configuration d'objet |
| with     | this (récepteur)    | Lambda   | Grouper des opérations |

Ces fonctions améliorent la lisibilité et réduisent le code boilerplate dans de nombreux scénarios.
