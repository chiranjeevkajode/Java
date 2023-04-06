package TODOList;

import java.util.ArrayList;

public class TodoFunction {
    private ArrayList<String> todoList=new ArrayList<String>();
    // add item 

    public void addItem(String item){
        todoList.add(item);
    }

    // Remove item 

    public void removeItem(int index){
        String myItem=todoList.get(index);
        todoList.remove(index);
    }

    // Print entire items
    public void printTodoList(){
        System.out.println("TODO list are of " + todoList.size() + "items");
        
        for(int i=0;i<todoList.size();i++){
            System.out.println("At Position" + (i+1) + " is " + todoList.get(i));
        }
    }

    // Update The List
    
    public void updateList(int index, String list){
        todoList.set(index, list);
        System.out.println("Updation is done " + index + 1);
    }

    // serach feture

    public String findItem(String searchItem){
        int index=todoList.indexOf(searchItem);

        if(index==-1){
            return null;
        }else{
            return todoList.get(index);
        }
    }
    
}
