// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.notificationhubs.generated;

import com.azure.resourcemanager.notificationhubs.fluent.models.NamespaceProperties;
import com.azure.resourcemanager.notificationhubs.fluent.models.PnsCredentials;
import com.azure.resourcemanager.notificationhubs.models.GcmCredential;
import com.azure.resourcemanager.notificationhubs.models.NamespaceResource;
import com.azure.resourcemanager.notificationhubs.models.Sku;
import com.azure.resourcemanager.notificationhubs.models.SkuName;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for Namespaces Update.
 */
public final class NamespacesUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/notificationhubs/resource-manager/Microsoft.NotificationHubs/preview/2023-10-01-preview/examples/
     * Namespaces/Update.json
     */
    /**
     * Sample code: Namespaces_Update.
     * 
     * @param manager Entry point to NotificationHubsManager.
     */
    public static void namespacesUpdate(com.azure.resourcemanager.notificationhubs.NotificationHubsManager manager) {
        NamespaceResource resource = manager.namespaces()
            .getByResourceGroupWithResponse("5ktrial", "nh-sdk-ns", com.azure.core.util.Context.NONE)
            .getValue();
        resource.update()
            .withTags(mapOf("tag1", "value3"))
            .withSku(new Sku().withName(SkuName.FREE))
            .withProperties(new NamespaceProperties().withPnsCredentials(new PnsCredentials()
                .withGcmCredential(new GcmCredential().withGcmEndpoint("https://fcm.googleapis.com/fcm/send")
                    .withGoogleApiKey("fakeTokenPlaceholder"))))
            .apply();
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
