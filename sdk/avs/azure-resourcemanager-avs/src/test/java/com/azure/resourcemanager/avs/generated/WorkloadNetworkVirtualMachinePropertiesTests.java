// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.avs.fluent.models.WorkloadNetworkVirtualMachineProperties;
import org.junit.jupiter.api.Assertions;

public final class WorkloadNetworkVirtualMachinePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        WorkloadNetworkVirtualMachineProperties model =
            BinaryData
                .fromString("{\"displayName\":\"pp\",\"vmType\":\"EDGE\"}")
                .toObject(WorkloadNetworkVirtualMachineProperties.class);
        Assertions.assertEquals("pp", model.displayName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        WorkloadNetworkVirtualMachineProperties model =
            new WorkloadNetworkVirtualMachineProperties().withDisplayName("pp");
        model = BinaryData.fromObject(model).toObject(WorkloadNetworkVirtualMachineProperties.class);
        Assertions.assertEquals("pp", model.displayName());
    }
}