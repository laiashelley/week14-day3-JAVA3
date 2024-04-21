
// 2- WHILE:

// Una asociación benéfica te envía a pedir caridad. Preguntas "una ayudita?", y si te dicen que sí, preguntas cuánto quieren poner. Si te dicen que no, te deprimes y te vas para tu casa.

// Al final, tienes que decir cuánta gente te ha ayudado y cuánto dinero has recaudado.

import java.util.Scanner;

public class Java3ejercicio2 {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Somos una asociación benéfica. ¿Nos ayudas?");
        
        String respuestaAyuda = sc.nextLine();

        if (respuestaAyuda.equals("si")){

            System.out.println("Escribe la cantidad que quieras donar: Escribe 0 para acabar");

            int genteAyuda= 0;
            float dineroRecaudado = 0;
            int cantidadUsuario = sc.nextInt();

            while(cantidadUsuario != 0){
                genteAyuda++;
                dineroRecaudado += cantidadUsuario;
                cantidadUsuario = sc.nextInt();
            }

            System.out.println("Me ha ayudado " + genteAyuda + " y hemos recaudado " + dineroRecaudado);

        } else {
            System.out.println("Nos deprimimos y nos vamos a casa.");
        }


        sc.close();

    }
}
