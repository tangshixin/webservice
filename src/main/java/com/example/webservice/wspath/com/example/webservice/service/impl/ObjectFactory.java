
package com.example.webservice.service.impl;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.example.webservice.service.impl package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetMyFirstService_QNAME = new QName("http://impl.Service.webservice.example.com/", "getMyFirstService");
    private final static QName _GetMyFirstServiceResponse_QNAME = new QName("http://impl.Service.webservice.example.com/", "getMyFirstServiceResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.example.webservice.service.impl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetMyFirstServiceResponse }
     * 
     */
    public GetMyFirstServiceResponse createGetMyFirstServiceResponse() {
        return new GetMyFirstServiceResponse();
    }

    /**
     * Create an instance of {@link GetMyFirstService }
     * 
     */
    public GetMyFirstService createGetMyFirstService() {
        return new GetMyFirstService();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMyFirstService }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.Service.webservice.example.com/", name = "getMyFirstService")
    public JAXBElement<GetMyFirstService> createGetMyFirstService(GetMyFirstService value) {
        return new JAXBElement<GetMyFirstService>(_GetMyFirstService_QNAME, GetMyFirstService.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMyFirstServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.Service.webservice.example.com/", name = "getMyFirstServiceResponse")
    public JAXBElement<GetMyFirstServiceResponse> createGetMyFirstServiceResponse(GetMyFirstServiceResponse value) {
        return new JAXBElement<GetMyFirstServiceResponse>(_GetMyFirstServiceResponse_QNAME, GetMyFirstServiceResponse.class, null, value);
    }

}
