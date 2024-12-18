package org.example.ProxyPattern;

public class ProxyDemo {

    public static void main(String[] args){
        EmployeeDao employeeDao = new EmployeeDaoProxy();
        try {
            employeeDao.create("USER",new EmployeeDo());
            System.out.println("operation successful");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
