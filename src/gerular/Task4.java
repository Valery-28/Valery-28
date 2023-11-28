package gerular;
/*
Поменяйте местами первое самое длинное слово с последним самым коротким
 */
public class Task4 {
    public static void main(String[] args) {
        String word = "Поменяйте местами первое самое длинное слово с последним самым коротким";
        String [] str = word.split(" ");
        int lengthStr = 0;
        int maxStr = 0;
        int minStr = 0;
        String strMin;
        String strMax;
        for(String words : str){
            System.out.println(words);
            lengthStr = words.length();
        }
    }
}