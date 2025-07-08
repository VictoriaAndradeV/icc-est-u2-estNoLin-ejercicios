### Informe de Ejercicios de Árboles Binarios

Estudiante: Victoria Andrade

Este documento describe los objetivos, el desarrollo, los aprendizajes y las conclusiones de los cuatro ejercicios realizados sobre árboles binarios.

## Ejercicio 01: Inserción en Árbol Binario de Búsqueda (BST)

Objetivo:

Implementar un algoritmo que permita insertar nodos en un Árbol Binario de Búsqueda (BST) y mostrar sus elementos en orden.

Desarrollo:

Se creó la clase InsertarBST con métodos:

insert(int value): inserta recursivamente un valor en el BST.

insertRec(Node node, int value): lógica recursiva que posiciona cada nodo según su valor.

printInOrder(): recorre el árbol en orden (izquierda-raíz-derecha) y muestra los valores.

En App, se insertaron los valores de ejemplo [5, 3, 7, 2, 4, 6, 8] y se imprimió el recorrido in-order.

## Lo que se aprendió:
- Fundamentos de la estructura de datos BST.
- Implementación de inserción recursiva respetando la propiedad de búsqueda.
- Recorrido in-order para obtener una lista ordenada de valores.

# Conclusión:

Se validó que la inserción respeta la ordenación y que el recorrido in-order devuelve una secuencia creciente de los valores.

## Ejercicio 02: Inversión (Espejo) de un Árbol Binario

# Objetivo:

Crear una función que invierta (haga espejo) la estructura de un árbol binario.

# Desarrollo:

Se implementó la clase ArbolInvertido con el método:

invert(Node node): recorre el árbol en post-order, invierte recursivamente los subárboles y luego intercambia los hijos izquierdo y derecho.

En App, se construyó un BST de ejemplo, se imprimió su forma con líneas ASCII y luego se invirtió aplicando invert, imprimiendo el resultado.

# Lo que se aprendió:

- Recorridos post-order como patrón para transformar árboles.

- Técnicas de manipulación de punteros/refs para intercambiar subárboles.

- Reutilización de métodos de impresión para validar cambios.

# Conclusión:

La inversión en sitio modifica la estructura del árbol de manera correcta, obteniendo su espejo.

## Ejercicio 03: Listas Enlazadas por Nivel

# Objetivo:

Generar una lista enlazada por cada nivel de un árbol binario.

# Desarrollo:

Se creó la clase ListLevels con el método:

listByLevel(Node root): utiliza un recorrido BFS con una cola (Queue) para agrupar nodos por niveles en LinkedList<Node>.

En App, tras invertir el árbol del ejercicio anterior, se invocó listByLevel y se imprimieron las listas de cada nivel con la flecha →.

# Lo que se aprendió:

- Recorridos por niveles (BFS) y su aplicación para agrupar nodos.
- Uso de estructuras auxiliares (colas y listas enlazadas) para representar niveles.
- Formato de salida que facilita la visualización de la arquitectura del árbol.

# Conclusión:

El recorrido BFS permite extraer fácilmente la estructura por niveles, generando sublistas que pueden usarse en algoritmos de visualización o procesamiento paralelo por profundidad.

## Ejercicio 04: Profundidad Máxima de un Árbol Binario

# Objetivo:

Calcular la profundidad máxima (longitud del camino más largo desde la raíz hasta una hoja) de un árbol binario.

# Desarrollo:

Se implementó la clase DepthCalculator con el método:

maxDepth(Node node): recursivamente calcula la profundidad de los subárboles izquierdo y derecho y retorna el mayor más uno.

En App, se construyó manualmente un árbol con la forma proporcionada y se imprimió el resultado de maxDepth.

# Lo que se aprendió:

- Aplicación de recursión para descomponer problemas en subproblemas (subárboles).
- Cálculo de métricas estructurales de un árbol (profundidad, altura).
- Interpretación de la recursión como acumulación de niveles.

# Conclusión:

El algoritmo recursivo proporciona de forma directa y eficiente la profundidad máxima de un árbol binario, con complejidad O(N) donde N es el número de nodos.

## Conclusiones Generales

La práctica integral de estas operaciones (inserción, inversión, recorrido por niveles y cálculo de profundidad) ofrece una visión completa de los algoritmos fundamentales sobre árboles binarios.

El manejo de referencias y recursión es clave para desarrollar manipulaciones estructurales en árboles.

El uso de diferentes patrones de recorrido (in-order, post-order, BFS) demuestra la versatilidad para resolver problemas concretos.

Estas implementaciones sientan las bases para estructuras y algoritmos más avanzados, como árboles balanceados (AVL, Red-Black) o recorridos especializados.


# Estructuras No Lineales – Ejercicios Árboles

Este proyecto contiene la solución a cuatro ejercicios prácticos sobre estructuras de datos tipo árbol binario, como parte del aprendizaje de estructuras no lineales en Java. Cada ejercicio se encuentra organizado en su propia carpeta, siguiendo la convención de paquetes y buenas prácticas.

