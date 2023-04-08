public class InsertionSort {

    public static int[] insertionSort(int[] input){
        int temp;
        for (int i = 1; i < input.length; i++) {
            for (int j = i; j > 0; j--) {
                if (input[j] < input[j-1]) {
                    temp = input[j];
                    input[j] = input[j-1];
                    input[j-1] = temp;
                }                
            }
            
        }
        return input;
    }

    public static void main(String[] args) {
        int[] array={1,23,54,67,24,99,45,345};
        int[] sortedArray = insertionSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(sortedArray[i]);
            System.out.print(",");
        }
    }
}
