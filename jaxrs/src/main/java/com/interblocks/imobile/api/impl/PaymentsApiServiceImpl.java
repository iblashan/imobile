package com.interblocks.imobile.api.impl;

import com.interblocks.imobile.api.*;
import com.interblocks.imobile.api.model.*;

import com.interblocks.imobile.api.model.BillPayments;
import com.interblocks.imobile.api.model.PreviousPayments;
import com.interblocks.imobile.api.model.SmartPay;

import java.util.List;
import com.interblocks.imobile.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-03-04T05:11:03.571Z")
public class PaymentsApiServiceImpl extends PaymentsApiService {
    @Override
    public Response getBillPayments(SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response getPayments(String type, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response smartPay(SmartPay type, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
}
