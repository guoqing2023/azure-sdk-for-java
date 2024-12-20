// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.apimanagement.fluent.models.IssueAttachmentContractProperties;
import org.junit.jupiter.api.Assertions;

public final class IssueAttachmentContractPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        IssueAttachmentContractProperties model = BinaryData
            .fromString(
                "{\"title\":\"qnwsithuqolyah\",\"contentFormat\":\"uqwqulsutrjbhxyk\",\"content\":\"hyqezvqq\"}")
            .toObject(IssueAttachmentContractProperties.class);
        Assertions.assertEquals("qnwsithuqolyah", model.title());
        Assertions.assertEquals("uqwqulsutrjbhxyk", model.contentFormat());
        Assertions.assertEquals("hyqezvqq", model.content());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        IssueAttachmentContractProperties model = new IssueAttachmentContractProperties().withTitle("qnwsithuqolyah")
            .withContentFormat("uqwqulsutrjbhxyk")
            .withContent("hyqezvqq");
        model = BinaryData.fromObject(model).toObject(IssueAttachmentContractProperties.class);
        Assertions.assertEquals("qnwsithuqolyah", model.title());
        Assertions.assertEquals("uqwqulsutrjbhxyk", model.contentFormat());
        Assertions.assertEquals("hyqezvqq", model.content());
    }
}
