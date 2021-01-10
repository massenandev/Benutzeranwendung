package com.userapp.constant;

import sun.jvm.hotspot.types.JShortField;

public class SecurityConstant {
    public static final long EXPIRATION_TIME = 432_000_000; //5 days expressed in milliseconds
    public static final String TOKEN_PREFIX = "Bearer "; // whoever has this token, can give it to the app and its verified. No need to any further checks
    public static final String JWT_TOKEN_HEADER = "Jwt-Token"; //sticking to convention by writing this string
    public static final String TOKEN_CANNOT_BE_VERIFIED = "Token cannot be verified";
    public static final String MASSENAN_LLC = "Massenan, LLC";
    public static final String MASSENAN_ADMINISTRATION = "User Management";
    public static final String AUTHORITIES = "authorities";
    public static final String FORBIDDEN_MESSAGE = "You need to lo in to access this page";
    public static final String ACCESS_DENIED_MESSAGE = "You do not have permission to access this page";
    public static final String OPTIONS_HTTP_METHOD = "OPTIONS";
    public static final String[] PUBLIC_URLS = { "/user/login", "/user/register", "/user/resetpassword/**", "/user/image/**" };
}
