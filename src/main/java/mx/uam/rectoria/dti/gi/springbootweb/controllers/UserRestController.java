package mx.uam.rectoria.dti.gi.springbootweb.controllers;

import mx.uam.rectoria.dti.gi.springbootweb.models.User;
import mx.uam.rectoria.dti.gi.springbootweb.models.dto.UserDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class UserRestController {

    /*Ejemplo 1 - Se pasan los valores directamente al cuerpo de la respuesta*/
    @GetMapping("/details")
    public Map<String, Object> details() {
        Map<String,Object> body = new HashMap<>();
        body.put("title", "Hola Spring Boot");
        body.put("name", "Jorge Emmanuel");
        body.put("lastname", "González");
        return body;
    }

    /*Ejemplo 2 - Se pasan los valores directamente al cuerpo de la respuesta, pero con un objeto user*/
    @GetMapping("/details-user")
    public Map<String, Object> detailsUser() {
        User user = new User("Jorge","Gonzalez");
        Map<String,Object> body = new HashMap<>();
        body.put("title", "Hola Spring Boot");
        body.put("user", user);
        return body;
    }

    /*Ejemplo 3 - Se hace uso del objeto DTO*/
    @GetMapping("/details-user-dto")
    public UserDTO detailsUserDTO() {
        UserDTO userDTO = new UserDTO();
        User user = new User("Jorge","Gonzalez");
        userDTO.setUser(user);
        userDTO.setTitle("Hola Spring Boot");
        return userDTO;
    }


    /*Ejemplo 4 - Se hace uso de listas*/
    @GetMapping("/details-user-list")
    public List<User> detailsUserList() {
        User user = new User("Jorge","Gonzalez");
        User user2 = new User("Gabriel","Tinajero");
        User user3 = new User("Maricela","Manriquez");

        List <User> users = List.of(user, user2, user3);
        return  users;
    }
}
