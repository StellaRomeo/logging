package co.develhope.logging.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class BasicService{

    Logger logger = LoggerFactory.getLogger(BasicService.class);

    public int calculateExponent(int value1, int value2){
        logger.debug("Exponent calculation started with values %d and %d", value1,value2);
        int result = value1 + value2;
        logger.info("Exponent calculation completed with result %d", result);
        return result;

    }
}