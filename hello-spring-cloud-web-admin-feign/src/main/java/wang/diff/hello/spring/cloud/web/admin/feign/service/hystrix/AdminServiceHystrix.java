package wang.diff.hello.spring.cloud.web.admin.feign.service.hystrix;

import org.springframework.stereotype.Component;
import wang.diff.hello.spring.cloud.web.admin.feign.service.AdminService;

@Component
public class AdminServiceHystrix implements AdminService {
    @Override
    public String sayHi(String message) {
        return String.format("hi, your message is %s, but request bad", message);
    }
}
