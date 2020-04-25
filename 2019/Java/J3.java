import java.util.*;
public class J3 {
	public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        String lines = input.nextLine();
        int L = Integer.parseInt(lines);
        System.out.println(L);
        List<String> lst = new ArrayList<String>();
        for (int i = 0; i<L; i++){
            List<String> lst1 = new ArrayList<String>();
            String text = input.nextLine();
            while (text!=""){
                int num = StringUtils.countMatches(text, text.charAt(0));
                if (num>1){
                    for (int x = 1; x<num; x++){
                        if (text.charAt(x) != text.charAt(x-1)){
                            num = x;
                            break;
                        }
                    }
                }
                lst1.add(num + " " + text.charAt(0));
                text = text.substring(num);
            }
        }
    }
}
/*
L = int(input())
lst = []
for counter in range (L):
    lst1 = []
    text = input()
    while text != "":
        num = text.count(text[0])
        if num > 1:
            for counter in range (1,num):
                if text[counter] != text[counter-1]:
                    num = counter
                    break
        lst1.append(str(num) + " " + text[0])
        text = text[num:]
    lst.append(" ".join(lst1))
for counter in range (len(lst)):
    print (lst[counter])
*/
