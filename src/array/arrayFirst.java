package array;

public class arrayFirst {
    public static void main(String[] args) {
        String [] names  = {"Cholpon","John","Kate"};
        for(int i =0; i < names.length; i++){
            names[1] = "David";
            for(int j =0; j < names[i].length();j++){
                System.out.print(names[i].charAt(j));
            }
        }
    }
}

