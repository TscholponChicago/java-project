package gurhanRevision;

public class JavaQuestions {
    public static void main(String[] args) {
        //i went to picnic today
        // i tnew ot cincip yadot
        revWords("I went to picnic today");
    }
    public static void revWords(String str){
        String [] arr = str.split(" ");
        String data ="";
        for(String word:arr){
            for(int i=word.length()-1; i >=0; i --){
                data += word.charAt(i);
            }
            data += " ";//" " because we need space betw words
        }
        System.out.println("The first format of the  sent :"+str);
        System.out.println("The result: "+data.trim());

    }
}
