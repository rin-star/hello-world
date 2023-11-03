public class LoopsAndMethods {

    private static int[] array = new int[] {
        1, 2, 3, 4, 5
    };

    public static void printWhile() {
        int i = 0;
        while (i<array.length) {
            System.out.println(array[i]);
            i++;
        }
    }

    public static void printDoWhile(){
        int i = 0;

        do{
            System.out.println(array[i]);
            i++;
        }
        while (i<array.length);
    }

    public static void printForLoop() {
        for (int i=0; i<array.length; i++) {
            System.out.println(array[i]);
        } 
    }

    public static void printForEach() {
        for(int i: array) {
            System.out.println(i);
        }
    }

    public static void printWithCondition(int condition){
        for (int i=0; i<array.length; i++) {
            if (array[i]%2==0) {
                System.out.println(array[i]);
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("---|   While Loop   |---");
        printWhile();
        System.out.println("---| Do While Loop  |---");
        printDoWhile();
        System.out.println("---|    For Loop    |---");
        printForLoop();
        System.out.println("---| For Each Loop  |---");
        printForEach();
        System.out.println("---| With Condition |---");
        // in this case the example is 3 but the parameter could be any int value
        printWithCondition(3);
    }
}
