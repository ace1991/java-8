package defaults;

public class Client14 implements Interface1,Interface4{

    // You have to overwrite the method if both interface have the same method
    public void methodA(){
        System.out.println("Inside method A " + Client14.class);
    }

    public static void main(String[] args) {
        Client14 client14 = new Client14();
        client14.methodA();
    }
}
