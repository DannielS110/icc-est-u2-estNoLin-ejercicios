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

🌳 Ejercicios Lógica con Árboles 

👨‍🎓 ESTUDIANTE

Daniel Sanchez Valle

📚 Ingeniería en Computación  

🏛️ Universidad Politécnica Salesiana  

📧 daniel.sanchez@estudiante.ups.edu.ec  

👨‍🏫 PROFESOR  

Ing. Pablo Torres 

📖 Estructuras de Datos  

📚 Descripción del Proyecto

Este proyecto constituye una implementación integral de cuatro algoritmos fundamentales para el manejo de árboles binarios, diseñado para consolidar el conocimiento teórico a través de la práctica aplicada. Cada ejercicio aborda aspectos críticos de las estructuras jerárquicas: inserción eficiente, transformaciones estructurales, recorridos por niveles y análisis de profundidad.

![image](https://github.com/user-attachments/assets/2ee6935e-d54b-4d04-89ca-7547f1d83569)


🏆 IMPLEMENTACIONES ALGORÍTMICAS 

EJERCICIO 1

🔧 Algoritmo: Inserción recursiva con preservación de propiedades BST

📥 Input: [5, 3, 7, 2, 4, 6, 8]

🎯 Objetivo: Construcción de BST optimizado

⚡ Complejidad: O(log n) promedio | O(n) peor caso

🌳 VISUALIZACIÓN ESTRUCTURAL
          
![image](https://github.com/user-attachments/assets/57ca53ce-fbc0-4ed3-a453-584fe2c5a550)


![image](https://github.com/user-attachments/assets/8fb3f160-d0f5-4460-ad23-394fb04c3421)

EJERCICIO 2

🔧 Algoritmo: Intercambio recursivo de subárboles

🎯 Función: Generación del árbol espejo

⚙️ Técnica: Recursión con manipulación de referencias

⚡ Complejidad: O(n) tiempo 

🌳 ÁRBOL DE ENTRADA:


![image](https://github.com/user-attachments/assets/1bd444ad-6ee6-4cda-a1ab-a0503c043b6a)

![image](https://github.com/user-attachments/assets/bd5f0112-fd32-4735-9dbc-92d7b9ffe5cd)

EJERCICIO 3

🔧 Algoritmo: BFS (Breadth-First Search) con cola

📤 Output: N listas enlazadas para N niveles

🔗 Estructura: Conversión nivel → lista enlazada independiente

⚡ Complejidad: O(n) tiempo 


![image](https://github.com/user-attachments/assets/91e353bc-3c41-464f-905b-cd59ea09bd72)

![image](https://github.com/user-attachments/assets/8d7821b7-e0bf-4c43-bdcd-fe323f955a57)


    EJERCICIO 4

🔧 Algoritmo: Recursión DFS para altura máxima

🎯 Función: Determinar camino más largo raíz → hoja

📊 Métrica: Número de niveles en el árbol

⚡ Complejidad: O(n) tiempo

🌳 ÁRBOL DE ENTRADA:
    ![image](https://github.com/user-attachments/assets/e2b9c6b6-aa9d-4eb2-b3bc-68447ca402cd)

📊 PROFUNDIDAD MÁXIMA: 4

![image](https://github.com/user-attachments/assets/338a8753-3387-4cf5-881e-060f5a0428df)

📖Ejecucion 

![code](https://github.com/user-attachments/assets/3956ff0a-e207-41b9-986f-d510b6f8d88c)

🔧 Funcionalidades

✅ Inserción eficiente en BST manteniendo propiedades de orden

✅ Inversión completa de árboles binarios

✅ Generación automática de listas enlazadas por nivel

✅ Cálculo preciso de profundidad máxima

✅ Validación automática de datos del estudiante

✅ Visualización clara de estructuras de árboles

🧾 Conclusión

Este proyecto permitió consolidar el entendimiento de estructuras de datos no lineales, específicamente árboles binarios y sus algoritmos asociados. Se reforzaron conceptos fundamentales como recursión, manejo 

de referencias y algoritmos de recorrido. La implementación de BFS para listas por niveles y la manipulación de BST demuestran la versatilidad y potencia de las estructuras arbóreas. El desarrollo fortaleció 

habilidades en programación orientada a objetos y metodologías de testing, evidenciando la importancia de estas estructuras para soluciones algorítmicas eficientes y escalables.


🎓 Universidad Politécnica Salesiana

⭐ ¡Gracias por revisar este proyecto académico! ⭐

