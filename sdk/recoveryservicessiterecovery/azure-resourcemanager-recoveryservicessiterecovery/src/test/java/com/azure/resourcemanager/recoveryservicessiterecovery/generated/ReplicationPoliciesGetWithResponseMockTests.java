// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.recoveryservicessiterecovery.SiteRecoveryManager;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.Policy;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class ReplicationPoliciesGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"friendlyName\":\"sychdcjggcmpncj\",\"providerSpecificDetails\":{\"instanceType\":\"PolicyProviderSpecificDetails\"}},\"location\":\"bnoq\",\"id\":\"owvfxe\",\"name\":\"tzgwjeky\",\"type\":\"irvcpol\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        SiteRecoveryManager manager = SiteRecoveryManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        Policy response = manager.replicationPolicies()
            .getWithResponse("rs", "vvmrn", "rdijox", com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals("sychdcjggcmpncj", response.properties().friendlyName());
        Assertions.assertEquals("bnoq", response.location());
    }
}
