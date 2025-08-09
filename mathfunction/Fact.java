package mathfunction;
public class Fact {
    public static void main(String[] args) {
        int num = 7, factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial*= i;
        }
        System.out.println("the factorial numer is " + factorial);
    }
}
