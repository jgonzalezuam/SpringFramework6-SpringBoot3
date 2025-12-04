package mx.uam.rectoria.dti.gi.springbootweb;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//Forma 2 de usar archivos properties e importarlos al proyecto:
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
public class ValuesConfig {
}
