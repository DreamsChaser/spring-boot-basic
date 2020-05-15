package org.dream.chaser.dao;

import org.apache.ibatis.annotations.Mapper;
import org.dream.chaser.domain.City;
import org.springframework.stereotype.Repository;

/**
 * @author wangdi
 * @version 1.0
 * @date 2020/5/15 17:19
 */
@Repository
public interface CityMapper {

    City queryById(Long id);

}
