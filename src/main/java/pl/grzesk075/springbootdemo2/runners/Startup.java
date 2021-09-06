package pl.grzesk075.springbootdemo2.runners;

import io.spring.guides.gs_producing_web_service.GetCountryResponse;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import pl.grzesk075.springbootdemo2.sandbox.soap.client.CountryClient;

@Component
public class Startup {

    @Bean
    CommandLineRunner lookup(CountryClient anyName) {
        return args -> {
            String country = "Spain";

            if (args.length > 0) {
                country = args[0];
            }
            GetCountryResponse response = anyName.getCountry(country);
            System.err.println(response.getCountry().getCurrency());
        };
    }
}
