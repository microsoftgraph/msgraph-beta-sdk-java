package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Entity that represents a Microsoft Tunnel site
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MicrosoftTunnelSite extends Entity implements Parsable {
    /**
     * Instantiates a new {@link MicrosoftTunnelSite} and sets the default values.
     */
    public MicrosoftTunnelSite() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link MicrosoftTunnelSite}
     */
    @jakarta.annotation.Nonnull
    public static MicrosoftTunnelSite createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MicrosoftTunnelSite();
    }
    /**
     * Gets the description property value. The site&apos;s description (optional)
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * Gets the displayName property value. The display name for the site. This property is required when a site is created.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("internalNetworkProbeUrl", (n) -> { this.setInternalNetworkProbeUrl(n.getStringValue()); });
        deserializerMap.put("microsoftTunnelConfiguration", (n) -> { this.setMicrosoftTunnelConfiguration(n.getObjectValue(MicrosoftTunnelConfiguration::createFromDiscriminatorValue)); });
        deserializerMap.put("microsoftTunnelServers", (n) -> { this.setMicrosoftTunnelServers(n.getCollectionOfObjectValues(MicrosoftTunnelServer::createFromDiscriminatorValue)); });
        deserializerMap.put("publicAddress", (n) -> { this.setPublicAddress(n.getStringValue()); });
        deserializerMap.put("roleScopeTagIds", (n) -> { this.setRoleScopeTagIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("upgradeAutomatically", (n) -> { this.setUpgradeAutomatically(n.getBooleanValue()); });
        deserializerMap.put("upgradeAvailable", (n) -> { this.setUpgradeAvailable(n.getBooleanValue()); });
        deserializerMap.put("upgradeWindowEndTime", (n) -> { this.setUpgradeWindowEndTime(n.getLocalTimeValue()); });
        deserializerMap.put("upgradeWindowStartTime", (n) -> { this.setUpgradeWindowStartTime(n.getLocalTimeValue()); });
        deserializerMap.put("upgradeWindowUtcOffsetInMinutes", (n) -> { this.setUpgradeWindowUtcOffsetInMinutes(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the internalNetworkProbeUrl property value. The site&apos;s Internal Network Access Probe URL
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getInternalNetworkProbeUrl() {
        return this.backingStore.get("internalNetworkProbeUrl");
    }
    /**
     * Gets the microsoftTunnelConfiguration property value. The MicrosoftTunnelConfiguration that has been applied to this MicrosoftTunnelSite
     * @return a {@link MicrosoftTunnelConfiguration}
     */
    @jakarta.annotation.Nullable
    public MicrosoftTunnelConfiguration getMicrosoftTunnelConfiguration() {
        return this.backingStore.get("microsoftTunnelConfiguration");
    }
    /**
     * Gets the microsoftTunnelServers property value. A list of MicrosoftTunnelServers that are registered to this MicrosoftTunnelSite
     * @return a {@link java.util.List<MicrosoftTunnelServer>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<MicrosoftTunnelServer> getMicrosoftTunnelServers() {
        return this.backingStore.get("microsoftTunnelServers");
    }
    /**
     * Gets the publicAddress property value. The site&apos;s public domain name or IP address
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPublicAddress() {
        return this.backingStore.get("publicAddress");
    }
    /**
     * Gets the roleScopeTagIds property value. List of Scope Tags for this Entity instance
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getRoleScopeTagIds() {
        return this.backingStore.get("roleScopeTagIds");
    }
    /**
     * Gets the upgradeAutomatically property value. The site&apos;s automatic upgrade setting. True for automatic upgrades, false for manual control
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getUpgradeAutomatically() {
        return this.backingStore.get("upgradeAutomatically");
    }
    /**
     * Gets the upgradeAvailable property value. The site provides the state of when an upgrade is available
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getUpgradeAvailable() {
        return this.backingStore.get("upgradeAvailable");
    }
    /**
     * Gets the upgradeWindowEndTime property value. The site&apos;s upgrade window end time of day
     * @return a {@link LocalTime}
     */
    @jakarta.annotation.Nullable
    public LocalTime getUpgradeWindowEndTime() {
        return this.backingStore.get("upgradeWindowEndTime");
    }
    /**
     * Gets the upgradeWindowStartTime property value. The site&apos;s upgrade window start time of day
     * @return a {@link LocalTime}
     */
    @jakarta.annotation.Nullable
    public LocalTime getUpgradeWindowStartTime() {
        return this.backingStore.get("upgradeWindowStartTime");
    }
    /**
     * Gets the upgradeWindowUtcOffsetInMinutes property value. The site&apos;s timezone represented as a minute offset from UTC
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getUpgradeWindowUtcOffsetInMinutes() {
        return this.backingStore.get("upgradeWindowUtcOffsetInMinutes");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("internalNetworkProbeUrl", this.getInternalNetworkProbeUrl());
        writer.writeObjectValue("microsoftTunnelConfiguration", this.getMicrosoftTunnelConfiguration());
        writer.writeCollectionOfObjectValues("microsoftTunnelServers", this.getMicrosoftTunnelServers());
        writer.writeStringValue("publicAddress", this.getPublicAddress());
        writer.writeCollectionOfPrimitiveValues("roleScopeTagIds", this.getRoleScopeTagIds());
        writer.writeBooleanValue("upgradeAutomatically", this.getUpgradeAutomatically());
        writer.writeBooleanValue("upgradeAvailable", this.getUpgradeAvailable());
        writer.writeLocalTimeValue("upgradeWindowEndTime", this.getUpgradeWindowEndTime());
        writer.writeLocalTimeValue("upgradeWindowStartTime", this.getUpgradeWindowStartTime());
        writer.writeIntegerValue("upgradeWindowUtcOffsetInMinutes", this.getUpgradeWindowUtcOffsetInMinutes());
    }
    /**
     * Sets the description property value. The site&apos;s description (optional)
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the displayName property value. The display name for the site. This property is required when a site is created.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the internalNetworkProbeUrl property value. The site&apos;s Internal Network Access Probe URL
     * @param value Value to set for the internalNetworkProbeUrl property.
     */
    public void setInternalNetworkProbeUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("internalNetworkProbeUrl", value);
    }
    /**
     * Sets the microsoftTunnelConfiguration property value. The MicrosoftTunnelConfiguration that has been applied to this MicrosoftTunnelSite
     * @param value Value to set for the microsoftTunnelConfiguration property.
     */
    public void setMicrosoftTunnelConfiguration(@jakarta.annotation.Nullable final MicrosoftTunnelConfiguration value) {
        this.backingStore.set("microsoftTunnelConfiguration", value);
    }
    /**
     * Sets the microsoftTunnelServers property value. A list of MicrosoftTunnelServers that are registered to this MicrosoftTunnelSite
     * @param value Value to set for the microsoftTunnelServers property.
     */
    public void setMicrosoftTunnelServers(@jakarta.annotation.Nullable final java.util.List<MicrosoftTunnelServer> value) {
        this.backingStore.set("microsoftTunnelServers", value);
    }
    /**
     * Sets the publicAddress property value. The site&apos;s public domain name or IP address
     * @param value Value to set for the publicAddress property.
     */
    public void setPublicAddress(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("publicAddress", value);
    }
    /**
     * Sets the roleScopeTagIds property value. List of Scope Tags for this Entity instance
     * @param value Value to set for the roleScopeTagIds property.
     */
    public void setRoleScopeTagIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("roleScopeTagIds", value);
    }
    /**
     * Sets the upgradeAutomatically property value. The site&apos;s automatic upgrade setting. True for automatic upgrades, false for manual control
     * @param value Value to set for the upgradeAutomatically property.
     */
    public void setUpgradeAutomatically(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("upgradeAutomatically", value);
    }
    /**
     * Sets the upgradeAvailable property value. The site provides the state of when an upgrade is available
     * @param value Value to set for the upgradeAvailable property.
     */
    public void setUpgradeAvailable(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("upgradeAvailable", value);
    }
    /**
     * Sets the upgradeWindowEndTime property value. The site&apos;s upgrade window end time of day
     * @param value Value to set for the upgradeWindowEndTime property.
     */
    public void setUpgradeWindowEndTime(@jakarta.annotation.Nullable final LocalTime value) {
        this.backingStore.set("upgradeWindowEndTime", value);
    }
    /**
     * Sets the upgradeWindowStartTime property value. The site&apos;s upgrade window start time of day
     * @param value Value to set for the upgradeWindowStartTime property.
     */
    public void setUpgradeWindowStartTime(@jakarta.annotation.Nullable final LocalTime value) {
        this.backingStore.set("upgradeWindowStartTime", value);
    }
    /**
     * Sets the upgradeWindowUtcOffsetInMinutes property value. The site&apos;s timezone represented as a minute offset from UTC
     * @param value Value to set for the upgradeWindowUtcOffsetInMinutes property.
     */
    public void setUpgradeWindowUtcOffsetInMinutes(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("upgradeWindowUtcOffsetInMinutes", value);
    }
}
