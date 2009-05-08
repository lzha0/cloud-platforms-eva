package org.cloudcomputingevaluation;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.1.3
 * Fri May 08 16:14:48 EST 2009
 * Generated source version: 2.1.3
 * 
 */
 
@WebService(targetNamespace = "http://cloudComputingEvaluation.org/", name = "ICloudComputingEvaluation")
@XmlSeeAlso({ObjectFactory.class,com.microsoft.schemas._2003._10.serialization.ObjectFactory.class})
public interface ICloudComputingEvaluation {

    @WebResult(name = "ReadByRangeResult", targetNamespace = "http://cloudComputingEvaluation.org/")
    @Action(input = "http://cloudComputingEvaluation.org/ReadByRange", output = "http://cloudComputingEvaluation.org/ICloudComputingEvaluation/ReadByRangeResponse", fault = {@FaultAction(className = ICloudComputingEvaluationReadByRangeCloudComputatonEvaluationExceptionFaultMessage.class, value = "http://cloudComputingEvaluation.org/ICloudComputingEvaluation/ReadByRangeCloudComputatonEvaluationException")})
    @RequestWrapper(localName = "ReadByRange", targetNamespace = "http://cloudComputingEvaluation.org/", className = "org.cloudcomputingevaluation.ReadByRange")
    @ResponseWrapper(localName = "ReadByRangeResponse", targetNamespace = "http://cloudComputingEvaluation.org/", className = "org.cloudcomputingevaluation.ReadByRangeResponse")
    @WebMethod(operationName = "ReadByRange", action = "http://cloudComputingEvaluation.org/ReadByRange")
    public org.cloudcomputingevaluation.Result readByRange(
        @WebParam(name = "start", targetNamespace = "http://cloudComputingEvaluation.org/")
        java.lang.Integer start,
        @WebParam(name = "end", targetNamespace = "http://cloudComputingEvaluation.org/")
        java.lang.Integer end
    ) throws ICloudComputingEvaluationReadByRangeCloudComputatonEvaluationExceptionFaultMessage;

    @WebResult(name = "ReadResult", targetNamespace = "http://cloudComputingEvaluation.org/")
    @Action(input = "http://cloudComputingEvaluation.org/Read", output = "http://cloudComputingEvaluation.org/ICloudComputingEvaluation/ReadResponse", fault = {@FaultAction(className = ICloudComputingEvaluationReadCloudComputatonEvaluationExceptionFaultMessage.class, value = "http://cloudComputingEvaluation.org/ICloudComputingEvaluation/ReadCloudComputatonEvaluationException")})
    @RequestWrapper(localName = "Read", targetNamespace = "http://cloudComputingEvaluation.org/", className = "org.cloudcomputingevaluation.Read")
    @ResponseWrapper(localName = "ReadResponse", targetNamespace = "http://cloudComputingEvaluation.org/", className = "org.cloudcomputingevaluation.ReadResponse")
    @WebMethod(operationName = "Read", action = "http://cloudComputingEvaluation.org/Read")
    public org.cloudcomputingevaluation.Result read(
        @WebParam(name = "content", targetNamespace = "http://cloudComputingEvaluation.org/")
        java.lang.String content
    ) throws ICloudComputingEvaluationReadCloudComputatonEvaluationExceptionFaultMessage;

    @WebResult(name = "GetCounterResult", targetNamespace = "http://cloudComputingEvaluation.org/")
    @Action(input = "http://cloudComputingEvaluation.org/GetCounter", output = "http://cloudComputingEvaluation.org/ICloudComputingEvaluation/GetCounterResponse", fault = {@FaultAction(className = ICloudComputingEvaluationGetCounterCloudComputatonEvaluationExceptionFaultMessage.class, value = "http://cloudComputingEvaluation.org/ICloudComputingEvaluation/GetCounterCloudComputatonEvaluationException")})
    @RequestWrapper(localName = "GetCounter", targetNamespace = "http://cloudComputingEvaluation.org/", className = "org.cloudcomputingevaluation.GetCounter")
    @ResponseWrapper(localName = "GetCounterResponse", targetNamespace = "http://cloudComputingEvaluation.org/", className = "org.cloudcomputingevaluation.GetCounterResponse")
    @WebMethod(operationName = "GetCounter", action = "http://cloudComputingEvaluation.org/GetCounter")
    public java.lang.Integer getCounter() throws ICloudComputingEvaluationGetCounterCloudComputatonEvaluationExceptionFaultMessage;

