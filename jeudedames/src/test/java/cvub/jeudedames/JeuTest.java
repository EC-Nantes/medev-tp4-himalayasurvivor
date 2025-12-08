/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package cvub.jeudedames;

import java.util.ArrayList;
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
public class JeuTest {
    
    public JeuTest() {
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
     * Test of initJeu method, of class Jeu.
     */
    @Test
    public void testInitJeu() {
        System.out.println("initJeu");
        Jeu instance = new Jeu();
        instance.initJeu();
        //on regarde juste que ça crash pas
    }

    /**
     * Test of dataTile method, of class Jeu.
     */
    @Test
    public void testDataTile() {
        System.out.println("dataTile");
        Case c = new Case(2);
        Jeu instance = new Jeu();
        instance.initJeu();
        
        int expResult = 1;
        int result = instance.dataTile(c);
        assertEquals(expResult, result);
    }
    
}
