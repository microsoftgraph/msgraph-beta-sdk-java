package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * By providing the configurations in this profile you can instruct the iOS device to connect to desired VPN endpoint. By specifying the authentication method and security types expected by VPN endpoint you can make the VPN connection seamless for end user.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class IosVpnConfiguration extends AppleVpnConfiguration implements Parsable {
    /**
     * Instantiates a new IosVpnConfiguration and sets the default values.
     */
    public IosVpnConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.iosVpnConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a IosVpnConfiguration
     */
    @jakarta.annotation.Nonnull
    public static IosVpnConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
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
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCloudName() {
        return this.backingStore.get("cloudName");
    }
    /**
     * Gets the derivedCredentialSettings property value. Tenant level settings for the Derived Credentials to be used for authentication.
     * @return a DeviceManagementDerivedCredentialSettings
     */
    @jakarta.annotation.Nullable
    public DeviceManagementDerivedCredentialSettings getDerivedCredentialSettings() {
        return this.backingStore.get("derivedCredentialSettings");
    }
    /**
     * Gets the excludeList property value. Zscaler only. List of network addresses which are not sent through the Zscaler cloud.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getExcludeList() {
        return this.backingStore.get("excludeList");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
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
     * @return a IosCertificateProfileBase
     */
    @jakarta.annotation.Nullable
    public IosCertificateProfileBase getIdentityCertificate() {
        return this.backingStore.get("identityCertificate");
    }
    /**
     * Gets the microsoftTunnelSiteId property value. Microsoft Tunnel site ID.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getMicrosoftTunnelSiteId() {
        return this.backingStore.get("microsoftTunnelSiteId");
    }
    /**
     * Gets the strictEnforcement property value. Zscaler only. Blocks network traffic until the user signs into Zscaler app. 'True' means traffic is blocked.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getStrictEnforcement() {
        return this.backingStore.get("strictEnforcement");
    }
    /**
     * Gets the targetedMobileApps property value. Targeted mobile apps. This collection can contain a maximum of 500 elements.
     * @return a java.util.List<AppListItem>
     */
    @jakarta.annotation.Nullable
    public java.util.List<AppListItem> getTargetedMobileApps() {
        return this.backingStore.get("targetedMobileApps");
    }
    /**
     * Gets the userDomain property value. Zscaler only. Enter a static domain to pre-populate the login field with in the Zscaler app. If this is left empty, the user's Azure Active Directory domain will be used instead.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getUserDomain() {
        return this.backingStore.get("userDomain");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     */
    public void setCloudName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("cloudName", value);
    }
    /**
     * Sets the derivedCredentialSettings property value. Tenant level settings for the Derived Credentials to be used for authentication.
     * @param value Value to set for the derivedCredentialSettings property.
     */
    public void setDerivedCredentialSettings(@jakarta.annotation.Nullable final DeviceManagementDerivedCredentialSettings value) {
        this.backingStore.set("derivedCredentialSettings", value);
    }
    /**
     * Sets the excludeList property value. Zscaler only. List of network addresses which are not sent through the Zscaler cloud.
     * @param value Value to set for the excludeList property.
     */
    public void setExcludeList(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("excludeList", value);
    }
    /**
     * Sets the identityCertificate property value. Identity certificate for client authentication when authentication method is certificate.
     * @param value Value to set for the identityCertificate property.
     */
    public void setIdentityCertificate(@jakarta.annotation.Nullable final IosCertificateProfileBase value) {
        this.backingStore.set("identityCertificate", value);
    }
    /**
     * Sets the microsoftTunnelSiteId property value. Microsoft Tunnel site ID.
     * @param value Value to set for the microsoftTunnelSiteId property.
     */
    public void setMicrosoftTunnelSiteId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("microsoftTunnelSiteId", value);
    }
    /**
     * Sets the strictEnforcement property value. Zscaler only. Blocks network traffic until the user signs into Zscaler app. 'True' means traffic is blocked.
     * @param value Value to set for the strictEnforcement property.
     */
    public void setStrictEnforcement(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("strictEnforcement", value);
    }
    /**
     * Sets the targetedMobileApps property value. Targeted mobile apps. This collection can contain a maximum of 500 elements.
     * @param value Value to set for the targetedMobileApps property.
     */
    public void setTargetedMobileApps(@jakarta.annotation.Nullable final java.util.List<AppListItem> value) {
        this.backingStore.set("targetedMobileApps", value);
    }
    /**
     * Sets the userDomain property value. Zscaler only. Enter a static domain to pre-populate the login field with in the Zscaler app. If this is left empty, the user's Azure Active Directory domain will be used instead.
     * @param value Value to set for the userDomain property.
     */
    public void setUserDomain(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("userDomain", value);
    }
}
