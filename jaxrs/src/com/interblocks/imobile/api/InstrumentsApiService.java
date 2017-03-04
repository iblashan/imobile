package com.interblocks.imobile.api;

import com.interblocks.imobile.api.*;
import com.interblocks.imobile.api.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import com.interblocks.imobile.api.model.Account;
import com.interblocks.imobile.api.model.Card;
import com.interblocks.imobile.api.model.Transaction;
import com.interblocks.imobile.api.model.Wallet;

import java.util.List;
import com.interblocks.imobile.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-03-04T04:46:34.711Z")
public abstract class InstrumentsApiService {
    public abstract Response addAccounts(Account type,SecurityContext securityContext) throws NotFoundException;
    public abstract Response addCards(Card type,SecurityContext securityContext) throws NotFoundException;
    public abstract Response addWallets(Wallet type,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getAccount(String id,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getAccounts(SecurityContext securityContext) throws NotFoundException;
    public abstract Response getCard(String id,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getCards(SecurityContext securityContext) throws NotFoundException;
    public abstract Response getTransactions(String type,String id,String page,String limit,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getWallet(String id,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getWallets(SecurityContext securityContext) throws NotFoundException;
    public abstract Response updateAccount(String id,SecurityContext securityContext) throws NotFoundException;
    public abstract Response updateCard(String id,SecurityContext securityContext) throws NotFoundException;
    public abstract Response updateWallets(String id,SecurityContext securityContext) throws NotFoundException;
}
