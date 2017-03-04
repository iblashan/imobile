package com.interblocks.imobile.api.impl;

import com.interblocks.imobile.api.*;
import com.interblocks.imobile.api.model.*;

import com.interblocks.imobile.api.model.Locations;

import java.util.List;
import com.interblocks.imobile.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-03-04T04:46:14.543Z")
public class OrganizationApiServiceImpl extends OrganizationApiService {
    @Override
    public Response getLocations(String type, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
}
