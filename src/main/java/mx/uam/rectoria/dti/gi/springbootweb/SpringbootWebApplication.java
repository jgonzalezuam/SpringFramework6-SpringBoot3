package mx.uam.rectoria.dti.gi.springbootweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
//Forma 1 de usar archivos properties e importarlos al proyecto:
//
//Aquí se pueden "importar" los n archivos de configuración properties
// en el siguiente caso se ve como se: haría con 2 o más archivos de
// configuración properties
/*@PropertySources({
        @PropertySource("classpath:configuracion1.properties"),
        @PropertySource("classpath:configuracion2.properties")
})*/
//Y a continuación se puede hacer con un archivo properties
@PropertySource(value="classpath:configuracion1.properties", encoding = "UTF-8")
public class SpringbootWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootWebApplication.class, args);
    }
}
