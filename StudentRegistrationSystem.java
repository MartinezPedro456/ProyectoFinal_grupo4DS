
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class StudentRegistrationSystem {

    // Clase Estudiante con Nombre y Apellido separados
    static class Estudiante {
        private final String nombre;
        private final String apellido;
        private final int edad;

        public Estudiante(String nombre, String apellido, int edad) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.edad = edad;
        }

        public String getNombreCompleto() {
            return nombre + " " + apellido;
        }

        @Override
        public String toString() {
            return "Estudiante: " + nombre + " " + apellido + " | Edad: " + edad;
        }
    }

    public static void main(String[] args) {
        ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();

        // Cargamos los 20 estudiantes iniciales
        cargarEstudiantesPredeterminados(listaEstudiantes);

        try (Scanner keyboard = new Scanner(System.in)) {
            int opcion = 0;

            JOptionPane.showMessageDialog(null, "Sistema de Registro - 20 Estudiantes Cargados");

            do {
                try {
                    String menu = """
                            --- GESTIÓN ACADÉMICA GRUPO 4 ---
                            1. Agregar Estudiante Manualmente
                            2. Buscar Estudiante (Nombre y Apellido)
                            3. Mostrar Lista Completa
                            4. Salir
                            """;

                    String inputMenu = JOptionPane.showInputDialog(menu);
                    if (inputMenu == null)
                        break;
                    opcion = Integer.parseInt(inputMenu);

                    switch (opcion) {
                        case 1 -> {
                            System.out.println("\n--- NUEVO REGISTRO ---");
                            System.out.print("Nombre: ");
                            String n = keyboard.nextLine();
                            System.out.print("Apellido: ");
                            String a = keyboard.nextLine();
                            System.out.print("Edad: ");
                            int ed = keyboard.nextInt();
                            keyboard.nextLine();

                            listaEstudiantes.add(new Estudiante(n, a, ed));
                            JOptionPane.showMessageDialog(null, "Registrado: " + n + " " + a);
                        }
                        case 2 -> {
                            String busqueda = JOptionPane.showInputDialog("Ingrese el NOMBRE o APELLIDO a buscar:");
                            if (busqueda != null && !busqueda.isEmpty()) {
                                StringBuilder resultados = new StringBuilder("Resultados encontrados:\n");
                                boolean hallado = false;

                                for (Estudiante e : listaEstudiantes) {
                                    // Busca coincidencias en nombre o apellido
                                    if (e.getNombreCompleto().toLowerCase().contains(busqueda.toLowerCase())) {
                                        resultados.append("- ").append(e.toString()).append("\n");
                                        hallado = true;
                                    }
                                }

                                if (hallado) {
                                    JOptionPane.showMessageDialog(null, resultados.toString());
                                } else {
                                    JOptionPane.showMessageDialog(null, "No se encontraron coincidencias.");
                                }
                            }
                        }
                        case 3 -> {
                            StringBuilder listaTotal = new StringBuilder(
                                    "LISTADO GENERAL (" + listaEstudiantes.size() + "):\n");
                            for (Estudiante e : listaEstudiantes) {
                                listaTotal.append(e.toString()).append("\n");
                            }
                            JOptionPane.showMessageDialog(null, listaTotal.toString());
                        }
                        case 4 -> JOptionPane.showMessageDialog(null, "Finalizando programa.");
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Error: Use números para el menú.");
                }
            } while (opcion != 4);
        }
    }

    // Método para tener datos listos para probar
    private static void cargarEstudiantesPredeterminados(ArrayList<Estudiante> lista) {
        lista.add(new Estudiante("Pedro", "García", 20));
        lista.add(new Estudiante("Michelle", "Rodríguez", 19));
        lista.add(new Estudiante("Juan", "Pérez", 21));
        lista.add(new Estudiante("María", "López", 22));
        lista.add(new Estudiante("Luis", "Martínez", 20));
        lista.add(new Estudiante("Ana", "Hernández", 18));
        lista.add(new Estudiante("Carlos", "Sánchez", 23));
        lista.add(new Estudiante("Sofía", "Ramírez", 19));
        lista.add(new Estudiante("Diego", "Torres", 21));
        lista.add(new Estudiante("Elena", "Flores", 20));
        lista.add(new Estudiante("Jorge", "Morales", 22));
        lista.add(new Estudiante("Lucía", "Castillo", 18));
        lista.add(new Estudiante("Roberto", "Ortiz", 24));
        lista.add(new Estudiante("Marta", "Gutiérrez", 21));
        lista.add(new Estudiante("Andrés", "Reyes", 20));
        lista.add(new Estudiante("Paola", "Jiménez", 19));
        lista.add(new Estudiante("Ricardo", "Álvarez", 22));
        lista.add(new Estudiante("Claudia", "Ruiz", 20));
        lista.add(new Estudiante("Fernando", "Vargas", 21));
        lista.add(new Estudiante("Gabriela", "Castro", 19));
    }
}