package com.alienlab.starter;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 描述:
 * JWT配置类，读取配置文件,组装成jwt的形式
 *
 * @author Msater Zg
 * @create 2017-11-13 19:30
 */
@ConfigurationProperties(prefix = "jwt")
public class JwtServiceProperties {

    /**
     * 密钥
     * 系统的简称
     */
    private String base64Security;

    private String issuer;

    public String getBase64Security() {
        return base64Security;
    }

    public void setBase64Security(String base64Security) {
        this.base64Security = base64Security;
    }

    public String getIssuer() {
        return issuer;
    }

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }
}
