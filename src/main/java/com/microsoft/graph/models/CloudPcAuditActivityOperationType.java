// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Cloud Pc Audit Activity Operation Type.
*/
public enum CloudPcAuditActivityOperationType
{
    /**
    * create
    */
    CREATE,
    /**
    * delete
    */
    DELETE,
    /**
    * patch
    */
    PATCH,
    /**
    * other
    */
    OTHER,
    /**
    * For CloudPcAuditActivityOperationType values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
