package de.urr4.demo.rest;


import de.urr4.demo.entities.User;
import de.urr4.demo.services.UserService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/users")
public class UserEndpoint {

	@Inject
	private UserService userService;

	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public User getUserById(@PathParam("id") Long id) {
		return userService.getUserById(id);
	}
}