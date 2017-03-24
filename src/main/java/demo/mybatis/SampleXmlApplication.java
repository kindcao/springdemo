package demo.mybatis;

import org.apache.log4j.Logger;
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

    private static Logger logger = Logger.getLogger(SampleXmlApplication.class);

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
        logger.info("\tcityDao.selectCityById ->1" + " = " + cityDao.selectCityById(1));
        logger.info("\thotelMapper.selectByCityId ->1" + " = " + hotelMapper.selectByCityId(1));
    }
}
