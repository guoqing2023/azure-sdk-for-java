// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.synapse.fluent.models.IntegrationRuntimeStatusResponseInner;
import com.azure.resourcemanager.synapse.models.IntegrationRuntimeStatus;
import java.util.HashMap;
import java.util.Map;

public final class IntegrationRuntimeStatusResponseInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        IntegrationRuntimeStatusResponseInner model = BinaryData.fromString(
            "{\"name\":\"ycjimryvwgcwwpbm\",\"properties\":{\"type\":\"IntegrationRuntimeStatus\",\"dataFactoryName\":\"w\",\"state\":\"Stopping\",\"\":{\"leallklm\":\"dataxwefohecbvopwndy\",\"rdfjmzsyzfhotl\":\"datakhlowkxxpv\"}}}")
            .toObject(IntegrationRuntimeStatusResponseInner.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        IntegrationRuntimeStatusResponseInner model = new IntegrationRuntimeStatusResponseInner()
            .withProperties(new IntegrationRuntimeStatus().withAdditionalProperties(
                mapOf("dataFactoryName", "w", "state", "Stopping", "type", "IntegrationRuntimeStatus")));
        model = BinaryData.fromObject(model).toObject(IntegrationRuntimeStatusResponseInner.class);
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
