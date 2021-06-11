/*
Задание: Дан массив с числами. Проверьте, есть ли в нем два одинаковых числа подряд.
 Если есть - выведите 'да', а если нет - выведите 'нет'.
*/

//проверка связи

public class Main {
    public static void main(String[] args) {
        int nums[] = {1,2,3,3};
        int result = 0;
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] != nums[i+1]) result = 0;
            else {
                result = 1;
                break;
            }
        }
        if (result == 0) System.out.println("нет");
        else System.out.println("да");

    }
}
