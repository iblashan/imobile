package com.interblocks.imobile.api;

import com.interblocks.imobile.api.model.*;
import com.interblocks.imobile.api.UtilitiesApiService;
import com.interblocks.imobile.api.factories.UtilitiesApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import com.interblocks.imobile.api.model.MobileNumber;

import java.util.List;
import com.interblocks.imobile.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/utilities")


@io.swagger.annotations.Api(description = "the utilities API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-03-04T04:51:09.939Z")
public class UtilitiesApi  {
   private final UtilitiesApiService delegate = UtilitiesApiServiceFactory.getUtilitiesApi();

    @GET
    @Path("/verify")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "valivate mobile", notes = "valivate the user's mobile number ", response = Object.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "mobile number verification code sent", response = Object.class) })
    public Response valivate(@ApiParam(value = "type of validate" ,required=true) MobileNumber validateNumber
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.valivate(validateNumber,securityContext);
    }
}
