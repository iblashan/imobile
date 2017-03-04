package com.interblocks.imobile.api;

import com.interblocks.imobile.api.model.*;
import com.interblocks.imobile.api.OrganizationApiService;
import com.interblocks.imobile.api.factories.OrganizationApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import com.interblocks.imobile.api.model.Locations;

import java.util.List;
import com.interblocks.imobile.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/organization")


@io.swagger.annotations.Api(description = "the organization API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-03-04T04:46:14.543Z")
public class OrganizationApi  {
   private final OrganizationApiService delegate = OrganizationApiServiceFactory.getOrganizationApi();

    @GET
    @Path("/locate/{type}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "get all ATM and Branches", notes = "Get all nearest ATM and Branches", response = Locations.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "search results matching criteria", response = Locations.class) })
    public Response getLocations(@ApiParam(value = "type of account",required=true) @PathParam("type") String type
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getLocations(type,securityContext);
    }
}
