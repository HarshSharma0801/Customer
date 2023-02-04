public class Customer {
    private String customerName;
    private String customerEmail;
    private String creditLimit;

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public String getCreditLimit() {
        return creditLimit;
    }

    public Customer(String customerName, String customerEmail, String creditLimit) {
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.creditLimit = creditLimit;
    }
    public Customer (){
        this ("Rocky","rocky@bhai.com","10000000");
    }
    public Customer(String customerName,String customerEmail){
        this (customerName,customerEmail,"1000000");

    }
}
