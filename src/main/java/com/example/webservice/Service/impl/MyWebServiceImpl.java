package com.example.webservice.Service.impl;

import com.example.webservice.Service.MyWebService;

import javax.jws.WebService;
import javax.xml.ws.Endpoint;

/**
 * @Describe:
 * @ClassName: MyWebServiceImpl
 * @Author: tsx
 * @Date: 2021/6/7 21:31
 **/
@WebService
public class MyWebServiceImpl implements MyWebService {

    @Override
    public String getMyFirstService(String serviceName) {
        return "我的第个webService项目：" + serviceName;
    }


    public static void main(String[] args) {
        Endpoint.publish("http://127.0.0.1:12345/myservice",new MyWebServiceImpl());
    }
}
