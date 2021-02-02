public class EjemploMatrices {
    public static void main(String[] args) {

        int[][] numeros = new int[2][4];

        numeros[0][0] = 1;
        numeros[0][1] = 2;
        numeros[0][2] = 3;
        numeros[0][3] = 4;

        numeros[1][0] = 11;
        numeros[1][1] = 12;
        numeros[1][2] = 13;
        numeros[1][3] = 14;

        System.out.println("Numero de filas: " + numeros.length);
        System.out.println("Numero de Columnas: " + numeros[0].length);

        System.out.println("Primer elemento : " + numeros[0][0]);
        System.out.println("Ultimo elemento : " + numeros[numeros.length -1][numeros[0].length -1]); //1-3

        //mOSTRANDO ARREGLO
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.print(numeros[i][j] + "  ");
            }
            System.out.println();
        }

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.println("Posicion  [" + (i) +","+(j) +"]  ->" + numeros[i][j]);
            }
        }


    }
}
