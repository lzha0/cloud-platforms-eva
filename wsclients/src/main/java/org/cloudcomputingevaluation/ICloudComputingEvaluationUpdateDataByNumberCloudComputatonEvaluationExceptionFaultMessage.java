
package org.cloudcomputingevaluation;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.1.3
 * Sat Apr 04 23:34:25 EST 2009
 * Generated source version: 2.1.3
 * 
 */

@WebFault(name = "CloudComputatonEvaluationException", targetNamespace = "http://cloudComputingEvaluation.org/")
public class ICloudComputingEvaluationUpdateDataByNumberCloudComputatonEvaluationExceptionFaultMessage extends Exception {
    public static final long serialVersionUID = 20090404233425L;
    
    private org.cloudcomputingevaluation.CloudComputatonEvaluationException cloudComputatonEvaluationException;

    public ICloudComputingEvaluationUpdateDataByNumberCloudComputatonEvaluationExceptionFaultMessage() {
        super();
    }
    
    public ICloudComputingEvaluationUpdateDataByNumberCloudComputatonEvaluationExceptionFaultMessage(String message) {
        super(message);
    }
    
    public ICloudComputingEvaluationUpdateDataByNumberCloudComputatonEvaluationExceptionFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ICloudComputingEvaluationUpdateDataByNumberCloudComputatonEvaluationExceptionFaultMessage(String message, org.cloudcomputingevaluation.CloudComputatonEvaluationException cloudComputatonEvaluationException) {
        super(message);
        this.cloudComputatonEvaluationException = cloudComputatonEvaluationException;
    }

    public ICloudComputingEvaluationUpdateDataByNumberCloudComputatonEvaluationExceptionFaultMessage(String message, org.cloudcomputingevaluation.CloudComputatonEvaluationException cloudComputatonEvaluationException, Throwable cause) {
        super(message, cause);
        this.cloudComputatonEvaluationException = cloudComputatonEvaluationException;
    }

    public org.cloudcomputingevaluation.CloudComputatonEvaluationException getFaultInfo() {
        return this.cloudComputatonEvaluationException;
    }
}
