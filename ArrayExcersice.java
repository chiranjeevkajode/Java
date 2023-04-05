package Arrays;

public class ArrayExcersice {
    public static void main(String[] args) {
        // int[] elements= {1,2,3,4,5,6,7,8,11,44,55,88,114,100};
        // for(int i=0;i<elements.length;i++){
        //     System.out.println("Element is : " + elements[i]);
        // }
        // int largest=elements[0];
        // for(int i=1;i<elements.length;i++){
        //     if(elements[i]>largest){
        //         largest=elements[i];
        //     }
        // }
        // System.out.println("Largest num is " + largest);
        // int sum = 0;
        // for(int i=0; i<elements.length; i++){
        //     sum= sum+ elements[i];
        // }
        // System.out.println("sum is " + sum);

        double[] elements={3.6,5.7,7.8,8.8,10.8,23.8,44.8,66,777,88};
        for(int i=0;i<elements.length; i++){
            System.out.println("Element is " + elements[i]);
        }

        double largest=elements[0];
        for(int i=1; i<elements.length; i++){
            if(elements[i]>largest){
                largest=elements[i];
            }
        }
        System.out.println("Largest number is " + largest);

        double sum = 0;
        for(int i=0;i<elements.length; i++){
            sum += elements[i];
        }
        System.out.println("Total sum is " + sum);
    }
    
}
