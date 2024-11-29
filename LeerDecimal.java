
import java.util.Scanner;

public class LeerDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número decimal: ");
        double decimal = scanner.nextDouble();

        System.out.println("Número decimal leído: " + decimal);


      //leer linea//   //EJEMPLO//

        System.out.print("Ingresa una línea de texto: ");
        String linea = scanner.nextLine();

        System.out.println("Línea de texto leída: " + linea);

      //LEER UNA PALABRA // //EJEMPLO//

        System.out.print("Ingresa una palabra: ");
        String palabra = scanner.next();

        System.out.println("Palabra leída: " + palabra);


      //EJEMPLO PRACTICO//

        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();
        System.out.print("Ingrese su altura en metros: ");
        double altura = scanner.nextDouble();

        System.out.println("Hola, " + nombre + ". Tienes " + edad + " años y mides " + altura + " metros.");
    }
}





