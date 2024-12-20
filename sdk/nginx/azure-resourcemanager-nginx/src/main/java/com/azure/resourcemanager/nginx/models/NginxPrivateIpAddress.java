// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.nginx.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The NginxPrivateIpAddress model.
 */
@Fluent
public final class NginxPrivateIpAddress implements JsonSerializable<NginxPrivateIpAddress> {
    /*
     * The privateIPAddress property.
     */
    private String privateIpAddress;

    /*
     * The privateIPAllocationMethod property.
     */
    private NginxPrivateIpAllocationMethod privateIpAllocationMethod;

    /*
     * The subnetId property.
     */
    private String subnetId;

    /**
     * Creates an instance of NginxPrivateIpAddress class.
     */
    public NginxPrivateIpAddress() {
    }

    /**
     * Get the privateIpAddress property: The privateIPAddress property.
     * 
     * @return the privateIpAddress value.
     */
    public String privateIpAddress() {
        return this.privateIpAddress;
    }

    /**
     * Set the privateIpAddress property: The privateIPAddress property.
     * 
     * @param privateIpAddress the privateIpAddress value to set.
     * @return the NginxPrivateIpAddress object itself.
     */
    public NginxPrivateIpAddress withPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }

    /**
     * Get the privateIpAllocationMethod property: The privateIPAllocationMethod property.
     * 
     * @return the privateIpAllocationMethod value.
     */
    public NginxPrivateIpAllocationMethod privateIpAllocationMethod() {
        return this.privateIpAllocationMethod;
    }

    /**
     * Set the privateIpAllocationMethod property: The privateIPAllocationMethod property.
     * 
     * @param privateIpAllocationMethod the privateIpAllocationMethod value to set.
     * @return the NginxPrivateIpAddress object itself.
     */
    public NginxPrivateIpAddress
        withPrivateIpAllocationMethod(NginxPrivateIpAllocationMethod privateIpAllocationMethod) {
        this.privateIpAllocationMethod = privateIpAllocationMethod;
        return this;
    }

    /**
     * Get the subnetId property: The subnetId property.
     * 
     * @return the subnetId value.
     */
    public String subnetId() {
        return this.subnetId;
    }

    /**
     * Set the subnetId property: The subnetId property.
     * 
     * @param subnetId the subnetId value to set.
     * @return the NginxPrivateIpAddress object itself.
     */
    public NginxPrivateIpAddress withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("privateIPAddress", this.privateIpAddress);
        jsonWriter.writeStringField("privateIPAllocationMethod",
            this.privateIpAllocationMethod == null ? null : this.privateIpAllocationMethod.toString());
        jsonWriter.writeStringField("subnetId", this.subnetId);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of NginxPrivateIpAddress from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of NginxPrivateIpAddress if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the NginxPrivateIpAddress.
     */
    public static NginxPrivateIpAddress fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            NginxPrivateIpAddress deserializedNginxPrivateIpAddress = new NginxPrivateIpAddress();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("privateIPAddress".equals(fieldName)) {
                    deserializedNginxPrivateIpAddress.privateIpAddress = reader.getString();
                } else if ("privateIPAllocationMethod".equals(fieldName)) {
                    deserializedNginxPrivateIpAddress.privateIpAllocationMethod
                        = NginxPrivateIpAllocationMethod.fromString(reader.getString());
                } else if ("subnetId".equals(fieldName)) {
                    deserializedNginxPrivateIpAddress.subnetId = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedNginxPrivateIpAddress;
        });
    }
}