    @Action(input = "http://cloudComputingEvaluation.org/ResetCounter", output = "http://cloudComputingEvaluation.org/ICloudComputingEvaluation/ResetCounterResponse", fault = {@FaultAction(className = ICloudComputingEvaluationResetCounterCloudComputatonEvaluationExceptionFaultMessage.class, value = "http://cloudComputingEvaluation.org/ICloudComputingEvaluation/ResetCounterCloudComputatonEvaluationException")})
    @RequestWrapper(localName = "ResetCounter", targetNamespace = "http://cloudComputingEvaluation.org/", className = "org.cloudcomputingevaluation.ResetCounter")
    @ResponseWrapper(localName = "ResetCounterResponse", targetNamespace = "http://cloudComputingEvaluation.org/", className = "org.cloudcomputingevaluation.ResetCounterResponse")
    @WebMethod(operationName = "ResetCounter", action = "http://cloudComputingEvaluation.org/ResetCounter")
    public void resetCounter() throws ICloudComputingEvaluationResetCounterCloudComputatonEvaluationExceptionFaultMessage;

    @WebResult(name = "DeleteResult", targetNamespace = "http://cloudComputingEvaluation.org/")
    @Action(input = "http://cloudComputingEvaluation.org/Delete", output = "http://cloudComputingEvaluation.org/ICloudComputingEvaluation/DeleteResponse", fault = {@FaultAction(className = ICloudComputingEvaluationDeleteCloudComputatonEvaluationExceptionFaultMessage.class, value = "http://cloudComputingEvaluation.org/ICloudComputingEvaluation/DeleteCloudComputatonEvaluationException")})
    @RequestWrapper(localName = "Delete", targetNamespace = "http://cloudComputingEvaluation.org/", className = "org.cloudcomputingevaluation.Delete")
    @ResponseWrapper(localName = "DeleteResponse", targetNamespace = "http://cloudComputingEvaluation.org/", className = "org.cloudcomputingevaluation.DeleteResponse")
    @WebMethod(operationName = "Delete", action = "http://cloudComputingEvaluation.org/Delete")
    public org.cloudcomputingevaluation.Result delete(
        @WebParam(name = "content", targetNamespace = "http://cloudComputingEvaluation.org/")
        java.lang.String content
    ) throws ICloudComputingEvaluationDeleteCloudComputatonEvaluationExceptionFaultMessage;

    @WebResult(name = "CleanDefaultDataResult", targetNamespace = "http://cloudComputingEvaluation.org/")
    @Action(input = "http://cloudComputingEvaluation.org/CleanDefaultData", output = "http://cloudComputingEvaluation.org/ICloudComputingEvaluation/CleanDefaultDataResponse", fault = {@FaultAction(className = ICloudComputingEvaluationCleanDefaultDataCloudComputatonEvaluationExceptionFaultMessage.class, value = "http://cloudComputingEvaluation.org/ICloudComputingEvaluation/CleanDefaultDataCloudComputatonEvaluationException")})
    @RequestWrapper(localName = "CleanDefaultData", targetNamespace = "http://cloudComputingEvaluation.org/", className = "org.cloudcomputingevaluation.CleanDefaultData")
    @ResponseWrapper(localName = "CleanDefaultDataResponse", targetNamespace = "http://cloudComputingEvaluation.org/", className = "org.cloudcomputingevaluation.CleanDefaultDataResponse")
    @WebMethod(operationName = "CleanDefaultData", action = "http://cloudComputingEvaluation.org/CleanDefaultData")
    public java.lang.Boolean cleanDefaultData(
        @WebParam(name = "numberOfEntries", targetNamespace = "http://cloudComputingEvaluation.org/")
        java.lang.Integer numberOfEntries,
        @WebParam(name = "offset", targetNamespace = "http://cloudComputingEvaluation.org/")
        java.lang.Integer offset
    ) throws ICloudComputingEvaluationCleanDefaultDataCloudComputatonEvaluationExceptionFaultMessage;

