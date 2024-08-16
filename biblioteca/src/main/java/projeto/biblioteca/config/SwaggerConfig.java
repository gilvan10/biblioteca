package projeto.biblioteca.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@Configuration
public class SwaggerConfig implements WebMvcConfigurer {
	
	public OpenAPI openAPI() {
		  return new OpenAPI()
		          .info(new Info()
		                  .title("Biblioteca - Rest API")
		                  .description("API exemplo de uso de Springboot REST API")
		                  .version("1.0")
		                  .termsOfService("Termo de uso: Open Source")
		                  .license(new License()
		                          .name("Apache 2.0")
		                          .url("http://www.seusite.com.br")
		                  )
		          ).externalDocs(
		                  new ExternalDocumentation()
		                  .description("Gilvan")
		                  .url("http://www.seusite.com.br"));
	}

}
