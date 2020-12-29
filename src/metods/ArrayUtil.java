package metods;

public class ArrayUtil {
    void printArrayElements(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    void minValue(int array[]) {
        int minValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }
        System.out.println("min value" + minValue);
    }

    void maxValue(int array[]) {
        int maxValue = array[9];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }
        System.out.println("max Value" + maxValue);
    }

    void evenElements(int array[]) {
        for (int i = 0; i < 10; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
    }

    void oddElements(int array[]) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
    }

    void sumOfElements(int array[]) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            result = result + array[i];
        }
        System.out.println(result);
    }

    void averageArithmetic(int array[]) {
        int result = 0;
        for (int i = 0; i < 10; i++) {
            result = result + array[i];
        }
        System.out.println((double) result / 10);
    }

    void countOfOdds(int array[]) {
        int oddCount = 0;
        for (int i = 0; i < 10; i++)
            if (array[i] % 2 != 0)
                oddCount = oddCount + 1;
        {
            System.out.println("odds of " + " " + oddCount);
        }
    }

    void countOFEvens(int array[]) {
        int evenCount = 0;
        for (int i = 0; i < 10; i++)
            if (array[i] % 2 == 0)
                evenCount = evenCount + 1;
        {
            System.out.println("evens of" + " " + evenCount);
        }
    }
}