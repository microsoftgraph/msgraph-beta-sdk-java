// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Cloud Pc Remote Action Name.
*/
public enum CloudPcRemoteActionName
{
    /**
    * unknown
    */
    UNKNOWN,
    /**
    * restart
    */
    RESTART,
    /**
    * rename
    */
    RENAME,
    /**
    * resize
    */
    RESIZE,
    /**
    * restore
    */
    RESTORE,
    /**
    * reprovision
    */
    REPROVISION,
    /**
    * change User Account Type
    */
    CHANGE_USER_ACCOUNT_TYPE,
    /**
    * troubleshoot
    */
    TROUBLESHOOT,
    /**
    * place Under Review
    */
    PLACE_UNDER_REVIEW,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * create Snapshot
    */
    CREATE_SNAPSHOT,
    /**
    * power On
    */
    POWER_ON,
    /**
    * power Off
    */
    POWER_OFF,
    /**
    * move Region
    */
    MOVE_REGION,
    /**
    * For CloudPcRemoteActionName values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
