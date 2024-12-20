// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.synapse.fluent.KustoOperationsClient;
import com.azure.resourcemanager.synapse.fluent.models.OperationInner;
import com.azure.resourcemanager.synapse.models.KustoOperations;
import com.azure.resourcemanager.synapse.models.Operation;

public final class KustoOperationsImpl implements KustoOperations {
    private static final ClientLogger LOGGER = new ClientLogger(KustoOperationsImpl.class);

    private final KustoOperationsClient innerClient;

    private final com.azure.resourcemanager.synapse.SynapseManager serviceManager;

    public KustoOperationsImpl(KustoOperationsClient innerClient,
        com.azure.resourcemanager.synapse.SynapseManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<Operation> list() {
        PagedIterable<OperationInner> inner = this.serviceClient().list();
        return ResourceManagerUtils.mapPage(inner, inner1 -> new OperationImpl(inner1, this.manager()));
    }

    public PagedIterable<Operation> list(Context context) {
        PagedIterable<OperationInner> inner = this.serviceClient().list(context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new OperationImpl(inner1, this.manager()));
    }

    private KustoOperationsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.synapse.SynapseManager manager() {
        return this.serviceManager;
    }
}
