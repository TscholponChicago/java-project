package mentor;

public class switchExs{


    public void compLength() {
        //this is not dynamic
        String str1 = "book";
        String str2 = "book";
        if (str1.length() == str2.length()) {
            System.out.println("The length are same");
        } else {
            System.out.println("Not same");
        }
    }
        public void compLength1(String ss1,String ss2){
            if(ss1.length() == ss2.length()){
                System.out.println("Same");
            }else{
                System.out.println("nottt");
            }
        }
        public void findLetter(String s,String b){
        if(s.contains("a") && b.contains("c")){
            System.out.println("These sent have these letters");
        }else{
            System.out.println("They dont have");
        }
        }
    }





