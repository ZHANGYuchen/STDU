/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package msgtypeid;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author abyx
 */
public class MsgTypeIdentifierWSTest {
    
    public MsgTypeIdentifierWSTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Tests of identifyMsgType method, of class MsgTypeIdentifierWS.
     */
    @Test
    public void testIdentifyMsgTypeFromDQM() {
        System.out.println("identifyMsgType from DQM");
        String msg = "fromDQM";
        MsgTypeIdentifierWS instance = new MsgTypeIdentifierWS();
        int expResult = 1;
        int result = instance.identifyMsgType(msg);
        assertEquals(expResult, result);
        fail("Message should be found as 'from DQM'.");
    }
    @Test
    public void testIdentifyMsgTypeFromMDM() {
        System.out.println("identifyMsgType from MDM");
        String msg = "fromMDM";
        MsgTypeIdentifierWS instance = new MsgTypeIdentifierWS();
        int expResult = 2;
        int result = instance.identifyMsgType(msg);
        assertEquals(expResult, result);
        fail("Message should be found as 'from MDM'.");
    }
    @Test
    public void testIdentifyMsgTypeFromEmpty() {
        System.out.println("identifyMsgType from Empty");
        String msg = "";
        MsgTypeIdentifierWS instance = new MsgTypeIdentifierWS();
        int expResult = 0;
        int result = instance.identifyMsgType(msg);
        assertEquals(expResult, result);
        fail("Message should be found as 'from unknown'.");
    }
    @Test
    public void testIdentifyMsgTypeFromOther() {
        System.out.println("identifyMsgType from Other");
        String msg = "fromOther";
        MsgTypeIdentifierWS instance = new MsgTypeIdentifierWS();
        int expResult = 0;
        int result = instance.identifyMsgType(msg);
        assertEquals(expResult, result);
        fail("Message should be found as 'from unknown'.");
    }
}
