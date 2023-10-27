package hello.proxy.app.v1;

import org.springframework.web.bind.annotation.*;

//스프링은 @Controller 또는 @RequestMapping 이 있어야 스프링 컨드롤러로 인식
//스프링 3.0 이상에서는 @Controller 만 스프링 컨드롤러로 인식
//@RequestMapping
//@ResponseBody
@RestController
public interface OrderControllerV1 {

    @GetMapping("/v1/request")
    String request(@RequestParam("itemId") String itemId);

    @GetMapping("/v1/no-log")
    String noLog();
}
