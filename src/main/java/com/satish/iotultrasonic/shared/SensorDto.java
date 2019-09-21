package com.satish.iotultrasonic.shared;
import java.io.Serializable;
public class SensorDto implements Serializable {
	private static final long serialVersionUID = 325971600084627747L;
	private String deviceName;
	private String date;
	private String time;
	private String value;
	public String getDeviceName() {
		return deviceName;
	}
	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
