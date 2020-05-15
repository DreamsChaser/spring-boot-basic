package org.dream.chaser.domain;

import lombok.Data;

/**
 * @author wangdi
 * @version 1.0
 * @date 2020/5/15 16:07
 */
@Data
public class City {

    private Long id;

    private String name;

    private String countryCode;

    private String district;

    private Long population;

}
