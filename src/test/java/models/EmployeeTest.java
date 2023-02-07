package models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {
    @Test
    void getCapitalizedname() {

        Address address = new Address("address 1", "city 1");
        Employee employee = new Employee("bob",123456789, 10000, address);

        String actualName = employee.getCapitalizedname();
        assertEquals("Bob",actualName);
    }

}