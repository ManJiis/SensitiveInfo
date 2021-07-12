package top.b0x0.sensitiveinfo.domain;

import lombok.Data;
import top.b0x0.sensitiveinfo.util.sensitive.SensitiveInfo;
import top.b0x0.sensitiveinfo.util.sensitive.SensitiveInfoType;
import top.b0x0.sensitiveinfo.util.sensitive.SensitiveType;

/**
 * @author TANG
 * @date 2021-07-12
 * @since 1.8
 */
@Data
public class User {

    private String nickname;

    @SensitiveInfo(value = SensitiveType.CHINESE_NAME)
    @SensitiveInfoType(value = SensitiveType.CHINESE_NAME)
    private String username;

    @SensitiveInfo(value = SensitiveType.MOBILE_PHONE)
    @SensitiveInfoType(value = SensitiveType.MOBILE_PHONE)
    private String mobilePhone;

    @SensitiveInfo(value = SensitiveType.ID_CARD)
    @SensitiveInfoType(value = SensitiveType.ID_CARD)
    private String cardNum;

    @SensitiveInfo(value = SensitiveType.BANK_CARD)
    @SensitiveInfoType(value = SensitiveType.BANK_CARD)
    private String bankNumber;

}
