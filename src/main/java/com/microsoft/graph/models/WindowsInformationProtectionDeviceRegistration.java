// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Information Protection Device Registration.
 */
public class WindowsInformationProtectionDeviceRegistration extends Entity implements IJsonBackedObject {


    /**
     * The Device Mac Address.
     * Device Mac address.
     */
    @SerializedName(value = "deviceMacAddress", alternate = {"DeviceMacAddress"})
    @Expose
	@Nullable
    public String deviceMacAddress;

    /**
     * The Device Name.
     * Device name.
     */
    @SerializedName(value = "deviceName", alternate = {"DeviceName"})
    @Expose
	@Nullable
    public String deviceName;

    /**
     * The Device Registration Id.
     * Device identifier for this device registration record.
     */
    @SerializedName(value = "deviceRegistrationId", alternate = {"DeviceRegistrationId"})
    @Expose
	@Nullable
    public String deviceRegistrationId;

    /**
     * The Device Type.
     * Device type, for example, Windows laptop VS Windows phone.
     */
    @SerializedName(value = "deviceType", alternate = {"DeviceType"})
    @Expose
	@Nullable
    public String deviceType;

    /**
     * The Last Check In Date Time.
     * Last checkin time of the device.
     */
    @SerializedName(value = "lastCheckInDateTime", alternate = {"LastCheckInDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime lastCheckInDateTime;

    /**
     * The User Id.
     * UserId associated with this device registration record.
     */
    @SerializedName(value = "userId", alternate = {"UserId"})
    @Expose
	@Nullable
    public String userId;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