    @WebResult(name = "BinaryFileReadResult", targetNamespace = "http://cloudComputingEvaluation.org/")
    @Action(input = "http://cloudComputingEvaluation.org/BinaryFileRead", output = "http://cloudComputingEvaluation.org/ICloudComputingEvaluation/BinaryFileReadResponse", fault = {@FaultAction(className = ICloudComputingEvaluationBinaryFileReadCloudComputatonEvaluationExceptionFaultMessage.class, value = "http://cloudComputingEvaluation.org/ICloudComputingEvaluation/BinaryFileReadCloudComputatonEvaluationException")})
    @RequestWrapper(localName = "BinaryFileRead", targetNamespace = "http://cloudComputingEvaluation.org/", className = "org.cloudcomputingevaluation.BinaryFileRead")
    @ResponseWrapper(localName = "BinaryFileReadResponse", targetNamespace = "http://cloudComputingEvaluation.org/", className = "org.cloudcomputingevaluation.BinaryFileReadResponse")
    @WebMethod(operationName = "BinaryFileRead", action = "http://cloudComputingEvaluation.org/BinaryFileRead")
    public org.cloudcomputingevaluation.Result binaryFileRead(
        @WebParam(name = "key", targetNamespace = "http://cloudComputingEvaluation.org/")
        java.lang.String key
    ) throws ICloudComputingEvaluationBinaryFileReadCloudComputatonEvaluationExceptionFaultMessage;

    @WebResult(name = "UpdateResult", targetNamespace = "http://cloudComputingEvaluation.org/")
    @Action(input = "http://cloudComputingEvaluation.org/Update", output = "http://cloudComputingEvaluation.org/ICloudComputingEvaluation/UpdateResponse", fault = {@FaultAction(className = ICloudComputingEvaluationUpdateCloudComputatonEvaluationExceptionFaultMessage.class, value = "http://cloudComputingEvaluation.org/ICloudComputingEvaluation/UpdateCloudComputatonEvaluationException")})
    @RequestWrapper(localName = "Update", targetNamespace = "http://cloudComputingEvaluation.org/", className = "org.cloudcomputingevaluation.Update")
    @ResponseWrapper(localName = "UpdateResponse", targetNamespace = "http://cloudComputingEvaluation.org/", className = "org.cloudcomputingevaluation.UpdateResponse")
    @WebMethod(operationName = "Update", action = "http://cloudComputingEvaluation.org/Update")
    public org.cloudcomputingevaluation.Result update(
        @WebParam(name = "oldValue", targetNamespace = "http://cloudComputingEvaluation.org/")
        java.lang.String oldValue,
        @WebParam(name = "newValue", targetNamespace = "http://cloudComputingEvaluation.org/")
        java.lang.String newValue
    ) throws ICloudComputingEvaluationUpdateCloudComputatonEvaluationExceptionFaultMessage;

    @WebResult(name = "UpdateDataByNumberResult", targetNamespace = "http://cloudComputingEvaluation.org/")
    @Action(input = "http://cloudComputingEvaluation.org/UpdateDataByNumber", output = "http://cloudComputingEvaluation.org/ICloudComputingEvaluation/UpdateDataByNumberResponse", fault = {@FaultAction(className = ICloudComputingEvaluationUpdateDataByNumberCloudComputatonEvaluationExceptionFaultMessage.class, value = "http://cloudComputingEvaluation.org/ICloudComputingEvaluation/UpdateDataByNumberCloudComputatonEvaluationException")})
    @RequestWrapper(localName = "UpdateDataByNumber", targetNamespace = "http://cloudComputingEvaluation.org/", className = "org.cloudcomputingevaluation.UpdateDataByNumber")
    @ResponseWrapper(localName = "UpdateDataByNumberResponse", targetNamespace = "http://cloudComputingEvaluation.org/", className = "org.cloudcomputingevaluation.UpdateDataByNumberResponse")
    @WebMethod(operationName = "UpdateDataByNumber", action = "http://cloudComputingEvaluation.org/UpdateDataByNumber")
    public org.cloudcomputingevaluation.Result updateDataByNumber(
        @WebParam(name = "count", targetNamespace = "http://cloudComputingEvaluation.org/")
        java.lang.Integer count
    ) throws ICloudComputingEvaluationUpdateDataByNumberCloudComputatonEvaluationExceptionFaultMessage;

