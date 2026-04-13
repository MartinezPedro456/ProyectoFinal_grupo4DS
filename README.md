# 🎓 Sistema de Gestión de Estudiantes - Grupo 4

## 1. Introducción
Este programa es un sistema básico que hicimos en Java para controlar una lista de estudiantes. La idea es que puedas tener a los alumnos registrados, buscarlos por nombre o apellido, ver la lista completa y con la nueva actualización, también borrar a alguien si ya no está en el grupo. 

## 2. Características Principales
 * **viene con datos:** Al abrirlo, el sistema ya trae 21 estudiantes de prueba para no empezar de cero.

* **Registro manual:** Puedes meter nuevos alumnos nombre, apellido y edad.

* **Buscador inteligente:** Si pones una parte del nombre o el apellido, el programa te encuentra las coincidencias.

* **Borrado de registros:** Si te equivocas o alguien se sale, puedes eliminarlo escribiendo su nombre completo.

* **Alertas visuales:** Usa ventanitas (JOptionPane) para que sea más fácil de usar que solo texto.

## 3. Arquitectura del Proyecto
Usamos Java puro con un enfoque de objetos.

* **ArrayList:** Es lo que usamos para guardar a los estudiantes porque nos deja agregar y quitar elementos sin complicaciones.

* **JOptionPane:** Para que el menú y los mensajes parezcan de una aplicación real con ventanas.

* **Scanner:** Para que cuando toque escribir datos nuevos (en la opción 1), se haga directo.

* **Lógica de eliminación:** Usamos una función llamada removeIf, que es súper útil porque busca y borra al mismo tiempo sin que el programa se trabe.

## 4. Tecnologías Utilizadas
* **Java.**
* **Visual Studio Code.**
* **ArrayList.**
* **Scanner.**
* **JOptionPane.**

## 5. Casos de uso
* **Para pasar asistencia rápido en el salón.**

* **Para organizar los grupos de laboratorio de la técnica.**

* **Como base para cualquier proyecto que necesite guardar datos de personas.**

## 6. Instalación
* Instalar **Java.** 
* Instalar **Visual Studio Code.**
* Instalar **extención Java.**
* Ejecutar**Main.java**

## 7. Validaciones
* **Control de errores:** Si el programa espera un número en el menú y tú pones una letra, no se cierra de golpe; te avisa que hubo un error con un mensaje.

* **Cierre de recursos:** Usamos el "try-with-resources" para que el lector del teclado (Scanner) se cierre solito al terminar y no consuma memoria de más.

* **Privacidad:** Los datos están protegidos dentro de la clase Estudiante, así que no se pueden modificar por fuera sin permiso.


## 8. Futuras Mejoras
* **Guardar en archivo:** Que cuando cierres el programa los datos no se borren, sino que se guarden en un txt o una base de datos de verdad como MariaDB.

* **Interfaz completa:** Hacer que todo sea con ventanas y botones, sin usar la terminal para nada.

* **Editar:** Agregar una opción para cambiarle la edad o el nombre a alguien que ya esté registrado.

## 9. Conclusión
Este trabajo nos ayudó a entender cómo manejar listas de objetos en Java. Es un sistema sencillo pero que ya tiene todas las funciones básicas (Crear, Leer, Buscar y Eliminar), lo que nos sirve de mucha práctica para proyectos más grandes de programación.
Este proyecto representa la culminación del aprendizaje en lógica de programación y estructuras de datos. Es una herramienta totalmente accesible.

## 10. Autor
* **Malenis Ortega**
* **Jose Villareal**
* **Pedro Martinez**
* *Estudiantes de Desarrollo de Software - Grupo_4.*