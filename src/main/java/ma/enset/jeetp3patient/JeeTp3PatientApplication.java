package ma.enset.jeetp3patient;
import ma.enset.jeetp3patient.entities.Patient;
import ma.enset.jeetp3patient.repositories.PatientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Date;
@SpringBootApplication
public class JeeTp3PatientApplication {
    public static void main(String[] args) {
        SpringApplication.run(JeeTp3PatientApplication.class, args);
    }
    @Bean
    CommandLineRunner commandLineRunner(PatientRepository patientRepository){
        return args -> {
            patientRepository.save(new Patient(null, "Kim Namjoon", new Date(), false, 142));
            patientRepository.save(new Patient(null, "Kim SeokJin", new Date(), false, 20));
            patientRepository.save(new Patient(null, "Min Yoongi", new Date(), false, 13));
            patientRepository.save(new Patient(null, "Jung Hoseok", new Date(), false, 10));
            patientRepository.save(new Patient(null, "Park Jimin", new Date(), false, 70));
            patientRepository.save(new Patient(null, "Kim Taehyung", new Date(), false, 29));
            patientRepository.save(new Patient(null, "Jeon Jungkook", new Date(), false, 2));
        };
    }
    @Bean
    PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}

