package com.microsoft.graph.models;

import com.microsoft.graph.models.IosikEv2VpnConfiguration;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class IosVpnConfiguration extends AppleVpnConfiguration implements Parsable {
    /** Zscaler only. Zscaler cloud which the user is assigned to. */
    private String _cloudName;
    /** Tenant level settings for the Derived Credentials to be used for authentication. */
    private DeviceManagementDerivedCredentialSettings _derivedCredentialSettings;
    /** Zscaler only. List of network addresses which are not sent through the Zscaler cloud. */
    private java.util.List<String> _excludeList;
    /** Identity certificate for client authentication when authentication method is certificate. */
    private IosCertificateProfileBase _identityCertificate;
    /** Microsoft Tunnel site ID. */
    private String _microsoftTunnelSiteId;
    /** Zscaler only. Blocks network traffic until the user signs into Zscaler app. 'True' means traffic is blocked. */
    private Boolean _strictEnforcement;
    /** Targeted mobile apps. This collection can contain a maximum of 500 elements. */
    private java.util.List<AppListItem> _targetedMobileApps;
    /** Zscaler only. Enter a static domain to pre-populate the login field with in the Zscaler app. If this is left empty, the user's Azure Active Directory domain will be used instead. */
    private String _userDomain;
    /**
     * Instantiates a new IosVpnConfiguration and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public IosVpnConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.iosVpnConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a IosVpnConfiguration
     */
    @javax.annotation.Nonnull
    public static IosVpnConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.iosikEv2VpnConfiguration": return new IosikEv2VpnConfiguration();
            }
        }
        return new IosVpnConfiguration();
    }
    /**
     * Gets the cloudName property value. Zscaler only. Zscaler cloud which the user is assigned to.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCloudName() {
        return this._cloudName;
    }
    /**
     * Gets the derivedCredentialSettings property value. Tenant level settings for the Derived Credentials to be used for authentication.
     * @return a deviceManagementDerivedCredentialSettings
     */
    @javax.annotation.Nullable
    public DeviceManagementDerivedCredentialSettings getDerivedCredentialSettings() {
        return this._derivedCredentialSettings;
    }
    /**
     * Gets the excludeList property value. Zscaler only. List of network addresses which are not sent through the Zscaler cloud.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getExcludeList() {
        return this._excludeList;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("cloudName", (n) -> { this.setCloudName(n.getStringValue()); });
        deserializerMap.put("derivedCredentialSettings", (n) -> { this.setDerivedCredentialSettings(n.getObjectValue(DeviceManagementDerivedCredentialSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("excludeList", (n) -> { this.setExcludeList(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("identityCertificate", (n) -> { this.setIdentityCertificate(n.getObjectValue(IosCertificateProfileBase::createFromDiscriminatorValue)); });
        deserializerMap.put("microsoftTunnelSiteId", (n) -> { this.setMicrosoftTunnelSiteId(n.getStringValue()); });
        deserializerMap.put("strictEnforcement", (n) -> { this.setStrictEnforcement(n.getBooleanValue()); });
        deserializerMap.put("targetedMobileApps", (n) -> { this.setTargetedMobileApps(n.getCollectionOfObjectValues(AppListItem::createFromDiscriminatorValue)); });
        deserializerMap.put("userDomain", (n) -> { this.setUserDomain(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the identityCertificate property value. Identity certificate for client authentication when authentication method is certificate.
     * @return a iosCertificateProfileBase
     */
    @javax.annotation.Nullable
    public IosCertificateProfileBase getIdentityCertificate() {
        return this._identityCertificate;
    }
    /**
     * Gets the microsoftTunnelSiteId property value. Microsoft Tunnel site ID.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMicrosoftTunnelSiteId() {
        return this._microsoftTunnelSiteId;
    }
    /**
     * Gets the strictEnforcement property value. Zscaler only. Blocks network traffic until the user signs into Zscaler app. 'True' means traffic is blocked.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getStrictEnforcement() {
        return this._strictEnforcement;
    }
    /**
     * Gets the targetedMobileApps property value. Targeted mobile apps. This collection can contain a maximum of 500 elements.
     * @return a appListItem
     */
    @javax.annotation.Nullable
    public java.util.List<AppListItem> getTargetedMobileApps() {
        return this._targetedMobileApps;
    }
    /**
     * Gets the userDomain property value. Zscaler only. Enter a static domain to pre-populate the login field with in the Zscaler app. If this is left empty, the user's Azure Active Directory domain will be used instead.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserDomain() {
        return this._userDomain;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("cloudName", this.getCloudName());
        writer.writeObjectValue("derivedCredentialSettings", this.getDerivedCredentialSettings());
        writer.writeCollectionOfPrimitiveValues("excludeList", this.getExcludeList());
        writer.writeObjectValue("identityCertificate", this.getIdentityCertificate());
        writer.writeStringValue("microsoftTunnelSiteId", this.getMicrosoftTunnelSiteId());
        writer.writeBooleanValue("strictEnforcement", this.getStrictEnforcement());
        writer.writeCollectionOfObjectValues("targetedMobileApps", this.getTargetedMobileApps());
        writer.writeStringValue("userDomain", this.getUserDomain());
    }
    /**
     * Sets the cloudName property value. Zscaler only. Zscaler cloud which the user is assigned to.
     * @param value Value to set for the cloudName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCloudName(@javax.annotation.Nullable final String value) {
        this._cloudName = value;
    }
    /**
     * Sets the derivedCredentialSettings property value. Tenant level settings for the Derived Credentials to be used for authentication.
     * @param value Value to set for the derivedCredentialSettings property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDerivedCredentialSettings(@javax.annotation.Nullable final DeviceManagementDerivedCredentialSettings value) {
        this._derivedCredentialSettings = value;
    }
    /**
     * Sets the excludeList property value. Zscaler only. List of network addresses which are not sent through the Zscaler cloud.
     * @param value Value to set for the excludeList property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExcludeList(@javax.annotation.Nullable final java.util.List<String> value) {
        this._excludeList = value;
    }
    /**
     * Sets the identityCertificate property value. Identity certificate for client authentication when authentication method is certificate.
     * @param value Value to set for the identityCertificate property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIdentityCertificate(@javax.annotation.Nullable final IosCertificateProfileBase value) {
        this._identityCertificate = value;
    }
    /**
     * Sets the microsoftTunnelSiteId property value. Microsoft Tunnel site ID.
     * @param value Value to set for the microsoftTunnelSiteId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMicrosoftTunnelSiteId(@javax.annotation.Nullable final String value) {
        this._microsoftTunnelSiteId = value;
    }
    /**
     * Sets the strictEnforcement property value. Zscaler only. Blocks network traffic until the user signs into Zscaler app. 'True' means traffic is blocked.
     * @param value Value to set for the strictEnforcement property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStrictEnforcement(@javax.annotation.Nullable final Boolean value) {
        this._strictEnforcement = value;
    }
    /**
     * Sets the targetedMobileApps property value. Targeted mobile apps. This collection can contain a maximum of 500 elements.
     * @param value Value to set for the targetedMobileApps property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTargetedMobileApps(@javax.annotation.Nullable final java.util.List<AppListItem> value) {
        this._targetedMobileApps = value;
    }
    /**
     * Sets the userDomain property value. Zscaler only. Enter a static domain to pre-populate the login field with in the Zscaler app. If this is left empty, the user's Azure Active Directory domain will be used instead.
     * @param value Value to set for the userDomain property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserDomain(@javax.annotation.Nullable final String value) {
        this._userDomain = value;
    }
}
