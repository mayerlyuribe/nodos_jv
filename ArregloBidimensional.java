
import javax.swing.JOptionPane;

public class ArregloBidimensional {
    public static void main(String[] args) {
        int filas = 2;
        int columnas = 2;
        int[][] matriz = new int[filas][columnas];
        // Llenar la matriz con valores
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[fila].length; columna++) {
               String valor= JOptionPane.showInputDialog("Ingrese el valor para la posición [" + fila + "][" + columna + "]");
               matriz[fila][columna] = Integer.parseInt(valor);

            }
            System.out.println();
        }
           for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[fila].length; columna++) {
             JOptionPane.showMessageDialog(null, "El valor de la posición [" + fila + "][" + columna + "] es: " + matriz[fila][columna]);

            }
            System.out.println();
        }
        

    }

}
