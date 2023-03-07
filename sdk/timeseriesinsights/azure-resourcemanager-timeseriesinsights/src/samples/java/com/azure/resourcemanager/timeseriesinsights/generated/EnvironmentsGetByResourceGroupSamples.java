// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.timeseriesinsights.generated;

/** Samples for Environments GetByResourceGroup. */
public final class EnvironmentsGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/timeseriesinsights/resource-manager/Microsoft.TimeSeriesInsights/stable/2020-05-15/examples/EnvironmentsGet.json
     */
    /**
     * Sample code: EnvironmentsGet.
     *
     * @param manager Entry point to TimeSeriesInsightsManager.
     */
    public static void environmentsGet(com.azure.resourcemanager.timeseriesinsights.TimeSeriesInsightsManager manager) {
        manager.environments().getByResourceGroupWithResponse("rg1", "env1", null, com.azure.core.util.Context.NONE);
    }
}