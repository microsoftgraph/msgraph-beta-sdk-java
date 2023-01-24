// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Booking Staff Membership Status.
*/
public enum BookingStaffMembershipStatus
{
    /**
    * active
    */
    ACTIVE,
    /**
    * pending Acceptance
    */
    PENDING_ACCEPTANCE,
    /**
    * rejected By Staff
    */
    REJECTED_BY_STAFF,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For BookingStaffMembershipStatus values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
