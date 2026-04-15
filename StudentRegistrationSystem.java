import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class StudentRegistrationSystem {

    static class Estudiante {
        private String id;
        private String nombre;
        private String apellido;
        // Atributos de notas por módulos
        private double notaExamen;
        private double notaTareas;
        private double notaProyecto;
        private double promedioFinal;

        public Estudiante(String id, String nombre, String apellido, double n1, double n2, double n3) {
            this.id = id;
            this.nombre = nombre;
            this.apellido = apellido;
            this.notaExamen = n1;
            this.notaTareas = n2;
            this.notaProyecto = n3;

            this.promedioFinal = (n1 * 0.40) + (n2 * 0.30) + (n3 * 0.30);
        }

        public String getNombreCompleto() {
            return nombre + " " + apellido;
        }

        public String getEstado() {
            return (promedioFinal >= 3.0) ? "APROBADO" : "REPROBADO";
        }

        @Override
        public String toString() {
            return String.format("ID: %-4s | %-22s | Prom: %.1f | [%s]",
                    id, nombre + " " + apellido, promedioFinal, getEstado());
        }

        public String getDetalleNotas() {
            return String.format("Detalle de %s:\nExamen: %.1f\nTareas: %.1f\nProyecto: %.1f\nFINAL: %.1f",
                    getNombreCompleto(), notaExamen, notaTareas, notaProyecto, promedioFinal);
        }
    }

    public static void main(String[] args) {
        ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int opcion = 0;

        cargar30Estudiantes(listaEstudiantes);

        JOptionPane.showMessageDialog(null, "SISTEMA DE REGISTRO DE ESTUDIANTES\n" +
                "Registros actuales: " + listaEstudiantes.size());

        do {
            try {
                String menu = """
                             MENÚ DE REGISTROS DE ESTUDIANTES
                        1. Registrar Estudiante (Nuevo)
                        2. Buscar y Ver Detalle de Notas
                        3. Listado General (30+ Registros)
                        4. Eliminar por Nombre
                        5. Analísis Grupal
                        6. Salir
                        """;

                String seleccion = JOptionPane.showInputDialog(menu);
                if (seleccion == null)
                    break;
                opcion = Integer.parseInt(seleccion);

                switch (opcion) {
                    case 1 -> {
                        System.out.println("\n NUEVO REGISTRO ");
                        System.out.print("ID: ");
                        String id = input.nextLine();
                        System.out.print("Nombre: ");
                        String n = input.nextLine();
                        System.out.print("Apellido: ");
                        String a = input.nextLine();
                        System.out.print("Nota Examen (0-5): ");
                        double n1 = input.nextDouble();
                        System.out.print("Nota Tareas (0-5): ");
                        double n2 = input.nextDouble();
                        System.out.print("Nota Proyecto (0-5): ");
                        double n3 = input.nextDouble();
                        input.nextLine();
                        listaEstudiantes.add(new Estudiante(id, n, a, n1, n2, n3));
                    }
                    case 2 -> {
                        String busqueda = JOptionPane.showInputDialog("Nombre o Apellido:");
                        for (Estudiante e : listaEstudiantes) {
                            if (e.getNombreCompleto().toLowerCase().contains(busqueda.toLowerCase())) {
                                JOptionPane.showMessageDialog(null, e.getDetalleNotas());
                            }
                        }
                    }
                    case 3 -> {
                        StringBuilder lista = new StringBuilder("LISTADO COMPLETO:\n");
                        for (int i = 0; i < listaEstudiantes.size(); i++) {
                            lista.append(listaEstudiantes.get(i)).append("\n");

                            if ((i + 1) % 15 == 0) {
                                JOptionPane.showMessageDialog(null, lista);
                                lista = new StringBuilder("LISTADO CONTINUACIÓN:\n");
                            }
                        }
                    }
                    case 4 -> {
                        String idBorrar = JOptionPane.showInputDialog("ID a eliminar:");
                        listaEstudiantes.removeIf(e -> e.id.equals(idBorrar));
                    }
                    case 5 -> {
                        double sumaTotal = 0;
                        int aprob = 0;
                        for (Estudiante e : listaEstudiantes) {
                            sumaTotal += e.promedioFinal;
                            if (e.promedioFinal >= 3.0)
                                aprob++;
                        }
                        String analisis = String.format("""
                                  ANALÍSIS DE RENDIMIENTO
                                Estudiantes Evaluados: %d
                                Promedio del Curso: %.2f
                                Tasa de Aprobación: %.1f%%
                                """, listaEstudiantes.size(), (sumaTotal / listaEstudiantes.size()),
                                ((double) aprob / listaEstudiantes.size() * 100));
                        JOptionPane.showMessageDialog(null, analisis);
                    }
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Entrada no válida.");
                input.nextLine();
            }
        } while (opcion != 6);
        input.close();
    }

    private static void cargar30Estudiantes(ArrayList<Estudiante> lista) {
        String[] nombres = { "Pedro", "Michelle", "Jose", "Malenis", "Luis", "Ana", "Carlos", "Sofia", "Diego", "Elena",
                "Jorge", "Lucia", "Roberto", "Marta", "Andres", "Paola", "Ricardo", "Claudia", "Fernando", "Gabriela",
                "Mario", "Carmen", "Raul", "Isabel", "Hugo", "Victoria", "Gabriel", "Rosa", "Tomas", "Julia" };
        String[] apellidos = { "Martinez", "Rodriguez", "Villareal", "Ortega", "Garcia", "Lopez", "Sanchez", "Ramirez",
                "Torres", "Flores", "Morales", "Castillo", "Ortiz", "Gutierrez", "Reyes", "Jimenez", "Alvarez", "Ruiz",
                "Vargas", "Castro", "Palacio", "Gomez", "Perez", "Diaz", "Herrera", "Castro", "Rios", "Mendoza", "Sosa",
                "Vera" };

        for (int i = 0; i < 30; i++) {
            String id = "E" + (i + 1);

            double n1 = 1.0 + (Math.random() * 4.0);
            double n2 = 1.0 + (Math.random() * 4.0);
            double n3 = 1.0 + (Math.random() * 4.0);
            lista.add(new Estudiante(id, nombres[i], apellidos[i], n1, n2, n3));
        }
    }
}