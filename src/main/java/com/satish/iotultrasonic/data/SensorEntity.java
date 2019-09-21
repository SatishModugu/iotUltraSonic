package com.satish.iotultrasonic.data;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="sensorData")
public class SensorEntity implements Serializable {
	
	private static final long serialVersionUID = -8446450201475492755L;
	@Column(nullable=false, length=50)
	private String deviceName;
	@Column(nullable=false, length=50)
	private String date;
	@Column(nullable=false, length=50, unique=true)
	private String time;
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
	@Column(nullable=false, unique=true)
	private String value;

}
