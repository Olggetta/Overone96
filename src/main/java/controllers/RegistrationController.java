package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.UserService;

public class RegistrationController {
    private UserService userService;



    @GetMapping("/registration")
    public String showRegistrationPage() {
        return "register_page";
    }

    @PostMapping("/registration")
    public String checkInputData(
            @RequestParam("username") String username,
            @RequestParam("password") String password,
            @RequestParam("repassword") String repassword,
            Model model(

    )

    }

}