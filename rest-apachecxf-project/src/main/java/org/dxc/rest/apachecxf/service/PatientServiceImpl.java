package org.dxc.rest.apachecxf.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.core.Response;

import org.dxc.rest.apachecxf.exception.PatientNotFoundException;
import org.dxc.rest.apachecxf.model.Patient;

public class PatientServiceImpl implements PatientService {
	Map<Long, Patient> patients = new HashMap<Long, Patient>();

	public PatientServiceImpl() {
		super();
		// TODO Auto-generated constructor stub
		Patient patient1 = new Patient(1000l, "Ajmal", "Fever");
		Patient patient2 = new Patient(1001l, "Asnan", "Cough");
		Patient patient3 = new Patient(1002l, "Nisam", "Headache");
		patients.put(patient1.getpId(), patient1);
		patients.put(patient2.getpId(), patient2);
		patients.put(patient3.getpId(), patient3);

	}

	@Override
	public List<Patient> getallpatients() {
		// TODO Auto-generated method stub
		Collection<Patient> result = patients.values();

		List<Patient> response = new ArrayList<Patient>(result);

		return response;
	}

	@Override
	public Patient getpatient(long id) {
		// TODO Auto-generated method stub
		if (patients.get(id) == null)
			throw new PatientNotFoundException();
		return patients.get(id);

	}

	@Override
	public Patient addPatient(Patient patient) {
		// TODO Auto-generated method stub
		patients.put(patient.getpId(), patient);

		return patient;
	}

	@Override
	public Response updatePatient(Patient patient) {
		// TODO Auto-generated method stub
		Patient currentPatient = patients.get(patient.getpId());
		Response response;
		if (currentPatient != null) {
			patients.put(patient.getpId(), patient);
			response = Response.ok().build();
		} else
			throw new PatientNotFoundException();

		return response;
	}

	@Override
	public Response deletePatient(long id) {
		Patient currentPatient = patients.get(id);
		Response response;
		if (currentPatient != null) {
			patients.remove(id);
			response = Response.ok().build();
		} else
			response = Response.notModified().build();
		return response;
	}

}
