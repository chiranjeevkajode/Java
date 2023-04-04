package Arrays;

public class Array {
    public static void main(String[] args) {

        int[] scorearray = new int[10];
        // scorearray[0]=3;
        // scorearray[1]=5;
        // scorearray[2]=8;
        // scorearray[3]=10;
        // System.out.println(scorearray[0]);
        for(int i=0;i<scorearray.length;i++){
            scorearray[i]=i*10;
        }
        for(int i=0;i<scorearray.length;i++){
            System.out.println(scorearray[i]);
        }
    }
    
}
