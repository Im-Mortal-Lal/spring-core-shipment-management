package com.Taskday30;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.core.env.Environment;

@Configuration
@PropertySources({
	@PropertySource("classpath:com/Taskday30/Shippment.properties"),
	@PropertySource("classpath:com/Taskday30/DomesticFedex.properties"),
	@PropertySource("classpath:com/Taskday30/InternationalFedex.properties")
})
@ComponentScan(basePackages = "com.Taskday30")
public class ShippmentConfig {
	
	@Autowired
	Environment enviroment;
	@Bean
	@Primary
	public DTDC dtdc() {
		DTDC Package = new DTDC();
		Package.setTrackingId(enviroment.getProperty("dtdcTracking"));
		return Package;
	}
	
	@Bean
	public Bluedart bluedart() {
		Bluedart Package = new Bluedart();
		Package.setTrackingId(enviroment.getProperty("bluedartTracking"));
		return Package;
	}
	
	@Bean
	public Delhivery delhivery() {
		Delhivery Package = new Delhivery();
		Package.setTrackingId(enviroment.getProperty("delhiveryTracking"));		
		return Package;
	}
	
	@Bean
	public fedexDomestic fedexdomestic() {
		fedexDomestic Package = new fedexDomestic();
		Package.setTrackingNumber(enviroment.getProperty("domesticTracking"));
		Package.setVendorCode(enviroment.getProperty("domesticVendor"));
		return Package;
	}
	@Bean
	public fedexInternational fedexinternational() {
		fedexInternational Package = new fedexInternational();
		Package.setTrackingNumber(enviroment.getProperty("intlTracking"));
		Package.setVendorCode(enviroment.getProperty("intlVendor"));
		return Package;
	}
	
}
