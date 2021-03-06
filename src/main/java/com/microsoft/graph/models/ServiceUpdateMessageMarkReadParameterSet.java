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
 * The class for the Service Update Message Mark Read Parameter Set.
 */
public class ServiceUpdateMessageMarkReadParameterSet {
    /**
     * The message Ids.
     * 
     */
    @SerializedName(value = "messageIds", alternate = {"MessageIds"})
    @Expose
	@Nullable
    public java.util.List<String> messageIds;


    /**
     * Instiaciates a new ServiceUpdateMessageMarkReadParameterSet
     */
    public ServiceUpdateMessageMarkReadParameterSet() {}
    /**
     * Instiaciates a new ServiceUpdateMessageMarkReadParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected ServiceUpdateMessageMarkReadParameterSet(@Nonnull final ServiceUpdateMessageMarkReadParameterSetBuilder builder) {
        this.messageIds = builder.messageIds;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static ServiceUpdateMessageMarkReadParameterSetBuilder newBuilder() {
        return new ServiceUpdateMessageMarkReadParameterSetBuilder();
    }
    /**
     * Fluent builder for the ServiceUpdateMessageMarkReadParameterSet
     */
    public static final class ServiceUpdateMessageMarkReadParameterSetBuilder {
        /**
         * The messageIds parameter value
         */
        @Nullable
        protected java.util.List<String> messageIds;
        /**
         * Sets the MessageIds
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public ServiceUpdateMessageMarkReadParameterSetBuilder withMessageIds(@Nullable final java.util.List<String> val) {
            this.messageIds = val;
            return this;
        }
        /**
         * Instanciates a new ServiceUpdateMessageMarkReadParameterSetBuilder
         */
        @Nullable
        protected ServiceUpdateMessageMarkReadParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public ServiceUpdateMessageMarkReadParameterSet build() {
            return new ServiceUpdateMessageMarkReadParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.messageIds != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("messageIds", messageIds));
        }
        return result;
    }
}
