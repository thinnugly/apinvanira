package com.devwn.activityprovider.controller.activityconfiguration;

import com.devwn.activityprovider.dto.activityconfiguration.ActivityConfigurationDTO;
import com.devwn.activityprovider.entitie.activityconfiguration.ActivityConfigurationEntitie;
import com.devwn.activityprovider.service.activityconfiguration.ActivityConfigurationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/configuration")
public class ActivityConfigurationController {

    @Autowired
    private ActivityConfigurationRepository activityConfigurationRepository;


    // Endpoint para index
    @GetMapping("/configuracao-interfaces")
    public String index(Model model) {
        List<ActivityConfigurationEntitie> activityConfigurationEntities = activityConfigurationRepository.findAll();
        model.addAttribute("activityConfigurationEntities", activityConfigurationEntities);
        return "activityconfiguration/index";
    }

    // Endpoint para configuração
    @GetMapping("/configuracao-interfaces/create")
    public String getConfig(Model model) {
        ActivityConfigurationDTO activityConfigurationDTO = new ActivityConfigurationDTO();
        model.addAttribute("activityConfigurationDTO", activityConfigurationDTO);
        return "activityconfiguration/config";
    }
}
