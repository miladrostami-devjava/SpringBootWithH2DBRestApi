package com.example.demoh2;

import com.example.demoh2.model.Book;
import com.example.demoh2.repository.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoH2Application {

	public static void main(String[] args) {
		SpringApplication.run(DemoH2Application.class, args);
		//System.out.println("demo h2 started...");

/*		ConfigurableApplicationContext context = SpringApplication.run(DemoH2Application.class,args);
		Object myBean = context.getBean("dataSource");
		System.out.println("my Bean is :" + myBean);*/

	}
@Bean
	CommandLineRunner commandLineRunner(BookRepository bookRepository){
		return args -> {
			//add same data
		bookRepository.save(new Book(null,"Darush",2485785,"Darab","Rostami"));
		};

}




}
