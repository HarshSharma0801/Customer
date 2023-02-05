public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer();
        System.out.println(customer1.getCustomerName()+" "+customer1.getCustomerEmail()+" "
                +customer1.getCreditLimit());
        Customer customer2 = new Customer("Bheem","bheem@rrr.com","20000000");
        System.out.println(customer2.getCustomerName()+" "+customer2.getCustomerEmail()+" "
                +customer2.getCreditLimit());
        Customer customer3 = new Customer("Raju","raju@rrr.com");
        System.out.println(customer3.getCustomerName()+" "+customer3.getCustomerEmail()+" "
                +customer3.getCreditLimit());
        Customer customer4 = new Customer("Harsh","Harsh@Best.com",
                "unlimited");
        System.out.println(customer4.getCustomerName()+" "+customer4.getCustomerEmail()+" "
                +customer4.getCreditLimit());

    }
}