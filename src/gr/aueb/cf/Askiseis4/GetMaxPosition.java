package gr.aueb.cf.Askiseis4;

public class GetMaxPosition {
    public static void main(String[] args) {
        int[] arr = {30, 12, 80, 7, 15,90,100,500,300,1,3,5000,54,760};
        int maxPosition=0;

        maxPosition=getMaxPosition(arr,0,arr.length-1);
        System.out.printf("Max Position: %d",maxPosition);

    }

    public static int getMaxPosition(int[] arr, int low, int high) {
        int maxPosition=low;
        int maxValue=arr[low];

        if((low<0) || (high>arr.length-1)){
            System.out.println("Error in array dimensions");
            return -1;
        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxPosition = i;
                maxValue = arr[i];
            }
        }
        return maxPosition;
    }
}

