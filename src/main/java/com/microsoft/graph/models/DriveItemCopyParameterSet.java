// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;

import com.microsoft.graph.models.ItemReference;
import com.microsoft.graph.models.DriveItem;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.gson.JsonObject;
import java.util.EnumSet;
import java.util.ArrayList;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Drive Item Copy Parameter Set.
 */
public class DriveItemCopyParameterSet {
    /**
     * The name.
     * 
     */
    @SerializedName(value = "name", alternate = {"Name"})
    @Expose
	@Nullable
    public String name;

    /**
     * The parent Reference.
     * 
     */
    @SerializedName(value = "parentReference", alternate = {"ParentReference"})
    @Expose
	@Nullable
    public ItemReference parentReference;


    /**
     * Instiaciates a new DriveItemCopyParameterSet
     */
    public DriveItemCopyParameterSet() {}
    /**
     * Instiaciates a new DriveItemCopyParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected DriveItemCopyParameterSet(@Nonnull final DriveItemCopyParameterSetBuilder builder) {
        this.name = builder.name;
        this.parentReference = builder.parentReference;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static DriveItemCopyParameterSetBuilder newBuilder() {
        return new DriveItemCopyParameterSetBuilder();
    }
    /**
     * Fluent builder for the DriveItemCopyParameterSet
     */
    public static final class DriveItemCopyParameterSetBuilder {
        /**
         * The name parameter value
         */
        @Nullable
        protected String name;
        /**
         * Sets the Name
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public DriveItemCopyParameterSetBuilder withName(@Nullable final String val) {
            this.name = val;
            return this;
        }
        /**
         * The parentReference parameter value
         */
        @Nullable
        protected ItemReference parentReference;
        /**
         * Sets the ParentReference
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public DriveItemCopyParameterSetBuilder withParentReference(@Nullable final ItemReference val) {
            this.parentReference = val;
            return this;
        }
        /**
         * Instanciates a new DriveItemCopyParameterSetBuilder
         */
        @Nullable
        protected DriveItemCopyParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public DriveItemCopyParameterSet build() {
            return new DriveItemCopyParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.name != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("name", name));
        }
        if(this.parentReference != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("parentReference", parentReference));
        }
        return result;
    }
}
