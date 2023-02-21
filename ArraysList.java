import java.util.ArrayList;

public class ArraysList{
    public static void main(String[] args) {
        
        ArrayList<Integer> myString = new ArrayList<Integer>();

        for(int i=1; i<=20; i++){
            myString.add(Integer.valueOf(i));
        }

        for(int i=0; i<=20; i++){
            System.out.println("Value of " + myString.get(i).intValue());
        }
        

    }
}