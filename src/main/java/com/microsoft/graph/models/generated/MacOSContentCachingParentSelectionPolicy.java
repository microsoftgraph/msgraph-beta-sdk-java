// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.generated;


/**
 * The Enum Mac OSContent Caching Parent Selection Policy.
*/
public enum MacOSContentCachingParentSelectionPolicy
{
    /**
    * not Configured
    */
    NOT_CONFIGURED,
    /**
    * round Robin
    */
    ROUND_ROBIN,
    /**
    * first Available
    */
    FIRST_AVAILABLE,
    /**
    * url Path Hash
    */
    URL_PATH_HASH,
    /**
    * random
    */
    RANDOM,
    /**
    * sticky Available
    */
    STICKY_AVAILABLE,
    /**
    * For MacOSContentCachingParentSelectionPolicy values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
