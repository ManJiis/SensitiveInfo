package top.b0x0.sensitiveinfo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import top.b0x0.sensitiveinfo.domain.User;
import top.b0x0.sensitiveinfo.service.UserService;
import top.b0x0.sensitiveinfo.util.sensitive.SensitiveInfoUtils;

/**
 * @author TANG
 * @date 2021-07-12
 * @since 1.8
 */
@RestController
public class UserController {
    private static final Logger log = LoggerFactory.getLogger(UserController.class);

    @Autowired
    UserService userService;

    @GetMapping("user")
    public User getUser() {
        User user = new User();
        user.setNickname("李四");
        user.setUsername("李四");
        user.setMobilePhone("17622338888");
        user.setCardNum("43022420001225391X");
        user.setBankNumber("901729712903701974017");

        log.error("user: {}", SensitiveInfoUtils.noSensitiveObject(user));

        return userService.getUser();
    }
}
