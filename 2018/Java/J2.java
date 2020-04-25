import java.util.*;
public class J2 {
	public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String p1 = input.next();
        String p2 = input.next();
        int count = 0;
        for (int i = 0; i<n; i++){
            if ((p1.charAt(i) == 'C') && (p2.charAt(i) == 'C')){
                count+=1;
            }
        }
        System.out.println(count);
    }
}
