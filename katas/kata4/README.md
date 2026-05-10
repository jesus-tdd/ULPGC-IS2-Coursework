# IS2 - Kata 4
Cuarta *kata* de Ingeniería del Software 2 del Grado Ingeniería Informática (ULPGC)


### Ejercicio
> Partiendo de la kata anterior, ampliar el proyecto para incorporar la visualización gráfica de los datos mediante la biblioteca JFreeChart.
> El objetivo de esta kata consiste en integrar la capa de visualización con la lógica existente, utilizando Maven para la gestión de dependencias y asegurando una separación clara entre los modelos de datos y la presentación gráfica.
>
> Es importante mantener una clara separación entre las capas:
> * Model: clases que representan los registros.
> * View Model: histograma
> * View: código encargado de generar el gráfico.
> * Control: código que conecta ambas partes.


### Código
Actualización de las clases de Entrada/Salida para implementar el uso de streams.

Actualización de la clase _Histogram_ y su respectivo builder para almacenar también metadatos del histograma (título, nombres de ejes...). 

Implementación visual de un histograma a partir del _dataset_ de la _kata 2_ usando _JFreeChart_.

Refactorización de los paquetes para favorecer la división entre las clases de la arquitectura y las implementaciones (fuera de cámara). 


### Créditos
El dataset en cuestión: [github.com/lgreski/pokemonData](https://github.com/lgreski/pokemonData/blob/master/Pokemon.csv)


### Dependencias
* [JFreeChart v1.5.6](https://mvnrepository.com/artifact/org.jfree/jfreechart/1.5.6)


## 
[Ver vídeo](https://www.youtube.com/watch?v=nRsv2t8uUOA) | [Todas las Katas](https://www.youtube.com/playlist?list=PL_MLZ_QLgMQ8v5oYzwturBAajvCAg-p8c)
