package com.interblocks.imobile.api.factories;

import com.interblocks.imobile.api.PaymentsApiService;
import com.interblocks.imobile.api.impl.PaymentsApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-03-04T05:11:03.571Z")
public class PaymentsApiServiceFactory {
    private final static PaymentsApiService service = new PaymentsApiServiceImpl();

    public static PaymentsApiService getPaymentsApi() {
        return service;
    }
}
