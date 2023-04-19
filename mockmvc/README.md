# Mock MVC

Using Mock MVC to test the controller.

## HERE BE DRAGONS

---

**The instance can not be created**

Log:

```shell
Cannot construct instance of `com.hihusky.mockmvc.User` (no Creators, like default constructor, exist): cannot deserialize from Object value (no delegate- or property-based Creator)
  # ...
```

Resolution:

Add the no args constructor.

---

**Found multiple declarations of `@BootstrapWith`**

Log:

```shell
Configuration error: found multiple declarations of @BootstrapWith for test class [com.hihusky.mockmvc.UserControllerTest]: [@org.springframework.test.context.BootstrapWith(value=org.springframework.boot.test.context.SpringBootTestContextBootstrapper.class), @org.springframework.test.context.BootstrapWith(value=org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTestContextBootstrapper.class)]
    # ...
```

Resolution:

Remove the `@SpringBootTest` annotation.
