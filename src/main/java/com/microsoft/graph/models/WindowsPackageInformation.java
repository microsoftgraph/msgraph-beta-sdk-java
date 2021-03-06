// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.WindowsArchitecture;
import com.microsoft.graph.models.WindowsMinimumOperatingSystem;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Package Information.
 */
public class WindowsPackageInformation implements IJsonBackedObject {

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
     * The Applicable Architecture.
     * The Windows architecture for which this app can run on. Possible values are: none, x86, x64, arm, neutral, arm64.
     */
    @SerializedName(value = "applicableArchitecture", alternate = {"ApplicableArchitecture"})
    @Expose
	@Nullable
    public EnumSet<WindowsArchitecture> applicableArchitecture;

    /**
     * The Display Name.
     * The Display Name.
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
	@Nullable
    public String displayName;

    /**
     * The Identity Name.
     * The Identity Name.
     */
    @SerializedName(value = "identityName", alternate = {"IdentityName"})
    @Expose
	@Nullable
    public String identityName;

    /**
     * The Identity Publisher.
     * The Identity Publisher.
     */
    @SerializedName(value = "identityPublisher", alternate = {"IdentityPublisher"})
    @Expose
	@Nullable
    public String identityPublisher;

    /**
     * The Identity Resource Identifier.
     * The Identity Resource Identifier.
     */
    @SerializedName(value = "identityResourceIdentifier", alternate = {"IdentityResourceIdentifier"})
    @Expose
	@Nullable
    public String identityResourceIdentifier;

    /**
     * The Identity Version.
     * The Identity Version.
     */
    @SerializedName(value = "identityVersion", alternate = {"IdentityVersion"})
    @Expose
	@Nullable
    public String identityVersion;

    /**
     * The Minimum Supported Operating System.
     * The value for the minimum applicable operating system.
     */
    @SerializedName(value = "minimumSupportedOperatingSystem", alternate = {"MinimumSupportedOperatingSystem"})
    @Expose
	@Nullable
    public WindowsMinimumOperatingSystem minimumSupportedOperatingSystem;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
