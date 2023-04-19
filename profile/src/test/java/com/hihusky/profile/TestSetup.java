package com.hihusky.profile;

import com.hihsuky.profile.Main;
import com.hihsuky.profile.User;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@SpringBootTest(classes = {Main.class, TestConfiguration.class})
@Configuration
public class TestSetup {
}
