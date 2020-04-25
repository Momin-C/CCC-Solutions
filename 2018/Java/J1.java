import java.util.*;
public class J1 {
	public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int n3 = input.nextInt();
        int n4 = input.nextInt();
        if ((n1 == 8 || n1 == 9) && (n4 == 8 || n4 == 9) && (n2 == n3)){
            System.out.println("ignore");
        }
        else{
            System.out.println("answer");
        }
    }
}
