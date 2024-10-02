/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.session;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import za.ac.tut.employee.Employee;


@Stateless
public class EmployeeBean implements EmployeeService
{
    @PersistenceContext(unitName="empUnit")
    private EntityManager entity;

    @Override
    public void addEmp(Employee emp)
    {
       entity.persist(emp);
    }

    @Override
    public void updateEmp(Employee emp)
    {
        Employee empObj = null;
        empObj = findEmp(emp.getEmpNo());
        
        if (empObj != null)
        {
            entity.merge(emp);        
        }
    }

    @Override
    public void deleteEmp(Long empId) throws  Exception
    {
        Employee empObj = null;
        empObj = findEmp(empId);
         if (empObj != null)
        {
            entity.remove(empObj);        
        }
        else
         {
             throw new Exception("Record is not found");
         }
    }

    @Override
    public Employee findEmp(Long empID) 
    {
        Employee employee = entity.find(Employee.class, empID);
        return employee;
    }

    @Override
    public List<Employee> findAllEmployee() {
        String sql = "select e from Employee e";        
        
        List<Employee> list = (List<Employee>) entity.createQuery(sql).getResultList();
        return list;        
    }

    @Override
    public Employee findByNameEmployee(String name, String surname) 
    {
        String sql = "select e from Employee e where e.name = '"+ name +"' and e.surname = '"+surname+"'";        
        Employee employee = (Employee)entity.createQuery(sql).getSingleResult();    
        return employee;
    }

    public Employee findByName(String ename, String esurname) 
    {
        String sql = "select e from Employee e where e.name = :name AND e.surname = :surname'";        
        Query query = entity.createQuery(sql);    
        query.setParameter("name", ename);
        query.setParameter("surname", esurname);  
        Employee employee = (Employee) query.getSingleResult();
        return employee;
    }
    
}
