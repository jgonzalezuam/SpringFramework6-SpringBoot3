package mx.uam.rectoria.dti.gi.springbootweb.controllers;

import mx.uam.rectoria.dti.gi.springbootweb.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
public class UserController {

    //Ejemplo 1 -> Usando la clase Model para pasar los atributos a la vista
    @GetMapping("/detailsConModelSimple")
    public String details(Model model) {
        model.addAttribute("title", "Hola Spring Boot");
        model.addAttribute("name", "Jorge Emmanuel");
        model.addAttribute("lastname", "González");
        return "details";
    }

    //Ejemplo 2 -> Usando la interfaz Map para pasar los atributos a la vista
    @GetMapping("/detailsConColeccionMap")
    public String details(Map<String, Object> model) {
        model.put("title", "Hola Spring Boot");
        model.put("name", "Jorge Emmanuel");
        model.put("lastname", "González");
        return "details";
    }

    //Ejemplo 3 -> Usando la clase User para pasar los atributos a la vista
    @GetMapping("/detailsConModelUser")
    public String detailsUser(Model model) {
        User user = new User("Jorge","Gonzalez");
        //user.setEmail("jgonzalez@outlook.com");
        model.addAttribute("title", "Hola Spring Boot");
        model.addAttribute("user", user);
        return "details";
    }

    //Ejemplo 4 -> Usar listas para pasar los atributos a la vista
    @GetMapping("/detailsConlList")
    public String detailsList(Model model) {
        model.addAttribute("title", "Listado de usuarios!");
        return "lists";
    }

    @ModelAttribute("users")
    public List<User> usersModel(){
        List <User> users = List.of(
                new User("Lupe", "Escalante", "lEscalante@correo.uam.mx"),
                new User("Luis", "Escalante"),
                new User("Queta", "Hernandez", "qHernandez@correo.uam.mx")
        );
        return users;
    }
}
