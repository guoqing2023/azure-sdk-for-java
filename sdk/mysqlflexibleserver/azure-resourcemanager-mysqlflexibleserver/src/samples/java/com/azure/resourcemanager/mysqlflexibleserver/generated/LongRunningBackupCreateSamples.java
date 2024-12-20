// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysqlflexibleserver.generated;

/**
 * Samples for LongRunningBackup Create.
 */
public final class LongRunningBackupCreateSamples {
    /*
     * x-ms-original-file:
     * specification/mysql/resource-manager/Microsoft.DBforMySQL/Backups/preview/2023-10-01-preview/examples/
     * LongRunningBackup.json
     */
    /**
     * Sample code: Create backup for a server.
     * 
     * @param manager Entry point to MySqlManager.
     */
    public static void createBackupForAServer(com.azure.resourcemanager.mysqlflexibleserver.MySqlManager manager) {
        manager.longRunningBackups()
            .define("testback")
            .withExistingFlexibleServer("TestGroup", "mysqltestserver")
            .create();
    }
}
