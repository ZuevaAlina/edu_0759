/*
Задание: Дан массив с числами. Проверьте, что в этом массиве есть число 5.
 Если есть - выведите 'да', а если нет - выведите 'нет'.
*/

public class Main {
    public static void main(String[] args) {
        int nums[] = {1,5,3};
        int result = 0;
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] != 5) result = 0;
            else {
                result = 1;
                break;
            }
        }
        if (result == 0) System.out.println("нет");
        else System.out.println("да");
    }
}
