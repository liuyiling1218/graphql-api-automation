package com.hjfruit.test.pitaya.app.entities.check;

import com.hjfruit.test.pitaya.app.entities.Page;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CheckRecordPageInput {
    /**
     *
     */
    private CheckRecordConfitionInput checkRecordConfitionInput;
    /**
     *
     */
    private Page page;
}