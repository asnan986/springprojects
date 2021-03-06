package org.dxc.rest.apachecxf.service;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.dxc.rest.apachecxf.model.Patient;

@Consumes("Application/json")
@Produces("Application/json")
@Path("/patientservice")
public interface PatientService {
	
	@GET
	@Path("/patients")
	List<Patient> getallpatients();
	
	@GET
	@Path("/patients/{id}")
	Patient getpatient(@PathParam(value="id")long id);
	
	@POST
	@Path("/patients")
	Patient addPatient(Patient patient);
	
	@PUT
	@Path("/patients")
	Response updatePatient(Patient patient);
	
	@DELETE
	@Path("/patients/{id}")
	Response deletePatient(@PathParam(value="id")long id);
	
	

}
