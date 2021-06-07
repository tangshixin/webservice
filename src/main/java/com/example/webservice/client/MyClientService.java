package com.example.webservice.client;

import com.example.webservice.service.impl.MyWebServiceImplService;

/**
 * @Describe:
 * @ClassName: MyClientService
 * @Author: tsx
 * @Date: 2021/6/7 21:36
 **/
public class MyClientService {

    public static void main(String[] args) {
        MyWebServiceImplService webServiceImplService = new MyWebServiceImplService();
        com.example.webservice.service.impl.MyWebServiceImpl port = webServiceImplService.getPort(com.example.webservice.service.impl.MyWebServiceImpl.class);
        String serviceName = port.getMyFirstService("学生管理系统");
        System.out.println(serviceName);
    }
}
