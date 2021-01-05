// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.generated;


/**
 * The Enum Mobile App Intent.
*/
public enum MobileAppIntent
{
    /**
    * available
    */
    AVAILABLE,
    /**
    * not Available
    */
    NOT_AVAILABLE,
    /**
    * required Install
    */
    REQUIRED_INSTALL,
    /**
    * required Uninstall
    */
    REQUIRED_UNINSTALL,
    /**
    * required And Available Install
    */
    REQUIRED_AND_AVAILABLE_INSTALL,
    /**
    * available Install Without Enrollment
    */
    AVAILABLE_INSTALL_WITHOUT_ENROLLMENT,
    /**
    * exclude
    */
    EXCLUDE,
    /**
    * For MobileAppIntent values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
