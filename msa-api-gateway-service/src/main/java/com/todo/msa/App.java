package com.todo.msa;

import com.todo.msa.filter.AccessFilter;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

/**
 * Hello world!
 *
 */
@EnableZuulProxy
@SpringCloudApplication
public class App 
{
    public static void main( String[] args )
    {
        new SpringApplicationBuilder(App.class).web(true).run(args);
    }

    @Bean
    public AccessFilter accessFilter() {
        return new AccessFilter();
    }
}
