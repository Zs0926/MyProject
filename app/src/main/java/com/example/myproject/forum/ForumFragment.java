package com.example.myproject.forum;


import android.support.v4.app.Fragment;
import android.view.View;

import com.example.myproject.R;
import com.example.myproject.base.BaseMVPFragment;
import com.example.myproject.base.BasePresenter;


/**
 * A simple {@link Fragment} subclass.
 */
public class ForumFragment extends BaseMVPFragment<ForumCatract.showView, BasePresenter<ForumCatract.showView>> implements ForumCatract.showView  {


    @Override
    protected BasePresenter<ForumCatract.showView> createPresenter() {
        return new ForumPresenter<>();
    }

    @Override
    protected void initView(View inflate) {

    }

    @Override
    protected int getLayout() {
        return R.layout.fragment_forum;
    }

    @Override
    public void onSuccess(String error) {

    }

    @Override
    public void onError(String error) {

    }
}
