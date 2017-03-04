package com.interblocks.imobile.api;

import com.interblocks.imobile.api.*;
import com.interblocks.imobile.api.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import com.interblocks.imobile.api.model.Locations;

import java.util.List;
import com.interblocks.imobile.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-03-04T04:51:09.939Z")
public abstract class OrganizationApiService {
    public abstract Response getLocations(String type,SecurityContext securityContext) throws NotFoundException;
}
