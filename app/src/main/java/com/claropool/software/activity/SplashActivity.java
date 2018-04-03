package com.claropool.software.activity;

import android.content.Intent;
import android.os.Bundle;

import com.claropool.software.activity.R;

public class SplashActivity extends BaseActivity {

    private static final int SPLASH_SCREEN_TIMEOUT = 3500;
    private static final String TAG = "SplashActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_1_splash);
        toolBar("Splash", R.string.app_name);

        Thread timerThread = new Thread(){
            public void run(){
                try{
                    sleep(SPLASH_SCREEN_TIMEOUT);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }finally{
                    showWebPage();
                }
            }
        };
        timerThread.start();
    }

    @Override
    protected void onPause() {
        // TODO Auto-generated method stub
        super.onPause();
        finish();
    }

    private void showWebPage() {
        Intent intent = new Intent();
        intent.setClass(SplashActivity.this, WebPageActivity.class);
        startActivity(intent);
        SplashActivity.this.finish();

        /* Apply our act_1_splash exit (fade out) and menu_reports entry (fade in) animation transitions. */
        overridePendingTransition(R.anim.slide_in, R.anim.slide_out);
    }

    /*
    private void isLogged() {
        Intent intent = new Intent();
        boolean isLogged = getSharePreferencesIsLogged();

        if(user != null && isLogged){
            switch (user.getRole()){
                case Const.ROLE_FATHER:
                    intent.setClass(SplashActivity.this, ListChildrenActivity.class);
                    break;
                case Const.ROLE_TEACHER:
                    intent.setClass(SplashActivity.this, WebPageActivity.class);
                    break;
                default:
                    Utils.shortToast(SplashActivity.this, "El usuario no tiene un rol");
                    break;
            }
        }else{
            intent.setClass(SplashActivity.this, LoginActivity.class);
        }

        //REDIRECT - JAFETH
//        intent.setClass(SplashActivity.this, ModulesSeleccionActivity.class);

        startActivity(intent);
        SplashActivity.this.finish();

        /7Apply our act_1_splash exit (fade out) and menu_reports entry (fade in) animation transitions.
        overridePendingTransition(R.anim.slide_in, R.anim.slide_out);
    }
    */


}
