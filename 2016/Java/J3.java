import java.util.*;
public class Main {
	public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        String word = input.next();
        List<Integer> lst = new ArrayList<Integer>();
        for (int i = 0; i<word.length(); i++){
            for (int x = word.length(); x>-1; x--){
                if (word.substring(i,x+1) != "" && word.substring(i,x+1) == new StringBuilder(word.substring(i,x+1)).reverse().toString()){
                    lst.add(Math.abs(x+1-i));
                    break;
                }
            }
        }
        System.out.println((Collections.max(lst)));
    }
}
