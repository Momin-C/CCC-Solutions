import java.util.*;
public class Main {
	public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int startX = input.nextInt();
        int startY = input.nextInt();
        int endX = input.nextInt();
        int endY = input.nextInt();
        int t = input.nextInt();
        int d = Math.abs(endX - startX) + Math.abs(endY - startY);

        if ((t-d)%2==0 && t-d>=0){
            System.out.println("Y");
        }
        else{
            System.out.println("N");
        }
    }
}
