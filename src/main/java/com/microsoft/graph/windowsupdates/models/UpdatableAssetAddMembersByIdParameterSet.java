// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.windowsupdates.models;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.gson.JsonObject;
import java.util.EnumSet;
import java.util.ArrayList;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Updatable Asset Add Members By Id Parameter Set.
 */
public class UpdatableAssetAddMembersByIdParameterSet {
    /**
     * The ids.
     * 
     */
    @SerializedName(value = "ids", alternate = {"Ids"})
    @Expose
	@Nullable
    public java.util.List<String> ids;

    /**
     * The member Entity Type.
     * 
     */
    @SerializedName(value = "memberEntityType", alternate = {"MemberEntityType"})
    @Expose
	@Nullable
    public String memberEntityType;


    /**
     * Instiaciates a new UpdatableAssetAddMembersByIdParameterSet
     */
    public UpdatableAssetAddMembersByIdParameterSet() {}
    /**
     * Instiaciates a new UpdatableAssetAddMembersByIdParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected UpdatableAssetAddMembersByIdParameterSet(@Nonnull final UpdatableAssetAddMembersByIdParameterSetBuilder builder) {
        this.ids = builder.ids;
        this.memberEntityType = builder.memberEntityType;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static UpdatableAssetAddMembersByIdParameterSetBuilder newBuilder() {
        return new UpdatableAssetAddMembersByIdParameterSetBuilder();
    }
    /**
     * Fluent builder for the UpdatableAssetAddMembersByIdParameterSet
     */
    public static final class UpdatableAssetAddMembersByIdParameterSetBuilder {
        /**
         * The ids parameter value
         */
        @Nullable
        protected java.util.List<String> ids;
        /**
         * Sets the Ids
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public UpdatableAssetAddMembersByIdParameterSetBuilder withIds(@Nullable final java.util.List<String> val) {
            this.ids = val;
            return this;
        }
        /**
         * The memberEntityType parameter value
         */
        @Nullable
        protected String memberEntityType;
        /**
         * Sets the MemberEntityType
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public UpdatableAssetAddMembersByIdParameterSetBuilder withMemberEntityType(@Nullable final String val) {
            this.memberEntityType = val;
            return this;
        }
        /**
         * Instanciates a new UpdatableAssetAddMembersByIdParameterSetBuilder
         */
        @Nullable
        protected UpdatableAssetAddMembersByIdParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public UpdatableAssetAddMembersByIdParameterSet build() {
            return new UpdatableAssetAddMembersByIdParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.ids != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("ids", ids));
        }
        if(this.memberEntityType != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("memberEntityType", memberEntityType));
        }
        return result;
    }
}