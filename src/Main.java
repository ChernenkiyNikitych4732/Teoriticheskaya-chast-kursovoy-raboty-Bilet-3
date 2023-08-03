public class Main {
    public static void main (String[] args) {
        System.out.println("Привет, мир!");
            System.out.println("Задача: Напишите программу, которая разделяет любую строку на две части ровно пополам по количеству символов.");
            String source = "Я обожаю изучать профессию Java-разрабочткик";
            String head = "";
            String tail = "";
            System.out.println("Исходная строка:" + source);

            while (source.length() < 2) {
                source = source + " ";
            }

            if (source.length() % 2 == 1) {
                source = source + " ";
            }

            head = source.substring(0, source.length() / 2);
            tail = source.substring(source.length() / 2, source.length());

            System.out.println("Первая половина:" + head);
            System.out.println("Вторая половина:" + tail);

        }
    }