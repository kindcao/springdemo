package demo.mybaits;

import org.apache.log4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import demo.mybaits.domain.City;
import demo.mybaits.mapper.CityMapper;

/**
 * Created by kind on 2017/3/22.
 */
@SpringBootApplication
public class SampleMapperApplication implements CommandLineRunner {

    private static Logger logger = Logger.getLogger(SampleMapperApplication.class);

    final private CityMapper cityMapper;

    public SampleMapperApplication(CityMapper cityMapper) {
        this.cityMapper = cityMapper;
    }

    public static void main(String[] args) {
        SpringApplication.run(SampleMapperApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info("\tfindByName ->San Francisco" + " = " + cityMapper.findByName("San Francisco"));
        logger.info("\tfindByState ->CA" + " = " + cityMapper.findByState("CA"));
        logger.info("\tfindNames ->y" + " = " + cityMapper.findNames("y"));
        //
        City city = new City();
        city.setName("Haha");
        city.setState("CA");
        city.setCountry("US");
        logger.info("\tadd ->" + city);
        cityMapper.add(city);
        //
    }
}
