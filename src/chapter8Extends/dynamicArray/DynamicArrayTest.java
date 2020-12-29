package chapter8Extends.dynamicArray;

public class DynamicArrayTest {
    public static void main(String[] args) {
        DynamicArray da = new DynamicArray();

        da.add(20);
        da.add(2);
        da.add(28);
        da.add(30);
        da.add(10);
        da.add(16);
        da.add(18);


        int byIndex = da.getByIndex(7);
        da.getByIndex(5);
        System.out.println(byIndex);
        da.print();
        System.out.println();

        int max = da.max();
        System.out.println("Max " + max);
        int min = da.min();
        System.out.println("Min " + min);

        da.deleteByIndex(2);
        int[] result = da.subArray(2, 5);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }


    }
}
