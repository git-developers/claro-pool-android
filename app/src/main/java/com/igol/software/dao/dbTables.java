package com.igol.software.dao;

import com.igol.software.utils.Const;

public class dbTables {
    public static String DB_NAME = "project.db";
    public static int DB_VERSION = Const.VERSION;
    public static String ID_INCREMENT = "id_increment";
    public static String CREATED_AT = "created_at";
    public static String USERNAME = "username";

    public static String T_USER = "t_user";
    public static String T_USER_NAME = "name";
    public static String T_USER_EMAIL = "email";
    public static String T_USER_ROLE = "role";
    public static String T_USER_INSERT_TYPE = "insert_type";

    public static String CREATE_T_USER =
            "CREATE TABLE " + T_USER + "(" +
            ID_INCREMENT + " INTEGER PRIMARY KEY AUTOINCREMENT," +
            T_USER_NAME + " VARCHAR(50)," +
            T_USER_EMAIL + " VARCHAR(200)," +
            USERNAME + " VARCHAR(50)," +
            T_USER_ROLE + " VARCHAR(50)," +
            T_USER_INSERT_TYPE + " VARCHAR(50)," +
            CREATED_AT + " TIMESTAMP DEFAULT CURRENT_TIMESTAMP)";

}
