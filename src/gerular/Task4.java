package gerular;

import java.util.Arrays;

/*
Поменяйте местами первое самое длинное слово с последним самым коротким
 */
public class Task4 {
    public static void main(String[] args) {
        String word = "Поменяйте местами первое самое длинное слово c последним самым коротким";
        String[] str = word.split(" ");
        int maxWord = 0;
        int minWord = 0;
        String temp;
        String strMax = str[0];
        String strMin = str[0];
        for (int i = 0; i < str.length; i++) {
            if (str[i].length() > strMax.length()) {
                maxWord = i;
                strMax = str[i];
            }
            if (str[i].length() <= strMin.length()) {
                minWord = i;
                strMin = str[i];
            }
        }
        System.out.println("До замены: " + Arrays.toString(str));
        System.out.println("Max: " + strMax);
        System.out.println("Min: " + strMin);
        temp = str[minWord];
        str[minWord] = str[maxWord];
        str[maxWord] = temp;
        System.out.print("После замены: ");
        Arrays.stream(str).forEach(e -> System.out.print(e + " "));
    }
}