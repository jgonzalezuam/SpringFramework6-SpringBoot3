package mx.uam.rectoria.dti.gi.springbootweb.controllers;

import jakarta.servlet.http.HttpServletRequest;
import mx.uam.rectoria.dti.gi.springbootweb.models.dto.ParamDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/params")
public class RequestParamsController {

    @GetMapping("/foo")
    public ParamDTO foo(@RequestParam(required = false, defaultValue = "Hola que tal") String message) {
        ParamDTO paramDTO = new ParamDTO();
        paramDTO.setMessage(message);
        return paramDTO;
    }

    @GetMapping("/bar")
    public ParamDTO bar(@RequestParam String text, @RequestParam Integer code) {
        ParamDTO paramDTO = new ParamDTO();
        paramDTO.setCode(code);
        paramDTO.setMessage(text);
        return paramDTO;
    }

    /*De forma nativa con HttpServletRequest*/
    @GetMapping("/request")
    public ParamDTO request(HttpServletRequest request) {
        ParamDTO params = new ParamDTO();
        params.setCode(Integer.parseInt(request.getParameter("code")));
        params.setMessage(request.getParameter("message"));
        return params;
    }
}