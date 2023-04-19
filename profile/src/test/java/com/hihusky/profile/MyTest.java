package com.hihusky.profile;

import com.hihsuky.profile.Main;
import com.hihsuky.profile.MyService;
import com.hihsuky.profile.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("default")
public class MyTest extends TestSetup {

    @Autowired
    private MyService myService;

    @Autowired
    private User user;

    @Test
    public void testMyService() {
        myService.printHello();
        System.out.println(user.toString());
        // testing logic here
    }
}