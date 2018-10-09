package org.hcl.test.asha.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.hcl.test.asha.model.ErrorMessage;

public class DataNotFoundExceptionMapper {
	
	public Response toResponse(DataNotFoundException ex) {
		ErrorMessage errMsg = new ErrorMessage(1,ex.getMessage(), "www.google.com");
		return Response.status(Status.NOT_FOUND)
					   .entity(errMsg)
				       .build();
	}

}
