package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"guru.springframework.sfgdi","com.springframework.pets"})
@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

		PetController petController = ctx.getBean("petController", PetController.class);
		System.out.println("--- The Best Pet is ---");
		System.out.println(petController.whichPetIsTheBest());
		System.out.println("------ i18N");
		i18NController i18NController = (i18NController) ctx.getBean("i18NController");
		System.out.println(i18NController.sayHello());

		System.out.println("------ Primary");
		MyController controller = (MyController) ctx.getBean("myController");
		System.out.println(controller.sayHello());

		System.out.println("------ Property");
		PropertyInjectController propertyInjectController = (PropertyInjectController) ctx.getBean("propertyInjectController");
		System.out.println(propertyInjectController.getGreeting());

		System.out.println("------ Setter");
		SetterInjectController setterInjectController = (SetterInjectController) ctx.getBean("setterInjectController");
		System.out.println(setterInjectController.getGreeting());

		System.out.println("------ Constructor");
		ConstructorInjectController constructorInjectController= (ConstructorInjectController) ctx.getBean("constructorInjectController");
		System.out.println(constructorInjectController.getGreeting());
	}

}
