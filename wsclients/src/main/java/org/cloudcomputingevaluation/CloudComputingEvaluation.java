
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
 * Sun Mar 22 21:42:00 EST 2009
 * Generated source version: 2.1.3
 * 
 */


@WebServiceClient(name = "CloudComputingEvaluation", 
                  wsdlLocation = "file:/D:/azure/wsclients/src/main/resources/CloudComputingEva.wsdl",
                  targetNamespace = "http://cloudComputingEvaluation.org/") 
public class CloudComputingEvaluation extends Service {

    public final static URL WSDL_LOCATION;
    public final static QName SERVICE = new QName("http://cloudComputingEvaluation.org/", "CloudComputingEvaluation");
    public final static QName AzureEvaluationSoap = new QName("http://cloudComputingEvaluation.org/", "AzureEvaluationSoap");
    public final static QName AppEngineSoapInstanceResponse = new QName("http://cloudComputingEvaluation.org/", "AppEngineSoapInstanceResponse");
    public final static QName AmazonSoap = new QName("http://cloudComputingEvaluation.org/", "AmazonSoap");
    static {
        URL url = null;
        try {
            url = new URL("file:/D:/azure/wsclients/src/main/resources/CloudComputingEva.wsdl");
        } catch (MalformedURLException e) {
            System.err.println("Can not initialize the default wsdl from file:/D:/azure/wsclients/src/main/resources/CloudComputingEva.wsdl");
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
     *     returns ICloudComputingEvaluation
     */
    @WebEndpoint(name = "AzureEvaluationSoap")
    public ICloudComputingEvaluation getAzureEvaluationSoap() {
        return super.getPort(AzureEvaluationSoap, ICloudComputingEvaluation.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ICloudComputingEvaluation
     */
    @WebEndpoint(name = "AzureEvaluationSoap")
    public ICloudComputingEvaluation getAzureEvaluationSoap(WebServiceFeature... features) {
        return super.getPort(AzureEvaluationSoap, ICloudComputingEvaluation.class, features);
    }
    /**
     * 
     * @return
     *     returns ICloudComputingEvaluation
     */
    @WebEndpoint(name = "AppEngineSoapInstanceResponse")
    public ICloudComputingEvaluation getAppEngineSoapInstanceResponse() {
        return super.getPort(AppEngineSoapInstanceResponse, ICloudComputingEvaluation.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ICloudComputingEvaluation
     */
    @WebEndpoint(name = "AppEngineSoapInstanceResponse")
    public ICloudComputingEvaluation getAppEngineSoapInstanceResponse(WebServiceFeature... features) {
        return super.getPort(AppEngineSoapInstanceResponse, ICloudComputingEvaluation.class, features);
    }
    /**
     * 
     * @return
     *     returns ICloudComputingEvaluation
     */
    @WebEndpoint(name = "AmazonSoap")
    public ICloudComputingEvaluation getAmazonSoap() {
        return super.getPort(AmazonSoap, ICloudComputingEvaluation.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ICloudComputingEvaluation
     */
    @WebEndpoint(name = "AmazonSoap")
    public ICloudComputingEvaluation getAmazonSoap(WebServiceFeature... features) {
        return super.getPort(AmazonSoap, ICloudComputingEvaluation.class, features);
    }

}
