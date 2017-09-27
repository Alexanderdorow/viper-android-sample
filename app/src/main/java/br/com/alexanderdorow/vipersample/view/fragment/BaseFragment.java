package br.com.alexanderdorow.vipersample.view.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import br.com.alexanderdorow.vipersample.contract.BaseContracts;

/**
 * Created by Alexander on 26/09/2017.
 */


public abstract class BaseFragment<P extends BaseContracts.BasePresenter>
        extends Fragment
        implements BaseContracts.BaseView {

    protected P presenter;
    protected AppCompatActivity activity;
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        activity = (AppCompatActivity) context;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        beforeCreateView();
        return inflater.inflate(getLayout(), null, false);
    }

    protected abstract void beforeCreateView();

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setupPresenter();
        onViewReady();
    }

    public void setupPresenter() {
        this.presenter = getPresenter();
        this.presenter.setActivity(activity);
    }

    abstract int getLayout();

    abstract P getPresenter();

    @SuppressWarnings("unchecked")
    public <T> T getViewById(int id) {
        return (T) getView().findViewById(id);
    }

}
