package demo.mybatis;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import demo.mybatis.domain.City;
import demo.mybatis.mapper.CityMapper;

/**
 * Created by kind on 2017/3/22.
 */
@SpringBootApplication
public class SampleMapperApplication implements CommandLineRunner {

    private static Logger log = LoggerFactory.getLogger(SampleMapperApplication.class);

    final private CityMapper cityMapper;

    public SampleMapperApplication(CityMapper cityMapper) {
        this.cityMapper = cityMapper;
    }

    public static void main(String[] args) {
        SpringApplication.run(SampleMapperApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        log.info("\tfindByName ->San Francisco" + " = " + cityMapper.findByName("San Francisco"));
        log.info("\tfindByState ->CA" + " = " + cityMapper.findByState("CA"));
        log.info("\tfindNames ->y" + " = " + cityMapper.findNames("y"));
        //
        City city = new City();
        city.setName("Haha");
        city.setState("CA");
        city.setCountry("US");
        log.info("\tadd ->" + city);
        cityMapper.add(city);
        //
    }
}
