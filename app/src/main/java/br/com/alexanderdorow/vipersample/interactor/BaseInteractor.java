package br.com.alexanderdorow.vipersample.interactor;

import br.com.alexanderdorow.vipersample.contract.BaseContracts;

/**
 * Created by Alexander on 26/09/2017.
 */

abstract class BaseInteractor<P extends BaseContracts.BasePresenter> implements BaseContracts.BaseInteractor {

    protected P presenter;

    public BaseInteractor(P presenter) {
        this.presenter = presenter;
    }
}
