package demo.mybatis;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import demo.mybatis.dao.CityDao;
import demo.mybatis.mapper.HotelMapper;

/**
 * Created by kind on 2017/3/22.
 */
@SpringBootApplication
public class SampleXmlApplication implements CommandLineRunner {

    private static Logger log = LoggerFactory.getLogger(SampleXmlApplication.class);

    private final CityDao cityDao;

    private final HotelMapper hotelMapper;

    public SampleXmlApplication(CityDao cityDao, HotelMapper hotelMapper) {
        this.cityDao = cityDao;
        this.hotelMapper = hotelMapper;
    }

    public static void main(String[] args) {
        SpringApplication.run(SampleXmlApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        log.info("\tcityDao.selectCityById ->1" + " = " + cityDao.selectCityById(1));
        log.info("\thotelMapper.selectByCityId ->1" + " = " + hotelMapper.selectByCityId(1));
    }
}
