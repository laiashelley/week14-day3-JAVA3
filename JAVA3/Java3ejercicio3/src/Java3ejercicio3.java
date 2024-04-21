// 3- SWITCH  - WHILE:

// El archivo sonoro!

// Usando una variable byte, preguntas cuál de los sonidos quieres escuchar. Cuando eligen un número, aparece la onomatopeya de ese sonido. Luego le preguntas: quieres escuchar otro? Y sigue hasta que diga no.

// Ejemplo: elige 1- cohete, y suena ziuuum!, elige 3- moto, y suena brrrmmm!

// Puedes probar la opción do...while para asegurar de que pregunta al menos una vez.

import java.util.Scanner;

public class Java3ejercicio3 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        byte sonidos;

        do{

            System.out.println("Eligue una de las siguientes:");
            System.out.println("1-Cohete");
            System.out.println("2-Moto");
            System.out.println("3-Perro");
            System.out.println("4-Gato");
            System.out.println("0-SALIR");

            sonidos = sc.nextByte();

            switch (sonidos){
                case 0:
                break;

                case 1:
                System.out.println("ziuuuuuuuuuuuuuum!");
                break;

                case 2:
                System.out.println("bruuuuuuuuuuuuuuuum!");
                break;

                case 3:
                System.out.println("guauuuuuuuuuuuu guauuuuuuuuuuuuuu");
                break;

                case 4:
                System.out.println("miaaaaaaaaaaau miaaaaaaaaau");
                break;

                default:
                System.out.println("Debes poner un numero del 0 al 4.");
            }

        } while (sonidos!=0);

        System.out.println("Quieres escuchar otro? (si o no)");
        sc.close();

    }

}
