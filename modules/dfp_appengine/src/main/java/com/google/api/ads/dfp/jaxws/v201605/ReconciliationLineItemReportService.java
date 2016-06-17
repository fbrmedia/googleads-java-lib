
package com.google.api.ads.dfp.jaxws.v201605;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "ReconciliationLineItemReportService", targetNamespace = "https://www.google.com/apis/ads/publisher/v201605", wsdlLocation = "https://ads.google.com/apis/ads/publisher/v201605/ReconciliationLineItemReportService?wsdl")
public class ReconciliationLineItemReportService
    extends Service
{

    private final static URL RECONCILIATIONLINEITEMREPORTSERVICE_WSDL_LOCATION;
    private final static WebServiceException RECONCILIATIONLINEITEMREPORTSERVICE_EXCEPTION;
    private final static QName RECONCILIATIONLINEITEMREPORTSERVICE_QNAME = new QName("https://www.google.com/apis/ads/publisher/v201605", "ReconciliationLineItemReportService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://ads.google.com/apis/ads/publisher/v201605/ReconciliationLineItemReportService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        RECONCILIATIONLINEITEMREPORTSERVICE_WSDL_LOCATION = url;
        RECONCILIATIONLINEITEMREPORTSERVICE_EXCEPTION = e;
    }

    public ReconciliationLineItemReportService() {
        super(__getWsdlLocation(), RECONCILIATIONLINEITEMREPORTSERVICE_QNAME);
    }

    public ReconciliationLineItemReportService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    /**
     * 
     * @return
     *     returns ReconciliationLineItemReportServiceInterface
     */
    @WebEndpoint(name = "ReconciliationLineItemReportServiceInterfacePort")
    public ReconciliationLineItemReportServiceInterface getReconciliationLineItemReportServiceInterfacePort() {
        return super.getPort(new QName("https://www.google.com/apis/ads/publisher/v201605", "ReconciliationLineItemReportServiceInterfacePort"), ReconciliationLineItemReportServiceInterface.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ReconciliationLineItemReportServiceInterface
     */
    @WebEndpoint(name = "ReconciliationLineItemReportServiceInterfacePort")
    public ReconciliationLineItemReportServiceInterface getReconciliationLineItemReportServiceInterfacePort(WebServiceFeature... features) {
        return super.getPort(new QName("https://www.google.com/apis/ads/publisher/v201605", "ReconciliationLineItemReportServiceInterfacePort"), ReconciliationLineItemReportServiceInterface.class, features);
    }

    private static URL __getWsdlLocation() {
        if (RECONCILIATIONLINEITEMREPORTSERVICE_EXCEPTION!= null) {
            throw RECONCILIATIONLINEITEMREPORTSERVICE_EXCEPTION;
        }
        return RECONCILIATIONLINEITEMREPORTSERVICE_WSDL_LOCATION;
    }

}