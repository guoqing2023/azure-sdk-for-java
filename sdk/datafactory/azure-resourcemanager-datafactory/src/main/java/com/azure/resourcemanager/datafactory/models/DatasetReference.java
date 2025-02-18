// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.Map;

/**
 * Dataset reference type.
 */
@Fluent
public final class DatasetReference implements JsonSerializable<DatasetReference> {
    /*
     * Dataset reference type.
     */
    private final String type = "DatasetReference";

    /*
     * Reference dataset name.
     */
    private String referenceName;

    /*
     * Arguments for dataset.
     */
    private Map<String, Object> parameters;

    /**
     * Creates an instance of DatasetReference class.
     */
    public DatasetReference() {
    }

    /**
     * Get the type property: Dataset reference type.
     * 
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Get the referenceName property: Reference dataset name.
     * 
     * @return the referenceName value.
     */
    public String referenceName() {
        return this.referenceName;
    }

    /**
     * Set the referenceName property: Reference dataset name.
     * 
     * @param referenceName the referenceName value to set.
     * @return the DatasetReference object itself.
     */
    public DatasetReference withReferenceName(String referenceName) {
        this.referenceName = referenceName;
        return this;
    }

    /**
     * Get the parameters property: Arguments for dataset.
     * 
     * @return the parameters value.
     */
    public Map<String, Object> parameters() {
        return this.parameters;
    }

    /**
     * Set the parameters property: Arguments for dataset.
     * 
     * @param parameters the parameters value to set.
     * @return the DatasetReference object itself.
     */
    public DatasetReference withParameters(Map<String, Object> parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (referenceName() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property referenceName in model DatasetReference"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(DatasetReference.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("type", this.type);
        jsonWriter.writeStringField("referenceName", this.referenceName);
        jsonWriter.writeMapField("parameters", this.parameters, (writer, element) -> writer.writeUntyped(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DatasetReference from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DatasetReference if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the DatasetReference.
     */
    public static DatasetReference fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DatasetReference deserializedDatasetReference = new DatasetReference();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("referenceName".equals(fieldName)) {
                    deserializedDatasetReference.referenceName = reader.getString();
                } else if ("parameters".equals(fieldName)) {
                    Map<String, Object> parameters = reader.readMap(reader1 -> reader1.readUntyped());
                    deserializedDatasetReference.parameters = parameters;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDatasetReference;
        });
    }
}
