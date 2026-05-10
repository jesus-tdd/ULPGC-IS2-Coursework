# IS2 - Kata 3
Tercera *kata* de Ingeniería del Software 2 del Grado Ingeniería Informática (ULPGC)


### Ejercicio
> Partiendo de la kata anterior, ampliar el proyecto para permitir la generación dinámica de un histograma en memoria basado en un atributo elegido del dataset.
> 1. Inyección de dependencias para la selección del atributo.
Implementar un mecanismo que permita seleccionar dinámicamente el atributo sobre el que se generará el histograma.
Esta selección se realizará mediante inyección de dependencias, por ejemplo, pasando una expresión lambda o referencia a método que obtenga el valor del atributo desde cada objeto.
El diseño debe ser genérico y reutilizable, sin depender de un atributo específico (como “año” o “duración”).
> 2. Creación de la clase view model Histogram. Implementar una clase llamada Histogram que actúe como view model para representar el histograma generado en memoria.
La clase debe contener métodos para añadir o actualizar frecuencias, métodos para obtener los valores y frecuencias.
> 3. Generación del histograma en memoria. A partir de la colección de objetos cargados y del atributo seleccionado mediante la lambda, construir una instancia de Histogram que contenga las frecuencias de los valores observados.
>
> NOTA: No se debe generar todavía una representación visual; esta se implementará en la siguiente kata.


### Código
Refactorización de las clases de io que no eran parte de la arquitectura del proyecto.

Implementación de la clase _Histogram_.

Implementación de la clase _HistogramBuilder_ (patrón builder para _Histogram_).

Construcción de un histograma a través del _dataset_ utilizado en la _kata 2_.


### Créditos
El dataset en cuestión: [github.com/lgreski/pokemonData](https://github.com/lgreski/pokemonData/blob/master/Pokemon.csv)

## 
[Ver vídeo](https://www.youtube.com/watch?v=SD2kZzLl3wg) | [Todas las Katas](https://www.youtube.com/playlist?list=PL_MLZ_QLgMQ8v5oYzwturBAajvCAg-p8c)
