package com.workrc.common.exception;

import com.workrc.common.result.ErrorCode;
import com.workrc.common.result.ResponseEntity;
import com.workrc.common.result.ResponseStatus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class GlobalExceptionHandler {
    private static final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    /**
     * 处理自定义的业务异常
     * @param req
     * @param e
     * @return
     */
    @ExceptionHandler(value = BussinessException.class)
    @ResponseBody
    public ResponseEntity<String> bizExceptionHandler(HttpServletRequest req, BussinessException e){
        logger.error("发生业务异常！原因是：{}",e.getErrorMsg());
        return new ResponseEntity<String>(ErrorCode.ERROR.code(), ResponseStatus.ERROR,e.getErrorMsg());
    }
    /**
     * 处理空指针的异常
     * @param req
     * @param e
     * @return
     */
    @ExceptionHandler(value =NullPointerException.class)
    @ResponseBody
    public ResponseEntity<String>  exceptionHandler(HttpServletRequest req, NullPointerException e){
        logger.error("发生空指针异常！原因是:",e);
        return new ResponseEntity<String>(ErrorCode.ERROR_NULL.code(),ResponseStatus.ERROR,e.getMessage());
    }
    /**
     * 处理其他异常
     * @param req
     * @param e
     * @return
     */
    @ExceptionHandler(value =Exception.class)
    @ResponseBody
    public  ResponseEntity<String>  exceptionHandler(HttpServletRequest req, Exception e){
        logger.error("发生空指针异常！原因是:",e);
        return new ResponseEntity<String>(ErrorCode.ERROR.code(),ResponseStatus.ERROR,e.getMessage());
    }
}
