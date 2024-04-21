// 1- SWITCH:

// Preguntas estación del año. Mediante un switch, respondes una cosa u otra. Ejemplo "primavera". Respuesta: "la primavera me alteraaa".

import java.util.Scanner;

public class Java3ejercicio1 {
    public static void main(String[] args) throws Exception {

        System.out.println("Dime una estación del año: Primavera, Otoño, Invierno o Verano");

        Scanner sc = new Scanner(System.in);
        String estacion = sc.nextLine().toLowerCase();

        sc.close();

        switch (estacion){

            case "primavera":
            System.out.println("Ya no existe la primavera.");
            break;

            case "verano":
            System.out.println("Odio el verano.");
            break;

            case "invierno":
            System.out.println("Dura 2 meses.");
            break;

            case "otoño":
            System.out.println("Ojalá existiera el otoño todavía.");
            break;

            default:
            System.out.println("Debes introducir una estación del año.");
        }
    }
}