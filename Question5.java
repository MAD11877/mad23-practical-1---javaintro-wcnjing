import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class Question5 {
    public static void main(String[] args) {
     /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
    int mode =0;
     List<Integer> numberList = new ArrayList<>();
     Scanner in = new Scanner(System.in);
    System.out.println();
    int n = in.nextInt();
    do {
        System.out.println();
        int i = in.nextInt();
        numberList.add(i);
        n--;
    } while (n>0);
    int max = 0;

    for (int x=0; x < numberList.size(); x++) {
         int count = 0;
        for (int y=0; y < numberList.size(); y++) {
            if (numberList.get(x) == numberList.get(y)) {
                count++;
            }
            if (count>=max) {
                mode = numberList.get(x);
                max=count;
            }
        }
        
        /** 1. Check each element to see how many each appears */
    }
     System.out.println(mode);
    
    
    }
}
