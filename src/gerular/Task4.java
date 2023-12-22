package gerular;

import java.util.Arrays;

/*
Поменяйте местами первое самое длинное слово с последним самым коротким
 */
public class Task4 {
    public static void main(String[] args) {
        String word = "Поменяйте местами первое самое длинное слово c последним самым коротким";
        String [] str = word.split(" ");
        String [] str2 = new String[str.length];
        int lengthStr;
        int maxStr = 0;
        int minStr = 999;
        int indexMax=0;
        int indexMin=0;
        String strMin = "";
        String strMax = "";
        for(String words : str){
            lengthStr = words.length();
            if(lengthStr > maxStr){
                maxStr = lengthStr;
                strMax = words;
                indexMax = words.indexOf(strMax);
            }
            if(lengthStr <= minStr){
                minStr = lengthStr;
                strMin = words;
                indexMin = words.indexOf(strMin);
            }
            str[indexMax]=strMin;
            str[indexMin]=strMax;
            System.arraycopy(str, 0, str2, 0, str.length);

        }


        System.out.println("Самое большое слово в тексте: "+ strMax + ", его длина: " + maxStr );
        System.out.println("Самое маленькое слово в тексте:  " + strMin + ", его длина: " + minStr);
        System.out.println(Arrays.toString(str2));

    }
}