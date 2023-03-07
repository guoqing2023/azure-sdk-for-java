// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.MabJobTaskDetails;
import java.time.Duration;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;

public final class MabJobTaskDetailsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        MabJobTaskDetails model =
            BinaryData
                .fromString(
                    "{\"taskId\":\"gdirazf\",\"startTime\":\"2021-02-11T05:39:41Z\",\"endTime\":\"2021-01-14T06:51:31Z\",\"duration\":\"PT208H42M12S\",\"status\":\"dujtmvcope\"}")
                .toObject(MabJobTaskDetails.class);
        Assertions.assertEquals("gdirazf", model.taskId());
        Assertions.assertEquals(OffsetDateTime.parse("2021-02-11T05:39:41Z"), model.startTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-01-14T06:51:31Z"), model.endTime());
        Assertions.assertEquals(Duration.parse("PT208H42M12S"), model.duration());
        Assertions.assertEquals("dujtmvcope", model.status());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        MabJobTaskDetails model =
            new MabJobTaskDetails()
                .withTaskId("gdirazf")
                .withStartTime(OffsetDateTime.parse("2021-02-11T05:39:41Z"))
                .withEndTime(OffsetDateTime.parse("2021-01-14T06:51:31Z"))
                .withDuration(Duration.parse("PT208H42M12S"))
                .withStatus("dujtmvcope");
        model = BinaryData.fromObject(model).toObject(MabJobTaskDetails.class);
        Assertions.assertEquals("gdirazf", model.taskId());
        Assertions.assertEquals(OffsetDateTime.parse("2021-02-11T05:39:41Z"), model.startTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-01-14T06:51:31Z"), model.endTime());
        Assertions.assertEquals(Duration.parse("PT208H42M12S"), model.duration());
        Assertions.assertEquals("dujtmvcope", model.status());
    }
}