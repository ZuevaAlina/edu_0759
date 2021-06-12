/*
* Задание: Дана коллекция с числами. Запишите в новую коллекцию только те числа,
* которые больше нуля и меньше 10-ти.
* Коллекции вы создаёте сами
*/

import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
    ArrayList<Integer> nums = new ArrayList<>();
    ArrayList<Integer> nums1 = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            nums.add(i);
            }
        for (int i = 0; i < nums.size(); i++) {
            if ((nums.get(i)>0)&&(nums.get(i)<10)){
                nums1.add(nums.get(i));
            }
        }
        System.out.println(nums);
        System.out.println(nums1);
    }
}
