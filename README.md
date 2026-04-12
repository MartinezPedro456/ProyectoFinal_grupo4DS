# 🎓 Sistema de Gestión de Estudiantes - Grupo 4

## 1. Introducción
Este proyecto es un sistema de registro de estudiantes desarrollado en java. es diseñada para administrar registros académicos de forma dinámica. 

## 2. Características Principales
Buscar Estudiantes.
Agregar Estudiantes.
Mostrar Lista de estudiantes.
uso de arrayList para estructura dinamica.
uso de Scanner para entrada 
uso de JoptionPane para interfaz grafica.

## 3. Arquitectura del Proyecto

JOptionPane para cuadros de diálogo y para la entrada de datos detallada.
* **Capa de Lógica:**Controlan el flujo de agregar, buscar y listar estudiantes.
* **Capa de Datos:** Definida por la clase interna `Estudiante`,(nombre, apellido, edad) utilizando modificadores de acceso `private` y `final`.
* **Estructura de Carpetas:**
    * `/`: Raíz del proyecto con archivos de configuración y documentación (`README.md`).
    * `/src`: Directorio que contiene el código fuente puro.
    * `/src/grupo4`: Paquete que agrupa las clases relacionadas al equipo de desarrollo.

## 4. Tecnologías Utilizadas
* **Lenguaje:** Java 17 o superior.
* **Entorno de Desarrollo (IDE):** Visual Studio Code con Extension Pack for Java.
* **Bibliotecas Estándar:** * `java.util.ArrayList`: Para la persistencia dinámica.
    * `javax.swing.JOptionPane`: Para la interacción gráfica de usuario.

## 5. Instalación y Ejecución
1.  **Clonación/Descarga:** Asegúrese de tener la carpeta `PROYECTOFINAL_GRUPO4DS` en su equipo.
2.  **Apertura en VS Code:** Abra la carpeta raíz en Visual Studio Code.
3.  **Configuración de Carpeta:** Verifique que el archivo esté en la ruta `src/grupo4/StudentRegistrationSystem.java`.
4.  **Ejecución:** Presione la tecla `F5` o haga clic en el botón **Run** del IDE.

## 6. Seguridad y Estándares de Código
* **Encapsulamiento:** Los atributos de los estudiantes están protegidos mediante el modificador `private final`, garantizando que la información no sea alterada accidentalmente tras su creación.
* **Gestión de Recursos:** Uso de `try-with-resources` para el cierre automático del objeto `Scanner`, evitando fugas de memoria (*memory leaks*).
* **Nomenclatura:** Se respetan las convenciones de *CamelCase* y nombres de variables descriptivos en inglés para una mejor legibilidad internacional.

## 7. Futuras Mejoras
* **Persistencia SQL:** Conexión con base de datos MariaDB para guardar registros permanentemente.
* **Interfaz Gráfica (GUI):** Evolución hacia una ventana completa utilizando JavaFX o Swing.
* **Módulo de Reportes:** Función para exportar la lista de estudiantes a un archivo PDF o Excel.

## 8. Conclusión
Este proyecto representa la culminación del aprendizaje en lógica de programación y estructuras de datos. Es una herramienta **totalmente accesible** que demuestra cómo la organización profesional de carpetas y el código limpio pueden transformar un ejercicio académico en una aplicación lista para el mundo real.