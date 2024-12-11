package com.devwn.activityprovider.entitie.activityconfiguration;

import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;

@Entity
@Table(name = "activities")
public class ActivityConfigurationEntitie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "technical_description", nullable = false, columnDefinition = "TEXT")
    private String technicalDescription;

    @Column(name = "activity_instructions", nullable = false)
    private String activityInstructions;

    @Column(name = "support_material", nullable = false)
    private String supportMaterial;

    @CreatedDate
    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt;

    @LastModifiedDate
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    public ActivityConfigurationEntitie() {
    }

    public ActivityConfigurationEntitie(String technicalDescription, String activityInstructions, String supportMaterial) {
        this.technicalDescription = technicalDescription;
        this.activityInstructions = activityInstructions;
        this.supportMaterial = supportMaterial;
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTechnicalDescription() {
        return technicalDescription;
    }

    public void setTechnicalDescription(String technicalDescription) {
        this.technicalDescription = technicalDescription;
    }

    public String getActivityInstructions() {
        return activityInstructions;
    }

    public void setActivityInstructions(String activityInstructions) {
        this.activityInstructions = activityInstructions;
    }

    public String getSupportMaterial() {
        return supportMaterial;
    }

    public void setSupportMaterial(String supportMaterial) {
        this.supportMaterial = supportMaterial;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
}

