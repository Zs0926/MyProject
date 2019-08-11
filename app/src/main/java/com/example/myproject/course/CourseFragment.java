package com.example.myproject.course;


import android.support.v4.app.Fragment;
import android.view.View;

import com.example.myproject.R;
import com.example.myproject.base.BaseMVPFragment;
import com.example.myproject.base.BasePresenter;


/**
 * A simple {@link Fragment} subclass.
 */
public class CourseFragment extends BaseMVPFragment<CourseCatract.showView, BasePresenter<CourseCatract.showView>> implements  CourseCatract.showView {


    @Override
    protected BasePresenter<CourseCatract.showView> createPresenter() {
        return new CoursePresenter<>();
    }

    @Override
    protected void initView(View inflate) {

    }

    @Override
    protected int getLayout() {
        return R.layout.fragment_course;
    }

    @Override
    public void onSuccess(String error) {

    }

    @Override
    public void onError(String error) {

    }
}
