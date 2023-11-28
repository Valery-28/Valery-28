package gerular;

/*
 Введите строку (текст). Найдите наибольшее количество идущих подряд цифр.
 */

public class Task3 {
    public static void main(final String[] args) {
        char[] chars = "Введите строку и найдите наибольшее3333 количество идущих подряд цифр"
                .toCharArray();
        int position = 0;
        int arrayLength = 0;
        int tempPosition = 0;
        int tempLength = 0;
        for (int i = 0; i < chars.length; i++) {
            if (Character.isDigit(chars[i])) {
                if (tempLength == 0) {
                    tempPosition = i;
                }
                tempLength++;
            } else {
                if (tempLength > arrayLength) {
                    arrayLength = tempLength;
                    position = tempPosition;
                }
                tempLength = 0;
                tempPosition = 0;
            }
        }
        System.out.println("Position: " + position + " Length: " + arrayLength + " Value: "
                + String.valueOf(chars).substring(position, position + arrayLength));
    }
}