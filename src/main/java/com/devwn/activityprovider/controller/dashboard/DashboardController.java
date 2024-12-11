package com.devwn.activityprovider.controller.dashboard;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/dashboard")
public class DashboardController {

    // Endpoint para dashboard
    @GetMapping("")
    public String dashboard() {return "dashboard/index";}

}
