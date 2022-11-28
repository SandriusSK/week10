package ie.atu.week10;

public class TestPerson {
    public static void main(String[] args) {
        Person sandrius = new Person();
        sandrius.setName("sandrius");
        sandrius.setAddress("ATU");
        sandrius.setTelephone("0870000001");

        System.out.println("Here are sandrius's details" + sandrius.getName());
        // Test Customer
        Customer myCust = new Customer("Sandrius","ATU", "0870000001", "abc", true);

        System.out.println("Details: " + myCust.toString());





    }
}
