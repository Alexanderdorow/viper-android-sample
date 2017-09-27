package br.com.alexanderdorow.vipersample.routing;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Alexander on 26/09/2017.
 */

public class BaseRouter {

    protected AppCompatActivity activity;

    BaseRouter(AppCompatActivity activity) {
        this.activity = activity;
    }

    protected void changeFragment(Fragment fragment){
        FragmentManager fragmentManager = activity.getSupportFragmentManager();

    }

}
