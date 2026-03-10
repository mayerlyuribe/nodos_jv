import javax.swing.JOptionPane;

public class SumarArreglos {
    public static void main(String[] args) {
        int filas = 2;
        int columnas = 2;

        int[][] array1 = new int[filas][columnas];
        int[][] array2 = new int[filas][columnas];
        int[][] suma = new int[filas][columnas];

        for (int fila = 0; fila < array1.length; fila++) {
            for (int columna = 0; columna < array1[fila].length; columna++) {
                String valor = JOptionPane.showInputDialog(
                        "Ingrese el valor para la posición [" + fila + "][" + columna + "] , del primer arreglo");
                array1[fila][columna] = Integer.parseInt(valor);
            }
            System.out.println();
        }

        for (int fila = 0; fila < array2.length; fila++) {
            for (int columna = 0; columna < array2[fila].length; columna++) {
                String valor = JOptionPane.showInputDialog(
                        "Ingrese el valor para la posición [" + fila + "][" + columna + "] , del segundo arreglo");
                array2[fila][columna] = Integer.parseInt(valor);
            }
            System.out.println();
        }
        for (int fila = 0; fila < suma.length; fila++) {
            for (int columna = 0; columna < suma[fila].length; columna++) {
                suma[fila][columna] = array1[fila][columna] + array2[fila][columna];
            }
            System.out.println();
        }
        System.out.println("Suma de los arreglos");
        for (int fila = 0; fila < suma.length; fila++) {
            for (int columna = 0; columna < suma[fila].length; columna++) {
            int sumaarray = (suma[fila][columna]);
                JOptionPane.showConfirmDialog(null, sumaarray);

            }
            System.out.println();
        }
    }

}
