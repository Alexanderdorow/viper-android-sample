package br.com.alexanderdorow.vipersample.contract;

import android.support.v7.app.AppCompatActivity;

public interface BaseContracts {

    interface BaseView {
        void onViewReady();
    }

    interface BasePresenter {
        void onPresenterReady();

        void afterActivitySet();

        void setActivity(AppCompatActivity activity);
    }

    interface BaseInteractor {
        void onInteractorReady();


    }

}

