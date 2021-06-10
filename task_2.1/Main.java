/*Вывести на экран все возможные комбинации слов "Мама", "Мыла", "Раму".
Подсказка: их 6 штук.
Каждую комбинацию вывести с новой строки. Слова не разделять.
Пример:
МылаРамуМама
РамуМамаМыла
...
Требования:
•	Программа должна выводить текст.
•	Выведенный текст должен содержать 6 строк.
•	Текст в каждой строке должен быть уникален.
•	Должны быть выведены все возможные комбинации. */

//проверка связи

public class Main {
    public static void main(String[] args) {
        String[] mum  = new String[] {"Мама", "Мыла", "Раму"};
        System.out.println(mum[0]+mum[1]+mum[2]);
        System.out.println(mum[0]+mum[2]+mum[1]);
        System.out.println(mum[1]+mum[2]+mum[0]);
        System.out.println(mum[1]+mum[0]+mum[2]);
        System.out.println(mum[2]+mum[1]+mum[0]);
        System.out.println(mum[2]+mum[0]+mum[1]);
        }

    }
