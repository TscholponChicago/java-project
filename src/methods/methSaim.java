package methods;

public class methSaim {

    public static void main(String[] args) {
        System.out.println(concatt("abc", ""));
    }

    public static String concatt(String str1, String str2) {
        if(str1.isEmpty()){
            return str2;
        }else if(str2.isEmpty()){
            return str1;
        }
        if (str1.length() == str2.length()) {

            if (str1.charAt(str1.length() - 1) == str2.charAt(0)) {
                String cut = str2.substring(1);

                return str1.concat(cut);

            }
        } else {
            return str1 + str2;
        }
     return "";

    }
}