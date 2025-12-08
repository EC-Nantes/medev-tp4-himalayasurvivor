/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package cvub.jeudedames;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Clément
 */
public class CaseTest {
    
    public CaseTest() {
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
     * Test of constructors method, of class Case.
     */
    @Test
    public void testConstructors1() {
        System.out.println("constructors1");
        Case c1 = new Case(44);
        Case c2 = new Case(3,8);
        boolean expResult1 = true;
        boolean result1 = c1.equals(c2);
        assertEquals(result1,expResult1);        
    }
    
        /**
     * Test of constructors method, of class Case.
     */
    @Test
    public void testConstructors2() {
        System.out.println("constructors2");
        Case c3 = new Case(41);
        Case c4 = new Case(2,8);
        boolean expResult2 = false;
        boolean result2 = c3.equals(c4);
        assertEquals(result2,expResult2);
        
    }
}
