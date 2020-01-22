package wang.diff.hello.spring.cloud.web.admin.ribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import wang.diff.hello.spring.cloud.web.admin.ribbon.service.AdminService;

@RestController
public class AdminController {

    @Autowired
    private AdminService adminService;

    @RequestMapping(value = "hi", method = RequestMethod.GET)
    public String sayHi(String message) {
        return adminService.sayHi(message);
    }
}
