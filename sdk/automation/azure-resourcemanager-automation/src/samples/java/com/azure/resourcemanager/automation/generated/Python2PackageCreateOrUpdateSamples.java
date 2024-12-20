// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.generated;

import com.azure.resourcemanager.automation.models.ContentHash;
import com.azure.resourcemanager.automation.models.ContentLink;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for Python2Package CreateOrUpdate.
 */
public final class Python2PackageCreateOrUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/automation/resource-manager/Microsoft.Automation/preview/2020-01-13-preview/examples/
     * createOrUpdatePython2Package.json
     */
    /**
     * Sample code: Create or update a python 2 package.
     * 
     * @param manager Entry point to AutomationManager.
     */
    public static void createOrUpdateAPython2Package(com.azure.resourcemanager.automation.AutomationManager manager) {
        manager.python2Packages()
            .define("OmsCompositeResources")
            .withExistingAutomationAccount("rg", "myAutomationAccount33")
            .withContentLink(new ContentLink()
                .withUri("https://teststorage.blob.core.windows.net/dsccomposite/OmsCompositeResources.zip")
                .withContentHash(new ContentHash().withAlgorithm("sha265")
                    .withValue("07E108A962B81DD9C9BAA89BB47C0F6EE52B29E83758B07795E408D258B2B87A"))
                .withVersion("1.0.0.0"))
            .withTags(mapOf())
            .create();
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
