/**
 * 
 */
package cxf.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import cxf.bo.Customer;

/**
 * @author ted
 *
 */
@Path("/rest") 
public interface CustomerService {
	
	@GET  
    @Path("/get")  
    @Produces(MediaType.APPLICATION_JSON) 
	public Customer getCustomer();
	
	@GET  
    @Path("/getByName")  
    @Produces(MediaType.APPLICATION_JSON) 
	public Customer getCustomerByName(@QueryParam("name") String name);
	
	@GET  
    @Path("/get/{name}")  
    @Produces(MediaType.APPLICATION_JSON) 
	public Customer getCustomerByNamePath(@PathParam("name") String name);
}
