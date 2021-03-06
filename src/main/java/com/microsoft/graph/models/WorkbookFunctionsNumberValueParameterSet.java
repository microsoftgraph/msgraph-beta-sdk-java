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
 * The class for the Workbook Functions Number Value Parameter Set.
 */
public class WorkbookFunctionsNumberValueParameterSet {
    /**
     * The text.
     * 
     */
    @SerializedName(value = "text", alternate = {"Text"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement text;

    /**
     * The decimal Separator.
     * 
     */
    @SerializedName(value = "decimalSeparator", alternate = {"DecimalSeparator"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement decimalSeparator;

    /**
     * The group Separator.
     * 
     */
    @SerializedName(value = "groupSeparator", alternate = {"GroupSeparator"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement groupSeparator;


    /**
     * Instiaciates a new WorkbookFunctionsNumberValueParameterSet
     */
    public WorkbookFunctionsNumberValueParameterSet() {}
    /**
     * Instiaciates a new WorkbookFunctionsNumberValueParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected WorkbookFunctionsNumberValueParameterSet(@Nonnull final WorkbookFunctionsNumberValueParameterSetBuilder builder) {
        this.text = builder.text;
        this.decimalSeparator = builder.decimalSeparator;
        this.groupSeparator = builder.groupSeparator;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static WorkbookFunctionsNumberValueParameterSetBuilder newBuilder() {
        return new WorkbookFunctionsNumberValueParameterSetBuilder();
    }
    /**
     * Fluent builder for the WorkbookFunctionsNumberValueParameterSet
     */
    public static final class WorkbookFunctionsNumberValueParameterSetBuilder {
        /**
         * The text parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement text;
        /**
         * Sets the Text
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsNumberValueParameterSetBuilder withText(@Nullable final com.google.gson.JsonElement val) {
            this.text = val;
            return this;
        }
        /**
         * The decimalSeparator parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement decimalSeparator;
        /**
         * Sets the DecimalSeparator
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsNumberValueParameterSetBuilder withDecimalSeparator(@Nullable final com.google.gson.JsonElement val) {
            this.decimalSeparator = val;
            return this;
        }
        /**
         * The groupSeparator parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement groupSeparator;
        /**
         * Sets the GroupSeparator
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsNumberValueParameterSetBuilder withGroupSeparator(@Nullable final com.google.gson.JsonElement val) {
            this.groupSeparator = val;
            return this;
        }
        /**
         * Instanciates a new WorkbookFunctionsNumberValueParameterSetBuilder
         */
        @Nullable
        protected WorkbookFunctionsNumberValueParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public WorkbookFunctionsNumberValueParameterSet build() {
            return new WorkbookFunctionsNumberValueParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.text != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("text", text));
        }
        if(this.decimalSeparator != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("decimalSeparator", decimalSeparator));
        }
        if(this.groupSeparator != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("groupSeparator", groupSeparator));
        }
        return result;
    }
}
