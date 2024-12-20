// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

module com.azure.communication.callingserver {

    requires transitive com.azure.communication.common;

    // public API surface area
    exports com.azure.communication.callingserver;
    exports com.azure.communication.callingserver.models;
    exports com.azure.communication.callingserver.models.events;

    // Opening some packages to azure-core for serialization.
    opens com.azure.communication.callingserver.implementation.models to com.azure.core;
    opens com.azure.communication.callingserver to com.azure.core;
    opens com.azure.communication.callingserver.models to com.azure.core;
    opens com.azure.communication.callingserver.models.events to com.azure.core;
}
