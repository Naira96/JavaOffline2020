package homework.metods;

public class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtil au = new ArrayUtil();
        int[] array = {2, 5, 8, 10, 32, 22, 11, 66, 12, 30};
        au.printArrayElements(array);
        au.minValue(array);
        au.maxValue(array);
        au.evenElements(array);
        au.oddElements(array);
        au.sumOfElements(array);
        au.averageArithmetic(array);
        au.countOfOdds(array);
        au.countOFEvens(array);

    }
}
