package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class HostSecurityProfile extends Entity implements Parsable {
    /**
     * Instantiates a new HostSecurityProfile and sets the default values.
     */
    public HostSecurityProfile() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a HostSecurityProfile
     */
    @jakarta.annotation.Nonnull
    public static HostSecurityProfile createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new HostSecurityProfile();
    }
    /**
     * Gets the azureSubscriptionId property value. The azureSubscriptionId property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAzureSubscriptionId() {
        return this.backingStore.get("azureSubscriptionId");
    }
    /**
     * Gets the azureTenantId property value. The azureTenantId property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAzureTenantId() {
        return this.backingStore.get("azureTenantId");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("azureSubscriptionId", (n) -> { this.setAzureSubscriptionId(n.getStringValue()); });
        deserializerMap.put("azureTenantId", (n) -> { this.setAzureTenantId(n.getStringValue()); });
        deserializerMap.put("firstSeenDateTime", (n) -> { this.setFirstSeenDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("fqdn", (n) -> { this.setFqdn(n.getStringValue()); });
        deserializerMap.put("isAzureAdJoined", (n) -> { this.setIsAzureAdJoined(n.getBooleanValue()); });
        deserializerMap.put("isAzureAdRegistered", (n) -> { this.setIsAzureAdRegistered(n.getBooleanValue()); });
        deserializerMap.put("isHybridAzureDomainJoined", (n) -> { this.setIsHybridAzureDomainJoined(n.getBooleanValue()); });
        deserializerMap.put("lastSeenDateTime", (n) -> { this.setLastSeenDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("logonUsers", (n) -> { this.setLogonUsers(n.getCollectionOfObjectValues(LogonUser::createFromDiscriminatorValue)); });
        deserializerMap.put("netBiosName", (n) -> { this.setNetBiosName(n.getStringValue()); });
        deserializerMap.put("networkInterfaces", (n) -> { this.setNetworkInterfaces(n.getCollectionOfObjectValues(NetworkInterface::createFromDiscriminatorValue)); });
        deserializerMap.put("os", (n) -> { this.setOs(n.getStringValue()); });
        deserializerMap.put("osVersion", (n) -> { this.setOsVersion(n.getStringValue()); });
        deserializerMap.put("parentHost", (n) -> { this.setParentHost(n.getStringValue()); });
        deserializerMap.put("relatedHostIds", (n) -> { this.setRelatedHostIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("riskScore", (n) -> { this.setRiskScore(n.getStringValue()); });
        deserializerMap.put("tags", (n) -> { this.setTags(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("vendorInformation", (n) -> { this.setVendorInformation(n.getObjectValue(SecurityVendorInformation::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the firstSeenDateTime property value. The firstSeenDateTime property
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getFirstSeenDateTime() {
        return this.backingStore.get("firstSeenDateTime");
    }
    /**
     * Gets the fqdn property value. The fqdn property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getFqdn() {
        return this.backingStore.get("fqdn");
    }
    /**
     * Gets the isAzureAdJoined property value. The isAzureAdJoined property
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsAzureAdJoined() {
        return this.backingStore.get("isAzureAdJoined");
    }
    /**
     * Gets the isAzureAdRegistered property value. The isAzureAdRegistered property
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsAzureAdRegistered() {
        return this.backingStore.get("isAzureAdRegistered");
    }
    /**
     * Gets the isHybridAzureDomainJoined property value. The isHybridAzureDomainJoined property
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsHybridAzureDomainJoined() {
        return this.backingStore.get("isHybridAzureDomainJoined");
    }
    /**
     * Gets the lastSeenDateTime property value. The lastSeenDateTime property
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastSeenDateTime() {
        return this.backingStore.get("lastSeenDateTime");
    }
    /**
     * Gets the logonUsers property value. The logonUsers property
     * @return a java.util.List<LogonUser>
     */
    @jakarta.annotation.Nullable
    public java.util.List<LogonUser> getLogonUsers() {
        return this.backingStore.get("logonUsers");
    }
    /**
     * Gets the netBiosName property value. The netBiosName property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getNetBiosName() {
        return this.backingStore.get("netBiosName");
    }
    /**
     * Gets the networkInterfaces property value. The networkInterfaces property
     * @return a java.util.List<NetworkInterface>
     */
    @jakarta.annotation.Nullable
    public java.util.List<NetworkInterface> getNetworkInterfaces() {
        return this.backingStore.get("networkInterfaces");
    }
    /**
     * Gets the os property value. The os property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOs() {
        return this.backingStore.get("os");
    }
    /**
     * Gets the osVersion property value. The osVersion property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOsVersion() {
        return this.backingStore.get("osVersion");
    }
    /**
     * Gets the parentHost property value. The parentHost property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getParentHost() {
        return this.backingStore.get("parentHost");
    }
    /**
     * Gets the relatedHostIds property value. The relatedHostIds property
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getRelatedHostIds() {
        return this.backingStore.get("relatedHostIds");
    }
    /**
     * Gets the riskScore property value. The riskScore property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getRiskScore() {
        return this.backingStore.get("riskScore");
    }
    /**
     * Gets the tags property value. The tags property
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getTags() {
        return this.backingStore.get("tags");
    }
    /**
     * Gets the vendorInformation property value. The vendorInformation property
     * @return a SecurityVendorInformation
     */
    @jakarta.annotation.Nullable
    public SecurityVendorInformation getVendorInformation() {
        return this.backingStore.get("vendorInformation");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("azureSubscriptionId", this.getAzureSubscriptionId());
        writer.writeStringValue("azureTenantId", this.getAzureTenantId());
        writer.writeOffsetDateTimeValue("firstSeenDateTime", this.getFirstSeenDateTime());
        writer.writeStringValue("fqdn", this.getFqdn());
        writer.writeBooleanValue("isAzureAdJoined", this.getIsAzureAdJoined());
        writer.writeBooleanValue("isAzureAdRegistered", this.getIsAzureAdRegistered());
        writer.writeBooleanValue("isHybridAzureDomainJoined", this.getIsHybridAzureDomainJoined());
        writer.writeOffsetDateTimeValue("lastSeenDateTime", this.getLastSeenDateTime());
        writer.writeCollectionOfObjectValues("logonUsers", this.getLogonUsers());
        writer.writeStringValue("netBiosName", this.getNetBiosName());
        writer.writeCollectionOfObjectValues("networkInterfaces", this.getNetworkInterfaces());
        writer.writeStringValue("os", this.getOs());
        writer.writeStringValue("osVersion", this.getOsVersion());
        writer.writeStringValue("parentHost", this.getParentHost());
        writer.writeCollectionOfPrimitiveValues("relatedHostIds", this.getRelatedHostIds());
        writer.writeStringValue("riskScore", this.getRiskScore());
        writer.writeCollectionOfPrimitiveValues("tags", this.getTags());
        writer.writeObjectValue("vendorInformation", this.getVendorInformation());
    }
    /**
     * Sets the azureSubscriptionId property value. The azureSubscriptionId property
     * @param value Value to set for the azureSubscriptionId property.
     */
    public void setAzureSubscriptionId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("azureSubscriptionId", value);
    }
    /**
     * Sets the azureTenantId property value. The azureTenantId property
     * @param value Value to set for the azureTenantId property.
     */
    public void setAzureTenantId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("azureTenantId", value);
    }
    /**
     * Sets the firstSeenDateTime property value. The firstSeenDateTime property
     * @param value Value to set for the firstSeenDateTime property.
     */
    public void setFirstSeenDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("firstSeenDateTime", value);
    }
    /**
     * Sets the fqdn property value. The fqdn property
     * @param value Value to set for the fqdn property.
     */
    public void setFqdn(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("fqdn", value);
    }
    /**
     * Sets the isAzureAdJoined property value. The isAzureAdJoined property
     * @param value Value to set for the isAzureAdJoined property.
     */
    public void setIsAzureAdJoined(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isAzureAdJoined", value);
    }
    /**
     * Sets the isAzureAdRegistered property value. The isAzureAdRegistered property
     * @param value Value to set for the isAzureAdRegistered property.
     */
    public void setIsAzureAdRegistered(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isAzureAdRegistered", value);
    }
    /**
     * Sets the isHybridAzureDomainJoined property value. The isHybridAzureDomainJoined property
     * @param value Value to set for the isHybridAzureDomainJoined property.
     */
    public void setIsHybridAzureDomainJoined(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isHybridAzureDomainJoined", value);
    }
    /**
     * Sets the lastSeenDateTime property value. The lastSeenDateTime property
     * @param value Value to set for the lastSeenDateTime property.
     */
    public void setLastSeenDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastSeenDateTime", value);
    }
    /**
     * Sets the logonUsers property value. The logonUsers property
     * @param value Value to set for the logonUsers property.
     */
    public void setLogonUsers(@jakarta.annotation.Nullable final java.util.List<LogonUser> value) {
        this.backingStore.set("logonUsers", value);
    }
    /**
     * Sets the netBiosName property value. The netBiosName property
     * @param value Value to set for the netBiosName property.
     */
    public void setNetBiosName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("netBiosName", value);
    }
    /**
     * Sets the networkInterfaces property value. The networkInterfaces property
     * @param value Value to set for the networkInterfaces property.
     */
    public void setNetworkInterfaces(@jakarta.annotation.Nullable final java.util.List<NetworkInterface> value) {
        this.backingStore.set("networkInterfaces", value);
    }
    /**
     * Sets the os property value. The os property
     * @param value Value to set for the os property.
     */
    public void setOs(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("os", value);
    }
    /**
     * Sets the osVersion property value. The osVersion property
     * @param value Value to set for the osVersion property.
     */
    public void setOsVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("osVersion", value);
    }
    /**
     * Sets the parentHost property value. The parentHost property
     * @param value Value to set for the parentHost property.
     */
    public void setParentHost(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("parentHost", value);
    }
    /**
     * Sets the relatedHostIds property value. The relatedHostIds property
     * @param value Value to set for the relatedHostIds property.
     */
    public void setRelatedHostIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("relatedHostIds", value);
    }
    /**
     * Sets the riskScore property value. The riskScore property
     * @param value Value to set for the riskScore property.
     */
    public void setRiskScore(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("riskScore", value);
    }
    /**
     * Sets the tags property value. The tags property
     * @param value Value to set for the tags property.
     */
    public void setTags(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("tags", value);
    }
    /**
     * Sets the vendorInformation property value. The vendorInformation property
     * @param value Value to set for the vendorInformation property.
     */
    public void setVendorInformation(@jakarta.annotation.Nullable final SecurityVendorInformation value) {
        this.backingStore.set("vendorInformation", value);
    }
}
