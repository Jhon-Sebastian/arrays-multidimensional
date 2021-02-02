public class EjemploMatricesStringFor {
    public static void main(String[] args) {

        String[][] nombres = new String[3][2];

        nombres[0][0] = "pepe";
        nombres[0][1] = "Pepa";

        nombres[1][0] = "luisa";
        nombres[1][1] = "andrea";

        nombres[2][0] = "karla";
        nombres[2][1] = "gomez";

        System.out.println("Iterador con For");
        for(int i = 0; i < nombres.length; i++){
            for(int j = 0; j < nombres[i].length; j++){
                System.out.print(nombres[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nIterador con Foreach");
        for(String[] fila: nombres){
            for(String columna : fila){
                System.out.print(columna + "\t");
            }
            System.out.println();
        }

    }
}
