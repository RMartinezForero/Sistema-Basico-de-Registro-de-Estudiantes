import java.util.Scanner;

public class App {
    //esto es una prueba de uno clonado
    static String nombre;
    static double nota1;
    static double nota2;
    static double nota3;
    public static void main(String[] args) {
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
                    mostrarInfoEstudiante();
                    break;
                case 3:
                    calcularPromedio();
                    break;
                case 0:
                    System.out.println("El programa ha finalizado\n");
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
        nombre = entrada.nextLine();

        do{
            System.out.print("Por favor digite la nota #1: ");
            nota1 = entrada.nextDouble();
            entrada.nextLine();
        }while(!validarNota(nota1));

        do{
            System.out.print("Por favor digite la nota #2: ");
            nota2 = entrada.nextDouble();
            entrada.nextLine();
        }while(!validarNota(nota2));

        do{
            System.out.print("Por favor digite la nota #3: ");
            nota3 = entrada.nextDouble();
            entrada.nextLine();
        }while(!validarNota(nota3));

        System.out.println("\n...registro exitoso...\n");
    }

    public static void mostrarInfoEstudiante(){
        System.out.println("...Mostrar datos del estudiante actual...");
        if(nombre == null){
            System.out.println("nombre: N/A");
            System.out.println("nota #1: N/A");
            System.out.println("nota #2: N/A");
            System.out.println("nota #3: N/A\n");
        }else{
            System.out.println("nombre: " + nombre);
            System.out.println("nota #1: " + nota1);
            System.out.println("nota #2: " + nota2);
            System.out.println("nota #3: " + nota3);
        }
        System.out.println();
    }

    public static double calcularPromedio(){
        System.out.println("...Calcular promedio de notas del estudiante actual...");
        double promedio = (nota1 + nota2 + nota3)/3;
        System.out.println("el promedio de notas del estudiante actual es: " + promedio + "\n");
        return promedio;
    }

    public static boolean validarNota(double nota){
        if(nota >= 0 && nota <= 100){
            return true;
        }else{
            System.out.println("\nEsta nota no es valida. Por favor digite una nota del 0 al 100\n");
            return false;
        }
    }
}
