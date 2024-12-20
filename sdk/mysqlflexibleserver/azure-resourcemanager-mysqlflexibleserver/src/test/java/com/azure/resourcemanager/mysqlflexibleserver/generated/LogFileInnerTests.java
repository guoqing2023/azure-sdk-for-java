// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysqlflexibleserver.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mysqlflexibleserver.fluent.models.LogFileInner;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;

public final class LogFileInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        LogFileInner model = BinaryData.fromString(
            "{\"properties\":{\"sizeInKB\":2270588281817751740,\"createdTime\":\"2021-10-30T06:22:22Z\",\"type\":\"jyoxgvclt\",\"lastModifiedTime\":\"2021-10-11T10:12:30Z\",\"url\":\"c\"},\"id\":\"kjeszz\",\"name\":\"bijhtxfvgxbf\",\"type\":\"mxnehmp\"}")
            .toObject(LogFileInner.class);
        Assertions.assertEquals(2270588281817751740L, model.sizeInKB());
        Assertions.assertEquals(OffsetDateTime.parse("2021-10-30T06:22:22Z"), model.createdTime());
        Assertions.assertEquals("jyoxgvclt", model.typePropertiesType());
        Assertions.assertEquals(OffsetDateTime.parse("2021-10-11T10:12:30Z"), model.lastModifiedTime());
        Assertions.assertEquals("c", model.url());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        LogFileInner model = new LogFileInner().withSizeInKB(2270588281817751740L)
            .withCreatedTime(OffsetDateTime.parse("2021-10-30T06:22:22Z"))
            .withTypePropertiesType("jyoxgvclt")
            .withLastModifiedTime(OffsetDateTime.parse("2021-10-11T10:12:30Z"))
            .withUrl("c");
        model = BinaryData.fromObject(model).toObject(LogFileInner.class);
        Assertions.assertEquals(2270588281817751740L, model.sizeInKB());
        Assertions.assertEquals(OffsetDateTime.parse("2021-10-30T06:22:22Z"), model.createdTime());
        Assertions.assertEquals("jyoxgvclt", model.typePropertiesType());
        Assertions.assertEquals(OffsetDateTime.parse("2021-10-11T10:12:30Z"), model.lastModifiedTime());
        Assertions.assertEquals("c", model.url());
    }
}
