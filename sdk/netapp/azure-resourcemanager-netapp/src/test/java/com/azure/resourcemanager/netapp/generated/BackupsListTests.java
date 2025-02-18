// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.netapp.fluent.models.BackupInner;
import com.azure.resourcemanager.netapp.models.BackupsList;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class BackupsListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        BackupsList model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"backupId\":\"jvewzcjznmwcp\",\"creationDate\":\"2021-03-18T03:28:02Z\",\"provisioningState\":\"adraufactkahzo\",\"size\":1201221594494672823,\"label\":\"iuxxpshneekulfg\",\"backupType\":\"Manual\",\"failureReason\":\"bkwdlenrds\",\"volumeResourceId\":\"tujbazpju\",\"useExistingSnapshot\":true,\"snapshotName\":\"nyfln\",\"backupPolicyResourceId\":\"wmd\",\"isLargeVolume\":false},\"id\":\"klvxwmyg\",\"name\":\"xpgpq\",\"type\":\"hiszepnnbjcrxgib\"},{\"properties\":{\"backupId\":\"axconfozauo\",\"creationDate\":\"2021-03-03T08:46:38Z\",\"provisioningState\":\"okwbqplh\",\"size\":928202540530969399,\"label\":\"epzl\",\"backupType\":\"Manual\",\"failureReason\":\"zsoldwey\",\"volumeResourceId\":\"qdunvmnnrwrbior\",\"useExistingSnapshot\":true,\"snapshotName\":\"ywjhhgdnhx\",\"backupPolicyResourceId\":\"ivfomiloxgg\",\"isLargeVolume\":false},\"id\":\"q\",\"name\":\"dieuzaofj\",\"type\":\"hvcyyysfg\"},{\"properties\":{\"backupId\":\"tcubiipuipwoqonm\",\"creationDate\":\"2021-06-06T06:49:44Z\",\"provisioningState\":\"k\",\"size\":4474116569169804323,\"label\":\"qvci\",\"backupType\":\"Manual\",\"failureReason\":\"fgmblrrilbywdxsm\",\"volumeResourceId\":\"ccwr\",\"useExistingSnapshot\":false,\"snapshotName\":\"jfnynszqujizdvoq\",\"backupPolicyResourceId\":\"ibyowbblgyavutp\",\"isLargeVolume\":false},\"id\":\"xoi\",\"name\":\"msksbp\",\"type\":\"mlqoljx\"}],\"nextLink\":\"gxxlxsffgcvizq\"}")
            .toObject(BackupsList.class);
        Assertions.assertEquals("iuxxpshneekulfg", model.value().get(0).label());
        Assertions.assertEquals("tujbazpju", model.value().get(0).volumeResourceId());
        Assertions.assertEquals(true, model.value().get(0).useExistingSnapshot());
        Assertions.assertEquals("nyfln", model.value().get(0).snapshotName());
        Assertions.assertEquals("gxxlxsffgcvizq", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        BackupsList model = new BackupsList().withValue(Arrays.asList(
            new BackupInner().withLabel("iuxxpshneekulfg")
                .withVolumeResourceId("tujbazpju")
                .withUseExistingSnapshot(true)
                .withSnapshotName("nyfln"),
            new BackupInner().withLabel("epzl")
                .withVolumeResourceId("qdunvmnnrwrbior")
                .withUseExistingSnapshot(true)
                .withSnapshotName("ywjhhgdnhx"),
            new BackupInner().withLabel("qvci")
                .withVolumeResourceId("ccwr")
                .withUseExistingSnapshot(false)
                .withSnapshotName("jfnynszqujizdvoq")))
            .withNextLink("gxxlxsffgcvizq");
        model = BinaryData.fromObject(model).toObject(BackupsList.class);
        Assertions.assertEquals("iuxxpshneekulfg", model.value().get(0).label());
        Assertions.assertEquals("tujbazpju", model.value().get(0).volumeResourceId());
        Assertions.assertEquals(true, model.value().get(0).useExistingSnapshot());
        Assertions.assertEquals("nyfln", model.value().get(0).snapshotName());
        Assertions.assertEquals("gxxlxsffgcvizq", model.nextLink());
    }
}
