package com.hjfruit.test.pitaya.app.entities.v2.types;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ListLogsPayload {
    /**
     *
     */
    private List<FlowLog> flowLog;
}