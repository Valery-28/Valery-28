package gerular;

import java.util.Scanner;

/*
Введите строку. Если она начинается на 'abc', то заменить их на 'www', иначе добавить в конец строки 'zzz'.
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter line: ");
        String line = scanner.nextLine();
        String line2 = "www";
        String line3 = "zzz";
        line = line.toLowerCase();
        if (line.startsWith("abc")) {
            line = line.replace("abc", line2);
        } else {
            line = line.concat(line3);
        }
        System.out.println("Your Line: " + line);
        scanner.close();
    }
}
