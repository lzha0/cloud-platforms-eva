
package org.cloudcomputingevaluation;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.1.3
 * Thu May 07 00:24:47 EST 2009
 * Generated source version: 2.1.3
 * 
 */

@WebFault(name = "CloudComputatonEvaluationException", targetNamespace = "http://cloudComputingEvaluation.org/")
public class ICloudComputingEvaluationBinaryFileWriteCloudComputatonEvaluationExceptionFaultMessage extends Exception {
    public static final long serialVersionUID = 20090507002447L;
    
    private org.cloudcomputingevaluation.CloudComputatonEvaluationException cloudComputatonEvaluationException;

    public ICloudComputingEvaluationBinaryFileWriteCloudComputatonEvaluationExceptionFaultMessage() {
        super();
    }
    
    public ICloudComputingEvaluationBinaryFileWriteCloudComputatonEvaluationExceptionFaultMessage(String message) {
        super(message);
    }
    
    public ICloudComputingEvaluationBinaryFileWriteCloudComputatonEvaluationExceptionFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ICloudComputingEvaluationBinaryFileWriteCloudComputatonEvaluationExceptionFaultMessage(String message, org.cloudcomputingevaluation.CloudComputatonEvaluationException cloudComputatonEvaluationException) {
        super(message);
        this.cloudComputatonEvaluationException = cloudComputatonEvaluationException;
    }

    public ICloudComputingEvaluationBinaryFileWriteCloudComputatonEvaluationExceptionFaultMessage(String message, org.cloudcomputingevaluation.CloudComputatonEvaluationException cloudComputatonEvaluationException, Throwable cause) {
        super(message, cause);
        this.cloudComputatonEvaluationException = cloudComputatonEvaluationException;
    }

    public org.cloudcomputingevaluation.CloudComputatonEvaluationException getFaultInfo() {
        return this.cloudComputatonEvaluationException;
    }
}
