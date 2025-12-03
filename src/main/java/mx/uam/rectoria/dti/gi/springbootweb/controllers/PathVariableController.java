package mx.uam.rectoria.dti.gi.springbootweb.controllers;

import mx.uam.rectoria.dti.gi.springbootweb.models.User;
import mx.uam.rectoria.dti.gi.springbootweb.models.dto.ParamDTO;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "/api/var")
public class PathVariableController {

    //Por convención el message del path variable es el mismo que el del metodo
    @GetMapping("/baz/{message}")
    public ParamDTO baz(@PathVariable String message) {
        ParamDTO param = new ParamDTO();
        param.setMessage(message);
        return param;
    }

    @GetMapping("/mix/{product}/{id}")
    public Map<String, Object> mixPathVariable(@PathVariable String product, @PathVariable Integer id) {
        Map<String, Object> json = new HashMap<>();
        json.put("product", product);
        json.put("id", id);
        return json;
    }

    @PostMapping("/create")
    public User create(@RequestBody User user) {
        //Hace algo con el usuario en la base de datos
        user.setName(user.getName().toUpperCase());
        return user;
    }
}
