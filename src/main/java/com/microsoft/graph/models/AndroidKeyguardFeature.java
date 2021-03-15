// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Android Keyguard Feature.
*/
public enum AndroidKeyguardFeature
{
    /**
    * not Configured
    */
    NOT_CONFIGURED,
    /**
    * camera
    */
    CAMERA,
    /**
    * notifications
    */
    NOTIFICATIONS,
    /**
    * unredacted Notifications
    */
    UNREDACTED_NOTIFICATIONS,
    /**
    * trust Agents
    */
    TRUST_AGENTS,
    /**
    * fingerprint
    */
    FINGERPRINT,
    /**
    * remote Input
    */
    REMOTE_INPUT,
    /**
    * all Features
    */
    ALL_FEATURES,
    /**
    * For AndroidKeyguardFeature values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
