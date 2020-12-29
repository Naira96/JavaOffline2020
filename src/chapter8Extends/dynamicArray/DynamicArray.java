package chapter8Extends.dynamicArray;

public class DynamicArray {
    //սա մեր հիմնական մասիվն է, որտեղ պահելու ենք ավելացվող էլեմենտները
    private int[] array = new int[10];
    ///սա մեր մասիվի մեջ ավելացված էլեմենտների քանակն է
    private int size = 0;

    //ստուգել եթե մասիվի մեջ տեղ չկա-> կանչել extend() ընդլայնել
    //և ավելացնենք
    public void add(int value) {
        if (size == array.length) {
            extend();
        }
        array[size++] = value;
    }

    //1,ստեղծել հին մասիվից 10 էլեմենտ ավելի մեծ մասիվ lenght+10
    //2, քցել հին մասիվի էլեմենտները նորի մեջ
    //3,հին մասիվի հղումը կապենք նոր մասիվի հղման հետ
    private void extend() {
        int[] temp = new int[array.length + 10];
//        for (int i = 0; i < array.length; i++) {
//            temp[i] = array[i];
//        }
        System.arraycopy(array, 0, temp, 0, array.length);
        array = temp;
    }


    //եթե տրված ինդեքսը մեր ունեցած մասիվի ինդեքսի սահմաններում է,
    // վերադարջնել մասիվի index-երրորդ էլեմենտը։ Հակառակ դեպքում վերադարփնել -1։
    public int getByIndex(int index) {
        return index >= 0 && index < size ? array[index] : -1;
    }


    //տպել մասիվի ավելացված էլեմենտները
    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }

    //վերադարձնել ավելացված թվերից ամենամեծը
    public int max() {
        int maxValue = array[0];
        for (int i = 0; i < size; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }
        return maxValue;
    }

    //վերադարձնել ավելացված թվերից ամենափոքրը
    public int min() {
        int minValue = array[0];
        for (int i = 0; i < size; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }
        return minValue;
    }

    //մասիվից ջնջում ենք եկած ինդեքսի տակ ընկած էլեմենտը, հետո տպելուց մասիվի բոլոր էլեմենտները կտպի իրար կողք, իսկ ջնջվածները՝ ոչ։
    public void deleteByIndex(int index) {
        for (int i = index + 1; i < size; i++) {
            array[i - 1] = array[i];
        }
        size--;
    }

    //մասիվից ջնջում ենք տված value-ին հավասար բոլոր էլէմենտները
    public void deleteByValue(int value) {
        for (int i = 0; i < size; i++) {
            if (array[i] == value) {
                deleteByIndex(i);
            }
        }
    }

    //մասիվից ջնջում ենք տված value-ին հավասար միայն առաջին էլեմենտը
    public void deleteByValueFirst(int value) {
        for (int i = 0; i < size; i++) {
            if (array[i] == value) {
                deleteByIndex(i);
                break;
            }
        }
    }


    //մասիվից կկտրի ու կստանա փոքր մասիվ ըստ startIndex-ի և endIndex-ի, որն էլ կվերադարձնենք, տեստի մեջ կտպենք
    public int[] subArray(int startIndex, int endIndex) {
        int[] tmp = new int[(endIndex - startIndex) + 1];
        int index = 0;
        for (int i = startIndex; i <= endIndex; i++) {
            tmp[index++] = array[i];
        }
        return tmp;
    }

    //մասիվիղ կկտրի ու կստանա փոքր մասիվ ըստ startIndex-ի մինչև վերջին էլեմենտի,որն էլ կվերադարձնենք, տեստի մեջ կտպենք
    public int[] subArray(int startIndex) {
        return subArray(startIndex, size - 1);
    }


}
