public class Test {

    int num1 = 15;
    int num2 = 15;

    public Test() {}

    public int deineMum() {
        return num1 * num2;
    }

    public static void main(String[] args) {
        
        Test main = new Test();
        
        System.out.println(main.deineMum());
    }
}