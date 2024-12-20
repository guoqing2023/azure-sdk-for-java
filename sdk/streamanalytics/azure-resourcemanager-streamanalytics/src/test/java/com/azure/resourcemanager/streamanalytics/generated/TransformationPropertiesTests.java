// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.streamanalytics.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.streamanalytics.fluent.models.TransformationProperties;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class TransformationPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        TransformationProperties model = BinaryData.fromString(
            "{\"streamingUnits\":194307867,\"validStreamingUnits\":[1382743089,384033547,701234104],\"query\":\"xzlocxscp\",\"etag\":\"erhhbcsglumm\"}")
            .toObject(TransformationProperties.class);
        Assertions.assertEquals(194307867, model.streamingUnits());
        Assertions.assertEquals(1382743089, model.validStreamingUnits().get(0));
        Assertions.assertEquals("xzlocxscp", model.query());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        TransformationProperties model = new TransformationProperties().withStreamingUnits(194307867)
            .withValidStreamingUnits(Arrays.asList(1382743089, 384033547, 701234104))
            .withQuery("xzlocxscp");
        model = BinaryData.fromObject(model).toObject(TransformationProperties.class);
        Assertions.assertEquals(194307867, model.streamingUnits());
        Assertions.assertEquals(1382743089, model.validStreamingUnits().get(0));
        Assertions.assertEquals("xzlocxscp", model.query());
    }
}
