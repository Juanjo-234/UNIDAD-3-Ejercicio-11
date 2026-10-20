Este programa está diseñado para modelar y gestionar las calificaciones académicas de un estudiante mediante la aplicación estricta del principio de encapsulamiento (ocultación de datos) y validaciones defensivas de notas en programación orientada a objetos (por ejemplo, en Java).

A continuación se detalla exactamente lo que hace cada parte del programa:

Define la clase LibretaCalificaciones: Declara atributos privados (nombreEstudiante y notas) para proteger la estructura de datos interna y evitar modificaciones externas no controladas.

Implementa el método agregarNota(double nota): Valida de forma estricta que la calificación ingresada se encuentre estrictamente entre 0.0 y 10.0 antes de aceptar su almacenamiento, rechazando valores erróneos con un mensaje de advertencia.

Implementa el método obtenerPromedio(): Procesa internamente el conjunto de notas ocultas para calcular el promedio aritmético y devolver el resultado al exterior sin exponer la lista interna.

Ejecuta la prueba en el main: Instancia la libreta de calificaciones, registra notas válidas e inválidas (como -1.0 o 12.5 para probar las validaciones), y muestra el promedio final obtenido por consola.
