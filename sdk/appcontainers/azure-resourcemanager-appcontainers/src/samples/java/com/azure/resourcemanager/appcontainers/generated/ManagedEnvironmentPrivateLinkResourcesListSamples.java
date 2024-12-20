// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

/**
 * Samples for ManagedEnvironmentPrivateLinkResources List.
 */
public final class ManagedEnvironmentPrivateLinkResourcesListSamples {
    /*
     * x-ms-original-file: specification/app/resource-manager/Microsoft.App/preview/2024-08-02-preview/examples/
     * ManagedEnvironmentPrivateLinkResources_List.json
     */
    /**
     * Sample code: List Private Link Resources by Managed Environment.
     * 
     * @param manager Entry point to ContainerAppsApiManager.
     */
    public static void listPrivateLinkResourcesByManagedEnvironment(
        com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager) {
        manager.managedEnvironmentPrivateLinkResources()
            .list("examplerg", "managedEnv", com.azure.core.util.Context.NONE);
    }
}
