import java.util.*;
import java.util.Scanner;
public class pdmstring {
    public static void main(String args[]){
        Scanner src=new Scanner(System.in);
        System.out.println("enter any string:");
        String word=src.next();
        String org_word=word;
        String rev="";
        int len=word.length();
        for(int i=len-1;i>=0;i--){
           rev=rev+word.charAt(i);
        }
        if(org_word.equals(rev)){
            System.out.println(org_word+" is palindrome string");
        }
        else{
            System.out.println(org_word+" is not palindrome string");
        }
    }
}
