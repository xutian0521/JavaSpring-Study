package org.example.Controller;

import org.example.domain.User;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping(path = "/User")
public class UserController {
    /*
    * get参数 非实体
    */
    @RequestMapping(path = "/Login", method = RequestMethod.GET)
    public String Login(String userName,String passWord)
    {
        System.out.println("userName=" +userName +";passWord= " +passWord);
        return "Login";
    }
    /*
    * jsp页面传值
    * */
    @RequestMapping(path = "/Info")
    public String Info(Model model)
    {
        User user = new User();
        user.setAge(18);
        user.setUserName("tom");
        user.setPassWord("123");
        model.addAttribute("User", user);

        return "Info";
    }
    /*
    *  服务端重定向, 302重定向, 中文编码, Servlet原生响应
    * */
    @RequestMapping(path = "/Test")
    public void Test(HttpServletRequest request, HttpServletResponse response) throws Exception
    {
        System.out.println(request);
        HttpSession session =request.getSession();

        //服务端重定向
        //request.getRequestDispatcher("/WEB-INF/pages/Index.jsp").forward(request, response);

        //302重定向
        //response.sendRedirect(request.getContextPath() + "/index.jsp");

        //中文编码
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");

        //Servlet原始响应
        response.getWriter().print("Servlet原始响应");



        return ;
    }

    /*
     * 返回json
     * */
    @RequestMapping(path = "/InfoJson")
    public @ResponseBody User InfoJson(@RequestBody User user)
    {
        System.out.println(user.getUserName() + user.getAge());
        user.setAge(99);
        user.setUserName("jack");
        user.setPassWord("456");

        return user;
    }
}
