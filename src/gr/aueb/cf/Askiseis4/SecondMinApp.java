package gr.aueb.cf.Askiseis4;

public class SecondMinApp {
    public static void main(String[] args) {
        int[] arr = {30, 12, 80, 7, 15, 90, 1000, 500, 3000, 1, 3, 5, 54, 76};
        int min = arr[0];
        int secondmin = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                secondmin = min;
                min = arr[i];
            } else if (arr[i] < secondmin && arr[i] != min) {
                secondmin = arr[i];
            }
        }
        System.out.printf("SecondMin value: %d, Min value: %d", secondmin, min);
    }
}

