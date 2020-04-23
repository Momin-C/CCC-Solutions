import java.util.*;
public class J2V2 {
	public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        List<Integer> num = new ArrayList<Integer>();
	    List<String> character = new ArrayList<String>();
        List<String> printable = new ArrayList<String>();
        int L = input.nextInt();
        for (int i = 0; i<L;i++){
            String toAdd = "";
            int number = input.nextInt();
            String c = input.next();
            num.add(number);
            character.add(c);
            for (int q = 0; q<number;q++){
                toAdd+=c;
            }
            printable.add(toAdd);
        }
        for (int x = 0; x<L; x++){
            System.out.println(printable.get(x));
        }
    }
}
