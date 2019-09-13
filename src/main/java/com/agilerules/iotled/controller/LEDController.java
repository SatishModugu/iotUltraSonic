package com.agilerules.iotled.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.GpioFactory;
import com.pi4j.io.gpio.GpioPinDigitalInput;
import com.pi4j.io.gpio.GpioPinDigitalOutput;
import com.pi4j.io.gpio.PinMode;
import com.pi4j.io.gpio.PinPullResistance;
import com.pi4j.io.gpio.PinState;
import com.pi4j.io.gpio.RaspiPin;

@RestController
public class LEDController {
	
	public static GpioPinDigitalOutput pin;
	public static GpioPinDigitalOutput gpioTrigger;
	public static GpioPinDigitalInput gpioEcho; 
	
	
	@RequestMapping("/")
	public String greeting(){
		return "Inventory detecting Service!!";
	}
	
	@RequestMapping("/level")
	public String getDistance(){
		
			GpioController gpio = GpioFactory.getInstance();
			if(gpioTrigger==null)
			gpioTrigger =  gpio.provisionDigitalOutputPin(RaspiPin.GPIO_00);
			if(gpioEcho==null)
			gpioEcho = gpio.provisionDigitalInputPin(RaspiPin.GPIO_02,PinPullResistance.PULL_DOWN); // Echo pin as INPUT
			long startTime=0;
			long endTime=0;
			while(true){
				try {
				Thread.sleep(2000);
				gpioTrigger.high(); // Make trigger pin HIGH
				Thread.sleep((long) 0.01);// Delay for 10 microseconds
				gpioTrigger.low(); //Make trigger pin LOW
			
				while(gpioEcho.isLow()){ //Wait until the ECHO pin gets HIGH
					
				}
				 startTime= System.nanoTime(); // Store the surrent time to calculate ECHO pin HIGH time.
				while(gpioEcho.isHigh()){ //Wait until the ECHO pin gets LOW
					
				}
				endTime= System.nanoTime(); // Store the echo pin HIGH end time to calculate ECHO pin HIGH time.
			
				System.out.println("Distance :"+((((endTime-startTime)/1e3)/2) / 29.1) +" cm"); //Printing out the distance in cm  
				Thread.sleep(1000);
				
			} catch (InterruptedException e) {
				e.printStackTrace();
				}
				return "Distance :"+((((endTime-startTime)/1e3)/2) / 29.1) +" cm";
			}
					
	}

}
