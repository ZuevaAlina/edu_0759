/*
Задание: Дан массив с числами. Узнайте сколько элементов с начала массива надо сложить,
чтобы в сумме получилось больше 10-ти.
*/

public class Main {
    public static void main(String[] args) {
        int nums[] = {3,8,6};
        int result = 0;
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            result = result + nums[i];
            k = k + 1;
            if (result > 10) break;
        }
        System.out.println(k);

    }
}
