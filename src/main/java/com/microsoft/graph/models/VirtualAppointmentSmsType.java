// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Virtual Appointment Sms Type.
*/
public enum VirtualAppointmentSmsType
{
    /**
    * confirmation
    */
    CONFIRMATION,
    /**
    * reschedule
    */
    RESCHEDULE,
    /**
    * cancellation
    */
    CANCELLATION,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For VirtualAppointmentSmsType values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
