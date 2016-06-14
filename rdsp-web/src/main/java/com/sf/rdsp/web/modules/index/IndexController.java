package com.sf.rdsp.web.modules.index;

import com.jfinal.core.Controller;
import com.sf.rdsp.web.utils.ext.route.ControllerBind;

/**
 * Created by 862911 on 2016/6/14.
 */
@ControllerBind(controllerKey = "/index", viewPath = "WEB-INF/page")
public class IndexController extends Controller {
    public void index() {
        render("index.ftl");
    }
}
