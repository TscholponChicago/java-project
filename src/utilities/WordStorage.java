package utilities;

import java.util.ArrayList;
import java.util.Scanner;

public class WordStorage {


    public static ArrayList<String> filterList(ArrayList<String> words, int length){
        ArrayList<String> result =new ArrayList<>();
        for(String word : words){
            if(word.length() == length){
                result.add(word);
            }
        }
        return result;
    }
}
