import java.util.*;
public class J2 {
	public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        List<String> num = new ArrayList<String>();
	    List<Integer> numInt = new ArrayList<Integer>();
	    List<String> character = new ArrayList<String>();
        //String[] splitStr;
        int L = input.nextInt();
        System.out.println("Integer L is " + L);
        for (int i = 0; i<L;i++){
            numInt
            input.nextLine();
            String str = input.nextLine();
            System.out.println("Str is: " + str);
            String[] splitStr = str.split("\\s");
            System.out.println("The length of the split string is: " + splitStr.length);
            //System.out.println(Arrays.toString(splitStr));
            System.out.println("[ " + splitStr[0] + " , " +splitStr[1] + " ]");
        }
        //for (String s : num) numInt.add(Integer.valueOf(s));
    }
}
