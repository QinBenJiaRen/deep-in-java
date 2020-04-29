package com.haiyang.www.serviceRegister;

import java.util.ServiceLoader;

public class ServiceObtain {

    public void showAllPayService() {
        ServiceLoader<IPayService> services = ServiceLoader.load(IPayService.class);

        for (IPayService service : services) {
            service.pay();
        }
    }
}
