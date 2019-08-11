package com.example.myproject.home;


import android.view.View;

import com.example.myproject.R;
import com.example.myproject.base.BaseMVPFragment;


public class HomeFragment extends BaseMVPFragment<HomeCatract.showView,HomePresenter<HomeCatract.showView>> implements HomeCatract.showView  {


    @Override
    protected HomePresenter<HomeCatract.showView> createPresenter() {
        return new HomePresenter<>();
    }

    @Override
    protected void initView(View inflate) {

    }

    @Override
    protected int getLayout() {
        return R.layout.fragment_home;
    }

    @Override
    public void onSuccess(String error) {

    }

    @Override
    public void onError(String error) {

    }
}
