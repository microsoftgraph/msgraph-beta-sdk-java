// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;

import com.microsoft.graph.models.GroupPolicyConfigurationAssignment;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.gson.JsonObject;
import java.util.EnumSet;
import java.util.ArrayList;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Group Policy Configuration Assign Parameter Set.
 */
public class GroupPolicyConfigurationAssignParameterSet {
    /**
     * The assignments.
     * 
     */
    @SerializedName(value = "assignments", alternate = {"Assignments"})
    @Expose
	@Nullable
    public java.util.List<GroupPolicyConfigurationAssignment> assignments;


    /**
     * Instiaciates a new GroupPolicyConfigurationAssignParameterSet
     */
    public GroupPolicyConfigurationAssignParameterSet() {}
    /**
     * Instiaciates a new GroupPolicyConfigurationAssignParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected GroupPolicyConfigurationAssignParameterSet(@Nonnull final GroupPolicyConfigurationAssignParameterSetBuilder builder) {
        this.assignments = builder.assignments;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static GroupPolicyConfigurationAssignParameterSetBuilder newBuilder() {
        return new GroupPolicyConfigurationAssignParameterSetBuilder();
    }
    /**
     * Fluent builder for the GroupPolicyConfigurationAssignParameterSet
     */
    public static final class GroupPolicyConfigurationAssignParameterSetBuilder {
        /**
         * The assignments parameter value
         */
        @Nullable
        protected java.util.List<GroupPolicyConfigurationAssignment> assignments;
        /**
         * Sets the Assignments
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public GroupPolicyConfigurationAssignParameterSetBuilder withAssignments(@Nullable final java.util.List<GroupPolicyConfigurationAssignment> val) {
            this.assignments = val;
            return this;
        }
        /**
         * Instanciates a new GroupPolicyConfigurationAssignParameterSetBuilder
         */
        @Nullable
        protected GroupPolicyConfigurationAssignParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public GroupPolicyConfigurationAssignParameterSet build() {
            return new GroupPolicyConfigurationAssignParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.assignments != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("assignments", assignments));
        }
        return result;
    }
}
