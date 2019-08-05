package saeemMentoring;

import java.util.ArrayList;

public class findVowels {
    public static void main(String[] args) {
       // vowelsAndConsonant("apple");
        vowelList("book");
    }
    public static void vowelsAndConsonant(String str){

         int countVowel =0;
         int countCons =0;
         String vowels  = "a,o,u,i,e";
         for(int i=0; i < str.length(); i++){
             if(vowels.contains(str.charAt(i)+" ")){
                 countVowel++;
             }else{
                 countCons ++;
             }
         }

        System.out.println("Number of vowels : "+countVowel);
        System.out.println("Number of consonant : "+countCons);

    }
    public static void vowelList(String letters){
        ArrayList<Character> arr = new ArrayList<>();
        arr.add('a'); arr.add('o');arr.add('e');arr.add('i');arr.add('u');
        int count=0;
        for(int j=0; j < letters.length(); j++){
            if(arr.contains(letters.charAt(j))){
                count++;
            }
        }
    }
}
