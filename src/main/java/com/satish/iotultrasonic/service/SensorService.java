package com.satish.iotultrasonic.service;

import com.satish.iotultrasonic.shared.SensorDto;

//Check about user details service.
public interface SensorService {
	
	SensorDto createSensorData(SensorDto sensorData);
	SensorDto getSensorDataByDate(String date);
}
