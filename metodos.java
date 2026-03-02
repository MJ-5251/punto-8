import java.util.Scanner;

public class metodos {

    public datos[][] llenarMatriz(datos[][] m) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                datos o = new datos();

                System.out.println("Ingrese el nombre del producto: ");
                o.setNombre(sc.next());

                System.out.println("Ingrese el peso del producto (kg): ");
                o.setPeso(sc.nextDouble());
                
                System.out.println("Ingrese la categoria (mancuerna/pesa/barra/disco): ");
                o.setCategoria(sc.next().toLowerCase());
                m[i][j] = o;
                
                System.out.println();
            }
        }
        return m;
    }

    public void agruparV(datos[][] m) {
        int cMancuernas = 0, cPesas = 0, cBarras = 0, cDiscos = 0;

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j].getCategoria().equalsIgnoreCase("mancuerna")) {
                    cMancuernas = cMancuernas + 1;
                }
                 else if (m[i][j].getCategoria().equalsIgnoreCase("pesa")) {
                    cPesas = cPesas + 1;
                } 
                 else if (m[i][j].getCategoria().equalsIgnoreCase("barra")) {
                    cBarras = cBarras + 1;
                } 
                 else if (m[i][j].getCategoria().equalsIgnoreCase("disco")) {
                    cDiscos = cDiscos + 1;
                }
            }
        }

        datos[] mancuernas = new datos[cMancuernas];
        datos[] pesas = new datos[cPesas];
        datos[] barras = new datos[cBarras];
        datos[] discos = new datos[cDiscos];

        int pMancuernas = 0, pPesas = 0, pBarras = 0, pDiscos = 0;

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j].getCategoria().equalsIgnoreCase("mancuerna")) {
                    mancuernas[pMancuernas] = m[i][j];
                    pMancuernas = pMancuernas + 1;
                } 
                else if (m[i][j].getCategoria().equalsIgnoreCase("pesa")) {
                    pesas[pPesas] = m[i][j];
                    pPesas = pPesas + 1;
                } 
                else if (m[i][j].getCategoria().equalsIgnoreCase("barra")) {
                    barras[pBarras] = m[i][j];
                    pBarras = pBarras + 1;
                } 
                else if (m[i][j].getCategoria().equalsIgnoreCase("disco")) {
                    discos[pDiscos] = m[i][j];
                    pDiscos = pDiscos + 1;
                }
            }
        }

        int max = 0;

        if (cMancuernas > max)
             max = cMancuernas;

        if (cPesas > max)
             max = cPesas;

        if (cBarras > max) 
            max = cBarras;

        if (cDiscos > max) 
            max = cDiscos;

        datos[][] resultado = new datos[4][max];

        for (int j = 0; j < mancuernas.length; j++) 
            resultado[0][j] = mancuernas[j];

        for (int j = 0; j < pesas.length; j++) 
            resultado[1][j] = pesas[j];

        for (int j = 0; j < barras.length; j++) 
            resultado[2][j] = barras[j];

        for (int j = 0; j < discos.length; j++)
             resultado[3][j] = discos[j];

        imprimirMatriz(resultado);
    }

    public void imprimirMatriz(datos[][] m) {
        String[] categorias = {"mancuerna", "pesa", "barra", "disco"};

            for (int i = 0; i < m.length; i++) {
                System.out.println("------- " + categorias[i].toUpperCase() + " -------");

                int encontrados = 0;

                for (int j = 0; j < m[i].length; j++) {
                    if (m[i][j] != null) {
                        System.out.println("Nombre: " + m[i][j].getNombre() + " Peso: " + m[i][j].getPeso() + "kg Categoria: " + m[i][j].getCategoria());
                        
                        encontrados = encontrados + 1;
                    }
                }

                if (encontrados == 0) {
                    System.out.println("No hay productos en esta categoria.");
                    }
            }
            System.out.println("-----------------------------");
    }
}