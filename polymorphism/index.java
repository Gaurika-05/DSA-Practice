package polymorphism;
 class calculator {
    public int add(int a, int b) {
        return a + b;
    }
    public int add(int a,int b, int c){
        return a+b+c;
    }
    public double add(double a, double b) {
        return a + b;
    }
}
 public class index{
    public static void main(String[] args) {
        calculator calc = new calculator();
        System.out.println("Sum of two integers: " + calc.add(5, 10));
        System.out.println("Sum of three integers: " + calc.add(5, 10, 15));
        System.out.println("Sum of two doubles: " + calc.add(5.5, 10.5));
    }
 }