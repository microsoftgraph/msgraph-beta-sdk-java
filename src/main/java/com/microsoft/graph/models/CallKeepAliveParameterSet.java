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
 * The class for the Call Keep Alive Parameter Set.
 */
public class CallKeepAliveParameterSet {

    /**
     * Instiaciates a new CallKeepAliveParameterSet
     */
    public CallKeepAliveParameterSet() {}
    /**
     * Instiaciates a new CallKeepAliveParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected CallKeepAliveParameterSet(@Nonnull final CallKeepAliveParameterSetBuilder builder) {
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static CallKeepAliveParameterSetBuilder newBuilder() {
        return new CallKeepAliveParameterSetBuilder();
    }
    /**
     * Fluent builder for the CallKeepAliveParameterSet
     */
    public static final class CallKeepAliveParameterSetBuilder {
        /**
         * Instanciates a new CallKeepAliveParameterSetBuilder
         */
        @Nullable
        protected CallKeepAliveParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public CallKeepAliveParameterSet build() {
            return new CallKeepAliveParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        return result;
    }
}
