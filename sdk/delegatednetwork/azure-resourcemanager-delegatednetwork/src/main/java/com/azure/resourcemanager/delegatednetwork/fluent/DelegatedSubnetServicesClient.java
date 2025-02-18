// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.delegatednetwork.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.delegatednetwork.fluent.models.DelegatedSubnetInner;
import com.azure.resourcemanager.delegatednetwork.models.ResourceUpdateParameters;

/**
 * An instance of this class provides access to all the operations defined in DelegatedSubnetServicesClient.
 */
public interface DelegatedSubnetServicesClient {
    /**
     * Gets details about the specified dnc DelegatedSubnet Link.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the resource. It must be a minimum of 3 characters, and a maximum of 63.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return details about the specified dnc DelegatedSubnet Link along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<DelegatedSubnetInner> getByResourceGroupWithResponse(String resourceGroupName, String resourceName,
        Context context);

    /**
     * Gets details about the specified dnc DelegatedSubnet Link.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the resource. It must be a minimum of 3 characters, and a maximum of 63.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return details about the specified dnc DelegatedSubnet Link.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DelegatedSubnetInner getByResourceGroup(String resourceGroupName, String resourceName);

    /**
     * Put delegated subnet resource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the resource. It must be a minimum of 3 characters, and a maximum of 63.
     * @param parameters Delegated subnet details.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of represents an instance of a orchestrator.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<DelegatedSubnetInner>, DelegatedSubnetInner> beginPutDetails(String resourceGroupName,
        String resourceName, DelegatedSubnetInner parameters);

    /**
     * Put delegated subnet resource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the resource. It must be a minimum of 3 characters, and a maximum of 63.
     * @param parameters Delegated subnet details.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of represents an instance of a orchestrator.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<DelegatedSubnetInner>, DelegatedSubnetInner> beginPutDetails(String resourceGroupName,
        String resourceName, DelegatedSubnetInner parameters, Context context);

    /**
     * Put delegated subnet resource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the resource. It must be a minimum of 3 characters, and a maximum of 63.
     * @param parameters Delegated subnet details.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents an instance of a orchestrator.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DelegatedSubnetInner putDetails(String resourceGroupName, String resourceName, DelegatedSubnetInner parameters);

    /**
     * Put delegated subnet resource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the resource. It must be a minimum of 3 characters, and a maximum of 63.
     * @param parameters Delegated subnet details.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents an instance of a orchestrator.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DelegatedSubnetInner putDetails(String resourceGroupName, String resourceName, DelegatedSubnetInner parameters,
        Context context);

    /**
     * Patch delegated subnet resource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the resource. It must be a minimum of 3 characters, and a maximum of 63.
     * @param parameters Delegated subnet details.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of represents an instance of a orchestrator.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<DelegatedSubnetInner>, DelegatedSubnetInner> beginPatchDetails(String resourceGroupName,
        String resourceName, ResourceUpdateParameters parameters);

    /**
     * Patch delegated subnet resource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the resource. It must be a minimum of 3 characters, and a maximum of 63.
     * @param parameters Delegated subnet details.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of represents an instance of a orchestrator.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<DelegatedSubnetInner>, DelegatedSubnetInner> beginPatchDetails(String resourceGroupName,
        String resourceName, ResourceUpdateParameters parameters, Context context);

    /**
     * Patch delegated subnet resource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the resource. It must be a minimum of 3 characters, and a maximum of 63.
     * @param parameters Delegated subnet details.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents an instance of a orchestrator.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DelegatedSubnetInner patchDetails(String resourceGroupName, String resourceName,
        ResourceUpdateParameters parameters);

    /**
     * Patch delegated subnet resource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the resource. It must be a minimum of 3 characters, and a maximum of 63.
     * @param parameters Delegated subnet details.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents an instance of a orchestrator.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DelegatedSubnetInner patchDetails(String resourceGroupName, String resourceName,
        ResourceUpdateParameters parameters, Context context);

    /**
     * Delete dnc DelegatedSubnet.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the resource. It must be a minimum of 3 characters, and a maximum of 63.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String resourceName);

    /**
     * Delete dnc DelegatedSubnet.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the resource. It must be a minimum of 3 characters, and a maximum of 63.
     * @param forceDelete Force delete resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String resourceName, Boolean forceDelete,
        Context context);

    /**
     * Delete dnc DelegatedSubnet.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the resource. It must be a minimum of 3 characters, and a maximum of 63.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String resourceName);

    /**
     * Delete dnc DelegatedSubnet.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the resource. It must be a minimum of 3 characters, and a maximum of 63.
     * @param forceDelete Force delete resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String resourceName, Boolean forceDelete, Context context);

    /**
     * Get all the DelegatedSubnets resources in a subscription.
     * 
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the DelegatedSubnets resources in a subscription as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DelegatedSubnetInner> list();

    /**
     * Get all the DelegatedSubnets resources in a subscription.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the DelegatedSubnets resources in a subscription as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DelegatedSubnetInner> list(Context context);

    /**
     * Get all the DelegatedSubnets resources in a resource group.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the DelegatedSubnets resources in a resource group as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DelegatedSubnetInner> listByResourceGroup(String resourceGroupName);

    /**
     * Get all the DelegatedSubnets resources in a resource group.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the DelegatedSubnets resources in a resource group as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DelegatedSubnetInner> listByResourceGroup(String resourceGroupName, Context context);
}
