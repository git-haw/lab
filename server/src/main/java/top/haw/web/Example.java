package top.haw.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by haw on 18-6-19.
 */
@Controller
public class Example {
    protected static Logger logger = LoggerFactory.getLogger(Example.class);

    @RequestMapping("/")
    @ResponseBody
    public String home(){
        logger.info("call home()");
        return "Hello World";
    }
}
