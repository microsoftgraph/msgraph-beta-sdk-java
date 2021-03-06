// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.SharedPCAccountDeletionPolicyType;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Shared PCAccount Manager Policy.
 */
public class SharedPCAccountManagerPolicy implements IJsonBackedObject {

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
     * The Account Deletion Policy.
     * Configures when accounts are deleted. Possible values are: immediate, diskSpaceThreshold, diskSpaceThresholdOrInactiveThreshold.
     */
    @SerializedName(value = "accountDeletionPolicy", alternate = {"AccountDeletionPolicy"})
    @Expose
	@Nullable
    public SharedPCAccountDeletionPolicyType accountDeletionPolicy;

    /**
     * The Cache Accounts Above Disk Free Percentage.
     * Sets the percentage of available disk space a PC should have before it stops deleting cached shared PC accounts. Only applies when AccountDeletionPolicy is DiskSpaceThreshold or DiskSpaceThresholdOrInactiveThreshold. Valid values 0 to 100
     */
    @SerializedName(value = "cacheAccountsAboveDiskFreePercentage", alternate = {"CacheAccountsAboveDiskFreePercentage"})
    @Expose
	@Nullable
    public Integer cacheAccountsAboveDiskFreePercentage;

    /**
     * The Inactive Threshold Days.
     * Specifies when the accounts will start being deleted when they have not been logged on during the specified period, given as number of days. Only applies when AccountDeletionPolicy is DiskSpaceThreshold or DiskSpaceThresholdOrInactiveThreshold.
     */
    @SerializedName(value = "inactiveThresholdDays", alternate = {"InactiveThresholdDays"})
    @Expose
	@Nullable
    public Integer inactiveThresholdDays;

    /**
     * The Remove Accounts Below Disk Free Percentage.
     * Sets the percentage of disk space remaining on a PC before cached accounts will be deleted to free disk space. Accounts that have been inactive the longest will be deleted first. Only applies when AccountDeletionPolicy is DiskSpaceThresholdOrInactiveThreshold. Valid values 0 to 100
     */
    @SerializedName(value = "removeAccountsBelowDiskFreePercentage", alternate = {"RemoveAccountsBelowDiskFreePercentage"})
    @Expose
	@Nullable
    public Integer removeAccountsBelowDiskFreePercentage;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
