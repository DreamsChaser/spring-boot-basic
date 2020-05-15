package org.dream.chaser.web.rest;

import com.dream.chaser.api.dto.CityDTO;
import org.dream.chaser.server.city.CityService;
import org.dream.chaser.web.request.QueryCityRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangdi
 * @version 1.0
 * @date 2020/5/15 17:33
 */
@RestController
@RequestMapping("/city")
public class CityController {

    @Autowired
    private CityService cityService;

    @RequestMapping("/query")
    @ResponseBody
    public CityDTO queryCity(@RequestBody QueryCityRequest queryCityRequest) {
        return cityService.queryById(queryCityRequest.getId());
    }

}
