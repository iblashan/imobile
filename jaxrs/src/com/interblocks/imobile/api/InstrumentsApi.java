package com.interblocks.imobile.api;

import com.interblocks.imobile.api.model.*;
import com.interblocks.imobile.api.InstrumentsApiService;
import com.interblocks.imobile.api.factories.InstrumentsApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import com.interblocks.imobile.api.model.Account;
import com.interblocks.imobile.api.model.Card;
import com.interblocks.imobile.api.model.Transaction;
import com.interblocks.imobile.api.model.Wallet;

import java.util.List;
import com.interblocks.imobile.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/instruments")


@io.swagger.annotations.Api(description = "the instruments API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-03-04T04:46:34.711Z")
public class InstrumentsApi  {
   private final InstrumentsApiService delegate = InstrumentsApiServiceFactory.getInstrumentsApi();

    @POST
    @Path("/accounts/")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "add a new account", notes = "Add a account to a particular user", response = void.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "account created", response = void.class) })
    public Response addAccounts(@ApiParam(value = "type of account" ,required=true) Account type
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.addAccounts(type,securityContext);
    }
    @POST
    @Path("/cards/")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "add a new debit or credit card", notes = "Add a card to a particular user ", response = void.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "account created", response = void.class) })
    public Response addCards(@ApiParam(value = "type of account" ,required=true) Card type
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.addCards(type,securityContext);
    }
    @POST
    @Path("/wallets/")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "add a new wallet - mobile wallet", notes = "Add a wallet to a particular user", response = void.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "wallet created", response = void.class) })
    public Response addWallets(@ApiParam(value = "type of wallet" ,required=true) Wallet type
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.addWallets(type,securityContext);
    }
    @GET
    @Path("/account/{id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "get all accounts", notes = "Get a particular account by authenticated user", response = Account.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "search results matching criteria", response = Account.class) })
    public Response getAccount(@ApiParam(value = "type of account",required=true) @PathParam("id") String id
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getAccount(id,securityContext);
    }
    @GET
    @Path("/accounts/")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "get all accounts", notes = "Get all the accounts by authenticated user", response = Account.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "search results matching criteria", response = Account.class) })
    public Response getAccounts(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getAccounts(securityContext);
    }
    @GET
    @Path("/card/{id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "get all cards", notes = "Get a particular card by authenticated user", response = Card.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "search results matching criteria", response = Card.class) })
    public Response getCard(@ApiParam(value = "type of cards",required=true) @PathParam("id") String id
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getCard(id,securityContext);
    }
    @GET
    @Path("/cards/")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "get all cards", notes = "Get all the cards by the authenticated user ", response = Card.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "search results matching criteria", response = Card.class) })
    public Response getCards(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getCards(securityContext);
    }
    @GET
    @Path("/{type}/{id}/transactions")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "get recent transactions", notes = " ", response = Transaction.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "search results matching criteria", response = Transaction.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "bad input parameter", response = Transaction.class) })
    public Response getTransactions(@ApiParam(value = "type of transactions",required=true) @PathParam("type") String type
,@ApiParam(value = "id of the transactions",required=true) @PathParam("id") String id
,@ApiParam(value = "tansaction pages",required=true) @QueryParam("page") String page
,@ApiParam(value = "transactions page limit",required=true) @QueryParam("limit") String limit
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getTransactions(type,id,page,limit,securityContext);
    }
    @GET
    @Path("/wallet/{id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "get all wallets", notes = "Get get a particular wallets by authenticated user", response = Wallet.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "search results matching criteria", response = Wallet.class) })
    public Response getWallet(@ApiParam(value = "type of wallet",required=true) @PathParam("id") String id
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getWallet(id,securityContext);
    }
    @GET
    @Path("/wallets/")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "get all wallets", notes = "Get all the wallets by the authenticated user", response = Wallet.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "search results matching criteria", response = Wallet.class) })
    public Response getWallets(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getWallets(securityContext);
    }
    @PATCH
    @Path("/account/{id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "change properties of the accounts", notes = "update values of the accounts", response = void.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "account updated", response = void.class) })
    public Response updateAccount(@ApiParam(value = "type of account",required=true) @PathParam("id") String id
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.updateAccount(id,securityContext);
    }
    @PATCH
    @Path("/card/{id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "change the properties of the cards", notes = "update values of the cards ", response = void.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "card updated", response = void.class) })
    public Response updateCard(@ApiParam(value = "type of card",required=true) @PathParam("id") String id
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.updateCard(id,securityContext);
    }
    @PATCH
    @Path("/wallet/{id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "convert default wallet to ecard or change properties of wallets", notes = "update values of the wallet ", response = void.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "wallet updated", response = void.class) })
    public Response updateWallets(@ApiParam(value = "type of wallet",required=true) @PathParam("id") String id
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.updateWallets(id,securityContext);
    }
}
