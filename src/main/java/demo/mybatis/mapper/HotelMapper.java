package demo.mybatis.mapper;

import demo.mybatis.domain.Hotel;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by kind on 2017/5/22.
 */
@Mapper
public interface HotelMapper {

    Hotel selectByCityId(long id);
}
