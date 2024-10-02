/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.session;

import java.util.List;
import javax.ejb.Local;
import za.ac.tut.employee.Employee;

/**
 *
 * @author MosesGadebe
 */
@Local
public interface EmployeeService 
{
    public void addEmp(Employee emp);
    public void updateEmp(Employee emp);
    public void deleteEmp(Long empId) throws  Exception;
    public Employee findEmp(Long empID);
    public List<Employee> findAllEmployee();
    public Employee findByNameEmployee(String name, String surname);
}
