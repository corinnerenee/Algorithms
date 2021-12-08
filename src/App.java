import java.util.Scanner;
import java.util.Arrays;

public class App {

    private static final int MAXCAP = 5;
    public static void main(String[] args) throws Exception {
        Scanner kb = new Scanner(System.in);

        System.out.println("Enter your numbers here ");
		String idk = kb.nextLine();

        System.out.println("Enter target number ");
        int targy = kb.nextInt();

        kb.close();
        Scanner op = new Scanner(idk);

        ArrayStack<Integer> stacky = new ArrayStack<Integer>(idk.length());

        while(op.hasNext()){
			stacky.push(op.nextInt());
		}
        op.close();

        System.out.println(stacky.toString());
        //76,89,04,66,23,16,29,34,900
       int iffy = Algorithms.linearSearch(stacky, targy);    

       if(iffy!= -1){
           System.out.println("Target found at position " + iffy);
       }else
        System.out.println("Target not found.");
        //data -> array to be searched
        //min -> int representation of min value
        //max -> int representatin of max value
        //target -> element being searched for
    }

}
