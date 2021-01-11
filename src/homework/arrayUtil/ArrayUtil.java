package homework.arrayUtil;

public class ArrayUtil {
    public static void main(String[] args) {
        //մասիվի բոլոր էլեմենտները print array
        int[] array = {2, 5, 8, 10, 32, 22, 11, 66, 12, 30};
        for (int i = 0; i < 10; i++) {
            System.out.print(array[i] + " ");
        }

//        մասիվի ամենափոքրը թիվը find minimum of array
        System.out.println();

        int minValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minValue) {
                array[i] = minValue;
            }
        }
        System.out.println("Min value " + minValue);


        System.out.println();
        //մասիվի ամենամեծ թիվը  find maximum of array

//        int maxValue = array[0];
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] > maxValue) {
//                array[i] = maxValue;
//            }
//        }
//        System.out.println("Max value " + maxValue);

        // մասիվի բոլոր զույգ էլեմենտները print all evens
        for (int i = 0; i < 10; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();

        // մասիվի բոլոր կենտ էլեմենտները։ print all odds
//        for (int i = 0; i < 10; i++) {
//            if (array[i] % 2 == 1) {
//                System.out.print(array[i] + " ");
//            }
//        }
//        System.out.println();

////մասիվի էլեմենտների գումարը։
//
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            result = result + array[i];
        }
        System.out.println(result);

        System.out.println();

        //մասիվի բոլոր թվերի միջին թվաբանականը (բոլոր էլեմենտների գումարը / էլեմենտների քանակի վրա)

//        int result = 0;
//        for (int i = 0; i < 10; i++) {
//            result = result + array[i];
//        }
//        System.out.println((double) result / 10);
//        System.out.println();
//


// կենտերի քանակը count of odds
//        int oddCount = 0;
//        for (int i = 0; i < 10; i++)
//            if (array[i] % 2 != 0)
//                oddCount = oddCount + 1;
//        {
//            System.out.println("kent" + " " + oddCount);
//        }
//        System.out.println();

        // զույգերի քանակը count of evens
//        int evenCount =0;
//        for (int i = 0; i < 10; i++)
//            if (array[i] %2 ==0)
//            evenCount = evenCount + 1;{
//            System.out.println("zuyg" + " " evenCount);
//        }
    }
}


