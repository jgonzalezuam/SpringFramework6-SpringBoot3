package mx.uam.rectoria.dti.gi.springbootweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping({"/", "", "/home"})
    public String home() {
        // La principal diferencia es que un
        //forward es una operación interna del servidor que no
        // notifica al navegador, mientras que un redirect es una
        // instrucción explícita al navegador para que haga una
        // nueva solicitud a una URL diferente.
        // Esto implica que el forward mantiene el
        // mismo objeto de solicitud y respuesta, no cambia la URL
        // en la barra del navegador y es más rápido, mientras
        // que el redirect crea una nueva solicitud,
        // borra los atributos de la solicitud anterior y
        // cambia la URL que ve el usuario.
        //return "redirect:/detailsConlList";
        return "forward:/detailsConlList";
    }
}