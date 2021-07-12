package top.b0x0.sensitiveinfo.service;

import org.springframework.stereotype.Component;
import top.b0x0.sensitiveinfo.domain.User;

/**
 * @author TANG
 * @date 2021-07-12
 * @since 1.8
 */
@Component
public class UserService {

    private static final User USER = new User();

    static {
        USER.setNickname("张三");
        USER.setUsername("张三");
        USER.setMobilePhone("176898701446");
        USER.setCardNum("43022419760819492X");
        USER.setBankNumber("901729712903701974017");
    }

    public User getUser() {
        return USER;
    }
}
