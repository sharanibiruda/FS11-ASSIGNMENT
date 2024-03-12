
// 2)Create a Java class MathOperations with overloaded methods for addition (add) that can accept two integers, three doubles, and two strings, respectively. Demonstrate the usage of these methods in the main method by adding two integers, three doubles, and concatenating two strings.

public class Operations{

    public int add(int x, int y) {
        return x + y;
    }
    
    public double add(double x, double y, double z){
        return x + y + z;
    }
    
    public String add(String x, String y){
        return x + y;
    }

    public static void main(String[] args){
        Operations op = new Operations();
        int IntSum = op.add(35, 87);
        System.out.println("Sum of two integers: " + IntSum);
        double DoubleSum = op.add(91.02, 56.91, 11.11);
        System.out.println("Sum of three doubles: " + DoubleSum);
        String StringConcat = op.add("Welcome", "to India!");
        System.out.println("Concatenation of two strings: " + StringConcat);
    }
}
