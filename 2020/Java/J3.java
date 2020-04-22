import java.util.*;
public class J3 {
	public static void main(String args[]) {
        Scanner input = new Scanner (System.in);
        List<String> dropsX = new ArrayList<String>();
        List<String> dropsY = new ArrayList<String>();
	List<Integer> dropsXInt = new ArrayList<Integer>();
	List<Integer> dropsYInt = new ArrayList<Integer>();
        int L = input.nextInt();
        for (int i=0; i<L;i++){
            	String str = input.next();
		String[] splitStr = str.split(",");
		dropsX.add(splitStr[0]);
		dropsY.add(splitStr[1]);
        }
	for (String s : dropsX) dropsXInt.add(Integer.valueOf(s));
	for (String s : dropsY) dropsYInt.add(Integer.valueOf(s));
	System.out.println((Collections.min(dropsXInt) -1) + "," + (Collections.min(dropsYInt) -1));
	System.out.println((Collections.max(dropsXInt) +1) + "," + (Collections.max(dropsYInt) +1));
    }
}
