import java.util.*;
public class J4 {
	public static void main(String args[]) {
        Scanner input = new Scanner (System.in);
        String T = input.next();
        String S = input.next();
	for (int i = 0; i<S.length();i++){
        	S = S.substring(1) + S.charAt(0);
        	if (T.contains(S)){
                	System.out.println("yes");
                	break;
            	}
        }
        if (T.contains(S) == false){
            System.out.println("no");
        }
    }
}
