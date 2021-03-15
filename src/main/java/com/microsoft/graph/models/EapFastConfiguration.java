// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Eap Fast Configuration.
*/
public enum EapFastConfiguration
{
    /**
    * no Protected Access Credential
    */
    NO_PROTECTED_ACCESS_CREDENTIAL,
    /**
    * use Protected Access Credential
    */
    USE_PROTECTED_ACCESS_CREDENTIAL,
    /**
    * use Protected Access Credential And Provision
    */
    USE_PROTECTED_ACCESS_CREDENTIAL_AND_PROVISION,
    /**
    * use Protected Access Credential And Provision Anonymously
    */
    USE_PROTECTED_ACCESS_CREDENTIAL_AND_PROVISION_ANONYMOUSLY,
    /**
    * For EapFastConfiguration values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
