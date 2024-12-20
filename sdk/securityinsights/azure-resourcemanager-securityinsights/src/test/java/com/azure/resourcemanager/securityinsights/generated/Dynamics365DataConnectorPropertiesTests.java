// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.securityinsights.fluent.models.Dynamics365DataConnectorProperties;
import com.azure.resourcemanager.securityinsights.models.DataTypeState;
import com.azure.resourcemanager.securityinsights.models.Dynamics365DataConnectorDataTypes;
import com.azure.resourcemanager.securityinsights.models.Dynamics365DataConnectorDataTypesDynamics365CdsActivities;
import org.junit.jupiter.api.Assertions;

public final class Dynamics365DataConnectorPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        Dynamics365DataConnectorProperties model = BinaryData
            .fromString("{\"dataTypes\":{\"dynamics365CdsActivities\":{\"state\":\"Disabled\"}},\"tenantId\":\"e\"}")
            .toObject(Dynamics365DataConnectorProperties.class);
        Assertions.assertEquals("e", model.tenantId());
        Assertions.assertEquals(DataTypeState.DISABLED, model.dataTypes().dynamics365CdsActivities().state());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        Dynamics365DataConnectorProperties model = new Dynamics365DataConnectorProperties().withTenantId("e")
            .withDataTypes(new Dynamics365DataConnectorDataTypes().withDynamics365CdsActivities(
                new Dynamics365DataConnectorDataTypesDynamics365CdsActivities().withState(DataTypeState.DISABLED)));
        model = BinaryData.fromObject(model).toObject(Dynamics365DataConnectorProperties.class);
        Assertions.assertEquals("e", model.tenantId());
        Assertions.assertEquals(DataTypeState.DISABLED, model.dataTypes().dynamics365CdsActivities().state());
    }
}
