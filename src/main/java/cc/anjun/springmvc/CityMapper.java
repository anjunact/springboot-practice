package cc.anjun.springmvc;

import cc.anjun.springmvc.domain.City;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Mapper
public interface  CityMapper {
    @Select("select * from city")
    public List<City> getList();
}
