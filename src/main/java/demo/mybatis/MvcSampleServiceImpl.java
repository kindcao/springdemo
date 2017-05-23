package demo.mybatis;

import demo.mybatis.domain.City;
import demo.mybatis.domain.Hotel;
import demo.mybatis.mapper.CityMapper;
import demo.mybatis.mapper.HotelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by kind on 2017/5/23.
 */
@Service
public class MvcSampleServiceImpl implements MvcSampleService {

    @Autowired
    private CityMapper cityMapper;

    @Autowired
    private HotelMapper hotelMapper;

    public List<City> findNames(String name) {
        return cityMapper.findNames(name);
    }

    public Hotel selectByCityId(long id) {
        return hotelMapper.selectByCityId(id);
    }
}
