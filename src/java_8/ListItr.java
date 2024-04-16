package java_8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ListItr {
	public static void main(String[] args) {

		List<Integer> l = Arrays.asList(23, 43, 45, 54, 12, 65, 22, 65, 34, 23, 43, 11, 21, 22, 23);
		l.forEach(i -> System.out.println(i));// by iterable interface lambda expression

		System.out.println("*********************************");
 
		l.stream().forEach(System.out::println);// by Stream interface

		System.out.println("*unique***************************");

		List<Integer> ll = l.stream().distinct().collect(Collectors.toList());

		for (Integer lll : ll) {
			System.out.println(lll + ":" + Collections.frequency(l, lll));
		}

		System.out.println("*min***************");
		long min = l.stream().min((i1, i2) -> i1.compareTo(i2)).get();
		System.out.println(min);

		System.out.println("*max***************");
		long max = l.stream().max((i1, i2) -> i1.compareTo(i2)).get();
		System.out.println(max);
	}
}


package org.info.resource;

import org.info.entity.Employee;
import org.info.repository.EmployeeRepo;

import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.persistence.ParameterMode;
import jakarta.persistence.StoredProcedureQuery;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/employee")
public class EmployeeResource {

	@Inject
	EmployeeRepo er;
	@Inject
	EntityManager em;
 
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response saveEmployee(Employee employee) {

		//insert employee record
		StoredProcedureQuery procedure = em.createStoredProcedureQuery("insert_employee");

		// register input parameters
		procedure.registerStoredProcedureParameter("name", String.class, ParameterMode.IN);
		procedure.registerStoredProcedureParameter("email", String.class, ParameterMode.IN);
		procedure.registerStoredProcedureParameter("city", String.class, ParameterMode.IN);
 
		//set parameters values
		procedure.setParameter("name", employee.getName());
		procedure.setParameter("email", employee.getEmail());
		procedure.setParameter("city", employee.getCity());
		
		procedure.execute();
		
		return Response.status(Response.Status.CREATED).build();

	}

}
