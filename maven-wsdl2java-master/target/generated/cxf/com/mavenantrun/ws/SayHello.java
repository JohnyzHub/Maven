package com.mavenantrun.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 * This class was generated by Apache CXF 3.1.6
 * 2016-05-22T06:55:09.518-04:00
 * Generated source version: 3.1.6
 * 
 */
@WebService(targetNamespace = "http://ws.mavenantrun.com/", name = "SayHello")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface SayHello {

    @WebResult(name = "return", targetNamespace = "http://ws.mavenantrun.com/", partName = "return")
    @WebMethod
    public java.lang.String getSayHelloAsString(
        @WebParam(partName = "arg0", name = "arg0")
        java.lang.String arg0
    );
}
