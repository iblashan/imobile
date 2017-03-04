package com.interblocks.imobile.api.impl;

import com.interblocks.imobile.api.*;
import com.interblocks.imobile.api.model.*;

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

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-03-04T04:46:34.711Z")
public class PayeesApiServiceImpl extends PayeesApiService {
    @Override
    public Response getAllInstruments(String id, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response transferMoney(MoneyTransfer type, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response transferMoneyAccount(PayeeAccount type, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response transferMoneyCard(PayeeCard type, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response transferMoneyWallet(PayeeWallet type, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response transferSocialPay(MoneySocialPay type, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
}
