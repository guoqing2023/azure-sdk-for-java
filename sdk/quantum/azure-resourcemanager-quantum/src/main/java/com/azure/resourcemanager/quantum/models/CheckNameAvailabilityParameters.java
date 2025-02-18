// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.quantum.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Details of check name availability request body.
 */
@Fluent
public final class CheckNameAvailabilityParameters implements JsonSerializable<CheckNameAvailabilityParameters> {
    /*
     * Name for checking availability.
     */
    private String name;

    /*
     * The resource type of Quantum Workspace.
     */
    private String type;

    /**
     * Creates an instance of CheckNameAvailabilityParameters class.
     */
    public CheckNameAvailabilityParameters() {
    }

    /**
     * Get the name property: Name for checking availability.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name for checking availability.
     * 
     * @param name the name value to set.
     * @return the CheckNameAvailabilityParameters object itself.
     */
    public CheckNameAvailabilityParameters withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the type property: The resource type of Quantum Workspace.
     * 
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type property: The resource type of Quantum Workspace.
     * 
     * @param type the type value to set.
     * @return the CheckNameAvailabilityParameters object itself.
     */
    public CheckNameAvailabilityParameters withType(String type) {
        this.type = type;
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
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeStringField("type", this.type);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of CheckNameAvailabilityParameters from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of CheckNameAvailabilityParameters if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the CheckNameAvailabilityParameters.
     */
    public static CheckNameAvailabilityParameters fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            CheckNameAvailabilityParameters deserializedCheckNameAvailabilityParameters
                = new CheckNameAvailabilityParameters();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedCheckNameAvailabilityParameters.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedCheckNameAvailabilityParameters.type = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedCheckNameAvailabilityParameters;
        });
    }
}
