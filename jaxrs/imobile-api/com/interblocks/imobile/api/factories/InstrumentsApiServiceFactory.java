package com.interblocks.imobile.api.factories;

import com.interblocks.imobile.api.InstrumentsApiService;
import com.interblocks.imobile.api.impl.InstrumentsApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-03-04T04:46:34.711Z")
public class InstrumentsApiServiceFactory {
    private final static InstrumentsApiService service = new InstrumentsApiServiceImpl();

    public static InstrumentsApiService getInstrumentsApi() {
        return service;
    }
}
