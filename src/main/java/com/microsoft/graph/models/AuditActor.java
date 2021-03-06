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
import com.microsoft.graph.models.RoleScopeTagInfo;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Audit Actor.
 */
public class AuditActor implements IJsonBackedObject {

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
     * The Application Display Name.
     * Name of the Application.
     */
    @SerializedName(value = "applicationDisplayName", alternate = {"ApplicationDisplayName"})
    @Expose
	@Nullable
    public String applicationDisplayName;

    /**
     * The Application Id.
     * AAD Application Id.
     */
    @SerializedName(value = "applicationId", alternate = {"ApplicationId"})
    @Expose
	@Nullable
    public String applicationId;

    /**
     * The Ip Address.
     * IPAddress.
     */
    @SerializedName(value = "ipAddress", alternate = {"IpAddress"})
    @Expose
	@Nullable
    public String ipAddress;

    /**
     * The Remote Tenant Id.
     * Remote Tenant Id
     */
    @SerializedName(value = "remoteTenantId", alternate = {"RemoteTenantId"})
    @Expose
	@Nullable
    public String remoteTenantId;

    /**
     * The Remote User Id.
     * Remote User Id
     */
    @SerializedName(value = "remoteUserId", alternate = {"RemoteUserId"})
    @Expose
	@Nullable
    public String remoteUserId;

    /**
     * The Service Principal Name.
     * Service Principal Name (SPN).
     */
    @SerializedName(value = "servicePrincipalName", alternate = {"ServicePrincipalName"})
    @Expose
	@Nullable
    public String servicePrincipalName;

    /**
     * The Type.
     * Actor Type.
     */
    @SerializedName(value = "type", alternate = {"Type"})
    @Expose
	@Nullable
    public String type;

    /**
     * The User Id.
     * User Id.
     */
    @SerializedName(value = "userId", alternate = {"UserId"})
    @Expose
	@Nullable
    public String userId;

    /**
     * The User Permissions.
     * List of user permissions when the audit was performed.
     */
    @SerializedName(value = "userPermissions", alternate = {"UserPermissions"})
    @Expose
	@Nullable
    public java.util.List<String> userPermissions;

    /**
     * The User Principal Name.
     * User Principal Name (UPN).
     */
    @SerializedName(value = "userPrincipalName", alternate = {"UserPrincipalName"})
    @Expose
	@Nullable
    public String userPrincipalName;

    /**
     * The User Role Scope Tags.
     * List of user scope tags when the audit was performed.
     */
    @SerializedName(value = "userRoleScopeTags", alternate = {"UserRoleScopeTags"})
    @Expose
	@Nullable
    public java.util.List<RoleScopeTagInfo> userRoleScopeTags;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
