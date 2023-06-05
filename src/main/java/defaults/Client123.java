package defaults;

public class Client123 implements Interface1,Interface2,Interface3{

    public void methodA(){
        System.out.println("Inside method A " + Client123.class);
    }
    // Priority
    // 1. Class that implements the interface (itself)
    // 2. The sub interface that extends the interface (children)

    public static void main(String[] args) {
        Client123 client123 = new Client123();
        client123.methodA(); // resolves child implementation
        client123.methodB();
        client123.methodC();
    }
}
