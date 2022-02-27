package site.metacoding.first;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // 얘가 성을 만들어줌
public class FirstApplication {

	public static void main(String[] args) {
		// main을 실행하면 스프링이라는 프레임워크가 실행됨(성이 지어짐)
		SpringApplication.run(FirstApplication.class, args);
	}

}
