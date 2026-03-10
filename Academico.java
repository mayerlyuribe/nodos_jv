import java.util.Scanner;

public class Academico {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int
        // arreglos
        int[] calificaciones1 = new int[4];
        // calificaciones1[0] = 10;
        for (int i = 0; i < calificaciones1.length; i++) {
            System.out.println("Ingrese la calificación " + i + ": ");
            calificaciones1[i] = sc.nextInt();
        }

        for (int i = 0; i < calificaciones1.length; i++) {
            System.out.println("Calificación " + i + ": " + calificaciones1[i]);
        }
        int[] calificaciones2 = new int[4];

        for (int i = 0; i < calificaciones2.length; i++) {
            System.out.println("Ingrese la calificación " + i + ": ");
            calificaciones2[i] = sc.nextInt();
        }

        for (int i = 0; i < calificaciones2.length; i++) {
            System.out.println("Calificación " + i + ": " + calificaciones2[i]);
        }
        int[] diferencias = new int[4];

    }for (int i = 0; i < diferencias.length; i++) {
            diferencias[i] = calificaciones1[i] - calificaciones2[i];
            if(diferencias[i] < 0){
                System.out.println("La calificación " + i + " fue mejor en el segundo periodo");
            } else if(diferencias[i] > 0){
                System.out.println("La calificación " + i + " fue mejor en el primer periodo");
            } else {
                System.out.println("La calificación " + i + " fue igual en ambos periodos");
            }
        }
        int suma=0;
        for(int i=0; i < diferencias.length; i++){
            suma =suma+ diferencias[i];
        }
        System.out.println("La diferencia de calificaciones es: " + suma);
        double promedio = (double) suma / diferencias.length;
        System.out.println("El promedio de las diferencias es: " + promedio);

        for(int valor:diferencias){
            System.out.println("Diferencia: " + valor);
        }

    }

}
