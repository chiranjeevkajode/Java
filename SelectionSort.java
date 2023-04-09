public class SelectionSort {

    public static int[] selectionSort(int[] arr){
        for (int i = 0; i < arr.length -1; i++) {
            int index= i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[index]) {
                    index = j;
                }
            }
            int sNum =arr[index];
            arr[index] = arr[i];
            arr[i] = sNum;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] newArray = {23,4,52,66,74,75,89,90,1,5,134};
        int[] sortArray = selectionSort(newArray);
        for (int i = 0; i < sortArray.length; i++) {
            System.out.print(sortArray[i]);
            System.out.print(",");
        }
    }
}
