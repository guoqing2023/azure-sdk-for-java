// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysqlflexibleserver.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.mysqlflexibleserver.fluent.models.MaintenancePropertiesForUpdate;
import java.io.IOException;
import java.time.OffsetDateTime;

/**
 * Represents a maintenance update parameter.
 */
@Fluent
public final class MaintenanceUpdate implements JsonSerializable<MaintenanceUpdate> {
    /*
     * The properties of a maintenance update parameter
     */
    private MaintenancePropertiesForUpdate innerProperties;

    /**
     * Creates an instance of MaintenanceUpdate class.
     */
    public MaintenanceUpdate() {
    }

    /**
     * Get the innerProperties property: The properties of a maintenance update parameter.
     * 
     * @return the innerProperties value.
     */
    private MaintenancePropertiesForUpdate innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the maintenanceStartTime property: The start time for a maintenance.
     * 
     * @return the maintenanceStartTime value.
     */
    public OffsetDateTime maintenanceStartTime() {
        return this.innerProperties() == null ? null : this.innerProperties().maintenanceStartTime();
    }

    /**
     * Set the maintenanceStartTime property: The start time for a maintenance.
     * 
     * @param maintenanceStartTime the maintenanceStartTime value to set.
     * @return the MaintenanceUpdate object itself.
     */
    public MaintenanceUpdate withMaintenanceStartTime(OffsetDateTime maintenanceStartTime) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MaintenancePropertiesForUpdate();
        }
        this.innerProperties().withMaintenanceStartTime(maintenanceStartTime);
        return this;
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

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MaintenanceUpdate from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MaintenanceUpdate if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the MaintenanceUpdate.
     */
    public static MaintenanceUpdate fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MaintenanceUpdate deserializedMaintenanceUpdate = new MaintenanceUpdate();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("properties".equals(fieldName)) {
                    deserializedMaintenanceUpdate.innerProperties = MaintenancePropertiesForUpdate.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedMaintenanceUpdate;
        });
    }
}
