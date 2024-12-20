// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.managednetworkfabric.ManagedNetworkFabricManager;
import com.azure.resourcemanager.managednetworkfabric.models.ExternalNetwork;
import com.azure.resourcemanager.managednetworkfabric.models.PeeringOption;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class ExternalNetworksListByL3IsolationDomainMockTests {
    @Test
    public void testListByL3IsolationDomain() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr
            = "{\"value\":[{\"properties\":{\"networkToNetworkInterconnectId\":\"gctygbbmu\",\"peeringOption\":\"OptionB\",\"optionBProperties\":{\"importRouteTargets\":[\"crsm\",\"ojmxwc\",\"umnru\",\"q\"],\"exportRouteTargets\":[\"qjftvltj\"],\"routeTargets\":{\"importIpv4RouteTargets\":[\"vpkbz\",\"tnowpajfhxsmu\"],\"importIpv6RouteTargets\":[\"adzglm\",\"uzpsuhs\",\"pxm\"],\"exportIpv4RouteTargets\":[\"hfrerkqpyfjxkb\"],\"exportIpv6RouteTargets\":[\"buq\",\"mxbdjkmn\"]}},\"optionAProperties\":{\"mtu\":1668571308,\"vlanId\":735928963,\"fabricASN\":2048786040696358626,\"peerASN\":8143716610874917650,\"bfdConfiguration\":{\"administrativeState\":\"MAT\",\"intervalInMilliSeconds\":1291322883,\"multiplier\":818358311},\"ingressAclId\":\"btycvl\",\"egressAclId\":\"sgiikh\",\"primaryIpv4Prefix\":\"thypepxshmrd\",\"primaryIpv6Prefix\":\"csdvkymktc\",\"secondaryIpv4Prefix\":\"ivoxgzegnglafnf\",\"secondaryIpv6Prefix\":\"zaghddc\"},\"configurationState\":\"Failed\",\"provisioningState\":\"Canceled\",\"administrativeState\":\"Enabled\",\"importRoutePolicyId\":\"rutuh\",\"exportRoutePolicyId\":\"mgxlssolqyp\",\"importRoutePolicy\":{\"importIpv4RoutePolicyId\":\"lxo\",\"importIpv6RoutePolicyId\":\"rkqvrv\"},\"exportRoutePolicy\":{\"exportIpv4RoutePolicyId\":\"jc\",\"exportIpv6RoutePolicyId\":\"fcm\"},\"annotation\":\"jpj\"},\"id\":\"kjd\",\"name\":\"uod\",\"type\":\"cg\"}]}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito.when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito.when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito.when(httpClient.send(httpRequest.capture(), Mockito.any())).thenReturn(Mono.defer(() -> {
            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
            return Mono.just(httpResponse);
        }));

        ManagedNetworkFabricManager manager = ManagedNetworkFabricManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<ExternalNetwork> response = manager.externalNetworks()
            .listByL3IsolationDomain("uwrfgpjfvqwk", "eodvlmdzgvcykz", com.azure.core.util.Context.NONE);

        Assertions.assertEquals(PeeringOption.OPTIONB, response.iterator().next().peeringOption());
        Assertions.assertEquals("crsm", response.iterator().next().optionBProperties().importRouteTargets().get(0));
        Assertions.assertEquals("qjftvltj", response.iterator().next().optionBProperties().exportRouteTargets().get(0));
        Assertions.assertEquals("vpkbz",
            response.iterator().next().optionBProperties().routeTargets().importIpv4RouteTargets().get(0));
        Assertions.assertEquals("adzglm",
            response.iterator().next().optionBProperties().routeTargets().importIpv6RouteTargets().get(0));
        Assertions.assertEquals("hfrerkqpyfjxkb",
            response.iterator().next().optionBProperties().routeTargets().exportIpv4RouteTargets().get(0));
        Assertions.assertEquals("buq",
            response.iterator().next().optionBProperties().routeTargets().exportIpv6RouteTargets().get(0));
        Assertions.assertEquals("thypepxshmrd", response.iterator().next().optionAProperties().primaryIpv4Prefix());
        Assertions.assertEquals("csdvkymktc", response.iterator().next().optionAProperties().primaryIpv6Prefix());
        Assertions.assertEquals("ivoxgzegnglafnf",
            response.iterator().next().optionAProperties().secondaryIpv4Prefix());
        Assertions.assertEquals("zaghddc", response.iterator().next().optionAProperties().secondaryIpv6Prefix());
        Assertions.assertEquals(1668571308, response.iterator().next().optionAProperties().mtu());
        Assertions.assertEquals(735928963, response.iterator().next().optionAProperties().vlanId());
        Assertions.assertEquals(8143716610874917650L, response.iterator().next().optionAProperties().peerAsn());
        Assertions.assertEquals(1291322883,
            response.iterator().next().optionAProperties().bfdConfiguration().intervalInMilliSeconds());
        Assertions.assertEquals(818358311,
            response.iterator().next().optionAProperties().bfdConfiguration().multiplier());
        Assertions.assertEquals("btycvl", response.iterator().next().optionAProperties().ingressAclId());
        Assertions.assertEquals("sgiikh", response.iterator().next().optionAProperties().egressAclId());
        Assertions.assertEquals("rutuh", response.iterator().next().importRoutePolicyId());
        Assertions.assertEquals("mgxlssolqyp", response.iterator().next().exportRoutePolicyId());
        Assertions.assertEquals("lxo", response.iterator().next().importRoutePolicy().importIpv4RoutePolicyId());
        Assertions.assertEquals("rkqvrv", response.iterator().next().importRoutePolicy().importIpv6RoutePolicyId());
        Assertions.assertEquals("jc", response.iterator().next().exportRoutePolicy().exportIpv4RoutePolicyId());
        Assertions.assertEquals("fcm", response.iterator().next().exportRoutePolicy().exportIpv6RoutePolicyId());
        Assertions.assertEquals("jpj", response.iterator().next().annotation());
    }
}
