
public class Algorithms {

    private static int finalIndex;

    public static <T extends Comparable<T>> int linearSearch(ArrayStack<Integer> data, T target) throws NullPointerException, EmptyCollectionException{

        boolean found = false;
        Integer popper;
        if (data.size() < 1){
            throw new EmptyCollectionException("Array Stack is empty.");
        }

        if (data == null){
            throw new NullPointerException("Invalid data given.");
        }
        //check if its element on top
        if(data.peek() == target){
            return data.size() ;
        }

        while(!found){
            popper = data.pop();
            if (popper.equals(target)){
                found = true;
                return data.size() ;
            }
        }
    
      return -1;

    }

    

    public static<T extends Comparable<T>> int getIndex(){

        if(finalIndex != -1){
            System.out.println("The target was found at index " + finalIndex);
            return finalIndex;
        }
        else 
            System.out.println("Target wasn't found.");
            return finalIndex;
    }

    public static <T extends Comparable<T>> Integer[] convert(ArrayStack<Integer>data)throws EmptyCollectionException{

        Integer[] daty = new Integer[data.size()];
        int i = 0;

        while(!data.isEmpty()){
            daty[i++] = data.pop();
        }
           
        return daty;
    }
}
    
