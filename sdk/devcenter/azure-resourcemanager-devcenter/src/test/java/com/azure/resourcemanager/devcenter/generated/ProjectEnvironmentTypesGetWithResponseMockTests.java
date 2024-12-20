// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.devcenter.DevCenterManager;
import com.azure.resourcemanager.devcenter.models.EnvironmentTypeEnableStatus;
import com.azure.resourcemanager.devcenter.models.ManagedServiceIdentityType;
import com.azure.resourcemanager.devcenter.models.ProjectEnvironmentType;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class ProjectEnvironmentTypesGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"provisioningState\":\"Created\",\"environmentCount\":1418512133,\"deploymentTargetId\":\"xlzhcoxovnekh\",\"displayName\":\"lusfnrdtjxtxrdcq\",\"status\":\"Disabled\",\"creatorRoleAssignment\":{\"roles\":{\"ughtuqfecjxeygtu\":{\"roleName\":\"gepuslvyjtc\",\"description\":\"wkasiziesf\"},\"zrhwp\":{\"roleName\":\"uicbuewmrsw\",\"description\":\"lx\"},\"bxncnwfepbnw\":{\"roleName\":\"xjbaqehgpdohzjq\",\"description\":\"ucoig\"},\"dlfgtdysnaq\":{\"roleName\":\"m\",\"description\":\"gcgbjb\"}}},\"userRoleAssignments\":{\"eg\":{\"roles\":{\"ctqhamzjrwdk\":{},\"zeqyjleziun\":{},\"xdfzantkw\":{}}},\"m\":{\"roles\":{\"lbnseqac\":{},\"jvpilguooqja\":{}}},\"delqacslmoto\":{\"roles\":{\"gueiookjbsahrtdt\":{}}},\"ab\":{\"roles\":{\"fxof\":{},\"cjkgdirazftxej\":{}}}}},\"tags\":{\"pexcmjurbuhh\":\"jtmvc\",\"wkffdjkt\":\"kyqltqsrogt\",\"n\":\"ysidfvclgl\",\"qogsfikayian\":\"uijtkbu\"},\"identity\":{\"principalId\":\"d42cc332-2195-4b3f-b771-e43685d75be7\",\"tenantId\":\"691657da-df5b-4c64-bb98-fd9eb75170c7\",\"type\":\"UserAssigned\",\"userAssignedIdentities\":{\"qxfzyjqttvwk\":{\"principalId\":\"8bfb4b80-1eae-4866-83a4-48530bdb650c\",\"clientId\":\"72d2259b-b024-4f24-ba13-07969eff764b\"}}},\"location\":\"hjpenuygbq\",\"id\":\"qekewvnqvcd\",\"name\":\"guaucmfdjwnla\",\"type\":\"punj\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        DevCenterManager manager = DevCenterManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        ProjectEnvironmentType response = manager.projectEnvironmentTypes()
            .getWithResponse("nszonwpngaj", "n", "ixjawrtm", com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals("jtmvc", response.tags().get("pexcmjurbuhh"));
        Assertions.assertEquals(ManagedServiceIdentityType.USER_ASSIGNED, response.identity().type());
        Assertions.assertEquals("hjpenuygbq", response.location());
        Assertions.assertEquals("xlzhcoxovnekh", response.deploymentTargetId());
        Assertions.assertEquals("lusfnrdtjxtxrdcq", response.displayName());
        Assertions.assertEquals(EnvironmentTypeEnableStatus.DISABLED, response.status());
    }
}
