public class EjemploMatricesColumnasVariables {
    public static void main(String[] args) {

        int[][] matriz = new int[3][];

        //Declarar la cantidad de columnas va a tener cada fila
        matriz[0] = new int[2];
        matriz[1] = new int[3];
        matriz[2] = new int[4];

        //Mostrando la cantidad de columnas que tiene cada fila
        System.out.println("Matriz length = " + matriz.length);
        System.out.println("Fila 0 -> length = " + matriz[0].length); //2
        System.out.println("Fila 1 -> length = " + matriz[1].length); //3
        System.out.println("Fila 2 -> length = " + matriz[2].length); //4

        //Llenado matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = i*j  + i * i;
            }
        }

        //Mostrando matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
