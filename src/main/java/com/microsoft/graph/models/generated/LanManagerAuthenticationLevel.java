// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.generated;


/**
 * The Enum Lan Manager Authentication Level.
*/
public enum LanManagerAuthenticationLevel
{
    /**
    * lm And Nltm
    */
    LM_AND_NLTM,
    /**
    * lm Ntlm And Ntlm V2
    */
    LM_NTLM_AND_NTLM_V2,
    /**
    * lm And Ntlm Only
    */
    LM_AND_NTLM_ONLY,
    /**
    * lm And Ntlm V2
    */
    LM_AND_NTLM_V2,
    /**
    * lm Ntlm V2And Not Lm
    */
    LM_NTLM_V2_AND_NOT_LM,
    /**
    * lm Ntlm V2And Not Lm Or Ntm
    */
    LM_NTLM_V2_AND_NOT_LM_OR_NTM,
    /**
    * For LanManagerAuthenticationLevel values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
