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
 * The class for the Sales Invoice Post Parameter Set.
 */
public class SalesInvoicePostParameterSet {

    /**
     * Instiaciates a new SalesInvoicePostParameterSet
     */
    public SalesInvoicePostParameterSet() {}
    /**
     * Instiaciates a new SalesInvoicePostParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected SalesInvoicePostParameterSet(@Nonnull final SalesInvoicePostParameterSetBuilder builder) {
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static SalesInvoicePostParameterSetBuilder newBuilder() {
        return new SalesInvoicePostParameterSetBuilder();
    }
    /**
     * Fluent builder for the SalesInvoicePostParameterSet
     */
    public static final class SalesInvoicePostParameterSetBuilder {
        /**
         * Instanciates a new SalesInvoicePostParameterSetBuilder
         */
        @Nullable
        protected SalesInvoicePostParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public SalesInvoicePostParameterSet build() {
            return new SalesInvoicePostParameterSet(this);
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
