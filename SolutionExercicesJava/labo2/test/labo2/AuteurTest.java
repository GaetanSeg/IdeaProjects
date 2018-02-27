/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package labo2;

import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author Michel
 */
public class AuteurTest {
    static Auteur instance;
    public AuteurTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
       instance = new Auteur("A","B",2000,"L");
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
        System.out.println("teardownclass");
    }
    
    @Before
    public void setUp() {
          System.out.println("setUp");
    }
    
    @After
    public void tearDown() {
        System.out.println("teardown");
    }

    /**
     * Test of getAnnee method, of class Auteur.
     */
    @Test
    public void testGetAnnee() {
        System.out.println("getAnnee");
       
        int expResult = 2000;
        int result = instance.getAnnee();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getLangue method, of class Auteur.
     */
    @Test
    public void testGetLangue() {
        System.out.println("getLangue");
        //Auteur instance = new Auteur("A","B",2000,"L");
        String expResult = "L";
        String result = instance.getLangue();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of getNom method, of class Auteur.
     */
    @Test
    public void testGetNom() {
        System.out.println("getNom");
        //Auteur instance = new Auteur("A","B",2000,"L");
        String expResult = "A";
        String result = instance.getNom();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getPrenom method, of class Auteur.
     */
    @Test
    public void testGetPrenom() {
        System.out.println("getPrenom");
      //  Auteur instance = new Auteur("A","B",2000,"L");
        String expResult = "B";
        String result = instance.getPrenom();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setLangue method, of class Auteur.
     */
    @Test
    public void testSetLangue() {
        System.out.println("setLangue");
        String langue = "X";
      //  Auteur instance = new Auteur("A","B",2000,"L");
        instance.setLangue(langue);
         String result = instance.getLangue();
        assertEquals("X", result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Auteur.
     */

    public void testToString() {
        System.out.println("toString");
        Auteur instance = new Auteur();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Auteur.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object unObjet = null;
        //Auteur instance = new Auteur("A","B",2000,"L");
        boolean expResult = true;
        boolean result = instance.equals(new Auteur("A","B",2000,"L"));
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
