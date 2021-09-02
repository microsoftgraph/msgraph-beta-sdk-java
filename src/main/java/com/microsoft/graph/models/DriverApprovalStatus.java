// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Driver Approval Status.
*/
public enum DriverApprovalStatus
{
    /**
    * needs Review
    */
    NEEDS_REVIEW,
    /**
    * declined
    */
    DECLINED,
    /**
    * approved
    */
    APPROVED,
    /**
    * suspended
    */
    SUSPENDED,
    /**
    * For DriverApprovalStatus values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
