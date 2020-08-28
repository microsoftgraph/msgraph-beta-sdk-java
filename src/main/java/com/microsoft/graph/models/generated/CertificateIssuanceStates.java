// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.generated;


/**
 * The Enum Certificate Issuance States.
*/
public enum CertificateIssuanceStates
{
    /**
    * unknown
    */
    UNKNOWN,
    /**
    * challenge Issued
    */
    CHALLENGE_ISSUED,
    /**
    * challenge Issue Failed
    */
    CHALLENGE_ISSUE_FAILED,
    /**
    * request Creation Failed
    */
    REQUEST_CREATION_FAILED,
    /**
    * request Submit Failed
    */
    REQUEST_SUBMIT_FAILED,
    /**
    * challenge Validation Succeeded
    */
    CHALLENGE_VALIDATION_SUCCEEDED,
    /**
    * challenge Validation Failed
    */
    CHALLENGE_VALIDATION_FAILED,
    /**
    * issue Failed
    */
    ISSUE_FAILED,
    /**
    * issue Pending
    */
    ISSUE_PENDING,
    /**
    * issued
    */
    ISSUED,
    /**
    * response Processing Failed
    */
    RESPONSE_PROCESSING_FAILED,
    /**
    * response Pending
    */
    RESPONSE_PENDING,
    /**
    * enrollment Succeeded
    */
    ENROLLMENT_SUCCEEDED,
    /**
    * enrollment Not Needed
    */
    ENROLLMENT_NOT_NEEDED,
    /**
    * revoked
    */
    REVOKED,
    /**
    * removed From Collection
    */
    REMOVED_FROM_COLLECTION,
    /**
    * renew Verified
    */
    RENEW_VERIFIED,
    /**
    * install Failed
    */
    INSTALL_FAILED,
    /**
    * installed
    */
    INSTALLED,
    /**
    * delete Failed
    */
    DELETE_FAILED,
    /**
    * deleted
    */
    DELETED,
    /**
    * renewal Requested
    */
    RENEWAL_REQUESTED,
    /**
    * requested
    */
    REQUESTED,
    /**
    * For CertificateIssuanceStates values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
