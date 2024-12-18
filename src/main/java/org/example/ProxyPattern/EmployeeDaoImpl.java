package org.example.ProxyPattern;

public class EmployeeDaoImpl implements EmployeeDao{

    @Override
    public void create(String client, EmployeeDo obj) throws Exception {
        System.out.println("create new row in table");
    }

    @Override
    public void delete(String client, int employeeId) throws Exception {
        System.out.println("delete  row in table");
    }

    @Override
    public EmployeeDo get(String client, int employeeId) throws Exception {
        System.out.println("fetch record from table");
        return new EmployeeDo();
    }
}
