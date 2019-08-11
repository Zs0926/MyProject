package com.example.myproject.main;


import android.support.v4.app.Fragment;
import android.view.View;

import com.example.myproject.R;
import com.example.myproject.base.BaseMVPFragment;
import com.example.myproject.base.BasePresenter;


/**
 * A simple {@link Fragment} subclass.
 */
public class MyFragment extends BaseMVPFragment<MyCatract.showView, BasePresenter<MyCatract.showView>> implements  MyCatract.showView {


    @Override
    protected BasePresenter<MyCatract.showView> createPresenter() {
        return new MyPresenter<>();
    }

    @Override
    protected void initView(View inflate) {

    }

    @Override
    protected int getLayout() {
        return R.layout.fragment_my;
    }

    @Override
    public void onSuccess(String error) {

    }

    @Override
    public void onError(String error) {

    }
}
