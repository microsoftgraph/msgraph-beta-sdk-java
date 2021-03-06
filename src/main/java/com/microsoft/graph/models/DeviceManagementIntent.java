// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.models.DeviceManagementIntentAssignment;
import com.microsoft.graph.models.DeviceManagementIntentSettingCategory;
import com.microsoft.graph.models.DeviceManagementIntentDeviceSettingStateSummary;
import com.microsoft.graph.models.DeviceManagementIntentDeviceState;
import com.microsoft.graph.models.DeviceManagementIntentDeviceStateSummary;
import com.microsoft.graph.models.DeviceManagementSettingInstance;
import com.microsoft.graph.models.DeviceManagementIntentUserState;
import com.microsoft.graph.models.DeviceManagementIntentUserStateSummary;
import com.microsoft.graph.models.Entity;
import com.microsoft.graph.requests.DeviceManagementIntentAssignmentCollectionPage;
import com.microsoft.graph.requests.DeviceManagementIntentSettingCategoryCollectionPage;
import com.microsoft.graph.requests.DeviceManagementIntentDeviceSettingStateSummaryCollectionPage;
import com.microsoft.graph.requests.DeviceManagementIntentDeviceStateCollectionPage;
import com.microsoft.graph.requests.DeviceManagementSettingInstanceCollectionPage;
import com.microsoft.graph.requests.DeviceManagementIntentUserStateCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Intent.
 */
public class DeviceManagementIntent extends Entity implements IJsonBackedObject {


    /**
     * The Description.
     * The user given description
     */
    @SerializedName(value = "description", alternate = {"Description"})
    @Expose
	@Nullable
    public String description;

    /**
     * The Display Name.
     * The user given display name
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
	@Nullable
    public String displayName;

    /**
     * The Is Assigned.
     * Signifies whether or not the intent is assigned to users
     */
    @SerializedName(value = "isAssigned", alternate = {"IsAssigned"})
    @Expose
	@Nullable
    public Boolean isAssigned;

    /**
     * The Last Modified Date Time.
     * When the intent was last modified
     */
    @SerializedName(value = "lastModifiedDateTime", alternate = {"LastModifiedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime lastModifiedDateTime;

    /**
     * The Role Scope Tag Ids.
     * List of Scope Tags for this Entity instance.
     */
    @SerializedName(value = "roleScopeTagIds", alternate = {"RoleScopeTagIds"})
    @Expose
	@Nullable
    public java.util.List<String> roleScopeTagIds;

    /**
     * The Template Id.
     * The ID of the template this intent was created from (if any)
     */
    @SerializedName(value = "templateId", alternate = {"TemplateId"})
    @Expose
	@Nullable
    public String templateId;

    /**
     * The Assignments.
     * Collection of assignments
     */
    @SerializedName(value = "assignments", alternate = {"Assignments"})
    @Expose
	@Nullable
    public DeviceManagementIntentAssignmentCollectionPage assignments;

    /**
     * The Categories.
     * Collection of setting categories within the intent
     */
    @SerializedName(value = "categories", alternate = {"Categories"})
    @Expose
	@Nullable
    public DeviceManagementIntentSettingCategoryCollectionPage categories;

    /**
     * The Device Setting State Summaries.
     * Collection of settings and their states and counts of devices that belong to corresponding state for all settings within the intent
     */
    @SerializedName(value = "deviceSettingStateSummaries", alternate = {"DeviceSettingStateSummaries"})
    @Expose
	@Nullable
    public DeviceManagementIntentDeviceSettingStateSummaryCollectionPage deviceSettingStateSummaries;

    /**
     * The Device States.
     * Collection of states of all devices that the intent is applied to
     */
    @SerializedName(value = "deviceStates", alternate = {"DeviceStates"})
    @Expose
	@Nullable
    public DeviceManagementIntentDeviceStateCollectionPage deviceStates;

    /**
     * The Device State Summary.
     * A summary of device states and counts of devices that belong to corresponding state for all devices that the intent is applied to
     */
    @SerializedName(value = "deviceStateSummary", alternate = {"DeviceStateSummary"})
    @Expose
	@Nullable
    public DeviceManagementIntentDeviceStateSummary deviceStateSummary;

    /**
     * The Settings.
     * Collection of all settings to be applied
     */
    @SerializedName(value = "settings", alternate = {"Settings"})
    @Expose
	@Nullable
    public DeviceManagementSettingInstanceCollectionPage settings;

    /**
     * The User States.
     * Collection of states of all users that the intent is applied to
     */
    @SerializedName(value = "userStates", alternate = {"UserStates"})
    @Expose
	@Nullable
    public DeviceManagementIntentUserStateCollectionPage userStates;

    /**
     * The User State Summary.
     * A summary of user states and counts of users that belong to corresponding state for all users that the intent is applied to
     */
    @SerializedName(value = "userStateSummary", alternate = {"UserStateSummary"})
    @Expose
	@Nullable
    public DeviceManagementIntentUserStateSummary userStateSummary;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("assignments")) {
            assignments = serializer.deserializeObject(json.get("assignments"), DeviceManagementIntentAssignmentCollectionPage.class);
        }

        if (json.has("categories")) {
            categories = serializer.deserializeObject(json.get("categories"), DeviceManagementIntentSettingCategoryCollectionPage.class);
        }

        if (json.has("deviceSettingStateSummaries")) {
            deviceSettingStateSummaries = serializer.deserializeObject(json.get("deviceSettingStateSummaries"), DeviceManagementIntentDeviceSettingStateSummaryCollectionPage.class);
        }

        if (json.has("deviceStates")) {
            deviceStates = serializer.deserializeObject(json.get("deviceStates"), DeviceManagementIntentDeviceStateCollectionPage.class);
        }

        if (json.has("settings")) {
            settings = serializer.deserializeObject(json.get("settings"), DeviceManagementSettingInstanceCollectionPage.class);
        }

        if (json.has("userStates")) {
            userStates = serializer.deserializeObject(json.get("userStates"), DeviceManagementIntentUserStateCollectionPage.class);
        }
    }
}
