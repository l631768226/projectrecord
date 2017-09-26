package hsoft.mobile.projectrecord.aop;

import hsoft.mobile.projectrecord.service.TokenService;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Aspect
@Component
public class Permission {

    @Autowired
    private TokenService tokenService;
    @Autowired
    private HttpServletRequest request;


    @Around(value = "execution(* hsoft.mobile.projectrecord.controller..*.*(..))")
    public Object checkSecurity(ProceedingJoinPoint pjp) throws Throwable{
        String path = request.getServletPath();
        System.out.println(path);
        if(path.equals("/") || path.equals("/login")){
            return pjp.proceed();
        }
//        if(!tokenService.processCheckToken()){
//            if(path.equals("/") || path.equals("/index")){
//                return new ModelAndView("redirect:/login");
//            }
//        }
        return pjp.proceed();
    }
}
