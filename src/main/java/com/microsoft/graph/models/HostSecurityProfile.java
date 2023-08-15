package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class HostSecurityProfile extends Entity implements Parsable {
    /**
     * The azureSubscriptionId property
     */
    private String azureSubscriptionId;
    /**
     * The azureTenantId property
     */
    private String azureTenantId;
    /**
     * The firstSeenDateTime property
     */
    private OffsetDateTime firstSeenDateTime;
    /**
     * The fqdn property
     */
    private String fqdn;
    /**
     * The isAzureAdJoined property
     */
    private Boolean isAzureAdJoined;
    /**
     * The isAzureAdRegistered property
     */
    private Boolean isAzureAdRegistered;
    /**
     * The isHybridAzureDomainJoined property
     */
    private Boolean isHybridAzureDomainJoined;
    /**
     * The lastSeenDateTime property
     */
    private OffsetDateTime lastSeenDateTime;
    /**
     * The logonUsers property
     */
    private java.util.List<LogonUser> logonUsers;
    /**
     * The netBiosName property
     */
    private String netBiosName;
    /**
     * The networkInterfaces property
     */
    private java.util.List<NetworkInterface> networkInterfaces;
    /**
     * The os property
     */
    private String os;
    /**
     * The osVersion property
     */
    private String osVersion;
    /**
     * The parentHost property
     */
    private String parentHost;
    /**
     * The relatedHostIds property
     */
    private java.util.List<String> relatedHostIds;
    /**
     * The riskScore property
     */
    private String riskScore;
    /**
     * The tags property
     */
    private java.util.List<String> tags;
    /**
     * The vendorInformation property
     */
    private SecurityVendorInformation vendorInformation;
    /**
     * Instantiates a new hostSecurityProfile and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public HostSecurityProfile() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a hostSecurityProfile
     */
    @jakarta.annotation.Nonnull
    public static HostSecurityProfile createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new HostSecurityProfile();
    }
    /**
     * Gets the azureSubscriptionId property value. The azureSubscriptionId property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getAzureSubscriptionId() {
        return this.azureSubscriptionId;
    }
    /**
     * Gets the azureTenantId property value. The azureTenantId property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getAzureTenantId() {
        return this.azureTenantId;
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
        return this.firstSeenDateTime;
    }
    /**
     * Gets the fqdn property value. The fqdn property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getFqdn() {
        return this.fqdn;
    }
    /**
     * Gets the isAzureAdJoined property value. The isAzureAdJoined property
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsAzureAdJoined() {
        return this.isAzureAdJoined;
    }
    /**
     * Gets the isAzureAdRegistered property value. The isAzureAdRegistered property
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsAzureAdRegistered() {
        return this.isAzureAdRegistered;
    }
    /**
     * Gets the isHybridAzureDomainJoined property value. The isHybridAzureDomainJoined property
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsHybridAzureDomainJoined() {
        return this.isHybridAzureDomainJoined;
    }
    /**
     * Gets the lastSeenDateTime property value. The lastSeenDateTime property
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastSeenDateTime() {
        return this.lastSeenDateTime;
    }
    /**
     * Gets the logonUsers property value. The logonUsers property
     * @return a logonUser
     */
    @jakarta.annotation.Nullable
    public java.util.List<LogonUser> getLogonUsers() {
        return this.logonUsers;
    }
    /**
     * Gets the netBiosName property value. The netBiosName property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getNetBiosName() {
        return this.netBiosName;
    }
    /**
     * Gets the networkInterfaces property value. The networkInterfaces property
     * @return a networkInterface
     */
    @jakarta.annotation.Nullable
    public java.util.List<NetworkInterface> getNetworkInterfaces() {
        return this.networkInterfaces;
    }
    /**
     * Gets the os property value. The os property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOs() {
        return this.os;
    }
    /**
     * Gets the osVersion property value. The osVersion property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOsVersion() {
        return this.osVersion;
    }
    /**
     * Gets the parentHost property value. The parentHost property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getParentHost() {
        return this.parentHost;
    }
    /**
     * Gets the relatedHostIds property value. The relatedHostIds property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getRelatedHostIds() {
        return this.relatedHostIds;
    }
    /**
     * Gets the riskScore property value. The riskScore property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getRiskScore() {
        return this.riskScore;
    }
    /**
     * Gets the tags property value. The tags property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getTags() {
        return this.tags;
    }
    /**
     * Gets the vendorInformation property value. The vendorInformation property
     * @return a securityVendorInformation
     */
    @jakarta.annotation.Nullable
    public SecurityVendorInformation getVendorInformation() {
        return this.vendorInformation;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
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
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAzureSubscriptionId(@jakarta.annotation.Nullable final String value) {
        this.azureSubscriptionId = value;
    }
    /**
     * Sets the azureTenantId property value. The azureTenantId property
     * @param value Value to set for the azureTenantId property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAzureTenantId(@jakarta.annotation.Nullable final String value) {
        this.azureTenantId = value;
    }
    /**
     * Sets the firstSeenDateTime property value. The firstSeenDateTime property
     * @param value Value to set for the firstSeenDateTime property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setFirstSeenDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.firstSeenDateTime = value;
    }
    /**
     * Sets the fqdn property value. The fqdn property
     * @param value Value to set for the fqdn property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setFqdn(@jakarta.annotation.Nullable final String value) {
        this.fqdn = value;
    }
    /**
     * Sets the isAzureAdJoined property value. The isAzureAdJoined property
     * @param value Value to set for the isAzureAdJoined property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setIsAzureAdJoined(@jakarta.annotation.Nullable final Boolean value) {
        this.isAzureAdJoined = value;
    }
    /**
     * Sets the isAzureAdRegistered property value. The isAzureAdRegistered property
     * @param value Value to set for the isAzureAdRegistered property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setIsAzureAdRegistered(@jakarta.annotation.Nullable final Boolean value) {
        this.isAzureAdRegistered = value;
    }
    /**
     * Sets the isHybridAzureDomainJoined property value. The isHybridAzureDomainJoined property
     * @param value Value to set for the isHybridAzureDomainJoined property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setIsHybridAzureDomainJoined(@jakarta.annotation.Nullable final Boolean value) {
        this.isHybridAzureDomainJoined = value;
    }
    /**
     * Sets the lastSeenDateTime property value. The lastSeenDateTime property
     * @param value Value to set for the lastSeenDateTime property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setLastSeenDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastSeenDateTime = value;
    }
    /**
     * Sets the logonUsers property value. The logonUsers property
     * @param value Value to set for the logonUsers property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setLogonUsers(@jakarta.annotation.Nullable final java.util.List<LogonUser> value) {
        this.logonUsers = value;
    }
    /**
     * Sets the netBiosName property value. The netBiosName property
     * @param value Value to set for the netBiosName property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setNetBiosName(@jakarta.annotation.Nullable final String value) {
        this.netBiosName = value;
    }
    /**
     * Sets the networkInterfaces property value. The networkInterfaces property
     * @param value Value to set for the networkInterfaces property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setNetworkInterfaces(@jakarta.annotation.Nullable final java.util.List<NetworkInterface> value) {
        this.networkInterfaces = value;
    }
    /**
     * Sets the os property value. The os property
     * @param value Value to set for the os property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setOs(@jakarta.annotation.Nullable final String value) {
        this.os = value;
    }
    /**
     * Sets the osVersion property value. The osVersion property
     * @param value Value to set for the osVersion property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setOsVersion(@jakarta.annotation.Nullable final String value) {
        this.osVersion = value;
    }
    /**
     * Sets the parentHost property value. The parentHost property
     * @param value Value to set for the parentHost property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setParentHost(@jakarta.annotation.Nullable final String value) {
        this.parentHost = value;
    }
    /**
     * Sets the relatedHostIds property value. The relatedHostIds property
     * @param value Value to set for the relatedHostIds property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setRelatedHostIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.relatedHostIds = value;
    }
    /**
     * Sets the riskScore property value. The riskScore property
     * @param value Value to set for the riskScore property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setRiskScore(@jakarta.annotation.Nullable final String value) {
        this.riskScore = value;
    }
    /**
     * Sets the tags property value. The tags property
     * @param value Value to set for the tags property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setTags(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.tags = value;
    }
    /**
     * Sets the vendorInformation property value. The vendorInformation property
     * @param value Value to set for the vendorInformation property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setVendorInformation(@jakarta.annotation.Nullable final SecurityVendorInformation value) {
        this.vendorInformation = value;
    }
}
