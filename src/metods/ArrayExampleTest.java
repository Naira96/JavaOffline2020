package metods;

public class ArrayExampleTest {
    public static void main(String[] args) {
        int array[] = {0, 5, -2, 24, 31, 100, 95, 5, 48, 9};
        ArrayExample ae = new ArrayExample();
        ae.isExists(array,44);
        ae.findIndex(array,44);
        ae.printValueByIndex(array);
        ae.isRepeated(array);
        ae.bubblesortmaxmin(array);
        ae.bubblesortminmax(array);
        ae.secMax(array);
    }
}
