// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.notificationhubs.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.notificationhubs.models.OperationDisplay;
import com.azure.resourcemanager.notificationhubs.models.OperationProperties;
import java.io.IOException;

/**
 * A NotificationHubs REST API operation.
 */
@Fluent
public final class OperationInner implements JsonSerializable<OperationInner> {
    /*
     * Gets operation name: {provider}/{resource}/{operation}
     */
    private String name;

    /*
     * The object that represents the operation.
     */
    private OperationDisplay display;

    /*
     * Optional operation properties.
     */
    private OperationProperties properties;

    /*
     * Gets or sets IsDataAction property. It is used to differentiate management and data plane operations.
     */
    private Boolean isDataAction;

    /**
     * Creates an instance of OperationInner class.
     */
    public OperationInner() {
    }

    /**
     * Get the name property: Gets operation name: {provider}/{resource}/{operation}.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the display property: The object that represents the operation.
     * 
     * @return the display value.
     */
    public OperationDisplay display() {
        return this.display;
    }

    /**
     * Set the display property: The object that represents the operation.
     * 
     * @param display the display value to set.
     * @return the OperationInner object itself.
     */
    public OperationInner withDisplay(OperationDisplay display) {
        this.display = display;
        return this;
    }

    /**
     * Get the properties property: Optional operation properties.
     * 
     * @return the properties value.
     */
    public OperationProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Optional operation properties.
     * 
     * @param properties the properties value to set.
     * @return the OperationInner object itself.
     */
    public OperationInner withProperties(OperationProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the isDataAction property: Gets or sets IsDataAction property. It is used to differentiate management and
     * data plane operations.
     * 
     * @return the isDataAction value.
     */
    public Boolean isDataAction() {
        return this.isDataAction;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (display() != null) {
            display().validate();
        }
        if (properties() != null) {
            properties().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("display", this.display);
        jsonWriter.writeJsonField("properties", this.properties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of OperationInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of OperationInner if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the OperationInner.
     */
    public static OperationInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            OperationInner deserializedOperationInner = new OperationInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedOperationInner.name = reader.getString();
                } else if ("display".equals(fieldName)) {
                    deserializedOperationInner.display = OperationDisplay.fromJson(reader);
                } else if ("properties".equals(fieldName)) {
                    deserializedOperationInner.properties = OperationProperties.fromJson(reader);
                } else if ("isDataAction".equals(fieldName)) {
                    deserializedOperationInner.isDataAction = reader.getNullable(JsonReader::getBoolean);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedOperationInner;
        });
    }
}
