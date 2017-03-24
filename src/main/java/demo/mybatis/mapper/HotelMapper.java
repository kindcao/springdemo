package demo.mybatis.mapper;

import org.apache.ibatis.annotations.Mapper;
import demo.mybatis.domain.Hotel;

/**
 * Created by kind on 2017/3/23.
 */
@Mapper
public interface HotelMapper {

    Hotel selectByCityId(int city_id);
}
