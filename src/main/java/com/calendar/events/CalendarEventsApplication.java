package com.calendar.events;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;

import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.Parameter;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * 
 * @author Haider Ali
 *
 */
@SpringBootApplication
@EnableSwagger2
public class CalendarEventsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CalendarEventsApplication.class, args);
	}
	
	@Bean
    public Docket api() {
        //Adding Header
        ParameterBuilder aParameterBuilder = new ParameterBuilder();
        aParameterBuilder.name("Authorization").modelRef(new ModelRef("string")).parameterType("header").required(false).build();
        List<Parameter> aParameters = new ArrayList<Parameter>();
        aParameters.add(aParameterBuilder.build());
        return new Docket(DocumentationType.SWAGGER_2).select()
                .apis(RequestHandlerSelectors.any()).paths(paths()).build().apiInfo(apiInfo()).pathMapping("").globalOperationParameters(aParameters);
    }
	
	private ApiInfo apiInfo() {
	     return new ApiInfo(
	       "Calendar Rest API", 
	       "This API is for Calendar Events.", 
	       "", 
	       "", 
	       new Contact("Haider Ali", "", "haideraliarain@gmail.com"), 
	       "License of API", "API license URL", Collections.emptyList());
	}
	
	private Predicate<String> paths() {
        return Predicates.not(PathSelectors.regex("/basic-error-controller.*"));
    }
}
