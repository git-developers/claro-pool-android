package com.claropool.software.utils;

/**
 * Created by jafeth on 3/31/17.
 */

public class Const {

    public static final int STATUS_SUCCESS = 1;
    public static final int STATUS_WARNING = 2;
    public static final int STATUS_ERROR = 3;

    public static final int VERSION = 3;
    public static final int HTTP_STATUS_200 = 200;
    public static final int SOCKET_TIMEOUT = 4000;
    public static final String IS_LOGGED = "is_logged";
    public static final String LAST_ACTIVITY = "last_activity";
    public static final String ROLE_FATHER = "ROLE_FATHER";
    public static final String ROLE_TEACHER = "ROLE_TEACHER";

    public static final String CONTENT_TYPE = "application/json";
    public static final String PREFERENCES = "preferences";

    public static final String PARAMETER_USERNAME = "username";
    public static final String PARAMETER_STUDENT_USERNAME = "student_username";
    public static final String PARAMETER_PASSWORD = "password";
    public static final String PARAMETER_REGISTRATION_ID = "registration_id";
    public static final String PARAMETER_USER_ID = "user_id";
    public static final String PARAMETER_CODE_GROUP = "code_group";
    public static final String PARAMETER_LATITUDE = "latitude";
    public static final String PARAMETER_LONGITUDE = "longitude";

    public static final String JSON_KEY_USER = "user";
    public static final String JSON_KEY_USERS_BY_COURSE = "users_by_course";
    public static final String JSON_KEY_COURSES = "courses";
    public static final String JSON_KEY_CHILDREN = "children";

    public static final int ACTIVITY_LOGIN = 1;
    public static final int ACTIVITY_COURSES = 2;
    public static final int ACTIVITY_POST_POSITION = 15;

    public static final String BASE_ROUTE = "http://grupocazaperu.com/soccer-rent/web/app_dev.php/";
    public static final String ROUTE_POST_POSITION = BASE_ROUTE + "route/save";
    public static final String ROUTE_LOGIN = BASE_ROUTE + "user/login";


}
