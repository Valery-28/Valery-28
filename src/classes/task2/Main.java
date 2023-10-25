package classes.task2;
/*
Создайте класс Phone, который содержит поля number, model и weight.
○	Создайте три экземпляра (instance) этого класса.
○	Выведите в консоль их значения.
○	Добавить в класс Phone методы: receiveCall (один параметр – имя звонящего).
Выводит на консоль сообщение “Звонит {name}”. getNumber – возвращает номер телефона.
Вызвать эти методы для каждого из объектов
○	Добавить второй метод receiveCall, который принимает два параметра - имя звонящего и номер телефона звонящего.
Вызвать этот метод.
○	Создать метод sendMessage с аргументами переменной длины.
Данный метод принимает на вход номера телефонов, которым будет отправлено сообщение.
Метод выводит на консоль номера этих телефонов.

 */
public class Main {
    public static void main(String[] args) {
        Phone samsung = new Phone(292209815,"S21+",250);
        Phone apple = new Phone(336354923,"iPhone 14 Pro",300);
        Phone xiaomi = new Phone(333515086,"mi 11",200);
        System.out.println(samsung);
        System.out.println(apple);
        System.out.println(xiaomi);
    }
}
