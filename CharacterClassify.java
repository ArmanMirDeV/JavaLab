import java.util.Scanner;

public class CharacterClassify {


    void makeClassification(String str){
        int vowel = 0, consonants = 0, digit = 0, specialChar = 0;
        for (int i = 0; i<str.length(); i++){
         char ch=str.charAt(i);
            if(ch>'a' && ch<'z' || ch>'A' && ch<'Z'){
                
            }
        }

    }



    public static void main(String[] args) {
 
        CharacterClassify cc = new CharacterClassify();
        Scanner input = new Scanner(System.in);


        System.out.print("Enter a string: ");
        String str = input.nextLine(); // Hello@24

        System.out.println( str); 
        cc.makeClassification(str);

    }
}
