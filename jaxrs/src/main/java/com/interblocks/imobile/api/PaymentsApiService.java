package com.interblocks.imobile.api;

import com.interblocks.imobile.api.*;
import com.interblocks.imobile.api.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import com.interblocks.imobile.api.model.BillPayments;
import com.interblocks.imobile.api.model.PreviousPayments;
import com.interblocks.imobile.api.model.SmartPay;

import java.util.List;
import com.interblocks.imobile.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-03-04T05:01:25.177Z")
public abstract class PaymentsApiService {
    public abstract Response getBillPayments(SecurityContext securityContext) throws NotFoundException;
    public abstract Response getPayments(String type,SecurityContext securityContext) throws NotFoundException;
    public abstract Response smartPay(SmartPay type,SecurityContext securityContext) throws NotFoundException;
}
