package com.example.xhanii.gemnetenterprisesolution;

/**
 * Created by Xhanii on 2/7/2017.
 */

public class Config {
    //Address of our scripts of the CRUD

//    public static final String URL_GET_ALL ="http://dev.comsol.net.pk/invoices/getAllcomp.php";
//    public static final String URL_GET_EMP = "http://dev.comsol.net.pk/invoices/getcomp.php?com_id=";
//    public static final String URL_DELETE_EMP ="http://dev.comsol.net.pk/invoices/deletecomp.php?com_id=";
//    public static final String DATA_URL = "http://dev.comsol.net.pk/invoices/json.php";
    public static final String URL_CREATE_USER = "http://www.comsol.net.pk/invoices/create_user.php";
    public static final String LOGIN_URL = "http://dev.comsol.net.pk/invoices/admin_login.php";
  //  public static final String GET_USER ="http://dev.comsol.net.pk/invoices/getuser.php?user_id=";

    //Keys for email and password as defined in our $_POST['key'] in login.php
    public static final String KEY_MAIL = "admin_id";
    public static final String KEY_PASSWORD = "admin_Pass";

    //If server response is equal to this that means login is successful
    public static final String LOGIN_SUCCESS = "success";

    //Keys for Sharedpreferences
    //This would be the name of our shared preferences
    public static final String SHARED_PREF_NAME = "myloginapp";

    //This would be used to store the email of current logged in user
    public static final String EMAIL_SHARED_PREF = "admin_id";

    //We will use this to store the boolean in sharedpreference to track user is loggedin or not
    public static final String LOGGEDIN_SHARED_PREF = "loggedin";






    //Keys that will be used to send the request to php scripts
    public static final String KEY_USER_ID = "cus_id";
    public static final String KEY_PASS  = "password";
    public static final String KEY_USER_NAME = "cus_name";
    public static final String KEY_ADDRESS = "address";
    public static final String KEY_EMAIL = "email";
    public static final String KEY_CELL = "cell_no";
    public static final String KEY_IP = "ip_address";
    public static final String KEY_PKG = "net_package";
    public static final String KEY_AMOUNT  = "total_amount";

//    public static final String TAG_USER_ID = "cus_id";
//    public static final String TAG_USER_NAME = "cus_name";
//    public static final String TAG_ADDRESS = "address";
//    public static final String TAG_EMAIL = "email";
//    public static final String TAG_CELL = "cell_no";
//    public static final String TAG_IP = "ip_address";
//    public static final String TAG_PKG = "net_package";
//    public static final String TAG_AMOUNT = "total_amount";



//    public static final String T_JSON_ARRAY = "result";
//    public static final String TAG_USER_ID = "user_id";
//    public static final String TAG_USER_NAME = "user_fname";
//    public static final String TAG_ADDRESS = "user_address";
//    public static final String TAG_EMAIL = "user_email";
//    public static final String TAG_CELL = "user_number";
//    public static final String TAG_IP = "ip_address";
//    public static final String TAG_PKG = "user_package";
//    public static final String TAG_AMOUNT = "user_price";
//
//    //JSON Tags
//    public static final String TAG_JSON_ARRAY="result";
//    public static final String TAG_ID = "com_id";
//    public static final String TAG_NAME = "cus_id";
//    public static final String TAG_DESG = "complaints_massage";
//    public static final String TAG_SAL = "date";
//
//    public static final String JSON_ARRAY = "result";
//    //employee id to pass with intent
//    public static final String EMP_ID = "emp_id";
}
