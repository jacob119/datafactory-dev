package org.kafka.datafactory.data;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
public class SensorData {
    private String id;
    private String eventTime;
    private double temperature;
}
