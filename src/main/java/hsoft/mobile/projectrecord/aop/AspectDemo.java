package hsoft.mobile.projectrecord.aop;

import com.google.gson.Gson;
import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

@Aspect
//申明是个spring管理的bean
//@Component
@Order(1)
/*
在@Before中优先执行@Order(5)的内容，再执行@Order(10)的内容
在@After和@AfterReturning中优先执行@Order(10)的内容，再执行@Order(5)的内容
所以我们可以这样子总结：
在切入点前的操作，按order的值由小到大执行
在切入点后的操作，按order的值由大到小执行
 */
public class AspectDemo {

    private Logger log = Logger.getLogger(getClass());

    private Gson gson = new Gson();

    //申明一个切点 里面是 execution表达式
    @Pointcut("execution(* hsoft.mobile.projectrecord.controller..*.*(..))")
    private void controllerAspect() {
    }


    //请求method前打印内容
    @Before(value = "controllerAspect()")
    public void methodBefore(JoinPoint joinPoint) {
        ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = requestAttributes.getRequest();

        //打印请求内容
        log.info("===============请求内容===============");
        log.info("请求地址:" + request.getRequestURL().toString());
        log.info("请求方式:" + request.getMethod());
        log.info("请求类方法:" + joinPoint.getSignature());
        log.info("请求类方法参数:" + Arrays.toString(joinPoint.getArgs()));
        log.info("===============请求内容===============");
    }


    //在方法执行完结后打印返回内容
    @AfterReturning(returning = "o", pointcut = "controllerAspect()")
    public void methodAfterReturing(Object o) {
        log.info("--------------返回内容----------------");
        log.info("Response内容:" + gson.toJson(o));
        log.info("--------------返回内容----------------");
    }
}
