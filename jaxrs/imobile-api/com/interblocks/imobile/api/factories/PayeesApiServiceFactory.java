package com.interblocks.imobile.api.factories;

import com.interblocks.imobile.api.PayeesApiService;
import com.interblocks.imobile.api.impl.PayeesApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-03-04T04:46:34.711Z")
public class PayeesApiServiceFactory {
    private final static PayeesApiService service = new PayeesApiServiceImpl();

    public static PayeesApiService getPayeesApi() {
        return service;
    }
}
