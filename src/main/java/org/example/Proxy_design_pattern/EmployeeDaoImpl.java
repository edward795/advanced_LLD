package org.example.Proxy_design_pattern;

public class EmployeeDaoImpl implements EmployeeDao
{
    @Override
    public void create(String clientId, EmployeeDo obj) throws Exception {
        System.out.println("created a row in the employee table!");
    }

    @Override
    public void delete(String client, int employeeId) throws Exception {
        System.out.println("deleted row with employeeID:");
    }

    @Override
    public EmployeeDo get(String client, int employeeId) throws Exception {
        System.out.println("fetching data from DB");
        return new EmployeeDo();
    }
}
