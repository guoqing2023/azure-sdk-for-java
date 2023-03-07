// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.purview.sharing.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines the supported types for share. */
public final class ShareKind extends ExpandableStringEnum<ShareKind> {
    /** Static value InPlace for ShareKind. */
    public static final ShareKind IN_PLACE = fromString("InPlace");

    /**
     * Creates a new instance of ShareKind value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ShareKind() {}

    /**
     * Creates or finds a ShareKind from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ShareKind.
     */
    @JsonCreator
    public static ShareKind fromString(String name) {
        return fromString(name, ShareKind.class);
    }

    /**
     * Gets known ShareKind values.
     *
     * @return known ShareKind values.
     */
    public static Collection<ShareKind> values() {
        return values(ShareKind.class);
    }
}