package saeemMentoring;

public class overloading {
    public static void main(String[] args) {
        System.out.println(theEnd("book",true, 2));
        System.out.println(theEnd("flower","flowers"));

    }
    public static String theEnd(String str, boolean front) {
        if(!front) {
            return str.substring(0,1);
        } else {
            return str.substring(str.length()-1);
        }
    }

//
        public static String theEnd(String str, boolean front, int number) {
//            if(front) {
//                return str.substring(0,1);
//            } else {
//                return str.substring(str.length()-1);
//            }
            return str.charAt(number -1) + "";
        }
        public static String theEnd(String str1,String str2 ){
        if(str1.length() == str2.length() ){

            return "They are same length";
        }else{
            return "They are not";
        }
        }
    }







