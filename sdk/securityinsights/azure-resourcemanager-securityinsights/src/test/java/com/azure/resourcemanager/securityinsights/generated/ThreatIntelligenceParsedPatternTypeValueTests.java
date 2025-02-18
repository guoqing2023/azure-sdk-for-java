// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.securityinsights.models.ThreatIntelligenceParsedPatternTypeValue;
import org.junit.jupiter.api.Assertions;

public final class ThreatIntelligenceParsedPatternTypeValueTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ThreatIntelligenceParsedPatternTypeValue model
            = BinaryData.fromString("{\"valueType\":\"qhoftrmaequiah\",\"value\":\"cslfaoqzpiyylha\"}")
                .toObject(ThreatIntelligenceParsedPatternTypeValue.class);
        Assertions.assertEquals("qhoftrmaequiah", model.valueType());
        Assertions.assertEquals("cslfaoqzpiyylha", model.value());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ThreatIntelligenceParsedPatternTypeValue model
            = new ThreatIntelligenceParsedPatternTypeValue().withValueType("qhoftrmaequiah")
                .withValue("cslfaoqzpiyylha");
        model = BinaryData.fromObject(model).toObject(ThreatIntelligenceParsedPatternTypeValue.class);
        Assertions.assertEquals("qhoftrmaequiah", model.valueType());
        Assertions.assertEquals("cslfaoqzpiyylha", model.value());
    }
}
