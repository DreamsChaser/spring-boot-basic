package org.dream.chaser.server.city;

import com.dream.chaser.api.dto.CityDTO;
import org.dream.chaser.dao.CityMapper;
import org.dream.chaser.domain.City;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author wangdi
 * @version 1.0
 * @date 2020/5/15 17:25
 */
@Service
public class CityService {

    @Autowired
    private CityMapper cityMapper;

    public CityDTO queryById(Long id) {
        CityDTO cityDTO = new CityDTO();
        City city = cityMapper.queryById(id);
        BeanUtils.copyProperties(city,cityDTO);
        return cityDTO;
    }
}
