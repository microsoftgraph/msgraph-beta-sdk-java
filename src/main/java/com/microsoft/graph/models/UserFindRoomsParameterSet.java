// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;

import com.microsoft.graph.models.EmailAddress;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.gson.JsonObject;
import java.util.EnumSet;
import java.util.ArrayList;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Find Rooms Parameter Set.
 */
public class UserFindRoomsParameterSet {
    /**
     * The room List.
     * 
     */
    @SerializedName(value = "roomList", alternate = {"RoomList"})
    @Expose
	@Nullable
    public String roomList;


    /**
     * Instiaciates a new UserFindRoomsParameterSet
     */
    public UserFindRoomsParameterSet() {}
    /**
     * Instiaciates a new UserFindRoomsParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected UserFindRoomsParameterSet(@Nonnull final UserFindRoomsParameterSetBuilder builder) {
        this.roomList = builder.roomList;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static UserFindRoomsParameterSetBuilder newBuilder() {
        return new UserFindRoomsParameterSetBuilder();
    }
    /**
     * Fluent builder for the UserFindRoomsParameterSet
     */
    public static final class UserFindRoomsParameterSetBuilder {
        /**
         * The roomList parameter value
         */
        @Nullable
        protected String roomList;
        /**
         * Sets the RoomList
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public UserFindRoomsParameterSetBuilder withRoomList(@Nullable final String val) {
            this.roomList = val;
            return this;
        }
        /**
         * Instanciates a new UserFindRoomsParameterSetBuilder
         */
        @Nullable
        protected UserFindRoomsParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public UserFindRoomsParameterSet build() {
            return new UserFindRoomsParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.roomList != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("roomList", roomList));
        }
        return result;
    }
}
