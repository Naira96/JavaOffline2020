package chapter5;

public class ForEach {
    public static void main(String[] args) {
//        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        int sum = 0;
//        for (int x : nums) {
//            System.out.println("Знaчeниe равно: " + x);
//            sum += x;
//        }
//        System.out.println("Cyммa равна: " + sum);
//
//        System.out.println();
//
//        int sum = 0;
//        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        for (int x:nums){
//            System.out.println("Знaчeниe равно: " + x);
//            sum+= x;
//            if (x == 5) break;
//        }
//        System.out.println("Сумма пяти первых элементов равна: " + sum);
        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for ( int x: nums){
            System.out.print(x + " ");
            x = x * 10;
        }
        System.out.println();
        for (int x: nums)
            System.out.print(x + " ");
            System.out.println();
    }
}
