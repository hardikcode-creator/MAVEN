package org.withoutXML2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class javaConfig {

@Bean
    public Samosa getSamosa(){
    return new Samosa();
}

@Bean
    public Class1 getClass1(){
    Class1  class1 = new Class1(getSamosa());
    return class1;
}

}
