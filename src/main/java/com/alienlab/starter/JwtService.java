package com.alienlab.starter;

import io.jsonwebtoken.Claims;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 描述:
 * JWT服务类
 *
 * @author Msater Zg
 * @create 2017-11-13 19:30
 */
@Service
public class JwtService {
    @Autowired
    JwtUtils jwtUtils;

    private String base64Security;

    private String issuer;

    public JwtService(String base64Security, String issuer) {
        this.base64Security = base64Security;
        this.issuer = issuer;
    }

    public String createPersonToken(Map map, String audience, long TTLMillis) {
        String personToken = jwtUtils.createJWT(map, audience, this.issuer, TTLMillis, this.base64Security);
        return personToken;
    }

    public Claims parsePersonJWT(String personToken) {
        Claims claims = jwtUtils.parseJWT(personToken, this.base64Security);
        return claims;
    }
}
