package com.devwn.activityprovider.dto.activityconfiguration;

import jakarta.validation.constraints.*;
import org.springframework.web.multipart.MultipartFile;

import java.time.LocalDateTime;


public class ActivityConfigurationDTO {

    @NotEmpty(message = "The description is requires.")
    @Size(min = 10, message = "The description should be at least 10 characters.")
    @Size(max = 2000, message = "The description cannot exceed 2000 characters.")
    private String technicalDescription;

    @NotEmpty(message = "Activity instructions are required.")
    private MultipartFile activityInstructions;

    @NotEmpty(message = "Support material is required.")
    private MultipartFile supportMaterial;

    public String getTechnicalDescription() {
        return technicalDescription;
    }

    public void setTechnicalDescription(String technicalDescription) {
        this.technicalDescription = technicalDescription;
    }

    public MultipartFile getActivityInstructions() {
        return activityInstructions;
    }

    public void setActivityInstructions(MultipartFile activityInstructions) {
        this.activityInstructions = activityInstructions;
    }

    public MultipartFile getSupportMaterial() {
        return supportMaterial;
    }

    public void setSupportMaterial(MultipartFile supportMaterial) {
        this.supportMaterial = supportMaterial;
    }
}

