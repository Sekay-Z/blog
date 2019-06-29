package cn.shukai.exception;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserHandlerException implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
        UserException userException;
        if(e instanceof UserException){
            userException=(UserException)e;
        }else{
            userException=new UserException("未知错误");
        }
        String message=userException.getMessage();
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("message",message);
        return modelAndView;
    }
}
