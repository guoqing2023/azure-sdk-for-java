// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.videoanalyzer.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.videoanalyzer.fluent.LivePipelinesClient;
import com.azure.resourcemanager.videoanalyzer.fluent.models.LivePipelineInner;
import com.azure.resourcemanager.videoanalyzer.models.LivePipeline;
import com.azure.resourcemanager.videoanalyzer.models.LivePipelines;

public final class LivePipelinesImpl implements LivePipelines {
    private static final ClientLogger LOGGER = new ClientLogger(LivePipelinesImpl.class);

    private final LivePipelinesClient innerClient;

    private final com.azure.resourcemanager.videoanalyzer.VideoAnalyzerManager serviceManager;

    public LivePipelinesImpl(LivePipelinesClient innerClient,
        com.azure.resourcemanager.videoanalyzer.VideoAnalyzerManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<LivePipeline> list(String resourceGroupName, String accountName) {
        PagedIterable<LivePipelineInner> inner = this.serviceClient().list(resourceGroupName, accountName);
        return Utils.mapPage(inner, inner1 -> new LivePipelineImpl(inner1, this.manager()));
    }

    public PagedIterable<LivePipeline> list(String resourceGroupName, String accountName, String filter, Integer top,
        Context context) {
        PagedIterable<LivePipelineInner> inner
            = this.serviceClient().list(resourceGroupName, accountName, filter, top, context);
        return Utils.mapPage(inner, inner1 -> new LivePipelineImpl(inner1, this.manager()));
    }

    public LivePipeline get(String resourceGroupName, String accountName, String livePipelineName) {
        LivePipelineInner inner = this.serviceClient().get(resourceGroupName, accountName, livePipelineName);
        if (inner != null) {
            return new LivePipelineImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<LivePipeline> getWithResponse(String resourceGroupName, String accountName, String livePipelineName,
        Context context) {
        Response<LivePipelineInner> inner
            = this.serviceClient().getWithResponse(resourceGroupName, accountName, livePipelineName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new LivePipelineImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String accountName, String livePipelineName) {
        this.serviceClient().delete(resourceGroupName, accountName, livePipelineName);
    }

    public Response<Void> deleteWithResponse(String resourceGroupName, String accountName, String livePipelineName,
        Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, accountName, livePipelineName, context);
    }

    public void activate(String resourceGroupName, String accountName, String livePipelineName) {
        this.serviceClient().activate(resourceGroupName, accountName, livePipelineName);
    }

    public void activate(String resourceGroupName, String accountName, String livePipelineName, Context context) {
        this.serviceClient().activate(resourceGroupName, accountName, livePipelineName, context);
    }

    public void deactivate(String resourceGroupName, String accountName, String livePipelineName) {
        this.serviceClient().deactivate(resourceGroupName, accountName, livePipelineName);
    }

    public void deactivate(String resourceGroupName, String accountName, String livePipelineName, Context context) {
        this.serviceClient().deactivate(resourceGroupName, accountName, livePipelineName, context);
    }

    public LivePipeline getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = Utils.getValueFromIdByName(id, "videoAnalyzers");
        if (accountName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'videoAnalyzers'.", id)));
        }
        String livePipelineName = Utils.getValueFromIdByName(id, "livePipelines");
        if (livePipelineName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'livePipelines'.", id)));
        }
        return this.getWithResponse(resourceGroupName, accountName, livePipelineName, Context.NONE).getValue();
    }

    public Response<LivePipeline> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = Utils.getValueFromIdByName(id, "videoAnalyzers");
        if (accountName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'videoAnalyzers'.", id)));
        }
        String livePipelineName = Utils.getValueFromIdByName(id, "livePipelines");
        if (livePipelineName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'livePipelines'.", id)));
        }
        return this.getWithResponse(resourceGroupName, accountName, livePipelineName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = Utils.getValueFromIdByName(id, "videoAnalyzers");
        if (accountName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'videoAnalyzers'.", id)));
        }
        String livePipelineName = Utils.getValueFromIdByName(id, "livePipelines");
        if (livePipelineName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'livePipelines'.", id)));
        }
        this.deleteWithResponse(resourceGroupName, accountName, livePipelineName, Context.NONE);
    }

    public Response<Void> deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = Utils.getValueFromIdByName(id, "videoAnalyzers");
        if (accountName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'videoAnalyzers'.", id)));
        }
        String livePipelineName = Utils.getValueFromIdByName(id, "livePipelines");
        if (livePipelineName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'livePipelines'.", id)));
        }
        return this.deleteWithResponse(resourceGroupName, accountName, livePipelineName, context);
    }

    private LivePipelinesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.videoanalyzer.VideoAnalyzerManager manager() {
        return this.serviceManager;
    }

    public LivePipelineImpl define(String name) {
        return new LivePipelineImpl(name, this.manager());
    }
}
