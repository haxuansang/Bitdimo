package com.appproteam.sangha.bitdimo.Utils;

public interface LoginConstant {
    public static final String USER_INFO_REQUIREMENT_MESSAGE = "Please enter username and password!";
    public static final String BANNED_STATUS = "banned";
    public static final String USER_BANNED_MESSAGE = "This user was banned";
    public static final String USER_LOGIN_SUCCESS_STATUS = "success";
    public static final String USER_ID_MESSAGE = "userId";
    public static final String USER_LOGIN_WRONG_USER_AND_PASS_RETURN =  "WUWPFailed";
    public static final String USER_LOGIN_RIGHT_USER_AND_PASS_RETURN =  "RUWPFailed";
    public static final String USER_LOGIN_WRONG_USER_MESSAGE = "Wrong username!";
    public static final String USER_LOGIN_WRONG_PASS_MESSAGE = "Wrong password!";
    public static final String USER_LOGIN_SUCCESS_RESPONSE_CODE = "Success";
    public static final String UER_LOGIN_WRONG_PASS_AND_USER_STATUS = "WUWP";
    public final static String PASSWORD_PATTERN = "^(?=.*[a-z])(?=.*\\d)[A-Za-z\\d#?!@$%^&*-]{8,30}";
    public final static String USERNAME_PATTERN = "^(?=.*[a-z])(?=.*\\d)[A-Za-z\\d#?!@$%^&*-]{8,30}";
    public final static String SHARED_PREFERENCES_LOCKED_USER_XML_FILE_NAME = "locked_user";
    public final static String SHARED_PREFERENCES_REMEMBERED_USER_XML_FILE_NAME = "remembered_user";
    public final static String TEMP_BANNED_USER_NAME = "user";
    public final static String LOST_INTERNET_CONNECTION_MESSAGE = "You lost Internet Connection. Please restart your Wifi or 3G.";
    public final static String USERNAME_ERROR_MESSAGE = "Tên tài khoản đúng với định dạng và tối thiểu là 8 kí tự, lớn nhất là 30 kí tự";
    public final static String PASSWORD_ERROR_MESSAGE = "Mật khẩu đúng với định dạng và tối thiểu là 8 kí tự, lớn nhất là 30 kí tự";
    public final static String DELAY_AFTER_WRONG_5_TIMES_MESSAGE = "You put a wrong password 5 times, now the login process is delayed";
    public final static String USERNAME_EMPTY = "";
    public final static String PASSWORD_EMPTY = "";
    public final static String BANNED_STATUS_CHARACTER = "b";
    public static final String APP_ID="72018";
    public static final String AUTH_KEY="Xp6Y24yq25GO3zc";
    public static final String AUTH_SECRET="cT8PxwdYYkROL3S";
    public static final String ACCOUNT_KEY="7yc_WUA_shXrP1YqRznJ";
    public static final String USERNAME="UsernameAll";
    public static final String PASSWORD="PasswordAll";
    public final static String REMEMBERED_USERNAME = "remembered_username";
    public final static String REMEMBERED_PASSWORD = "remembered_password";

}
