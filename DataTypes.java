public class DataTypes {
    public static void main(String[] args) {
        final int[] INPUT = {1, 2, 3, 4, 5, 6, 7, 8, 9}; 
        int sum = 0;
        String sumString = "0";
        double sumDouble = 0.0;

        int i = 0;
        for (i = 0; i<INPUT.length; i++) { //goes through the array, number by number
            sum += INPUT [i]; //as the program goes through the array, it adds the number by number
            
        }
        System.out.println("int: " + sum);
        System.out.println("String: " + String.valueOf(sum)); //String.valueOf changes sum from int into string
        System.out.println("double: " + Double.valueOf(sum)); //Double.valueOf changes sum from int into double
    }
}
