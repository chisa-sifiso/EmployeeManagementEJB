package za.ac.tut.employee;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import za.ac.tut.employee.Address;
import za.ac.tut.employee.Salary;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-08-07T19:30:35")
@StaticMetamodel(Employee.class)
public class Employee_ { 

    public static volatile ListAttribute<Employee, Address> addresses;
    public static volatile SingularAttribute<Employee, String> surname;
    public static volatile SingularAttribute<Employee, String> name;
    public static volatile SingularAttribute<Employee, Long> empNo;
    public static volatile SingularAttribute<Employee, Salary> salary;

}