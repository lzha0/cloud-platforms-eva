package org.azureva;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.1.3
 * Sat Mar 07 22:37:31 EST 2009
 * Generated source version: 2.1.3
 * 
 */
 
@WebService(targetNamespace = "http://azureva.org/", name = "GoodDayAzureSoap")
@XmlSeeAlso({ObjectFactory.class})
public interface GoodDayAzureSoap {

    @WebResult(name = "readResult", targetNamespace = "http://azureva.org/")
    @RequestWrapper(localName = "read", targetNamespace = "http://azureva.org/", className = "org.azureva.Read")
    @ResponseWrapper(localName = "readResponse", targetNamespace = "http://azureva.org/", className = "org.azureva.ReadResponse")
    @WebMethod(action = "http://azureva.org/read")
    public org.azureva.Result read(
        @WebParam(name = "value", targetNamespace = "http://azureva.org/")
        java.lang.String value
    );

    @WebResult(name = "deleteResult", targetNamespace = "http://azureva.org/")
    @RequestWrapper(localName = "delete", targetNamespace = "http://azureva.org/", className = "org.azureva.Delete")
    @ResponseWrapper(localName = "deleteResponse", targetNamespace = "http://azureva.org/", className = "org.azureva.DeleteResponse")
    @WebMethod(action = "http://azureva.org/delete")
    public org.azureva.Result delete(
        @WebParam(name = "key", targetNamespace = "http://azureva.org/")
        java.lang.String key
    );

    @WebResult(name = "updateResult", targetNamespace = "http://azureva.org/")
    @RequestWrapper(localName = "update", targetNamespace = "http://azureva.org/", className = "org.azureva.Update")
    @ResponseWrapper(localName = "updateResponse", targetNamespace = "http://azureva.org/", className = "org.azureva.UpdateResponse")
    @WebMethod(action = "http://azureva.org/update")
    public org.azureva.Result update(
        @WebParam(name = "oldValue", targetNamespace = "http://azureva.org/")
        java.lang.String oldValue,
        @WebParam(name = "newValue", targetNamespace = "http://azureva.org/")
        java.lang.String newValue
    );

    @WebResult(name = "createResult", targetNamespace = "http://azureva.org/")
    @RequestWrapper(localName = "create", targetNamespace = "http://azureva.org/", className = "org.azureva.Create")
    @ResponseWrapper(localName = "createResponse", targetNamespace = "http://azureva.org/", className = "org.azureva.CreateResponse")
    @WebMethod(action = "http://azureva.org/create")
    public org.azureva.Result create(
        @WebParam(name = "content", targetNamespace = "http://azureva.org/")
        java.lang.String content
    );

    @WebResult(name = "SayGoodDayResult", targetNamespace = "http://azureva.org/")
    @RequestWrapper(localName = "SayGoodDay", targetNamespace = "http://azureva.org/", className = "org.azureva.SayGoodDay")
    @ResponseWrapper(localName = "SayGoodDayResponse", targetNamespace = "http://azureva.org/", className = "org.azureva.SayGoodDayResponse")
    @WebMethod(operationName = "SayGoodDay", action = "http://azureva.org/SayGoodDay")
    public org.azureva.Result sayGoodDay(
        @WebParam(name = "yourNamePlz", targetNamespace = "http://azureva.org/")
        java.lang.String yourNamePlz
    );
}
