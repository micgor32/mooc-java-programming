

public class Division {

    public static void main(String[] args) {
        
        // Once you have implemented the division method, you can
        // try it out here. Fopr example division(3,5);
        // should print "0.6"

        division(2, 1);
    }

    public static void division(int numberOne, int numberTwo) {
        double n1 = Double.valueOf(numberOne); 
        double n2 = Double.valueOf(numberTwo);
        for (double i = n1; i <= n2; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}