    @WebResult(name = "ReadAndUpdateResult", targetNamespace = "http://cloudComputingEvaluation.org/")
    @Action(input = "http://cloudComputingEvaluation.org/ReadAndUpdate", output = "http://cloudComputingEvaluation.org/ICloudComputingEvaluation/ReadAndUpdateResponse", fault = {@FaultAction(className = ICloudComputingEvaluationReadAndUpdateCloudComputatonEvaluationExceptionFaultMessage.class, value = "http://cloudComputingEvaluation.org/ICloudComputingEvaluation/ReadAndUpdateCloudComputatonEvaluationException")})
    @RequestWrapper(localName = "ReadAndUpdate", targetNamespace = "http://cloudComputingEvaluation.org/", className = "org.cloudcomputingevaluation.ReadAndUpdate")
    @ResponseWrapper(localName = "ReadAndUpdateResponse", targetNamespace = "http://cloudComputingEvaluation.org/", className = "org.cloudcomputingevaluation.ReadAndUpdateResponse")
    @WebMethod(operationName = "ReadAndUpdate", action = "http://cloudComputingEvaluation.org/ReadAndUpdate")
    public org.cloudcomputingevaluation.Result readAndUpdate(
        @WebParam(name = "id", targetNamespace = "http://cloudComputingEvaluation.org/")
        java.lang.String id
    ) throws ICloudComputingEvaluationReadAndUpdateCloudComputatonEvaluationExceptionFaultMessage;

    @WebResult(name = "InstanceResponseResult", targetNamespace = "http://cloudComputingEvaluation.org/")
    @Action(input = "http://cloudComputingEvaluation.org/InstanceResponse", output = "http://cloudComputingEvaluation.org/ICloudComputingEvaluation/InstanceResponseResponse", fault = {@FaultAction(className = ICloudComputingEvaluationInstanceResponseCloudComputatonEvaluationExceptionFaultMessage.class, value = "http://cloudComputingEvaluation.org/ICloudComputingEvaluation/InstanceResponseCloudComputatonEvaluationException")})
    @RequestWrapper(localName = "InstanceResponse", targetNamespace = "http://cloudComputingEvaluation.org/", className = "org.cloudcomputingevaluation.InstanceResponse")
    @ResponseWrapper(localName = "InstanceResponseResponse", targetNamespace = "http://cloudComputingEvaluation.org/", className = "org.cloudcomputingevaluation.InstanceResponseResponse")
    @WebMethod(operationName = "InstanceResponse", action = "http://cloudComputingEvaluation.org/InstanceResponse")
    public org.cloudcomputingevaluation.Result instanceResponse(
        @WebParam(name = "message", targetNamespace = "http://cloudComputingEvaluation.org/")
        java.lang.String message
    ) throws ICloudComputingEvaluationInstanceResponseCloudComputatonEvaluationExceptionFaultMessage;

    @WebResult(name = "BinaryFileWriteResult", targetNamespace = "http://cloudComputingEvaluation.org/")
    @Action(input = "http://cloudComputingEvaluation.org/BinaryFileWrite", output = "http://cloudComputingEvaluation.org/ICloudComputingEvaluation/BinaryFileWriteResponse", fault = {@FaultAction(className = ICloudComputingEvaluationBinaryFileWriteCloudComputatonEvaluationExceptionFaultMessage.class, value = "http://cloudComputingEvaluation.org/ICloudComputingEvaluation/BinaryFileWriteCloudComputatonEvaluationException")})
    @RequestWrapper(localName = "BinaryFileWrite", targetNamespace = "http://cloudComputingEvaluation.org/", className = "org.cloudcomputingevaluation.BinaryFileWrite")
    @ResponseWrapper(localName = "BinaryFileWriteResponse", targetNamespace = "http://cloudComputingEvaluation.org/", className = "org.cloudcomputingevaluation.BinaryFileWriteResponse")
    @WebMethod(operationName = "BinaryFileWrite", action = "http://cloudComputingEvaluation.org/BinaryFileWrite")
    public org.cloudcomputingevaluation.Result binaryFileWrite(
        @WebParam(name = "key", targetNamespace = "http://cloudComputingEvaluation.org/")
        java.lang.String key
    ) throws ICloudComputingEvaluationBinaryFileWriteCloudComputatonEvaluationExceptionFaultMessage;

