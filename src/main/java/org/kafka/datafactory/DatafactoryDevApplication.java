package org.kafka.datafactory;

import lombok.extern.slf4j.Slf4j;
import org.kafka.datafactory.factory.SensorDataFactory;
import org.kafka.datafactory.schedule.DynamicScheduler;
import org.kafka.datafactory.schedule.SchedulerActor;
import org.kafka.datafactory.schedule.SchedulerManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.core.KafkaTemplate;


@Slf4j
@SpringBootApplication
public class DatafactoryDevApplication implements ApplicationRunner {

    @Autowired
    SensorDataFactory sensorDataFactory;

    @Autowired
    SchedulerManager schedulerManager;

    @Autowired
    private KafkaTemplate kafkaTemplate;

    public static void main(String[] args) {
        SpringApplication.run(DatafactoryDevApplication.class);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        DynamicScheduler dynamicScheduler = new DynamicScheduler("sensor-data", 1, new SchedulerActor() {
            @Override
            public void doTask() {
                send("test", sensorDataFactory.getJson());
            }
        });
        schedulerManager.add(dynamicScheduler);
        schedulerManager.startAll();
    }

    public void send(String topic, String payload) {
        kafkaTemplate.send(topic, payload);
        log.info("Message: " + payload + " sent to topic: " + topic);
    }
}
