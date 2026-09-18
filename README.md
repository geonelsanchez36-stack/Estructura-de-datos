# Estructura-de-datos
Este repositorio contiene ejemplos prácticos de la implementación de ArrayList y LinkedList en Java. El objetivo es mostrar tanto casos correctos como incorrectos de uso, para ayudar a comprender mejor cómo funcionan estas estructuras de datos y cuáles son los errores más comunes al implementarlas.

 -Contenido del proyecto 
 
    Clase ArrayList 
Contiene toda la lógica de la creación de un arrayList
  
     Clase MainArrayList
    Implementación personalizada de un ArrayList.

        Ejemplos de uso correcto: inserción, eliminación, búsqueda y recorrido de elementos.

        Ejemplos de uso incorrecto:

            Intentar obtener un elemento fuera de rango.

            Eliminar un elemento que no existe.
            
            Modificar la lista mientras se itera.

    Clase MainListaEnlazada 
    Ejemplos de una correcta implementación de una lista enlazada:

        Agregar elementos.

        Recorrer la lista.

        Acceder a un elemento.

        Ejemplos de uso incorrecto: intentar modificar un elemento mientras se itera.

    Clase ListaEnlazada  
    Contiene otros ejemplos de mala implementación,además de la lógica para la creación de una lista enlazada:

        Método para eliminar un elemento intermedio de forma incorrecta.

        Método para insertar un elemento sin verificar previamente que la cabeza no sea null (es decir, que la lista no esté vacía).

    Clase ListInterface
  Esta clase contiene todos los métodos que debe de implementar cualquier lista

    Clase Nodo  
    
    Clase auxiliar que implementa los nodos de la lista enlazada.
    Cada nodo contiene un valor y una referencia al siguiente nodo.
    
   - Objetivos del proyecto
    

    Mostrar cómo implementar desde cero estructuras de datos básicas en Java.

    Identificar errores comunes en la programación de listas.

    Servir como material de estudio para estudiantes y desarrolladores que deseen reforzar sus conocimientos en estructuras de datos.
