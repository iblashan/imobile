package com.interblocks.imobile.api;

import com.interblocks.imobile.api.model.*;
import com.interblocks.imobile.api.PayeesApiService;
import com.interblocks.imobile.api.factories.PayeesApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import com.interblocks.imobile.api.model.MoneySocialPay;
import com.interblocks.imobile.api.model.MoneyTransfer;
import com.interblocks.imobile.api.model.PayeeAccount;
import com.interblocks.imobile.api.model.PayeeCard;
import com.interblocks.imobile.api.model.PayeeInstruments;
import com.interblocks.imobile.api.model.PayeeWallet;

import java.util.List;
import com.interblocks.imobile.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/payees")


@io.swagger.annotations.Api(description = "the payees API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-03-04T04:46:34.711Z")
public class PayeesApi  {
   private final PayeesApiService delegate = PayeesApiServiceFactory.getPayeesApi();

    @GET
    @Path("/instruments/{id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "get all instruments", notes = "Get all the instruments by authenticated user", response = PayeeInstruments.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "search results matching criteria", response = PayeeInstruments.class) })
    public Response getAllInstruments(@ApiParam(value = "type of instruments",required=true) @PathParam("id") String id
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getAllInstruments(id,securityContext);
    }
    @POST
    @Path("/transfer/")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "send money, transfer", notes = "transfer money from a selected instrument to a own account or third party account", response = void.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "Transfer successful", response = void.class) })
    public Response transferMoney(@ApiParam(value = "type of transfer" ,required=true) MoneyTransfer type
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.transferMoney(type,securityContext);
    }
    @POST
    @Path("/account/")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "send money from account", notes = "send money from a selected account", response = void.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "Transfer successful", response = void.class) })
    public Response transferMoneyAccount(@ApiParam(value = "type of account" ,required=true) PayeeAccount type
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.transferMoneyAccount(type,securityContext);
    }
    @POST
    @Path("/card/")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "send money from card", notes = "send money from a selected card", response = void.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "Transfer successful", response = void.class) })
    public Response transferMoneyCard(@ApiParam(value = "type of card" ,required=true) PayeeCard type
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.transferMoneyCard(type,securityContext);
    }
    @POST
    @Path("/wallet/")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "send money from wallet", notes = "send money from a selected wallet", response = void.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "Transfer successful", response = void.class) })
    public Response transferMoneyWallet(@ApiParam(value = "type of wallet" ,required=true) PayeeWallet type
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.transferMoneyWallet(type,securityContext);
    }
    @POST
    @Path("/socialpay/")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "send money, social pay", notes = "transfer money from a selected instrument to a social contact", response = void.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "Transfer successful", response = void.class) })
    public Response transferSocialPay(@ApiParam(value = "type of social pay" ,required=true) MoneySocialPay type
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.transferSocialPay(type,securityContext);
    }
}
