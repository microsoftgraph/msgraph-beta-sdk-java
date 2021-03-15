// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Group Policy Uploaded Definition File Status.
*/
public enum GroupPolicyUploadedDefinitionFileStatus
{
    /**
    * none
    */
    NONE,
    /**
    * upload In Progress
    */
    UPLOAD_IN_PROGRESS,
    /**
    * available
    */
    AVAILABLE,
    /**
    * assigned
    */
    ASSIGNED,
    /**
    * removal In Progress
    */
    REMOVAL_IN_PROGRESS,
    /**
    * upload Failed
    */
    UPLOAD_FAILED,
    /**
    * removal Failed
    */
    REMOVAL_FAILED,
    /**
    * For GroupPolicyUploadedDefinitionFileStatus values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
