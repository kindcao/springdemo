package demo.mybatis.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Component;
import demo.mybatis.domain.City;

/**
 * Created by kind on 2017/3/23.
 */
@Component
public class CityDao {

    private final SqlSession sqlSession;

    public CityDao(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }

    public City selectCityById(long id) {
        return this.sqlSession.selectOne("selectCityById", id);
    }
}
