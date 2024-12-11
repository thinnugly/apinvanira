package com.devwn.activityprovider.service.activityconfiguration;

import com.devwn.activityprovider.entitie.activityconfiguration.ActivityConfigurationEntitie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActivityConfigurationRepository extends JpaRepository<ActivityConfigurationEntitie, Long> {

}
