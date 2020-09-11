package th.ac.ku.atm;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ATMConfig {
    @Bean
    public DataSource dataSource() {
        return new DataSourceFile("./src/main/resources/customers.txt");
    }

    @Bean
    public Bank bank() {
        return new Bank("PuenCruft-BANK", dataSource());
    }

    @Bean
    public ATM atm() {
        return new ATM(bank());
    }
}
