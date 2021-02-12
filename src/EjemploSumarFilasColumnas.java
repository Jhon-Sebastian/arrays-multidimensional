public class EjemploSumarFilasColumnas {
    public static void main(String[] args) {

        int sumRow, sumColumn;

        int[][] a = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int i = 0; i < a.length; i++) {
            sumRow = 0;
            sumColumn = 0;
            for (int j = 0; j < a[i].length; j++) {
                sumRow += a[i][j];
                sumColumn += a[j][i];
            }
            System.out.println("Total fia " + i + " : " + sumRow);
            System.out.println("Total Columna " + i + " : " + sumColumn);
        }

    }
}
