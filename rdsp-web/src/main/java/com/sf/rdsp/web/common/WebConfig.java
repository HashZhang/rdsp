package com.sf.rdsp.web.common;

import com.jfinal.config.*;
import com.jfinal.core.JFinal;
import com.sf.rdsp.web.utils.StrUtil;
import com.sf.rdsp.web.utils.ext.route.AutoBindRoutes;

/**
 * Created by 862911 on 2016/6/14.
 */
public class WebConfig extends JFinalConfig {
    @Override
    public void configConstant(Constants me) {
        // 加载少量必要配置，随后可用getProperty(...)获取值
        loadPropertyFile("config.properties");
        //设置是否为开发模式，开发模式下
        me.setDevMode(getPropertyToBoolean("devMode", false));
        me.setFreeMarkerViewExtension("ftl");
        String staticPath = getProperty("static.path");
        me.setBaseUploadPath(StrUtil.isBlank(staticPath) ? "static/upload" : staticPath);
        me.setFreeMarkerTemplateUpdateDelay(300);
        me.setError401View("/WEB-INF/page/401.html");
        me.setError404View("/WEB-INF/page/404.html");
        me.setError500View("/WEB-INF/page/500.html");
    }

    @Override
    public void configRoute(Routes me) {
        me.add(new AutoBindRoutes());
    }

    @Override
    public void configPlugin(Plugins me) {

    }

    @Override
    public void configInterceptor(Interceptors me) {

    }

    @Override
    public void configHandler(Handlers me) {

    }

    public static void main(String[] args) {
        JFinal.start("rdsp-web/src/main/webapp", 4001, "/", 5);
    }
}
