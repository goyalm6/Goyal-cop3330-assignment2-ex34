package ex34;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void getEmployeesShouldListAllEmployees() {
        String[] employees = ex34.Main.getEmployees();
        assertEquals(5, employees.length);
    }

    @Test
    void removeEmployeeShouldRemove() {
        String[] empCount = ex34.Main.getEmployees();
        String[] newEmpList = ex34.Main.removeEmployee(empCount, "Chris Jones");
        assertEquals(4, newEmpList.length);
    }
}