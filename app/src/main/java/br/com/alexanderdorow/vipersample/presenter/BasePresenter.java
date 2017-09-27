package br.com.alexanderdorow.vipersample.presenter;

import android.support.v7.app.AppCompatActivity;

import br.com.alexanderdorow.vipersample.contract.BaseContracts;

/**
 * Created by Alexander on 26/09/2017.
 */

abstract class BasePresenter<V extends BaseContracts.BaseView, I extends BaseContracts.BaseInteractor>
        implements BaseContracts.BasePresenter {

    protected V view;
    protected I interactor;
    protected AppCompatActivity activity;

    public BasePresenter(V view) {
        this.view = view;
        setInteractor();
        onPresenterReady();
    }

    public void setInteractor() {
        this.interactor = getInteractor();
    }

    public abstract I getInteractor();

    @Override
    public void setActivity(AppCompatActivity activity) {
        this.activity = activity;
        afterActivitySet();
    }
}

