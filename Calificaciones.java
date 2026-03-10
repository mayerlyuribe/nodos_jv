public class Calificaciones {
    public static void main(String[] args) {
        double[] calificaciones1 = { 3.2, 4.5, 2.9, 4.5, 3.2 };// Tamaño del arreglo //Posiciones del arreglo
        double[] calificaciones = new double[5];// Tamaño del arreglo //Posiciones del arreglo
        calificaciones[0] = 3.2;
        // nombre del arreglo [posicion]=valor;
        calificaciones[1] = 4.5;
        calificaciones[2] = 2.9;
        calificaciones[3] = 4.5;
        calificaciones[4] = 3.2;
        System.out.println("Calificaciones: " + calificaciones[0] + ", " + calificaciones[1] + ", " + calificaciones[2]
                + ", " + calificaciones[3] + ", " + calificaciones[4]);

        double suma = 0;
        // Tamaño del arreglo con length
        for (int posicion = 0; posicion < calificaciones.length; posicion++) {
            suma += calificaciones[posicion];
        }
        System.out.println("Suma: " + suma);
        System.out.println("Promedio: " + suma / calificaciones.length);

        double minimo = calificaciones[0];
        double maximo = calificaciones[0];
        for (int posicion = 0; posicion < calificaciones.length; posicion++) {
            if (calificaciones[posicion] < minimo) {
                minimo = calificaciones[posicion];
            }
            if (calificaciones[posicion] > maximo) {
                maximo = calificaciones[posicion];
            }
        }
        System.out.println("Mínimo: " + minimo);
        System.out.println("Máximo: " + maximo);

        int aprobados = 0;
        int reprobados = 0;

        for (int posicion = 0; posicion < calificaciones.length; posicion++) {
            if (calificaciones[posicion] < 3.0) {
                System.out.println("Reprobado: " + calificaciones[posicion]);
                reprobados++;
            } else {
                System.out.println("Aprobado: " + calificaciones[posicion]);
                aprobados++;
            }
        }
        System.out.println("Aprobados: " + aprobados);
        System.out.println("Reprobados: " + reprobados);
    }

}
