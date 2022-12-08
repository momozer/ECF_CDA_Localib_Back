package fr.momozer.m2i.ECF.ecfback.vehicules;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class VehiculeConfiguration {
    @Bean
    public VehiculeService vehiculeService(VehiculeRepository vehiculeRepository){
        return new VehiculeServiceImpl(vehiculeRepository);
    }
}
