package dio.spring_primeiros_passos;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.gson.Gson;

@Configuration
public class BeansFactory {

	@Bean
	public Gson gson() {
		return new Gson();
	}
	
}
