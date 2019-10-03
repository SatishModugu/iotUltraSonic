package com.satish.iotultrasonic.model;

import javax.validation.constraints.NotNull;

public class CreateSensorRequestModel {
	
	@NotNull(message="deviceID cannot be null")
	private String deviceId;

	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}
}
