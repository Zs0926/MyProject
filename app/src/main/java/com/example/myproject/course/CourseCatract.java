package com.example.myproject.course;

public interface CourseCatract {

    interface  showView{
        void   onSuccess(String  error);
        void   onError(String  error);
    }
    interface   showModel{
        interface  Callback{
            void   onSuccess(String  error);
            void   onError(String  error);
        }
        void    data(Callback callback);
    }
    interface    showPresenter<T>{
        void   http();
    }

}
