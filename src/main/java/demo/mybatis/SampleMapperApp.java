package demo.mybatis;

import demo.mybatis.domain.City;
import demo.mybatis.mapper.CityMapper;
import demo.mybatis.mapper.HotelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by kind on 2017/3/22.
 */
@SpringBootApplication
public class SampleMapperApp implements CommandLineRunner {

    private static Logger log = LoggerFactory.getLogger(SampleMapperApp.class);

    @Autowired
    private CityMapper cityMapper;

    @Autowired
    private HotelMapper hotelMapper;

    public static void main(String[] args) {
        SpringApplication.run(SampleMapperApp.class, args);
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
        log.info("\thotelMapper.selectByCityId ->1" + " = " + hotelMapper.selectByCityId(1));
    }
}
