import java.util.*;
import java.lang.StringBuilder;
public class Main {
	public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        List<String> grid = new ArrayList<String>();
        grid.add("1 2");
        grid.add("3 4");
        String seq = input.next();
        for (int i =0; i<seq.length(); i++){
            if (seq.charAt(i) == 'H'){
                Collections.reverse(grid);
            }
            else if (seq.charAt(i) == 'V'){
                String reverse0 = new StringBuilder(grid.get(0)).reverse().toString();
                String reverse1 = new StringBuilder(grid.get(1)).reverse().toString();
                grid.add(reverse0);
                grid.add(reverse1);
                grid.remove(0);
                grid.remove(0);
            }
        }
        System.out.println(grid.get(0));
        System.out.println(grid.get(1));
    }
}
