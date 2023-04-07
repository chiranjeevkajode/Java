public class BubbleShort {

    public static void sorting(int array[]){
        int n = array.length;
        int k;

        for(int m =n; m >= 0; m--){
            for (int i = 0; i < n-1; i++) {
                k = i + 1;
                if(array[i] > array[k] ){
                    swap(i, k, array);
                    
                }
            }
            printNum(array);

        }
    }

    private static void swap(int i, int j, int[] array){
        int temp;
        temp= array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private static void printNum(int[] input){
        for(int i=0; i<input.length; i++){
            System.out.print(input[i] + " , ");
        }
        System.out.println("\n");
    } 
    public static void main(String[] args) {
        int[] input = {13,7,6,5,4,3,0,1};
        sorting(input);
    }
}
