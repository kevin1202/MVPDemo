package com.lofty.longan.contract.welcome;

import com.lofty.longan.base.BaseView;

public interface WelcomeContract {
    interface View extends BaseView {
        void initBar();

        void loadImage();

        void jumpToMain();
    }

    interface Presenter {
        void init();
    }
}
