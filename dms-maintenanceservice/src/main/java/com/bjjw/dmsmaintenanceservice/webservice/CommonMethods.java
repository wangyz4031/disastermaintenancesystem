package com.bjjw.dmsmaintenanceservice.webservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import java.net.MalformedURLException;
import java.net.URL;

@Component
public class CommonMethods {
    @Autowired
    Environment environment;
    public AccessBusWCF getWebServiceClient() {
        URL url = null;
        try {
            url = new URL(environment.getProperty("webserviceurl"));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        AccessBusWCF client = new AccessBusWCF(url);
        return client;
    }
}
