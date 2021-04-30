package myweb.login.dbtest;

import myweb.login.Customer.customer;
import myweb.login.DAO.customerDao;

public class dbTest {
    public static void main(String[] args) {
//        customerDao customerdao = new customerDao();
        String resvkey = "RK123321";
        customer cus = customerDao.getCustomerByresvkey(resvkey);
        System.out.println(cus);
    }
}
