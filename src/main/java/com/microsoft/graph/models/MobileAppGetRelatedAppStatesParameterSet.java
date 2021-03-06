// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;

import com.microsoft.graph.models.MobileAppRelationshipState;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.gson.JsonObject;
import java.util.EnumSet;
import java.util.ArrayList;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mobile App Get Related App States Parameter Set.
 */
public class MobileAppGetRelatedAppStatesParameterSet {
    /**
     * The user Principal Name.
     * 
     */
    @SerializedName(value = "userPrincipalName", alternate = {"UserPrincipalName"})
    @Expose
	@Nullable
    public String userPrincipalName;

    /**
     * The device Id.
     * 
     */
    @SerializedName(value = "deviceId", alternate = {"DeviceId"})
    @Expose
	@Nullable
    public String deviceId;


    /**
     * Instiaciates a new MobileAppGetRelatedAppStatesParameterSet
     */
    public MobileAppGetRelatedAppStatesParameterSet() {}
    /**
     * Instiaciates a new MobileAppGetRelatedAppStatesParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected MobileAppGetRelatedAppStatesParameterSet(@Nonnull final MobileAppGetRelatedAppStatesParameterSetBuilder builder) {
        this.userPrincipalName = builder.userPrincipalName;
        this.deviceId = builder.deviceId;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static MobileAppGetRelatedAppStatesParameterSetBuilder newBuilder() {
        return new MobileAppGetRelatedAppStatesParameterSetBuilder();
    }
    /**
     * Fluent builder for the MobileAppGetRelatedAppStatesParameterSet
     */
    public static final class MobileAppGetRelatedAppStatesParameterSetBuilder {
        /**
         * The userPrincipalName parameter value
         */
        @Nullable
        protected String userPrincipalName;
        /**
         * Sets the UserPrincipalName
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public MobileAppGetRelatedAppStatesParameterSetBuilder withUserPrincipalName(@Nullable final String val) {
            this.userPrincipalName = val;
            return this;
        }
        /**
         * The deviceId parameter value
         */
        @Nullable
        protected String deviceId;
        /**
         * Sets the DeviceId
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public MobileAppGetRelatedAppStatesParameterSetBuilder withDeviceId(@Nullable final String val) {
            this.deviceId = val;
            return this;
        }
        /**
         * Instanciates a new MobileAppGetRelatedAppStatesParameterSetBuilder
         */
        @Nullable
        protected MobileAppGetRelatedAppStatesParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public MobileAppGetRelatedAppStatesParameterSet build() {
            return new MobileAppGetRelatedAppStatesParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.userPrincipalName != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("userPrincipalName", userPrincipalName));
        }
        if(this.deviceId != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("deviceId", deviceId));
        }
        return result;
    }
}
