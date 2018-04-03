package com.claropool.software.controller;

import android.content.Context;
import com.claropool.software.utils.Const;

import java.util.HashMap;

public class WebPageController extends BaseController {


    private static final String TAG = "WebPageController";
    private Context context;

    public WebPageController(Context context) {
        this.context = context;
    }

    public HashMap wsPosition(String txt_latitude, String txt_longitude, String txt_et_user_id, String txt_et_code_group) {
        HashMap<String, String> params = new HashMap<String, String>();
        try {
            params.put(Const.PARAMETER_LATITUDE, txt_latitude);
            params.put(Const.PARAMETER_LONGITUDE, txt_longitude);
            params.put(Const.PARAMETER_USER_ID, txt_et_user_id);
            params.put(Const.PARAMETER_CODE_GROUP, txt_et_code_group);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return params;
    }


}
