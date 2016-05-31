package edu.com.mvpCommon;

import edu.com.base.model.bean.Channel;
import edu.com.base.ui.activity.AbsSplashActivity;
import edu.com.base.ui.widget.ViewDisplay;

/**
 * Created by Anthony on 2016/5/10.
 * Class Note:
 */
public class SplashActivity extends AbsSplashActivity{


    @Override
    protected String getFirstUrl() {
        //// TODO: 2016/5/17  url define here to get data
        return "file://xxx";
    }

    @Override
    protected int getContentViewID() {
        return R.layout.activity_splash;
    }

    @Override
    protected void initDagger() {

    }

    @Override
    protected void showMain() {
        Channel channel = new Channel();
        channel.setType("1002");
        ViewDisplay.initialView(mContext, channel);
    }

}