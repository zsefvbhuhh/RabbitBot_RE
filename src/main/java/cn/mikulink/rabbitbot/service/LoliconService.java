package cn.mikulink.rabbitbot.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @author by MechellWater
 * @date : 2020-12-23 20:52
 */
@Service
public class LoliconService {
    private static final Logger logger = LoggerFactory.getLogger(WeatherService.class);

    @Value("${lolicon.key}")
    private String loliconKey;

}
