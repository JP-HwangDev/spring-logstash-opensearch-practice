package com.example.slo.config;

import lombok.experimental.UtilityClass;
import lombok.extern.log4j.Log4j2;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.MarkerManager;

@Log4j2
@UtilityClass
public class Log4j2Config {

    public Marker logstash(){
         return MarkerManager.getMarker("LOGSTASH");
    }
}
