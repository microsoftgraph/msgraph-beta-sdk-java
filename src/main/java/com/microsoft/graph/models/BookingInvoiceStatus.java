// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Booking Invoice Status.
*/
public enum BookingInvoiceStatus
{
    /**
    * draft
    */
    DRAFT,
    /**
    * reviewing
    */
    REVIEWING,
    /**
    * open
    */
    OPEN,
    /**
    * canceled
    */
    CANCELED,
    /**
    * paid
    */
    PAID,
    /**
    * corrective
    */
    CORRECTIVE,
    /**
    * For BookingInvoiceStatus values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
