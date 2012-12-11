package org.bluemagic.ui.config;

import org.bluemagic.ui.service.MagicDisplayService;
import org.bluemagic.ui.service.MagicDisplayServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfig {

    @Bean
    public MagicDisplayService getMagicDisplayService() {
    	return new MagicDisplayServiceImpl();
    }
}
