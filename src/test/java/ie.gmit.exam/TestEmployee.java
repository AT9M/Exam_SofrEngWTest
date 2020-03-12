package ie.gmit.exam;


import org.junit.jupiter.api.*;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestEmployee {

    Employee employee;

    @BeforeEach
    public void init(){
    employee = new Employee("Mr","Engineer","123456",1000001,"Full-Time",35);
    }

    @DisplayName("Test Constructor")
    @Test
    public void TestConstructor() {
        assertEquals(35,employee.getAge());
    }

    @DisplayName("Test Wrong Constructor")
    @Test
    public void TestWConstructor() {

        Exception e = assertThrows(IllegalArgumentException.class, new Executable() {
                    @Override
                    public void execute() throws Throwable {
                        Employee employee1 = new Employee("Mr","Engineer","123456",1000001,"Full-",35);
                    }
                });
                assertEquals("Invalid Employement type", e.getMessage());
    }

    @DisplayName("Test Wrong name")
    @Test
    public void TestWName() {

        Exception e = assertThrows(IllegalArgumentException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                Employee employee1 = new Employee("Mr","Eeer","123456",1000001,"Full-Time",35);
            }
        });
        assertEquals("Invalid Name", e.getMessage());
    }

    @DisplayName("Test Wrong Age")
    @Test
    public void TestWAge() {

        Exception e = assertThrows(IllegalArgumentException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                Employee employee1 = new Employee("Miss","Eesffer","123456",1000001,"Full-Time",12);
            }
        });
        assertEquals("The employee must be over 18", e.getMessage());
    }

    @DisplayName("Test Wrong PPS")
    @Test
    public void TestWPPS() {

        Exception e = assertThrows(IllegalArgumentException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                Employee employee1 = new Employee("Mrs","Engineer","1234565456",1000001,"Full-Time",35);
            }
        });
        assertEquals("Not a valid pps Number", e.getMessage());
    }
    @DisplayName("Test Wrong Title")
    @Test
    public void TestWTitle() {

        Exception e = assertThrows(IllegalArgumentException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                Employee employee1 = new Employee("Mrdfgfdgs","Engineer","123456",1000001,"Full-Time",35);
            }
        });
        assertEquals("Invalid title", e.getMessage());
    }

    @DisplayName("Test getTitle")
    @Test
    public void TestGetTitle() {
       // employee = new Employee("Mr","Engineer",99999999,1000001,"Full-Time",35);
        assertEquals("Mr",employee.getTitle() );
    }
    @DisplayName("Test getName")
    @Test
    public void TestGetName() {
        // employee = new Employee("Mr","Engineer",99999999,1000001,"Full-Time",35);
        assertEquals("Engineer",employee.getName() );
    }
    @DisplayName("Test getPPS")
    @Test
    public void TestGetPPS() {
        // employee = new Employee("Mr","Engineer",99999999,1000001,"Full-Time",35);
        assertEquals("123456",employee.getPps() );
    }
    @DisplayName("Test getPhone")
    @Test
    public void TestGetPhone() {
        // employee = new Employee("Mr","Engineer",99999999,1000001,"Full-Time",35);
        assertEquals(1000001,employee.getPhone() );
    }
    @DisplayName("Test getEmployement")
    @Test
    public void TestGetEmployement() {
        // employee = new Employee("Mr","Engineer",99999999,1000001,"Full-Time",35);
        assertEquals("Full-Time",employee.getEmployentType() );
    }
    @DisplayName("Test getAge")
    @Test
    public void TestGetage() {
        // employee = new Employee("Mr","Engineer",99999999,1000001,"Full-Time",35);
        assertEquals(35,employee.getAge() );
    }


}
