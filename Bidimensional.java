public class Bidimensional {
    public static void main(String[] args) {
        int[][] matriz = {
                { 1, 2, 3 },
                { 4, 5, 6,8 },
                { 7, 8, 9 }
        };
        System.out.println("Tamaño de la matriz: " + matriz.length);
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[fila].length; columna++) {
                System.out.print(matriz[fila][columna] + " ");
            }
            System.out.println();
        }

    }

}
