// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.implementation;

import com.azure.resourcemanager.security.fluent.models.HealthReportInner;
import com.azure.resourcemanager.security.models.EnvironmentDetails;
import com.azure.resourcemanager.security.models.HealthDataClassification;
import com.azure.resourcemanager.security.models.HealthReport;
import com.azure.resourcemanager.security.models.Issue;
import com.azure.resourcemanager.security.models.ResourceDetailsAutoGenerated;
import com.azure.resourcemanager.security.models.StatusAutoGenerated;
import java.util.Collections;
import java.util.List;

public final class HealthReportImpl implements HealthReport {
    private HealthReportInner innerObject;

    private final com.azure.resourcemanager.security.SecurityManager serviceManager;

    HealthReportImpl(HealthReportInner innerObject, com.azure.resourcemanager.security.SecurityManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public ResourceDetailsAutoGenerated resourceDetails() {
        return this.innerModel().resourceDetails();
    }

    public EnvironmentDetails environmentDetails() {
        return this.innerModel().environmentDetails();
    }

    public HealthDataClassification healthDataClassification() {
        return this.innerModel().healthDataClassification();
    }

    public StatusAutoGenerated status() {
        return this.innerModel().status();
    }

    public List<String> affectedDefendersPlans() {
        List<String> inner = this.innerModel().affectedDefendersPlans();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<Issue> issues() {
        List<Issue> inner = this.innerModel().issues();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public HealthReportInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.security.SecurityManager manager() {
        return this.serviceManager;
    }
}