public class VariableExample {
    static int staticVariable = 10;  // Class variable

    int instanceVariable = 20;  // Instance variable

    public void display() {
        int localVariable = 30;  // Local variable
        System.out.println("Local Variable: " + localVariable);
        System.out.println("Instance Variable: " + instanceVariable);
        System.out.println("Class Variable: " + staticVariable);
    }

    public static void main(String[] args) {
        VariableExample example = new VariableExample();
        example.display();
    }
}
