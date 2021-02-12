public class EjemploMatricesTransponerMatrices {
    public static void main(String[] args) {

        //Para hacer la transpuesta de una matriz en otra
        //Toca tener el numero de filas y columnas opuestas
        int[][] a = new int[8][4];
        int[][] b = new int[4][8];

        //Llenamos la matriz -> a
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = ((i + 1) * 2)+j;
            }
        }

        //Matriz original
        System.out.println("\nMatriz a NORMAL");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }

        //Hacemos el transposicion
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                b[i][j] = a[j][i];
            }
        }

        System.out.println("\nMatriz b Transpuestas");
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.print(b[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
