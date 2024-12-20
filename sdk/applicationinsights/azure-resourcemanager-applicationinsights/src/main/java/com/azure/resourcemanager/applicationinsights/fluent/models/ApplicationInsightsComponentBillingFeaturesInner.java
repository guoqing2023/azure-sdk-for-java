// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.applicationinsights.models.ApplicationInsightsComponentDataVolumeCap;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** An Application Insights component billing features. */
@Fluent
public final class ApplicationInsightsComponentBillingFeaturesInner {
    /*
     * An Application Insights component daily data volume cap
     */
    @JsonProperty(value = "DataVolumeCap")
    private ApplicationInsightsComponentDataVolumeCap dataVolumeCap;

    /*
     * Current enabled pricing plan. When the component is in the Enterprise plan, this will list both 'Basic' and
     * 'Application Insights Enterprise'.
     */
    @JsonProperty(value = "CurrentBillingFeatures")
    private List<String> currentBillingFeatures;

    /** Creates an instance of ApplicationInsightsComponentBillingFeaturesInner class. */
    public ApplicationInsightsComponentBillingFeaturesInner() {
    }

    /**
     * Get the dataVolumeCap property: An Application Insights component daily data volume cap.
     *
     * @return the dataVolumeCap value.
     */
    public ApplicationInsightsComponentDataVolumeCap dataVolumeCap() {
        return this.dataVolumeCap;
    }

    /**
     * Set the dataVolumeCap property: An Application Insights component daily data volume cap.
     *
     * @param dataVolumeCap the dataVolumeCap value to set.
     * @return the ApplicationInsightsComponentBillingFeaturesInner object itself.
     */
    public ApplicationInsightsComponentBillingFeaturesInner
        withDataVolumeCap(ApplicationInsightsComponentDataVolumeCap dataVolumeCap) {
        this.dataVolumeCap = dataVolumeCap;
        return this;
    }

    /**
     * Get the currentBillingFeatures property: Current enabled pricing plan. When the component is in the Enterprise
     * plan, this will list both 'Basic' and 'Application Insights Enterprise'.
     *
     * @return the currentBillingFeatures value.
     */
    public List<String> currentBillingFeatures() {
        return this.currentBillingFeatures;
    }

    /**
     * Set the currentBillingFeatures property: Current enabled pricing plan. When the component is in the Enterprise
     * plan, this will list both 'Basic' and 'Application Insights Enterprise'.
     *
     * @param currentBillingFeatures the currentBillingFeatures value to set.
     * @return the ApplicationInsightsComponentBillingFeaturesInner object itself.
     */
    public ApplicationInsightsComponentBillingFeaturesInner
        withCurrentBillingFeatures(List<String> currentBillingFeatures) {
        this.currentBillingFeatures = currentBillingFeatures;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (dataVolumeCap() != null) {
            dataVolumeCap().validate();
        }
    }
}
