// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

/**
 * Properties of an artifact.
 */
@Fluent
public final class ArtifactInstallProperties implements JsonSerializable<ArtifactInstallProperties> {
    /*
     * The artifact's identifier.
     */
    private String artifactId;

    /*
     * The artifact's title.
     */
    private String artifactTitle;

    /*
     * The parameters of the artifact.
     */
    private List<ArtifactParameterProperties> parameters;

    /*
     * The status of the artifact.
     */
    private String status;

    /*
     * The status message from the deployment.
     */
    private String deploymentStatusMessage;

    /*
     * The status message from the virtual machine extension.
     */
    private String vmExtensionStatusMessage;

    /*
     * The time that the artifact starts to install on the virtual machine.
     */
    private OffsetDateTime installTime;

    /**
     * Creates an instance of ArtifactInstallProperties class.
     */
    public ArtifactInstallProperties() {
    }

    /**
     * Get the artifactId property: The artifact's identifier.
     * 
     * @return the artifactId value.
     */
    public String artifactId() {
        return this.artifactId;
    }

    /**
     * Set the artifactId property: The artifact's identifier.
     * 
     * @param artifactId the artifactId value to set.
     * @return the ArtifactInstallProperties object itself.
     */
    public ArtifactInstallProperties withArtifactId(String artifactId) {
        this.artifactId = artifactId;
        return this;
    }

    /**
     * Get the artifactTitle property: The artifact's title.
     * 
     * @return the artifactTitle value.
     */
    public String artifactTitle() {
        return this.artifactTitle;
    }

    /**
     * Set the artifactTitle property: The artifact's title.
     * 
     * @param artifactTitle the artifactTitle value to set.
     * @return the ArtifactInstallProperties object itself.
     */
    public ArtifactInstallProperties withArtifactTitle(String artifactTitle) {
        this.artifactTitle = artifactTitle;
        return this;
    }

    /**
     * Get the parameters property: The parameters of the artifact.
     * 
     * @return the parameters value.
     */
    public List<ArtifactParameterProperties> parameters() {
        return this.parameters;
    }

    /**
     * Set the parameters property: The parameters of the artifact.
     * 
     * @param parameters the parameters value to set.
     * @return the ArtifactInstallProperties object itself.
     */
    public ArtifactInstallProperties withParameters(List<ArtifactParameterProperties> parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * Get the status property: The status of the artifact.
     * 
     * @return the status value.
     */
    public String status() {
        return this.status;
    }

    /**
     * Set the status property: The status of the artifact.
     * 
     * @param status the status value to set.
     * @return the ArtifactInstallProperties object itself.
     */
    public ArtifactInstallProperties withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Get the deploymentStatusMessage property: The status message from the deployment.
     * 
     * @return the deploymentStatusMessage value.
     */
    public String deploymentStatusMessage() {
        return this.deploymentStatusMessage;
    }

    /**
     * Set the deploymentStatusMessage property: The status message from the deployment.
     * 
     * @param deploymentStatusMessage the deploymentStatusMessage value to set.
     * @return the ArtifactInstallProperties object itself.
     */
    public ArtifactInstallProperties withDeploymentStatusMessage(String deploymentStatusMessage) {
        this.deploymentStatusMessage = deploymentStatusMessage;
        return this;
    }

    /**
     * Get the vmExtensionStatusMessage property: The status message from the virtual machine extension.
     * 
     * @return the vmExtensionStatusMessage value.
     */
    public String vmExtensionStatusMessage() {
        return this.vmExtensionStatusMessage;
    }

    /**
     * Set the vmExtensionStatusMessage property: The status message from the virtual machine extension.
     * 
     * @param vmExtensionStatusMessage the vmExtensionStatusMessage value to set.
     * @return the ArtifactInstallProperties object itself.
     */
    public ArtifactInstallProperties withVmExtensionStatusMessage(String vmExtensionStatusMessage) {
        this.vmExtensionStatusMessage = vmExtensionStatusMessage;
        return this;
    }

    /**
     * Get the installTime property: The time that the artifact starts to install on the virtual machine.
     * 
     * @return the installTime value.
     */
    public OffsetDateTime installTime() {
        return this.installTime;
    }

    /**
     * Set the installTime property: The time that the artifact starts to install on the virtual machine.
     * 
     * @param installTime the installTime value to set.
     * @return the ArtifactInstallProperties object itself.
     */
    public ArtifactInstallProperties withInstallTime(OffsetDateTime installTime) {
        this.installTime = installTime;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (parameters() != null) {
            parameters().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("artifactId", this.artifactId);
        jsonWriter.writeStringField("artifactTitle", this.artifactTitle);
        jsonWriter.writeArrayField("parameters", this.parameters, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("status", this.status);
        jsonWriter.writeStringField("deploymentStatusMessage", this.deploymentStatusMessage);
        jsonWriter.writeStringField("vmExtensionStatusMessage", this.vmExtensionStatusMessage);
        jsonWriter.writeStringField("installTime",
            this.installTime == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.installTime));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ArtifactInstallProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ArtifactInstallProperties if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ArtifactInstallProperties.
     */
    public static ArtifactInstallProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ArtifactInstallProperties deserializedArtifactInstallProperties = new ArtifactInstallProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("artifactId".equals(fieldName)) {
                    deserializedArtifactInstallProperties.artifactId = reader.getString();
                } else if ("artifactTitle".equals(fieldName)) {
                    deserializedArtifactInstallProperties.artifactTitle = reader.getString();
                } else if ("parameters".equals(fieldName)) {
                    List<ArtifactParameterProperties> parameters
                        = reader.readArray(reader1 -> ArtifactParameterProperties.fromJson(reader1));
                    deserializedArtifactInstallProperties.parameters = parameters;
                } else if ("status".equals(fieldName)) {
                    deserializedArtifactInstallProperties.status = reader.getString();
                } else if ("deploymentStatusMessage".equals(fieldName)) {
                    deserializedArtifactInstallProperties.deploymentStatusMessage = reader.getString();
                } else if ("vmExtensionStatusMessage".equals(fieldName)) {
                    deserializedArtifactInstallProperties.vmExtensionStatusMessage = reader.getString();
                } else if ("installTime".equals(fieldName)) {
                    deserializedArtifactInstallProperties.installTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedArtifactInstallProperties;
        });
    }
}
