package demo.mybatis;

import demo.mybatis.domain.City;
import demo.mybatis.domain.Hotel;

import java.util.List;

/**
 * Created by kind on 2017/5/23.
 */
public interface MvcSampleService {

    List<City> findNames(String name);

    Hotel selectByCityId(long id);
}
