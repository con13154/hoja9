/*Modificado 10/10/2014

Por: Isa Contreras 13154
     Erick de Mata 13648
     Luis Orellana 13140

Prueba unitria de SplayTree
*/

package hojadetrabajo8;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Isa
 */
public class SplayTreeTest {
    
    public SplayTreeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    

    /**
     * Test of add method, of class SplayTree.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Word word = null;
        SplayTree instance = new SplayTree();
        instance.add(word);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }


    /**
     * Test of get method, of class SplayTree.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        Word word = null;
        SplayTree instance = new SplayTree();
        Word expResult = null;
        Word result = instance.get(word);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
}
