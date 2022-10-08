public class matris_transpoz_alma {
    public static void main(String[] args) {
        int k = 0;
        int[][] dizi = {
                {1, 2, 3},
                {4, 5, 6},
        };
        int[][] dizi2 = new int[dizi[0].length][dizi.length];
        for (int i = 0; i < dizi.length; i++){
            for (int j = 0; j < dizi[i].length; j++){
                dizi2[j][i] = dizi[i][j];
            }
        }
        System.out.println("Transposed matris: ");

        for (int i = 0; i < dizi2.length; i++){
            for (int j = 0; j < dizi2[i].length; j++){
                System.out.print(dizi2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
