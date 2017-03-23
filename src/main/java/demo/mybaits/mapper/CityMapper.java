package demo.mybaits.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import demo.mybaits.domain.City;

/**
 * Created by kind on 2017/3/22.
 */
@Mapper
public interface CityMapper {

    @Select("select * from city where name = #{name}")
    City findByName(@Param("name") String name);

    @Select("select * from city where state = #{state}")
    List<City> findByState(@Param("state") String state);

    @Select("select * from city where name LIKE concat(concat('%',#{name}),'%')")
    List<City> findNames(@Param("name") String name);

    @Insert("insert into city (name, state, country) values (#{city.name},#{city.state},#{city.country})")
    void add(@Param("city") City city);
}