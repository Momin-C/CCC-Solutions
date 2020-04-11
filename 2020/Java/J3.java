import java.util.*;
public class J3 {
	public static void main(String args[]) {
        Scanner input = new Scanner (System.in);
        ArrayList<String> dropsX = new ArrayList<String>();
        ArrayList<String> dropsY = new ArrayList<String>();

        int L = input.nextInt();
        String str;
        for (int i=0; i<L;i++){
            str = input.next();
            String[] splitStr = str.trim().split("\\s+ ");


            dropsX.add(splitStr[0]);
            System.out.println(dropsX);
            dropsY.add(splitStr[1]);
            System.out.println(dropsY);
        }

    }
}
