package br.com.alexanderdorow.vipersample.view.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import br.com.alexanderdorow.vipersample.contract.BaseContracts;

/**
 * Created by Alexander on 26/09/2017.
 */

public abstract class   BaseActivity<P extends BaseContracts.BasePresenter>
        extends AppCompatActivity
        implements BaseContracts.BaseView {

    protected P presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayout());
        setupPresenter();
        onViewReady();
    }

    public void setupPresenter() {
        this.presenter = getPresenter();
    }

    abstract int getLayout();

    abstract P getPresenter();


}
