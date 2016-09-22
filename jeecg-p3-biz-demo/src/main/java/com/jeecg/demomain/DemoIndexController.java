package com.jeecg.demomain;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.velocity.VelocityContext;
import org.jeecgframework.p3.core.util.plugin.ViewVelocity;
import org.jeecgframework.p3.core.web.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

 /**
 * 描述：首页
 * @author Alex
 * @version:1.0
 */
@Controller
@RequestMapping("/demo/index")
public class DemoIndexController extends BaseController{

	/**
	 * 跳转到欢迎页
	 * @return
	 * @throws Exception 
	 */
	@RequestMapping(method = {RequestMethod.GET,RequestMethod.POST})
	public void index(HttpServletRequest request,HttpServletResponse response,ModelMap model) throws Exception{
		 try {
//			 LOG.info(request, " back home");
			 VelocityContext velocityContext = new VelocityContext();
			 String viewName = "demomain/index.vm";
			 ViewVelocity.view(request,response,viewName,velocityContext);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
