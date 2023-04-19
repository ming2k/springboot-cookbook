package com.hihusky.profile;

import com.hihsuky.profile.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Configuration
public class TestConfiguration {
    @Bean
    @Primary
    @Profile({"default"})
    User test() {
        User user = new User("ming");
        return user;
    }
}
