// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.streamanalytics.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.streamanalytics.models.ClusterProperties;
import com.azure.resourcemanager.streamanalytics.models.ClusterSku;
import java.io.IOException;
import java.util.Map;

/**
 * A Stream Analytics Cluster object.
 */
@Fluent
public final class ClusterInner extends Resource {
    /*
     * The SKU of the cluster. This determines the size/capacity of the cluster. Required on PUT (CreateOrUpdate)
     * requests.
     */
    private ClusterSku sku;

    /*
     * The current entity tag for the cluster. This is an opaque string. You can use it to detect whether the resource
     * has changed between requests. You can also use it in the If-Match or If-None-Match headers for write operations
     * for optimistic concurrency.
     */
    private String etag;

    /*
     * The properties associated with a Stream Analytics cluster.
     */
    private ClusterProperties properties;

    /*
     * The type of the resource.
     */
    private String type;

    /*
     * The name of the resource.
     */
    private String name;

    /*
     * Fully qualified resource Id for the resource.
     */
    private String id;

    /**
     * Creates an instance of ClusterInner class.
     */
    public ClusterInner() {
    }

    /**
     * Get the sku property: The SKU of the cluster. This determines the size/capacity of the cluster. Required on PUT
     * (CreateOrUpdate) requests.
     * 
     * @return the sku value.
     */
    public ClusterSku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: The SKU of the cluster. This determines the size/capacity of the cluster. Required on PUT
     * (CreateOrUpdate) requests.
     * 
     * @param sku the sku value to set.
     * @return the ClusterInner object itself.
     */
    public ClusterInner withSku(ClusterSku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the etag property: The current entity tag for the cluster. This is an opaque string. You can use it to detect
     * whether the resource has changed between requests. You can also use it in the If-Match or If-None-Match headers
     * for write operations for optimistic concurrency.
     * 
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the properties property: The properties associated with a Stream Analytics cluster.
     * 
     * @return the properties value.
     */
    public ClusterProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: The properties associated with a Stream Analytics cluster.
     * 
     * @param properties the properties value to set.
     * @return the ClusterInner object itself.
     */
    public ClusterInner withProperties(ClusterProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the type property: The type of the resource.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Get the name property: The name of the resource.
     * 
     * @return the name value.
     */
    @Override
    public String name() {
        return this.name;
    }

    /**
     * Get the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    @Override
    public String id() {
        return this.id;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClusterInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClusterInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sku() != null) {
            sku().validate();
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
        jsonWriter.writeStringField("location", location());
        jsonWriter.writeMapField("tags", tags(), (writer, element) -> writer.writeString(element));
        jsonWriter.writeJsonField("sku", this.sku);
        jsonWriter.writeJsonField("properties", this.properties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ClusterInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ClusterInner if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ClusterInner.
     */
    public static ClusterInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ClusterInner deserializedClusterInner = new ClusterInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedClusterInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedClusterInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedClusterInner.type = reader.getString();
                } else if ("location".equals(fieldName)) {
                    deserializedClusterInner.withLocation(reader.getString());
                } else if ("tags".equals(fieldName)) {
                    Map<String, String> tags = reader.readMap(reader1 -> reader1.getString());
                    deserializedClusterInner.withTags(tags);
                } else if ("sku".equals(fieldName)) {
                    deserializedClusterInner.sku = ClusterSku.fromJson(reader);
                } else if ("etag".equals(fieldName)) {
                    deserializedClusterInner.etag = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedClusterInner.properties = ClusterProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedClusterInner;
        });
    }
}
