
/*
 * 
 */

package org.cloudcomputingevaluation;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;

/**
 * This class was generated by Apache CXF 2.1.3
 * Sun Mar 15 23:27:09 EST 2009
 * Generated source version: 2.1.3
 * 
 */


@WebServiceClient(name = "CloudComputingEvaluation", 
                  wsdlLocation = "file:/D:/azure/wsclients/src/main/resources/GoodDayAzure.wsdl",
                  targetNamespace = "http://cloudComputingEvaluation.org/") 
public class CloudComputingEvaluation extends Service {

    public final static URL WSDL_LOCATION;
    public final static QName SERVICE = new QName("http://cloudComputingEvaluation.org/", "CloudComputingEvaluation");
    public final static QName AzureEvaluationSoap = new QName("http://cloudComputingEvaluation.org/", "AzureEvaluationSoap");
    public final static QName AzureEvaluationSoap12 = new QName("http://cloudComputingEvaluation.org/", "AzureEvaluationSoap12");
    static {
        URL url = null;
        try {
            url = new URL("file:/D:/azure/wsclients/src/main/resources/GoodDayAzure.wsdl");
        } catch (MalformedURLException e) {
            System.err.println("Can not initialize the default wsdl from file:/D:/azure/wsclients/src/main/resources/GoodDayAzure.wsdl");
            // e.printStackTrace();
        }
        WSDL_LOCATION = url;
    }

    public CloudComputingEvaluation(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public CloudComputingEvaluation(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CloudComputingEvaluation() {
        super(WSDL_LOCATION, SERVICE);
    }

    /**
     * 
     * @return
     *     returns CloudComputingEvaluationSoap
     */
    @WebEndpoint(name = "AzureEvaluationSoap")
    public CloudComputingEvaluationSoap getAzureEvaluationSoap() {
        return super.getPort(AzureEvaluationSoap, CloudComputingEvaluationSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CloudComputingEvaluationSoap
     */
    @WebEndpoint(name = "AzureEvaluationSoap")
    public CloudComputingEvaluationSoap getAzureEvaluationSoap(WebServiceFeature... features) {
        return super.getPort(AzureEvaluationSoap, CloudComputingEvaluationSoap.class, features);
    }
    /**
     * 
     * @return
     *     returns CloudComputingEvaluationSoap
     */
    @WebEndpoint(name = "AzureEvaluationSoap12")
    public CloudComputingEvaluationSoap getAzureEvaluationSoap12() {
        return super.getPort(AzureEvaluationSoap12, CloudComputingEvaluationSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CloudComputingEvaluationSoap
     */
    @WebEndpoint(name = "AzureEvaluationSoap12")
    public CloudComputingEvaluationSoap getAzureEvaluationSoap12(WebServiceFeature... features) {
        return super.getPort(AzureEvaluationSoap12, CloudComputingEvaluationSoap.class, features);
    }

}
