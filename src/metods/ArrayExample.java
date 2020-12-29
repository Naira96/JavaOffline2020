package metods;

public class ArrayExample {
    void isExists(int array[], int x) {
        boolean isExists = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                isExists = true;
            }
        }
        System.out.println(isExists);
    }

    void findIndex(int array[],int x) {

        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                index = i;
            }
        }
        System.out.println(index);
    }

    void printValueByIndex(int array[]) {
        int index = 4;
        System.out.println(array[index]);
    }

    void isRepeated(int array[]) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    System.out.println(array[i] + " is Repeated");
                }
            }
        }
    }

    void bubblesortmaxmin(int array[]) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length - i; j++) {
                if (array[j] > array[j - 1]) {
                    int tmp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = tmp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    void bubblesortminmax(int array[]) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length - 1; j++) {
                if (array[j] < array[j - 1]) {
                    int tmp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = tmp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    void secMax(int array[]) {
        int max = array[0];
        int secMax = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                secMax = max;
                max = array[i];
            } else {
                if (array[i] != max && array[i] > secMax) {
                    secMax = array[i];
                }
            }
        }
        System.out.println(secMax);
    }
}

