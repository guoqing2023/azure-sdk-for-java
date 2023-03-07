// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.avs.models.AddonVrProperties;
import org.junit.jupiter.api.Assertions;

public final class AddonVrPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AddonVrProperties model =
            BinaryData
                .fromString("{\"addonType\":\"VR\",\"vrsCount\":882438810,\"provisioningState\":\"Building\"}")
                .toObject(AddonVrProperties.class);
        Assertions.assertEquals(882438810, model.vrsCount());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AddonVrProperties model = new AddonVrProperties().withVrsCount(882438810);
        model = BinaryData.fromObject(model).toObject(AddonVrProperties.class);
        Assertions.assertEquals(882438810, model.vrsCount());
    }
}