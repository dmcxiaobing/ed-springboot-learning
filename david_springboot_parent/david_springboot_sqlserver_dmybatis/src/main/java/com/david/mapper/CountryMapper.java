
package com.david.mapper;

import com.david.entity.Country;
import com.david.util.mapper.MyMapper;
import org.apache.ibatis.annotations.Select;

public interface CountryMapper extends MyMapper<Country> {

    @Select("select * from country limit 1")
    Country findOne();
}