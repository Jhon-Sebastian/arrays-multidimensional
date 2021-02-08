public class EjemploMatricesBuscarElemento {
    public static void main(String[] args) {

        int[][] matrizEnteros = {
                {11,22,33,44},
                {23,45,56,67},
                {55,66,77,88}
        };

        int elementoBuscar = 56;
        boolean encontrado = false;

        //Etiquetas

        int i = 0;
        int j = 0;
        buscar: for (i = 0;i < matrizEnteros.length; i++) {
                    for (j = 0;j < matrizEnteros[i].length; j++) {
                        if(matrizEnteros[i][j] == elementoBuscar){
                            encontrado = true;
                            break buscar;
                        }
                    }
                 }

        if(encontrado){
            System.out.println("El elemento a buscar " + elementoBuscar + " fue encontrado en: " + i + ","+ j);
        }else{
            System.out.println("Elemento no encontrado");
        }

        //Mostrando matriz
        for (int k = 0; k < matrizEnteros.length; k++) {
            for (int l = 0; l < matrizEnteros[k].length; l++) {
                System.out.print(matrizEnteros[k][l] + "\t");
            }
            System.out.println();
        }

    }

}
