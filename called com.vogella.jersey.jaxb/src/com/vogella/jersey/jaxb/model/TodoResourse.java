package com.vogella.jersey.jaxb.model;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/todo")
public class TodoResourse {
        // This method is called if XMLis request
        @GET
        @Produces( { MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
        public Todo getXML() {
                Todo todo = new Todo();
                todo.setSummary("This is my first todo1");
                todo.setDescription("This is my first todo1");
                return todo;
        }

        // This can be used to test the integration with the browser
        @GET
        @Produces( { MediaType.TEXT_XML })
        @Path("{todos}/{month}")
        public Todo getHTML(@PathParam("todos") int id, @PathParam("month") String name) {
                Todo todo = new Todo();
                if(id == 12)
                {
                	todo.setSummary("Success " + 0);
                	todo.setDescription("Id = " + id+1 );
                }
                else
                {
                	todo.setSummary("Error " + 1);
                }
                	
//                todo.setSummary("This is my first todo2" + id);
  //              todo.setDescription("This is my first todo2"+ name);
                return todo;
        }

}