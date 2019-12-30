package com.ventulus95;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;

@Configuration
// 지금 이건  Controller를 빼고 처리하겠다는 것. 이런상태로 처리해주면, Service는 스캔이 안되서 오류발생.
//@ComponentScan(useDefaultFilters = false, includeFilters = @ComponentScan.Filter(Controller.class))
@ComponentScan
public class WebConfig {

}
