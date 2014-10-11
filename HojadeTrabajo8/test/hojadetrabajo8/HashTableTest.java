/*Modificado 10/10/2014

Por: Isa Contreras 13154
     Erick de Mata 13648
     Luis Orellana 13140

Prueba unitaria de HashTable
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
public class HashTableTest {
    
    public HashTableTest() {
    }
    
    /**
     * Test of add method, of class HashTable.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Word wordObject = null;
        HashTable instance = new HashTable();
        instance.add(wordObject);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get method, of class HashTable.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        Word word = null;
        HashTable instance = new HashTable();
        Word expResult = null;
        Word result = instance.get(word);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
