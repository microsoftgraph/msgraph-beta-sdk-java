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
import com.microsoft.graph.models.UserIdentity;
import com.microsoft.graph.models.AccessReviewHistoryDecisionFilter;
import com.microsoft.graph.models.AccessReviewScope;
import com.microsoft.graph.models.AccessReviewHistoryStatus;
import com.microsoft.graph.models.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Access Review History Definition.
 */
public class AccessReviewHistoryDefinition extends Entity implements IJsonBackedObject {


    /**
     * The Created By.
     * 
     */
    @SerializedName(value = "createdBy", alternate = {"CreatedBy"})
    @Expose
	@Nullable
    public UserIdentity createdBy;

    /**
     * The Created Date Time.
     * 
     */
    @SerializedName(value = "createdDateTime", alternate = {"CreatedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime createdDateTime;

    /**
     * The Decisions.
     * 
     */
    @SerializedName(value = "decisions", alternate = {"Decisions"})
    @Expose
	@Nullable
    public java.util.List<AccessReviewHistoryDecisionFilter> decisions;

    /**
     * The Display Name.
     * 
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
	@Nullable
    public String displayName;

    /**
     * The Download Uri.
     * 
     */
    @SerializedName(value = "downloadUri", alternate = {"DownloadUri"})
    @Expose
	@Nullable
    public String downloadUri;

    /**
     * The Fulfilled Date Time.
     * 
     */
    @SerializedName(value = "fulfilledDateTime", alternate = {"FulfilledDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime fulfilledDateTime;

    /**
     * The Review History Period End Date Time.
     * 
     */
    @SerializedName(value = "reviewHistoryPeriodEndDateTime", alternate = {"ReviewHistoryPeriodEndDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime reviewHistoryPeriodEndDateTime;

    /**
     * The Review History Period Start Date Time.
     * 
     */
    @SerializedName(value = "reviewHistoryPeriodStartDateTime", alternate = {"ReviewHistoryPeriodStartDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime reviewHistoryPeriodStartDateTime;

    /**
     * The Scopes.
     * 
     */
    @SerializedName(value = "scopes", alternate = {"Scopes"})
    @Expose
	@Nullable
    public java.util.List<AccessReviewScope> scopes;

    /**
     * The Status.
     * 
     */
    @SerializedName(value = "status", alternate = {"Status"})
    @Expose
	@Nullable
    public AccessReviewHistoryStatus status;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}