    @WebResult(name = "LongProcessInstanceResponseResult", targetNamespace = "http://cloudComputingEvaluation.org/")
    @Action(input = "http://cloudComputingEvaluation.org/LongProcessInstanceResponse", output = "http://cloudComputingEvaluation.org/ICloudComputingEvaluation/LongProcessInstanceResponseResponse", fault = {@FaultAction(className = ICloudComputingEvaluationLongProcessInstanceResponseCloudComputatonEvaluationExceptionFaultMessage.class, value = "http://cloudComputingEvaluation.org/ICloudComputingEvaluation/LongProcessInstanceResponseCloudComputatonEvaluationException")})
    @RequestWrapper(localName = "LongProcessInstanceResponse", targetNamespace = "http://cloudComputingEvaluation.org/", className = "org.cloudcomputingevaluation.LongProcessInstanceResponse")
    @ResponseWrapper(localName = "LongProcessInstanceResponseResponse", targetNamespace = "http://cloudComputingEvaluation.org/", className = "org.cloudcomputingevaluation.LongProcessInstanceResponseResponse")
    @WebMethod(operationName = "LongProcessInstanceResponse", action = "http://cloudComputingEvaluation.org/LongProcessInstanceResponse")
    public org.cloudcomputingevaluation.Result longProcessInstanceResponse(
        @WebParam(name = "times", targetNamespace = "http://cloudComputingEvaluation.org/")
        java.lang.Integer times,
        @WebParam(name = "message", targetNamespace = "http://cloudComputingEvaluation.org/")
        java.lang.String message
    ) throws ICloudComputingEvaluationLongProcessInstanceResponseCloudComputatonEvaluationExceptionFaultMessage;

    @WebResult(name = "CreateResult", targetNamespace = "http://cloudComputingEvaluation.org/")
    @Action(input = "http://cloudComputingEvaluation.org/Create", output = "http://cloudComputingEvaluation.org/ICloudComputingEvaluation/CreateResponse", fault = {@FaultAction(className = ICloudComputingEvaluationCreateCloudComputatonEvaluationExceptionFaultMessage.class, value = "http://cloudComputingEvaluation.org/ICloudComputingEvaluation/CreateCloudComputatonEvaluationException")})
    @RequestWrapper(localName = "Create", targetNamespace = "http://cloudComputingEvaluation.org/", className = "org.cloudcomputingevaluation.Create")
    @ResponseWrapper(localName = "CreateResponse", targetNamespace = "http://cloudComputingEvaluation.org/", className = "org.cloudcomputingevaluation.CreateResponse")
    @WebMethod(operationName = "Create", action = "http://cloudComputingEvaluation.org/Create")
    public org.cloudcomputingevaluation.Result create(
        @WebParam(name = "content", targetNamespace = "http://cloudComputingEvaluation.org/")
        java.lang.String content
    ) throws ICloudComputingEvaluationCreateCloudComputatonEvaluationExceptionFaultMessage;

    @WebResult(name = "ReadDataByNumberResult", targetNamespace = "http://cloudComputingEvaluation.org/")
    @Action(input = "http://cloudComputingEvaluation.org/ReadDataByNumber", output = "http://cloudComputingEvaluation.org/ICloudComputingEvaluation/ReadDataByNumberResponse", fault = {@FaultAction(className = ICloudComputingEvaluationReadDataByNumberCloudComputatonEvaluationExceptionFaultMessage.class, value = "http://cloudComputingEvaluation.org/ICloudComputingEvaluation/ReadDataByNumberCloudComputatonEvaluationException")})
    @RequestWrapper(localName = "ReadDataByNumber", targetNamespace = "http://cloudComputingEvaluation.org/", className = "org.cloudcomputingevaluation.ReadDataByNumber")
    @ResponseWrapper(localName = "ReadDataByNumberResponse", targetNamespace = "http://cloudComputingEvaluation.org/", className = "org.cloudcomputingevaluation.ReadDataByNumberResponse")
    @WebMethod(operationName = "ReadDataByNumber", action = "http://cloudComputingEvaluation.org/ReadDataByNumber")
    public org.cloudcomputingevaluation.Result readDataByNumber(
        @WebParam(name = "count", targetNamespace = "http://cloudComputingEvaluation.org/")
        java.lang.Integer count
    ) throws ICloudComputingEvaluationReadDataByNumberCloudComputatonEvaluationExceptionFaultMessage;

