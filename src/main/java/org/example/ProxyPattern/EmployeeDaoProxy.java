package org.example.ProxyPattern;

public class EmployeeDaoProxy implements EmployeeDao{

    EmployeeDaoImpl employeeDao;

    public EmployeeDaoProxy() {
        employeeDao = new EmployeeDaoImpl();
    }


    @Override
    public void create(String client, EmployeeDo obj) throws Exception {
        if(client.equals("ADMIN")) {
            employeeDao.create(client,obj);
            return;
        }
        throw new Exception("Access denied");
    }

    @Override
    public void delete(String client, int employeeId) throws Exception {
        if(client.equals("ADMIN")) {
            employeeDao.delete(client,employeeId);
            return ;
        }
        throw new Exception("Access denied");
    }

    @Override
    public EmployeeDo get(String client, int employeeId) throws Exception {
        if(client.equals("ADMIN")||client.equals("USER")) {
            employeeDao.get(client,employeeId);
            return new EmployeeDo();
        }
        throw new Exception("Access denied");
    }
}
