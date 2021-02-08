public class EjemploMatricesSimetrica {
    public static void main(String[] args) {


        /*
           Son simetricas cuando la fila 1 es igual a la columna 1

           1,2,3,4        2,            3,            4
           2,           2,1,0,5         0,            5
           3,             0,        3,0,1,6           6
           4,             5,            6,      4,5,6,7

         */

        /*
               Tambien mas eficiente comprobar la tranpuesta
               Ejemplo comprobar el numer 3;

                1,2,3,4 -> position [0][2]
                ahora comprobar su opuesta [2][0] => 1,
                                                     2,
                                                     3,
                                                     4,

              Si asi ocurre sucesivamente y todas son iguales es por es simetrica
         */

        boolean simetrica = true;
        int[][] matriz = {
                {1, 2, 3, 4},
                {2, 1, 0, 5},
                {3, 0, 1, 6},
                {4, 5, 6, 7}
        };

        //Usando for
        salir:
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < i; j++) {
                if (matriz[i][j] != matriz[j][i]) {
                    simetrica = false;
                    break salir;
                }
            }
        }

        //Usando while
        int i, j;
        i = 0;
        while (i < matriz.length && simetrica == true) {
            j = 0;
            // j < i -> para evitar que compruebe doble ves y sea mas eficiente porque si no
            // seria [i][j] != [i][j] y luego vuelve a hacer ese proce pero opuesto
            while (j < i && simetrica == true) {
                if (matriz[i][j] != matriz[j][i]) {
                    simetrica = false;
                }
                j++;
            }
            i++;
        }

        /* USANDO WHILE Y ETIQUETAS

        int i, j;
        i = 0;
        salir: while(i < matriz.length){
            j = 0;
            // j < i -> para evitar que compruebe doble ves y sea mas eficiente porque si no
            // seria [i][j] != [i][j] y luego vuelve a hacer ese proce pero opuesto
            while(j < i){
                if(matriz[i][j] != matriz[j][i]){
                    simetrica = false;
                    break salir;
                }
                j++;
            }
            i++;
        }
         */




        /*  USANDO FOR Y ETIQUETAS
      salir: for(int i = 0; i < matriz.length; i++){
                for(int j = 0; j < i ; j++){
                    if(matriz[i][j] != matriz[j][i]){
                        simetrica = false;
                          break salir;
                    }
                }
            }
         */


        
        if (simetrica) {
            System.out.println("Es SIMETRICA");
        } else {
            System.out.println("NO ES -> simetrica");
        }

    }
}
