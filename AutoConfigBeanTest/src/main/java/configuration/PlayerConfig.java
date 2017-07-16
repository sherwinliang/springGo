package configuration;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import music.CompactDisc;
import music.SgtPeppers;

@Configuration
@ComponentScan(basePackages={"media","configuration", "music"})
//@EnableAspectJAutoProxy
public class PlayerConfig {
	
	@Bean
	public CompactDisc sgtPeppers(){
		return new SgtPeppers();
	}
	
//	@Bean
//	public Audience audience(){
//		return new Audience();
//	}
	
}
