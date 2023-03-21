// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.communication.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.communication.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;

/** A class representing a SenderUsername resource. */
@Fluent
public final class SenderUsernameResourceInner extends ProxyResource {
    /*
     * The properties of a SenderUsername resource.
     */
    @JsonProperty(value = "properties")
    private SenderUsernameProperties innerProperties;

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /** Creates an instance of SenderUsernameResourceInner class. */
    public SenderUsernameResourceInner() {
    }

    /**
     * Get the innerProperties property: The properties of a SenderUsername resource.
     *
     * @return the innerProperties value.
     */
    private SenderUsernameProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the dataLocation property: The location where the SenderUsername resource data is stored at rest.
     *
     * @return the dataLocation value.
     */
    public String dataLocation() {
        return this.innerProperties() == null ? null : this.innerProperties().dataLocation();
    }

    /**
     * Get the username property: A sender senderUsername to be used when sending emails.
     *
     * @return the username value.
     */
    public String username() {
        return this.innerProperties() == null ? null : this.innerProperties().username();
    }

    /**
     * Set the username property: A sender senderUsername to be used when sending emails.
     *
     * @param username the username value to set.
     * @return the SenderUsernameResourceInner object itself.
     */
    public SenderUsernameResourceInner withUsername(String username) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SenderUsernameProperties();
        }
        this.innerProperties().withUsername(username);
        return this;
    }

    /**
     * Get the displayName property: The display name for the senderUsername.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.innerProperties() == null ? null : this.innerProperties().displayName();
    }

    /**
     * Set the displayName property: The display name for the senderUsername.
     *
     * @param displayName the displayName value to set.
     * @return the SenderUsernameResourceInner object itself.
     */
    public SenderUsernameResourceInner withDisplayName(String displayName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SenderUsernameProperties();
        }
        this.innerProperties().withDisplayName(displayName);
        return this;
    }

    /**
     * Get the provisioningState property: Provisioning state of the resource. Unknown is the default state for
     * Communication Services.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}