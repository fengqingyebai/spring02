package spring.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;

/**
 * Created by IntelliJ IDEA.
 * User: link
 * Date: 2017/9/21
 * Time: 9:39
 * To change this template use File | Settings | File Templates.
 */

@Controller
@RequestMapping("/")
public class ItemController {

    @RequestMapping("/items1")
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws UnsupportedEncodingException {
     System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

     //创建modelAndView准备填充数据、设置视图
     ModelAndView modelAndView = new ModelAndView();
     httpServletRequest.setCharacterEncoding("utf-8");
     modelAndView.setViewName("hello");
     return modelAndView;

    }


}
