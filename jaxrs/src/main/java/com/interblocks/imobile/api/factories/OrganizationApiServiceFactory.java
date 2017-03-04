package com.interblocks.imobile.api.factories;

import com.interblocks.imobile.api.OrganizationApiService;
import com.interblocks.imobile.api.impl.OrganizationApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-03-04T05:11:03.571Z")
public class OrganizationApiServiceFactory {
    private final static OrganizationApiService service = new OrganizationApiServiceImpl();

    public static OrganizationApiService getOrganizationApi() {
        return service;
    }
}
