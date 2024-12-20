// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.notificationhubs.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * State of Private Link Connection.
 */
public final class PrivateLinkConnectionStatus extends ExpandableStringEnum<PrivateLinkConnectionStatus> {
    /**
     * Static value Disconnected for PrivateLinkConnectionStatus.
     */
    public static final PrivateLinkConnectionStatus DISCONNECTED = fromString("Disconnected");

    /**
     * Static value Pending for PrivateLinkConnectionStatus.
     */
    public static final PrivateLinkConnectionStatus PENDING = fromString("Pending");

    /**
     * Static value Approved for PrivateLinkConnectionStatus.
     */
    public static final PrivateLinkConnectionStatus APPROVED = fromString("Approved");

    /**
     * Static value Rejected for PrivateLinkConnectionStatus.
     */
    public static final PrivateLinkConnectionStatus REJECTED = fromString("Rejected");

    /**
     * Creates a new instance of PrivateLinkConnectionStatus value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public PrivateLinkConnectionStatus() {
    }

    /**
     * Creates or finds a PrivateLinkConnectionStatus from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding PrivateLinkConnectionStatus.
     */
    public static PrivateLinkConnectionStatus fromString(String name) {
        return fromString(name, PrivateLinkConnectionStatus.class);
    }

    /**
     * Gets known PrivateLinkConnectionStatus values.
     * 
     * @return known PrivateLinkConnectionStatus values.
     */
    public static Collection<PrivateLinkConnectionStatus> values() {
        return values(PrivateLinkConnectionStatus.class);
    }
}