    @WebResult(name = "CreateDataByNumberResult", targetNamespace = "http://cloudComputingEvaluation.org/")
    @Action(input = "http://cloudComputingEvaluation.org/CreateDataByNumber", output = "http://cloudComputingEvaluation.org/ICloudComputingEvaluation/CreateDataByNumberResponse", fault = {@FaultAction(className = ICloudComputingEvaluationCreateDataByNumberCloudComputatonEvaluationExceptionFaultMessage.class, value = "http://cloudComputingEvaluation.org/ICloudComputingEvaluation/CreateDataByNumberCloudComputatonEvaluationException")})
    @RequestWrapper(localName = "CreateDataByNumber", targetNamespace = "http://cloudComputingEvaluation.org/", className = "org.cloudcomputingevaluation.CreateDataByNumber")
    @ResponseWrapper(localName = "CreateDataByNumberResponse", targetNamespace = "http://cloudComputingEvaluation.org/", className = "org.cloudcomputingevaluation.CreateDataByNumberResponse")
    @WebMethod(operationName = "CreateDataByNumber", action = "http://cloudComputingEvaluation.org/CreateDataByNumber")
    public org.cloudcomputingevaluation.Result createDataByNumber(
        @WebParam(name = "count", targetNamespace = "http://cloudComputingEvaluation.org/")
        java.lang.Integer count
    ) throws ICloudComputingEvaluationCreateDataByNumberCloudComputatonEvaluationExceptionFaultMessage;

    @WebResult(name = "SetupDefaultDataResult", targetNamespace = "http://cloudComputingEvaluation.org/")
    @Action(input = "http://cloudComputingEvaluation.org/SetupDefaultData", output = "http://cloudComputingEvaluation.org/ICloudComputingEvaluation/SetupDefaultDataResponse", fault = {@FaultAction(className = ICloudComputingEvaluationSetupDefaultDataCloudComputatonEvaluationExceptionFaultMessage.class, value = "http://cloudComputingEvaluation.org/ICloudComputingEvaluation/SetupDefaultDataCloudComputatonEvaluationException")})
    @RequestWrapper(localName = "SetupDefaultData", targetNamespace = "http://cloudComputingEvaluation.org/", className = "org.cloudcomputingevaluation.SetupDefaultData")
    @ResponseWrapper(localName = "SetupDefaultDataResponse", targetNamespace = "http://cloudComputingEvaluation.org/", className = "org.cloudcomputingevaluation.SetupDefaultDataResponse")
    @WebMethod(operationName = "SetupDefaultData", action = "http://cloudComputingEvaluation.org/SetupDefaultData")
    public java.lang.Integer setupDefaultData(
        @WebParam(name = "numberOfEntries", targetNamespace = "http://cloudComputingEvaluation.org/")
        java.lang.Integer numberOfEntries,
        @WebParam(name = "offset", targetNamespace = "http://cloudComputingEvaluation.org/")
        java.lang.Integer offset
    ) throws ICloudComputingEvaluationSetupDefaultDataCloudComputatonEvaluationExceptionFaultMessage;

    @WebResult(name = "DeleteDataByNumberResult", targetNamespace = "http://cloudComputingEvaluation.org/")
    @Action(input = "http://cloudComputingEvaluation.org/DeleteDataByNumber", output = "http://cloudComputingEvaluation.org/ICloudComputingEvaluation/DeleteDataByNumberResponse", fault = {@FaultAction(className = ICloudComputingEvaluationDeleteDataByNumberCloudComputatonEvaluationExceptionFaultMessage.class, value = "http://cloudComputingEvaluation.org/ICloudComputingEvaluation/DeleteDataByNumberCloudComputatonEvaluationException")})
    @RequestWrapper(localName = "DeleteDataByNumber", targetNamespace = "http://cloudComputingEvaluation.org/", className = "org.cloudcomputingevaluation.DeleteDataByNumber")
    @ResponseWrapper(localName = "DeleteDataByNumberResponse", targetNamespace = "http://cloudComputingEvaluation.org/", className = "org.cloudcomputingevaluation.DeleteDataByNumberResponse")
    @WebMethod(operationName = "DeleteDataByNumber", action = "http://cloudComputingEvaluation.org/DeleteDataByNumber")
    public org.cloudcomputingevaluation.Result deleteDataByNumber(
        @WebParam(name = "count", targetNamespace = "http://cloudComputingEvaluation.org/")
        java.lang.Integer count
    ) throws ICloudComputingEvaluationDeleteDataByNumberCloudComputatonEvaluationExceptionFaultMessage;
}
