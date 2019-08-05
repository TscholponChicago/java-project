package mentor;

public class findDoubleLetters {
    public static void main(String[] args) {
        String str  = "cybertek";
        int countE =  0;
        for(int i = 0; i < str.length(); i++){
            if((str.charAt(i)+" ").equals("e")){
                countE++;
            }
        }
        System.out.println(countE);
    }
}
