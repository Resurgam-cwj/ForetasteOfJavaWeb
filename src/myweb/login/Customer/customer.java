package myweb.login.Customer;

public class customer {
    private String customerName;
    private String customerId;
    private int resvtype;
    private String resvkey;
    public int getResvtype() {
        return resvtype;
    }

    public void setResvtype(int resvtype) {
        this.resvtype = resvtype;
    }

    public String getResvkey() {
        return resvkey;
    }

    public void setResvkey(String resvkey) {
        this.resvkey = resvkey;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    @Override
    public String toString() {
        return "customer{" +
                "customerName='" + customerName + '\'' +
                ", customerId='" + customerId + '\'' +
                '}';
    }
}
