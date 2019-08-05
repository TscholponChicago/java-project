package saeemMentoring;
import java.util.*;
public class methods {
    public static void main(String[] args) {

        System.out.println(theEnd("Hello",true));
        System.out.println(add(12,45));
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a sentence to be analyzed: ");
        countWords(scan.nextLine());
        countWords2(scan.nextLine());
    }
     public static String theEnd(String str, boolean front){
        char first = str.charAt(0);
        char last = str.charAt(str.length()-1);
        if(front){
            return first+"";
        }else {
            return last +"";
        }
    }
    public static int add(int num1,int num2){

        int sum =num1+num2;
        return sum;
    }
   public static void countWords(String sent){

      String [] arr= sent.split(" ");
      System.out.println("Words in this snetence are : "+ Arrays.toString(arr));
      System.out.println("The number of words in this sentence is : " + arr.length);

   }
   // second version\
    public static void countWords2(String str1){
        int count=0;
        str1= str1.trim();
        for(int j=0; j < str1.length();j++){
            if(str1.charAt(0) == ' '){
                count++;
            }
        }
        System.out.println("Number of words : "+count);
    }

}
