// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.synapse.fluent.models.IntegrationRuntimeResourceInner;
import com.azure.resourcemanager.synapse.models.IntegrationRuntime;
import com.azure.resourcemanager.synapse.models.IntegrationRuntimeListResponse;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class IntegrationRuntimeListResponseTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        IntegrationRuntimeListResponse model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"type\":\"IntegrationRuntime\",\"description\":\"wnwvroevytlyokr\",\"\":{\"o\":\"datauuxvnsasbcry\"}},\"etag\":\"zrxklobd\",\"id\":\"nazpmk\",\"name\":\"lmv\",\"type\":\"vfxzopjh\"},{\"properties\":{\"type\":\"IntegrationRuntime\",\"description\":\"xliohrdddt\",\"\":{\"p\":\"dataqbawpcbbnzqcykn\",\"zb\":\"dataofyuicd\"}},\"etag\":\"bwwg\",\"id\":\"d\",\"name\":\"ibidmhmwffp\",\"type\":\"fmuvapckccr\"},{\"properties\":{\"type\":\"IntegrationRuntime\",\"description\":\"weyoxoy\",\"\":{\"oqboshbragapyyr\":\"dataphaimmoi\"}},\"etag\":\"svbpavbopfppdbwn\",\"id\":\"pgahxkumas\",\"name\":\"caac\",\"type\":\"dmmcpugmehqep\"},{\"properties\":{\"type\":\"IntegrationRuntime\",\"description\":\"fhbzehewhoqhn\",\"\":{\"krsrrmoucs\":\"datanbldxeaclgschori\",\"abeolhbhlvbm\":\"datafldpuviyfc\"}},\"etag\":\"qi\",\"id\":\"s\",\"name\":\"tkcudfbsfarfsiow\",\"type\":\"kjxnqpvwgfstmhq\"}],\"nextLink\":\"izmdksa\"}")
            .toObject(IntegrationRuntimeListResponse.class);
        Assertions.assertEquals("wnwvroevytlyokr", model.value().get(0).properties().description());
        Assertions.assertEquals("izmdksa", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        IntegrationRuntimeListResponse model = new IntegrationRuntimeListResponse().withValue(Arrays.asList(
            new IntegrationRuntimeResourceInner().withProperties(
                new IntegrationRuntime().withDescription("wnwvroevytlyokr")
                    .withAdditionalProperties(mapOf("type", "IntegrationRuntime"))),
            new IntegrationRuntimeResourceInner().withProperties(new IntegrationRuntime().withDescription("xliohrdddt")
                .withAdditionalProperties(mapOf("type", "IntegrationRuntime"))),
            new IntegrationRuntimeResourceInner().withProperties(new IntegrationRuntime().withDescription("weyoxoy")
                .withAdditionalProperties(mapOf("type", "IntegrationRuntime"))),
            new IntegrationRuntimeResourceInner()
                .withProperties(new IntegrationRuntime().withDescription("fhbzehewhoqhn")
                    .withAdditionalProperties(mapOf("type", "IntegrationRuntime")))))
            .withNextLink("izmdksa");
        model = BinaryData.fromObject(model).toObject(IntegrationRuntimeListResponse.class);
        Assertions.assertEquals("wnwvroevytlyokr", model.value().get(0).properties().description());
        Assertions.assertEquals("izmdksa", model.nextLink());
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
