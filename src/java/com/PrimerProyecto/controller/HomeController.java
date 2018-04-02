
package com.PrimerProyecto.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    
    @RequestMapping("home.htm")
    public ModelAndView home( HttpServletRequest request)
    {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("home/home");
        
        String dato1 = request.getParameter("id");
        String dato2 = request.getParameter("id2");
        
        
        mav.addObject("id", dato1);
        mav.addObject("id2", dato2);
        
        int intdato1 = Integer.parseInt(dato1);
        int intdato2 = Integer.parseInt(dato2);

        
        mav.addObject("resultado", intdato1+intdato2);
        
        return mav;
    }
    
    @RequestMapping("nosotros.htm")
    public ModelAndView nosotros()
    {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("home/nosotros");
        return mav;
    }
    
}
