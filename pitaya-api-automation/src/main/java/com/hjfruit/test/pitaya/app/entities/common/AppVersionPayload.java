package com.hjfruit.test.pitaya.app.entities.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AppVersionPayload {
    /**
     * @ApiModelProperty(notes = "0不升级，1升级，2强制升级")
     */
    private Integer upgradeStrategy;
    /**
     *
     */
    private Integer platform;
    /**
     *
     */
    private Integer version;
    /**
     *
     */
    private String versionCode;
    /**
     *
     */
    private String updateInfo;
    /**
     * @ApiModelProperty(notes = "android 包下载地址")
     */
    private String downloadUrl;
    /**
     * @ApiModelProperty(notes = "ios 苹果商店的应用 id")
     */
    private String appleId;
    /**
     * @ApiModelProperty(notes = "发布时间")
     */
    private Long releaseAt;
    /**
     * @ApiModelProperty(notes = "创建时间")
     */
    private Long createAt;
    /**
     *
     */
    private Long nowData;
}