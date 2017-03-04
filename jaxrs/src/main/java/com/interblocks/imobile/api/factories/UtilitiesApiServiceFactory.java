package com.interblocks.imobile.api.factories;

import com.interblocks.imobile.api.UtilitiesApiService;
import com.interblocks.imobile.api.impl.UtilitiesApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-03-04T05:11:03.571Z")
public class UtilitiesApiServiceFactory {
    private final static UtilitiesApiService service = new UtilitiesApiServiceImpl();

    public static UtilitiesApiService getUtilitiesApi() {
        return service;
    }
}
