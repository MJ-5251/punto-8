import java.util.Scanner;

public class principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        metodos o = new metodos();

        System.out.println("Ingrese el numero de filas: ");
        int filas = sc.nextInt();

        System.out.println("Ingrese el numero de columnas: ");
        int columnas = sc.nextInt();

        datos[][] m = new datos[filas][columnas];

        m = o.llenarMatriz(m);
        o.agruparV(m);
    }
}