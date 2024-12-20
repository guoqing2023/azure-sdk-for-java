// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.openai.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The CompletionsUsageCompletionTokensDetails model.
 */
@Immutable
public final class CompletionsUsageCompletionTokensDetails
    implements JsonSerializable<CompletionsUsageCompletionTokensDetails> {

    /*
     * Tokens generated by the model for reasoning.
     */
    @Generated
    private Integer reasoningTokens;

    /**
     * Creates an instance of CompletionsUsageCompletionTokensDetails class.
     */
    @Generated
    private CompletionsUsageCompletionTokensDetails() {
    }

    /**
     * Get the reasoningTokens property: Tokens generated by the model for reasoning.
     *
     * @return the reasoningTokens value.
     */
    @Generated
    public Integer getReasoningTokens() {
        return this.reasoningTokens;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeNumberField("reasoning_tokens", this.reasoningTokens);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of CompletionsUsageCompletionTokensDetails from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of CompletionsUsageCompletionTokensDetails if the JsonReader was pointing to an instance of
     * it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the CompletionsUsageCompletionTokensDetails.
     */
    @Generated
    public static CompletionsUsageCompletionTokensDetails fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            CompletionsUsageCompletionTokensDetails deserializedCompletionsUsageCompletionTokensDetails
                = new CompletionsUsageCompletionTokensDetails();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("reasoning_tokens".equals(fieldName)) {
                    deserializedCompletionsUsageCompletionTokensDetails.reasoningTokens
                        = reader.getNullable(JsonReader::getInt);
                } else {
                    reader.skipChildren();
                }
            }
            return deserializedCompletionsUsageCompletionTokensDetails;
        });
    }
}
