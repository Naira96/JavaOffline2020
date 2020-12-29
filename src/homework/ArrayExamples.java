package homework;

public class ArrayExamples {
    public static void main(String[] args) {
        int array[] = {0, 5, -2, 24, 31, 100, 95, 5, 48, 9};

        //1. Ունենք թիվ, օրինակ՝ int x = 44; ներքևում պետք է գրենք կոդ,
        // որը մեզ կտպի true եթե նշված թիվը կա վերևի մասիվի մեջ, եթե չկա false:

//        int x = 44;
//        boolean isExists = false;
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] == x) {
//                isExists = true;
//            }
//        }
//        System.out.println(isExists);
        //2. Ունենք թիվ, օրինակ՝ int x = 44; ներքևում պետք է գրենք կոդ,
        // որը մեզ կտպի 44 թվի ինդեքսը մասիվի մեջ եթե կա, եթե չկա -1 կտպի։
//        int x = 44;
//        int index = -1;
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] == x) {
//                index = i;
//            }
//        }
//        System.out.println(index);
        //3.Ունենք թիվ, օրինակ՝ int index = 4;
        // ներքևում պետք է գրենք կոդ, որը կտպի տրված index - ինդեքսի մեջի արժեքը։
//        int index = 4;
//        System.out.println(array[index]);

// 4.tpel krknvox tiv@
//        for (int i = 0; i < array.length; i++) {
//            for (int j = i + 1; j < array.length; j++) {
//                if (array[i] == array[j]) {
//                    System.out.println(array[i] + " tiv@ krknvum e");
//                }
//
//            }
//        }
        // 5 sortavorel mecic poqr
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length-i; j++) {
                if (array[j] > array[j-1]){
                    int tmp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = tmp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+ " ");
        }

        //6. sortavorel poqric mec
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 1; j < array.length-1; j++) {
//                if (array[j] < array[j-1]){
//                    int tmp = array[j];
//                    array[j] = array[j-1];
//                    array[j-1] = tmp;
//                }
//            }
//        }
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i]+ " ");
//        }

        //7. tpel erkrord amenamec tiv@
//        int max = array[0];
//        int secMax = array[0];
//        for (int i = 1; i < array.length; i++) {
//            if (max < array[i]) {
//                secMax = max;
//                max = array[i];
//            } else {
//                if (array[i] != max && array[i] > secMax) {
//                    secMax = array[i];
//                }
//            }
//        }
//        System.out.println(secMax);
    }
}
