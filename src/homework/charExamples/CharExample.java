package homework.charExamples;

public class CharExample {
    public static void main(String[] args) {

        //1.Ունենք հետևյալ մասիվը՝
        // Պետք է գրել կոդ, որը text մասիվից կստանա char[] result մասիվ,
        // որը կլինի նույն տեքստը, առանց պռաբելների(իրար կողք կտպի barev)։
        char[] text = {' ', ' ', 'b', 'a', 'r', ' ', 'e', 'v', ' ', ' '};
        int beginIndex = 0;
        int endIndex = text.length - 1;
        while (beginIndex < endIndex && text[beginIndex] == ' ') {
            beginIndex++;
        }
        while (beginIndex < endIndex && text[endIndex] == ' ') {
            endIndex--;
        }
        char[] result = new char[(endIndex-beginIndex) + 1];
        int index =0;
        for (int i = beginIndex; i <endIndex+1 ; i++) {
            result[index++] = text[i];
        }
        for (int i = 0; i < result.length ; i++) {
            System.out.print(result[i]);

        }

//        //2.Ունենք հետևյալ մասիվը՝
//        //ունենք նաև մի սինվոլ՝ char c = 'o';
//        //Պետք է գրել լոգիկա, որը կհաշվի թե քանի հատ կա c-փոփոխականից մեր մասիվի մեջ, ու տպել այդ քանակը։
//        char[] bolola = {'b', 'o', 'l', 'o', 'l', 'a'};
//        char c = 'o';
//        int count = 0;
//        for (char x: bolola) {
//            if (x == c)
//                count ++;
//        }
//        System.out.println("cout of " +c);
//        System.out.println(count);

        //3) Ունենք հետևյալ մասիվը՝ գրել կոդ, որը կտպի մեջտեղի 2 սինվոլները։
//        char[] bolola = {'b','o','l','o','l','a'};
//        int x = bolola.length;
//        System.out.print(bolola[(x/2)-1]);
//        System.out.print(bolola[x/2]);
        //4) Ունենք հետևյալ մասիվը՝
        // պետք է տպենք true եթե մեր մասիվը վերջանում է ly-ով, եթե ոչ՝ false
//        char[] bolola = {'b','o','l','o','l','a'};
//
//        if (bolola[bolola.length-2] == 'l' && bolola[bolola.length-1]== 'y') {
//            System.out.println(true);
//        }else{
//            System.out.println(false);
//        }

        //5) Ունենք հետևյալ մասիվը՝
        ////Տպում ենք true եթե տեքստը պարունակում է bob բառը, բայց o-ի տեղը կարող է լինել ցանկացած սինվոլ։
//        char[] bolola = {'b', 'a', 'b', 'o', 'l', 'a'};
//        boolean bobThere = false;
//        for (int i = 0; i < bolola.length-2; i++) {
//            if (bolola[i] == 'b' && bolola[i + 2] == 'b') {
//                bobThere = true;
//            }
//        }
//        System.out.println(bobThere);
    }
}



