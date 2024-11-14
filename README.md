<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Employee Management EJB</title>
</head>
<body>

<h1>Employee Management EJB</h1>

<p>This project is an Employee Management System built using <strong>Enterprise JavaBeans (EJB)</strong> and deployed on <strong>GlassFish Server</strong>. It handles basic CRUD operations for employee records, including the management of addresses and salary information.</p>

<h2>Technologies Used</h2>
<ul>
    <li>Java EE (Enterprise Edition)</li>
    <li>EJB (Enterprise JavaBeans)</li>
    <li>JPA (Java Persistence API)</li>
    <li>tomcate Application Server</li>
    <li>Maven</li>
</ul>

<h2>Features</h2>
<ul>
    <li>Create, read, update, and delete (CRUD) operations for employees.</li>
    <li>Management of employee addresses and salary information.</li>
    <li>Find employees by name and surname using JPQL.</li>
    <li>Persist employee data using JPA (Java Persistence API).</li>
</ul>

<h2>Project Structure</h2>
<p>The project is structured into several key components:</p>
<ul>
    <li><strong>EmployeeService Interface:</strong> Defines the service layer for handling employee operations.</li>
    <li><strong>EmployeeBean:</strong> The stateless EJB implementing the employee service logic.</li>
    <li><strong>Employee Entity:</strong> Represents an employee, with fields for name, surname, salary, and associated addresses.</li>
    <li><strong>Address Entity:</strong> Represents the address of an employee.</li>
    <li><strong>Salary Entity:</strong> Represents the salary details of an employee.</li>
</ul>

<h2>Setting Up the Project</h2>
<ol>
    <li>Clone this repository: <code>git clone https://github.com/username/EmployeeManagementEJB.git</code></li>
    <li>Import the project into your preferred IDE (e.g., NetBeans, IntelliJ).</li>
    <li>Ensure GlassFish Server is configured in your IDE.</li>
    <li>Build the project using Maven: <code>mvn clean install</code></li>
    <li>Deploy the project to GlassFish using the server’s admin console or directly from the IDE.</li>
</ol>

<h2>Running the Application</h2>
<p>Once the application is deployed to the GlassFish server, the employee management functionalities can be accessed via the available API endpoints or integrated within a user interface.</p>

<h2>Contributing</h2>
<p>Feel free to fork this repository, make changes, and submit pull requests. Contributions are welcome!</p>

<h2>License</h2>
<p>This project is licensed under the <strong>MIT License</strong>.</p>

</body>
</html>
