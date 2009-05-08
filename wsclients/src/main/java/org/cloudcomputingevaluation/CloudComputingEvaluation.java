
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
 * Sat May 09 00:04:29 EST 2009
 * Generated source version: 2.1.3
 * 
 */


@WebServiceClient(name = "CloudComputingEvaluation", 
                  wsdlLocation = "file:/tmp_amd/kamen/import/1/lzha077/Works/cs9596/wsclients/wsclients/src/main/resources/CloudComputingEva.wsdl",
                  targetNamespace = "http://cloudComputingEvaluation.org/") 
public class CloudComputingEvaluation extends Service {

    public final static URL WSDL_LOCATION;
    public final static QName SERVICE = new QName("http://cloudComputingEvaluation.org/", "CloudComputingEvaluation");
    public final static QName AmazonSoapSimpleDB = new QName("http://cloudComputingEvaluation.org/", "AmazonSoapSimpleDB");
    public final static QName AzureStorageEvaluationSoap = new QName("http://cloudComputingEvaluation.org/", "AzureStorageEvaluationSoap");
    public final static QName AmazonSoap = new QName("http://cloudComputingEvaluation.org/", "AmazonSoap");
    public final static QName AppEngineSoapInstanceResponse = new QName("http://cloudComputingEvaluation.org/", "AppEngineSoapInstanceResponse");
    public final static QName AzureEvaluationSoap = new QName("http://cloudComputingEvaluation.org/", "AzureEvaluationSoap");
    public final static QName AppEngineSoapCreate = new QName("http://cloudComputingEvaluation.org/", "AppEngineSoapCreate");
    public final static QName AppEngineSoapCreateDataByNumber = new QName("http://cloudComputingEvaluation.org/", "AppEngineSoapCreateDataByNumber");
    public final static QName AppEngineSoapRead = new QName("http://cloudComputingEvaluation.org/", "AppEngineSoapRead");
    public final static QName AppEngineSoap = new QName("http://cloudComputingEvaluation.org/", "AppEngineSoap");
    public final static QName AppEngineSoapCleanDefaultData = new QName("http://cloudComputingEvaluation.org/", "AppEngineSoapCleanDefaultData");
    public final static QName AppEngineSoapReadDataByNumber = new QName("http://cloudComputingEvaluation.org/", "AppEngineSoapReadDataByNumber");
    public final static QName AppEngineSoapBinaryFileWrite = new QName("http://cloudComputingEvaluation.org/", "AppEngineSoapBinaryFileWrite");
    public final static QName AppEngineSoapBinaryFileRead = new QName("http://cloudComputingEvaluation.org/", "AppEngineSoapBinaryFileRead");
    static {
        URL url = null;
        try {
            url = new URL("file:/tmp_amd/kamen/import/1/lzha077/Works/cs9596/wsclients/wsclients/src/main/resources/CloudComputingEva.wsdl");
        } catch (MalformedURLException e) {
            System.err.println("Can not initialize the default wsdl from file:/tmp_amd/kamen/import/1/lzha077/Works/cs9596/wsclients/wsclients/src/main/resources/CloudComputingEva.wsdl");
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
    @WebEndpoint(name = "AmazonSoapSimpleDB")
    public ICloudComputingEvaluation getAmazonSoapSimpleDB() {
        return super.getPort(AmazonSoapSimpleDB, ICloudComputingEvaluation.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ICloudComputingEvaluation
     */
    @WebEndpoint(name = "AmazonSoapSimpleDB")
    public ICloudComputingEvaluation getAmazonSoapSimpleDB(WebServiceFeature... features) {
        return super.getPort(AmazonSoapSimpleDB, ICloudComputingEvaluation.class, features);
    }
    /**
     * 
     * @return
     *     returns ICloudComputingEvaluation
     */
    @WebEndpoint(name = "AzureStorageEvaluationSoap")
    public ICloudComputingEvaluation getAzureStorageEvaluationSoap() {
        return super.getPort(AzureStorageEvaluationSoap, ICloudComputingEvaluation.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ICloudComputingEvaluation
     */
    @WebEndpoint(name = "AzureStorageEvaluationSoap")
    public ICloudComputingEvaluation getAzureStorageEvaluationSoap(WebServiceFeature... features) {
        return super.getPort(AzureStorageEvaluationSoap, ICloudComputingEvaluation.class, features);
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
    @WebEndpoint(name = "AppEngineSoapCreate")
    public ICloudComputingEvaluation getAppEngineSoapCreate() {
        return super.getPort(AppEngineSoapCreate, ICloudComputingEvaluation.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ICloudComputingEvaluation
     */
    @WebEndpoint(name = "AppEngineSoapCreate")
    public ICloudComputingEvaluation getAppEngineSoapCreate(WebServiceFeature... features) {
        return super.getPort(AppEngineSoapCreate, ICloudComputingEvaluation.class, features);
    }
    /**
     * 
     * @return
     *     returns ICloudComputingEvaluation
     */
    @WebEndpoint(name = "AppEngineSoapCreateDataByNumber")
    public ICloudComputingEvaluation getAppEngineSoapCreateDataByNumber() {
        return super.getPort(AppEngineSoapCreateDataByNumber, ICloudComputingEvaluation.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ICloudComputingEvaluation
     */
    @WebEndpoint(name = "AppEngineSoapCreateDataByNumber")
    public ICloudComputingEvaluation getAppEngineSoapCreateDataByNumber(WebServiceFeature... features) {
        return super.getPort(AppEngineSoapCreateDataByNumber, ICloudComputingEvaluation.class, features);
    }
    /**
     * 
     * @return
     *     returns ICloudComputingEvaluation
     */
    @WebEndpoint(name = "AppEngineSoapRead")
    public ICloudComputingEvaluation getAppEngineSoapRead() {
        return super.getPort(AppEngineSoapRead, ICloudComputingEvaluation.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ICloudComputingEvaluation
     */
    @WebEndpoint(name = "AppEngineSoapRead")
    public ICloudComputingEvaluation getAppEngineSoapRead(WebServiceFeature... features) {
        return super.getPort(AppEngineSoapRead, ICloudComputingEvaluation.class, features);
    }
    /**
     * 
     * @return
     *     returns ICloudComputingEvaluation
     */
    @WebEndpoint(name = "AppEngineSoap")
    public ICloudComputingEvaluation getAppEngineSoap() {
        return super.getPort(AppEngineSoap, ICloudComputingEvaluation.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ICloudComputingEvaluation
     */
    @WebEndpoint(name = "AppEngineSoap")
    public ICloudComputingEvaluation getAppEngineSoap(WebServiceFeature... features) {
        return super.getPort(AppEngineSoap, ICloudComputingEvaluation.class, features);
    }
    /**
     * 
     * @return
     *     returns ICloudComputingEvaluation
     */
    @WebEndpoint(name = "AppEngineSoapCleanDefaultData")
    public ICloudComputingEvaluation getAppEngineSoapCleanDefaultData() {
        return super.getPort(AppEngineSoapCleanDefaultData, ICloudComputingEvaluation.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ICloudComputingEvaluation
     */
    @WebEndpoint(name = "AppEngineSoapCleanDefaultData")
    public ICloudComputingEvaluation getAppEngineSoapCleanDefaultData(WebServiceFeature... features) {
        return super.getPort(AppEngineSoapCleanDefaultData, ICloudComputingEvaluation.class, features);
    }
    /**
     * 
     * @return
     *     returns ICloudComputingEvaluation
     */
    @WebEndpoint(name = "AppEngineSoapReadDataByNumber")
    public ICloudComputingEvaluation getAppEngineSoapReadDataByNumber() {
        return super.getPort(AppEngineSoapReadDataByNumber, ICloudComputingEvaluation.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ICloudComputingEvaluation
     */
    @WebEndpoint(name = "AppEngineSoapReadDataByNumber")
    public ICloudComputingEvaluation getAppEngineSoapReadDataByNumber(WebServiceFeature... features) {
        return super.getPort(AppEngineSoapReadDataByNumber, ICloudComputingEvaluation.class, features);
    }
    /**
     * 
     * @return
     *     returns ICloudComputingEvaluation
     */
    @WebEndpoint(name = "AppEngineSoapBinaryFileWrite")
    public ICloudComputingEvaluation getAppEngineSoapBinaryFileWrite() {
        return super.getPort(AppEngineSoapBinaryFileWrite, ICloudComputingEvaluation.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ICloudComputingEvaluation
     */
    @WebEndpoint(name = "AppEngineSoapBinaryFileWrite")
    public ICloudComputingEvaluation getAppEngineSoapBinaryFileWrite(WebServiceFeature... features) {
        return super.getPort(AppEngineSoapBinaryFileWrite, ICloudComputingEvaluation.class, features);
    }
    /**
     * 
     * @return
     *     returns ICloudComputingEvaluation
     */
    @WebEndpoint(name = "AppEngineSoapBinaryFileRead")
    public ICloudComputingEvaluation getAppEngineSoapBinaryFileRead() {
        return super.getPort(AppEngineSoapBinaryFileRead, ICloudComputingEvaluation.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ICloudComputingEvaluation
     */
    @WebEndpoint(name = "AppEngineSoapBinaryFileRead")
    public ICloudComputingEvaluation getAppEngineSoapBinaryFileRead(WebServiceFeature... features) {
        return super.getPort(AppEngineSoapBinaryFileRead, ICloudComputingEvaluation.class, features);
    }

}
