package gerular;

import java.util.Scanner;

/*
Вводится ненормированная строка, у которой могут быть пробелы в начале, в конце и между словами более одного пробела.
Привести ее к нормированному виду, т.е. удалить все пробелы в начале и конце, а между словами оставить только один пробел.
 */
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your line: ");
        String line = scanner.nextLine();
        line = line.trim();
        String[] words = line.split(" {2}");
        for (String word : words){
            System.out.print(word);
    }
        scanner.close();
    }
}
