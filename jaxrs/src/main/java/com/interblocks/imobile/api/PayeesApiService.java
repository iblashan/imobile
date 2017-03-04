package com.interblocks.imobile.api;

import com.interblocks.imobile.api.*;
import com.interblocks.imobile.api.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import com.interblocks.imobile.api.model.MoneySocialPay;
import com.interblocks.imobile.api.model.MoneyTransfer;
import com.interblocks.imobile.api.model.PayeeAccount;
import com.interblocks.imobile.api.model.PayeeCard;
import com.interblocks.imobile.api.model.PayeeInstruments;
import com.interblocks.imobile.api.model.PayeeWallet;

import java.util.List;
import com.interblocks.imobile.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-03-04T05:01:25.177Z")
public abstract class PayeesApiService {
    public abstract Response getAllInstruments(String id,SecurityContext securityContext) throws NotFoundException;
    public abstract Response transferMoney(MoneyTransfer type,SecurityContext securityContext) throws NotFoundException;
    public abstract Response transferMoneyAccount(PayeeAccount type,SecurityContext securityContext) throws NotFoundException;
    public abstract Response transferMoneyCard(PayeeCard type,SecurityContext securityContext) throws NotFoundException;
    public abstract Response transferMoneyWallet(PayeeWallet type,SecurityContext securityContext) throws NotFoundException;
    public abstract Response transferSocialPay(MoneySocialPay type,SecurityContext securityContext) throws NotFoundException;
}
