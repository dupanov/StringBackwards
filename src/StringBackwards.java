import java.util.Scanner;

/**
 * Created by Вадик on 30.10.2015.
 */
public class StringBackwards {
    public static void main(String[] args) {
        String line="";
        System.out.println("Enter string to backward turn");
        System.out.println("");
        Scanner sc = new Scanner(System.in);
        line=sc.nextLine();

        System.out.println(stringBackwards(line));
    }

    private static String stringBackwards (String str){
        String result="";
        for(int i=str.length()-1;i>=0;i--){
            result = result + str.valueOf(str.charAt(i));
        }
        return result;
    }
}
