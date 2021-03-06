// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.managedtenants.models;

import com.microsoft.graph.managedtenants.models.TenantTag;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.gson.JsonObject;
import java.util.EnumSet;
import java.util.ArrayList;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Tenant Tag Assign Tag Parameter Set.
 */
public class TenantTagAssignTagParameterSet {
    /**
     * The tenant Ids.
     * 
     */
    @SerializedName(value = "tenantIds", alternate = {"TenantIds"})
    @Expose
	@Nullable
    public java.util.List<String> tenantIds;


    /**
     * Instiaciates a new TenantTagAssignTagParameterSet
     */
    public TenantTagAssignTagParameterSet() {}
    /**
     * Instiaciates a new TenantTagAssignTagParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected TenantTagAssignTagParameterSet(@Nonnull final TenantTagAssignTagParameterSetBuilder builder) {
        this.tenantIds = builder.tenantIds;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static TenantTagAssignTagParameterSetBuilder newBuilder() {
        return new TenantTagAssignTagParameterSetBuilder();
    }
    /**
     * Fluent builder for the TenantTagAssignTagParameterSet
     */
    public static final class TenantTagAssignTagParameterSetBuilder {
        /**
         * The tenantIds parameter value
         */
        @Nullable
        protected java.util.List<String> tenantIds;
        /**
         * Sets the TenantIds
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public TenantTagAssignTagParameterSetBuilder withTenantIds(@Nullable final java.util.List<String> val) {
            this.tenantIds = val;
            return this;
        }
        /**
         * Instanciates a new TenantTagAssignTagParameterSetBuilder
         */
        @Nullable
        protected TenantTagAssignTagParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public TenantTagAssignTagParameterSet build() {
            return new TenantTagAssignTagParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.tenantIds != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("tenantIds", tenantIds));
        }
        return result;
    }
}
