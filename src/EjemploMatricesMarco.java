public class EjemploMatricesMarco {
    public static void main(String[] args) {

        int[][] a = new int[5][5];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if(i == 0 || i == a.length -1 || j == 0 || j == a[i].length-1){
                    a[i][j] = 1;
                }
            }
        }
        
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
