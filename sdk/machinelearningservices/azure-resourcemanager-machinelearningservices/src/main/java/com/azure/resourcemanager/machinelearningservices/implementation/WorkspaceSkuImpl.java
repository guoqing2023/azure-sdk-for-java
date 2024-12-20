// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearningservices.implementation;

import com.azure.resourcemanager.machinelearningservices.fluent.models.WorkspaceSkuInner;
import com.azure.resourcemanager.machinelearningservices.models.ResourceSkuLocationInfo;
import com.azure.resourcemanager.machinelearningservices.models.Restriction;
import com.azure.resourcemanager.machinelearningservices.models.SkuCapability;
import com.azure.resourcemanager.machinelearningservices.models.WorkspaceSku;
import java.util.Collections;
import java.util.List;

public final class WorkspaceSkuImpl implements WorkspaceSku {
    private WorkspaceSkuInner innerObject;

    private final com.azure.resourcemanager.machinelearningservices.MachineLearningServicesManager serviceManager;

    WorkspaceSkuImpl(WorkspaceSkuInner innerObject,
        com.azure.resourcemanager.machinelearningservices.MachineLearningServicesManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public List<String> locations() {
        List<String> inner = this.innerModel().locations();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<ResourceSkuLocationInfo> locationInfo() {
        List<ResourceSkuLocationInfo> inner = this.innerModel().locationInfo();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String tier() {
        return this.innerModel().tier();
    }

    public String resourceType() {
        return this.innerModel().resourceType();
    }

    public String name() {
        return this.innerModel().name();
    }

    public List<SkuCapability> capabilities() {
        List<SkuCapability> inner = this.innerModel().capabilities();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<Restriction> restrictions() {
        List<Restriction> inner = this.innerModel().restrictions();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public WorkspaceSkuInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.machinelearningservices.MachineLearningServicesManager manager() {
        return this.serviceManager;
    }
}
