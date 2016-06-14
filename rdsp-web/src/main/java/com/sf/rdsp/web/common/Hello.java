package com.sf.rdsp.web.common;

import com.jfinal.core.Controller;
import com.sf.rdsp.web.utils.ext.route.ControllerBind;

/**
 * Created by 862911 on 2016/6/14.
 */
@ControllerBind(controllerKey = "/hello", viewPath = "WEB-INF/page")
public class Hello extends Controller {
    public void index() {
        renderText("Hello JFinal World.");
    }
}
