// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;

import com.microsoft.graph.models.EvaluateDynamicMembershipResult;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.gson.JsonObject;
import java.util.EnumSet;
import java.util.ArrayList;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Group Evaluate Dynamic Membership Parameter Set.
 */
public class GroupEvaluateDynamicMembershipParameterSet {
    /**
     * The member Id.
     * 
     */
    @SerializedName(value = "memberId", alternate = {"MemberId"})
    @Expose
	@Nullable
    public String memberId;

    /**
     * The membership Rule.
     * 
     */
    @SerializedName(value = "membershipRule", alternate = {"MembershipRule"})
    @Expose
	@Nullable
    public String membershipRule;


    /**
     * Instiaciates a new GroupEvaluateDynamicMembershipParameterSet
     */
    public GroupEvaluateDynamicMembershipParameterSet() {}
    /**
     * Instiaciates a new GroupEvaluateDynamicMembershipParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected GroupEvaluateDynamicMembershipParameterSet(@Nonnull final GroupEvaluateDynamicMembershipParameterSetBuilder builder) {
        this.memberId = builder.memberId;
        this.membershipRule = builder.membershipRule;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static GroupEvaluateDynamicMembershipParameterSetBuilder newBuilder() {
        return new GroupEvaluateDynamicMembershipParameterSetBuilder();
    }
    /**
     * Fluent builder for the GroupEvaluateDynamicMembershipParameterSet
     */
    public static final class GroupEvaluateDynamicMembershipParameterSetBuilder {
        /**
         * The memberId parameter value
         */
        @Nullable
        protected String memberId;
        /**
         * Sets the MemberId
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public GroupEvaluateDynamicMembershipParameterSetBuilder withMemberId(@Nullable final String val) {
            this.memberId = val;
            return this;
        }
        /**
         * The membershipRule parameter value
         */
        @Nullable
        protected String membershipRule;
        /**
         * Sets the MembershipRule
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public GroupEvaluateDynamicMembershipParameterSetBuilder withMembershipRule(@Nullable final String val) {
            this.membershipRule = val;
            return this;
        }
        /**
         * Instanciates a new GroupEvaluateDynamicMembershipParameterSetBuilder
         */
        @Nullable
        protected GroupEvaluateDynamicMembershipParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public GroupEvaluateDynamicMembershipParameterSet build() {
            return new GroupEvaluateDynamicMembershipParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.memberId != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("memberId", memberId));
        }
        if(this.membershipRule != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("membershipRule", membershipRule));
        }
        return result;
    }
}
