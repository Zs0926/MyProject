package com.example.myproject.shopping;


import android.support.v4.app.Fragment;
import android.view.View;

import com.example.myproject.R;
import com.example.myproject.base.BaseMVPFragment;
import com.example.myproject.base.BasePresenter;


/**
 * A simple {@link Fragment} subclass.
 */
public class ShoppingFragment extends BaseMVPFragment<ShoppingCatract.showView, BasePresenter<ShoppingCatract.showView>> implements ShoppingCatract.showView {


    @Override
    protected BasePresenter<ShoppingCatract.showView> createPresenter() {
        return new ShoppingPresenter<>();
    }

    @Override
    protected void initView(View inflate) {

    }

    @Override
    protected int getLayout() {
        return R.layout.fragment_shopping;
    }

    @Override
    public void onSuccess(String error) {

    }

    @Override
    public void onError(String error) {

    }
}
