// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.DeviceManagementExchangeAccessLevel;
import com.microsoft.graph.models.DeviceManagementExchangeDeviceClass;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Exchange Access Rule.
 */
public class DeviceManagementExchangeAccessRule implements IJsonBackedObject {

    /** the OData type of the object as returned by the service */
    @SerializedName("@odata.type")
    @Expose
    @Nullable
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    @Nonnull
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Access Level.
     * Access Level for Exchange granted by this rule. Possible values are: none, allow, block, quarantine.
     */
    @SerializedName(value = "accessLevel", alternate = {"AccessLevel"})
    @Expose
	@Nullable
    public DeviceManagementExchangeAccessLevel accessLevel;

    /**
     * The Device Class.
     * Device Class which will be impacted by this rule.
     */
    @SerializedName(value = "deviceClass", alternate = {"DeviceClass"})
    @Expose
	@Nullable
    public DeviceManagementExchangeDeviceClass deviceClass;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
