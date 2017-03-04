package com.interblocks.imobile.api;

import com.interblocks.imobile.api.model.*;
import com.interblocks.imobile.api.PaymentsApiService;
import com.interblocks.imobile.api.factories.PaymentsApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import com.interblocks.imobile.api.model.BillPayments;
import com.interblocks.imobile.api.model.PreviousPayments;
import com.interblocks.imobile.api.model.SmartPay;

import java.util.List;
import com.interblocks.imobile.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/payments")


@io.swagger.annotations.Api(description = "the payments API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-03-04T04:51:09.939Z")
public class PaymentsApi  {
   private final PaymentsApiService delegate = PaymentsApiServiceFactory.getPaymentsApi();

    @GET
    @Path("/previous-payments/")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "get all the saved payments", notes = "Get all the Previously saved payments", response = PreviousPayments.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "search results matching criteria", response = PreviousPayments.class) })
    public Response getBillPayments(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getBillPayments(securityContext);
    }
    @GET
    @Path("/bill-payments/{type}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "get payments types", notes = "get payments types", response = BillPayments.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "search results matching criteria", response = BillPayments.class) })
    public Response getPayments(@ApiParam(value = "type of payments",required=true) @PathParam("type") String type
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getPayments(type,securityContext);
    }
    @POST
    @Path("/smartpay/")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "pay money through samrtpay", notes = "pay money through selected wireless payment gateway", response = void.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "Transfer successful", response = void.class) })
    public Response smartPay(@ApiParam(value = "type of samrtpay" ,required=true) SmartPay type
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.smartPay(type,securityContext);
    }
}
