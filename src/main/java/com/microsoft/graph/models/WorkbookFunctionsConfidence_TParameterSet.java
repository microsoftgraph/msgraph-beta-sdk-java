// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;

import com.microsoft.graph.models.WorkbookFunctionResult;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.gson.JsonObject;
import java.util.EnumSet;
import java.util.ArrayList;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Functions Confidence_TParameter Set.
 */
public class WorkbookFunctionsConfidence_TParameterSet {
    /**
     * The alpha.
     * 
     */
    @SerializedName(value = "alpha", alternate = {"Alpha"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement alpha;

    /**
     * The standard Dev.
     * 
     */
    @SerializedName(value = "standardDev", alternate = {"StandardDev"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement standardDev;

    /**
     * The size.
     * 
     */
    @SerializedName(value = "size", alternate = {"Size"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement size;


    /**
     * Instiaciates a new WorkbookFunctionsConfidence_TParameterSet
     */
    public WorkbookFunctionsConfidence_TParameterSet() {}
    /**
     * Instiaciates a new WorkbookFunctionsConfidence_TParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected WorkbookFunctionsConfidence_TParameterSet(@Nonnull final WorkbookFunctionsConfidence_TParameterSetBuilder builder) {
        this.alpha = builder.alpha;
        this.standardDev = builder.standardDev;
        this.size = builder.size;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static WorkbookFunctionsConfidence_TParameterSetBuilder newBuilder() {
        return new WorkbookFunctionsConfidence_TParameterSetBuilder();
    }
    /**
     * Fluent builder for the WorkbookFunctionsConfidence_TParameterSet
     */
    public static final class WorkbookFunctionsConfidence_TParameterSetBuilder {
        /**
         * The alpha parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement alpha;
        /**
         * Sets the Alpha
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsConfidence_TParameterSetBuilder withAlpha(@Nullable final com.google.gson.JsonElement val) {
            this.alpha = val;
            return this;
        }
        /**
         * The standardDev parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement standardDev;
        /**
         * Sets the StandardDev
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsConfidence_TParameterSetBuilder withStandardDev(@Nullable final com.google.gson.JsonElement val) {
            this.standardDev = val;
            return this;
        }
        /**
         * The size parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement size;
        /**
         * Sets the Size
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsConfidence_TParameterSetBuilder withSize(@Nullable final com.google.gson.JsonElement val) {
            this.size = val;
            return this;
        }
        /**
         * Instanciates a new WorkbookFunctionsConfidence_TParameterSetBuilder
         */
        @Nullable
        protected WorkbookFunctionsConfidence_TParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public WorkbookFunctionsConfidence_TParameterSet build() {
            return new WorkbookFunctionsConfidence_TParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.alpha != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("alpha", alpha));
        }
        if(this.standardDev != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("standardDev", standardDev));
        }
        if(this.size != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("size", size));
        }
        return result;
    }
}
