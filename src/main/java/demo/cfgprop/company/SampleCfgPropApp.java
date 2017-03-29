package demo.cfgprop.company;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by kind on 2017/3/29.
 */
@SpringBootApplication
public class SampleCfgPropApp implements CommandLineRunner {

    private static Logger log = LoggerFactory.getLogger(SampleCfgPropApp.class);

    @Autowired
    private CompanyProperties companyProperties;

    public static void main(String[] args) {
        SpringApplication.run(SampleCfgPropApp.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        log.info("getCfg [com.kfit.company.name] = " + companyProperties.getName());
        log.info("getCfg [com.kfit.company.COMPANY_FULLNAM] = " + companyProperties.getCompanyFullname());
        log.info("getCfg [com.kfit.company.employs] = " + companyProperties.getEmploys());
    }
}
