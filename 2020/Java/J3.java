import java.util.*;
public class J3 {
	public static void main(String args[]) {
        Scanner input = new Scanner (System.in);
        ArrayList<String> dropsX = new ArrayList<String>();
        ArrayList<String> dropsY = new ArrayList<String>();
		String[] splitStr;
        int L = input.nextInt();
        String str;

        for (int i=0; i<=L;i++){
            str = input.nextLine();
			splitStr = str.split(", ");
			System.out.println(splitStr[0]);
			System.out.println(splitStr[1]);
			/*
            dropsX.add(splitStr[0]);
			dropsY.add(splitStr[1]);
			*/
        }

    }
}
