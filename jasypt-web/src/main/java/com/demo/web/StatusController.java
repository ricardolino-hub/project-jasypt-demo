package com.demo.web;

import com.demo.core.ConfigService;
import com.demo.core.DatabaseService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StatusController {
    private final DatabaseService databaseService;
    private final ConfigService configService;

    public StatusController(DatabaseService dbSvc, ConfigService cfgSvc) {
        this.databaseService = dbSvc;
        this.configService = cfgSvc;
    }

    @GetMapping("/")
    public String showStatus(Model model) {
        model.addAttribute("dbStatus", databaseService.checkConnection());
        model.addAttribute("internalKey", configService.getInternalKey());
        return "index";
    }
}