---

## Identificación del Estudiante (Obligatorio)

Antes de comenzar a programar o ejecutar el proyecto, **debes completar tu nombre y correo institucional en el archivo `student.env`** que se encuentra en la raíz del proyecto. Este archivo es necesario para validar tu identidad como autor del trabajo.

### ¿Por qué es obligatorio?

Este proyecto utiliza una verificación automática que valida que has ingresado tu información personal. Si no lo haces:

- Al ejecutar el proyecto (`App.java`) verás este mensaje de error:
```
❌ Debes completar STUDENT_NAME y STUDENT_EMAIL en student.env
```
- No podrás enviar tu código (`push`) al repositorio si tienes activado el sistema de validación local.
- Las pruebas automáticas en GitHub Actions también fallarán si no detectan tu nombre y correo.

### ¿Qué debo hacer?

1. Abre el archivo `student.env` que ya está creado en el proyecto.
2. Rellena tus datos:

```
STUDENT_NAME=Tu Nombre Completo
STUDENT_EMAIL=tu.correo@institucion.edu.ec
```


3. **No borres estas líneas ni cambies los nombres de las variables.**
4. Guarda los cambios y vuelve a ejecutar el programa o hacer push.

> 💡 Este mecanismo asegura la autoría del código y que cada estudiante reciba su evaluación automática de forma personalizada.

---




## Explicación para el estudiante

```
src/
│
├── Materia/
│
├── Ejercicio_01_insert/
├── Ejercicio_02_invert/
├── Ejercicio_03_listLeves/
└── Ejercicio_04_depth/
```

---

## Descripción de Ejercicios

### Ejercicio 01: Insertar en un Árbol Binario de Búsqueda (BST)

Carpeta: `Ejercicio_01_insert`
Implementa un algoritmo para insertar nodos en un Árbol Binario de Búsqueda.

 **Input de ejemplo:** `[5, 3, 7, 2, 4, 6, 8]`
 **Output esperado:**

```
    5
  3   7
 2 4 6 8
```

---

### Ejercicio 02: Invertir un Árbol Binario

📂 Carpeta: `Ejercicio_02_invert`
Dada la raíz de un árbol binario, el algoritmo devuelve su versión invertida (espejo).

 **Input de ejemplo:**

```
    4
  2   7
1  3 6  9
```

**Output esperado:**

```
    4
  7   2
9  6 3  1
```

---

### Ejercicio 03: Listar Niveles en Listas Enlazadas

📂 Carpeta: `Ejercicio_03_listLeves`
Devuelve una lista enlazada con los nodos por nivel. Si hay N niveles, se obtienen N listas.

 **Input de ejemplo:**

```
    4
  2   7
1  3 6  9
```

**Output esperado:**

```
4  
2 → 7  
1 → 3 → 6 → 9
```

---

### Ejercicio 04: Calcular la Profundidad Máxima

Carpeta: `Ejercicio_04_depth`
Calcula la profundidad máxima de un árbol binario (la longitud del camino más largo desde la raíz hasta una hoja).

**Input de ejemplo:**

```
    4
  2   7
1  3  
8
```

**Output esperado:** `4`

---

## Indicaciones Generales

* Lee cuidadosamente el enunciado de cada ejercicio.
* Cada carpeta debe contener:

  * Código fuente Java.
  * Casos de prueba.
  * Comentarios claros.
* Realiza commit y push con el mensaje:

  ```
  Estructuras No Lineales – Ejercicios Árboles
  ```
* En el AVAC, sube la **URL del repositorio** con el código.

---

## No se calificará si:

* No hay commit con los ejercicios.
* No se incluye este README explicativo.
* Las clases o métodos no siguen los nombres requeridos.

---

## Rúbrica de Calificación

| **Criterio**       | **Descripción**                                                                       | **Puntaje** |
| ------------------ | ------------------------------------------------------------------------------------- | ----------- |
| **Informe**        | No hay informe                                                                        | 0 pts       |
|                    | Informe parcial **sin explicación** de cada método                                    | 1 pt        |
|                    | Informe parcial **con explicación** de cada método                                    | 2 pts       |
|                    | Informe completo                                                                      | 3 pts       |
| **Funcionamiento** | No implementado                                                                       | 0 pts       |
|                    | Implementado parcialmente: <br>• Ejercicio 1 y 4 → 2 pts<br>• Ejercicio 2 y 3 → 4 pts | 2–4 pts     |
|                    | Código funcional pero **no pasa todas las pruebas**                                   | 6 pts       |
|                    | Código funcional y **pasa todas las pruebas correctamente**                           | 7 pts       |



## Contribuir

Para contribuir a este proyecto, por favor crea un fork y envía una solicitud de extracción, o simplemente abre un issue con tus comentarios y sugerencias.

## Autores

- [PABLO TORRES] - Desarrollo inicial

