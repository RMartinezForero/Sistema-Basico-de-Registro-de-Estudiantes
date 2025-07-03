import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        var entrada = new Scanner(System.in);
        mostrarMenu(entrada);
    }

    public static void mostrarMenu(Scanner entrada){

        var opcion = 0;
        do {
            System.out.println("""
                    --- Sistema de Registro de Estudiantes ---
                    1. Registrar datos de un estudiante
                    2. Mostrar datos del estudiante actual
                    3. Calcular promedio de notas del estudiante actual
                    0. Salir
                    \n""");
            System.out.print("Ingrese su opción: ");
            opcion = entrada.nextInt();
            entrada.nextLine();
            System.out.println("");

            switch (opcion) {
                case 1:
                    registrarDatosEstudiante(entrada);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 0:
                    System.out.println("La aplicación ha finalizado\n");
                    break;
                default:
                    System.out.println("Opción invalida. Intenta nuevamente\n");
                    break;
            }
        } while(opcion != 0);
    }

    public static void registrarDatosEstudiante(Scanner entrada){
        System.out.println("...registrar datos de un estudiante...\n");
        System.out.print("por favor digite el nombre completo del estudiante: ");
        String nombre = entrada.nextLine();

        System.out.print("Por favor digite la nota #1: ");
        double nota1 = entrada.nextDouble();
        entrada.nextLine();

        System.out.print("Por favor digite la nota #2: ");
        double nota2 = entrada.nextDouble();
        entrada.nextLine();

        System.out.print("Por favor digite la nota #3: ");
        double nota3 = entrada.nextDouble();
        entrada.nextLine();
    }
}
