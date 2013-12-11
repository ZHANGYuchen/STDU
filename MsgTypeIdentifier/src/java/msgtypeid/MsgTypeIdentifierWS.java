/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package msgtypeid;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author abyx
 */
@WebService(serviceName = "MsgTypeIdentifierWS")
public class MsgTypeIdentifierWS {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    
    /* The next method returns an int depending on the source of the message it 
     * receives. 0 if from unrecognized module, 1 if DQM and 2 if MDM (example 
     * and factice values)
    */
    /**  
     * @param msg
     * @return
     */
    @WebMethod(operationName="identifyMsgType")
    public int identifyMsgType(@WebParam(name = "message") String msg){        
        if (msg.equals("fromDQM")){ 
            return 1;
        } else if(msg.equals("fromMDM")) {            
            return 2;
        } else {
            return 0;
        }
    }
}
