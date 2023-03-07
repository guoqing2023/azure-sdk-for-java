// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.purview.sharing.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Defines a single StorageAccountPath path. */
@Fluent
public final class StorageAccountPath {
    /*
     * Gets or sets the container name
     */
    @JsonProperty(value = "containerName", required = true)
    private String containerName;

    /*
     * Gets or sets the path on the receiver side where the artifact is to be mapped
     */
    @JsonProperty(value = "receiverPath")
    private String receiverPath;

    /*
     * Gets or sets the path to file/folder within the container to be shared
     */
    @JsonProperty(value = "senderPath")
    private String senderPath;

    /** Creates an instance of StorageAccountPath class. */
    public StorageAccountPath() {}

    /**
     * Get the containerName property: Gets or sets the container name.
     *
     * @return the containerName value.
     */
    public String getContainerName() {
        return this.containerName;
    }

    /**
     * Set the containerName property: Gets or sets the container name.
     *
     * @param containerName the containerName value to set.
     * @return the StorageAccountPath object itself.
     */
    public StorageAccountPath setContainerName(String containerName) {
        this.containerName = containerName;
        return this;
    }

    /**
     * Get the receiverPath property: Gets or sets the path on the receiver side where the artifact is to be mapped.
     *
     * @return the receiverPath value.
     */
    public String getReceiverPath() {
        return this.receiverPath;
    }

    /**
     * Set the receiverPath property: Gets or sets the path on the receiver side where the artifact is to be mapped.
     *
     * @param receiverPath the receiverPath value to set.
     * @return the StorageAccountPath object itself.
     */
    public StorageAccountPath setReceiverPath(String receiverPath) {
        this.receiverPath = receiverPath;
        return this;
    }

    /**
     * Get the senderPath property: Gets or sets the path to file/folder within the container to be shared.
     *
     * @return the senderPath value.
     */
    public String getSenderPath() {
        return this.senderPath;
    }

    /**
     * Set the senderPath property: Gets or sets the path to file/folder within the container to be shared.
     *
     * @param senderPath the senderPath value to set.
     * @return the StorageAccountPath object itself.
     */
    public StorageAccountPath setSenderPath(String senderPath) {
        this.senderPath = senderPath;
        return this;
    }
}