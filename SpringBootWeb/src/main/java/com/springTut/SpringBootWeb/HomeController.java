package com.springTut.SpringBootWeb;

//import ch.qos.logback.core.model.Model;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @RequestMapping("/") //this used to find the path of jsp
    public String home(){
        System.out.println("Inside the home method");
        return "index.jsp";
    }
    @RequestMapping("/add")
    //public String addNum(HttpServletRequest req, HttpSession session){
        //another way to pass the param without using httpservelet req
   /* public String addNum(@RequestParam("num1") int num1,@RequestParam("num2") int num2,HttpSession session){ */
            //USING THE MODEL OBJECT INSTEAD OF SESSION
    public String addNum(@RequestParam("num1") int num1, @RequestParam("num2") int num2, Model model){
//        int num1= Integer.parseInt(req.getParameter("num1"));
//        int num2= Integer.parseInt(req.getParameter("num2"));

        int result = num1+num2;
        System.out.println(result);
       // session.setAttribute("result",result);
        model.addAttribute("result",result);
        return "result.jsp";
    }
}
