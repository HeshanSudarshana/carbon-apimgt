package org.wso2.carbon.apimgt.rest.api.store;

import org.wso2.carbon.apimgt.rest.api.store.*;
import org.wso2.carbon.apimgt.rest.api.store.dto.*;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import org.wso2.carbon.apimgt.rest.api.store.dto.ErrorDTO;
import org.wso2.carbon.apimgt.rest.api.store.dto.LabelListDTO;

import java.util.List;
import org.wso2.carbon.apimgt.rest.api.store.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.wso2.maven.plugins.JavaMSF4JServerCodegen", date = "2017-03-24T14:21:25.168+05:30")
public abstract class LabelInfoApiService {
    public abstract Response labelInfoGet(String labels
 ,String accept
 ,String ifNoneMatch
 ,String ifModifiedSince
 ,String minorVersion
 ) throws NotFoundException;
}
