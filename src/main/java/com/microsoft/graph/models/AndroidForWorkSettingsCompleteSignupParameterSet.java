// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.gson.JsonObject;
import java.util.EnumSet;
import java.util.ArrayList;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Android For Work Settings Complete Signup Parameter Set.
 */
public class AndroidForWorkSettingsCompleteSignupParameterSet {
    /**
     * The enterprise Token.
     * 
     */
    @SerializedName(value = "enterpriseToken", alternate = {"EnterpriseToken"})
    @Expose
	@Nullable
    public String enterpriseToken;


    /**
     * Instiaciates a new AndroidForWorkSettingsCompleteSignupParameterSet
     */
    public AndroidForWorkSettingsCompleteSignupParameterSet() {}
    /**
     * Instiaciates a new AndroidForWorkSettingsCompleteSignupParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected AndroidForWorkSettingsCompleteSignupParameterSet(@Nonnull final AndroidForWorkSettingsCompleteSignupParameterSetBuilder builder) {
        this.enterpriseToken = builder.enterpriseToken;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static AndroidForWorkSettingsCompleteSignupParameterSetBuilder newBuilder() {
        return new AndroidForWorkSettingsCompleteSignupParameterSetBuilder();
    }
    /**
     * Fluent builder for the AndroidForWorkSettingsCompleteSignupParameterSet
     */
    public static final class AndroidForWorkSettingsCompleteSignupParameterSetBuilder {
        /**
         * The enterpriseToken parameter value
         */
        @Nullable
        protected String enterpriseToken;
        /**
         * Sets the EnterpriseToken
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public AndroidForWorkSettingsCompleteSignupParameterSetBuilder withEnterpriseToken(@Nullable final String val) {
            this.enterpriseToken = val;
            return this;
        }
        /**
         * Instanciates a new AndroidForWorkSettingsCompleteSignupParameterSetBuilder
         */
        @Nullable
        protected AndroidForWorkSettingsCompleteSignupParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public AndroidForWorkSettingsCompleteSignupParameterSet build() {
            return new AndroidForWorkSettingsCompleteSignupParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.enterpriseToken != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("enterpriseToken", enterpriseToken));
        }
        return result;
    }
}
