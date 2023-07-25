/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ec.edu.espe.accountingagenda.junit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Cesar Galarza, BugBusters, DCCO-ESPE
 */
public class FrmCostPerMeterTest {
    
    public FrmCostPerMeterTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of main method, of class FrmCostPerMeter.
     */
    @Test
    public void testMain() {
        double area = 871.12;
        double quantity = 54;
        double unitPrice = 234.37;
        double total = quantity * unitPrice;
        double expTotalResult = 47040.48;
        double cost = total/area;
        double expCostResult = 54;
        assertEquals(expTotalResult, total,0.00000000000001);
        assertEquals(expCostResult, cost,0.00000000000001);
    }
    
}
