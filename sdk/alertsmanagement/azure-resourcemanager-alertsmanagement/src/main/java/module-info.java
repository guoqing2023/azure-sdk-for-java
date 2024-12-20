// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

module com.azure.resourcemanager.alertsmanagement {
    requires transitive com.azure.core.management;

    exports com.azure.resourcemanager.alertsmanagement;
    exports com.azure.resourcemanager.alertsmanagement.fluent;
    exports com.azure.resourcemanager.alertsmanagement.fluent.models;
    exports com.azure.resourcemanager.alertsmanagement.models;

    opens com.azure.resourcemanager.alertsmanagement.fluent.models to com.azure.core;
    opens com.azure.resourcemanager.alertsmanagement.models to com.azure.core;
}
