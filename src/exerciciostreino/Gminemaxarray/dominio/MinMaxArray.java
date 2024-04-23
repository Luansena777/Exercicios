package exerciciostreino.Gminemaxarray.dominio;

public class MinMaxArray {
    public static int findMinArray(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
        public static int findMaxArray(int[] arr) {
            int max = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > max){
                    max = arr[i];
                }
            }
            return max;
        }
}
