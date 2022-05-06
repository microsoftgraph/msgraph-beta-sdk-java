// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Zebra Fota Deployment State.
*/
public enum ZebraFotaDeploymentState
{
    /**
    * pending Creation
    */
    PENDING_CREATION,
    /**
    * create Failed
    */
    CREATE_FAILED,
    /**
    * created
    */
    CREATED,
    /**
    * in Progress
    */
    IN_PROGRESS,
    /**
    * completed
    */
    COMPLETED,
    /**
    * pending Cancel
    */
    PENDING_CANCEL,
    /**
    * canceled
    */
    CANCELED,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For ZebraFotaDeploymentState values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
