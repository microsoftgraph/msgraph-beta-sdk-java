package com.microsoft.graph.models;

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
public class MicrosoftTunnelSite extends Entity implements Parsable {
    /**
     * The site's description (optional)
     */
    private String description;
    /**
     * The display name for the site. This property is required when a site is created.
     */
    private String displayName;
    /**
     * The site's Internal Network Access Probe URL
     */
    private String internalNetworkProbeUrl;
    /**
     * The MicrosoftTunnelConfiguration that has been applied to this MicrosoftTunnelSite
     */
    private MicrosoftTunnelConfiguration microsoftTunnelConfiguration;
    /**
     * A list of MicrosoftTunnelServers that are registered to this MicrosoftTunnelSite
     */
    private java.util.List<MicrosoftTunnelServer> microsoftTunnelServers;
    /**
     * The site's public domain name or IP address
     */
    private String publicAddress;
    /**
     * List of Scope Tags for this Entity instance
     */
    private java.util.List<String> roleScopeTagIds;
    /**
     * The site's automatic upgrade setting. True for automatic upgrades, false for manual control
     */
    private Boolean upgradeAutomatically;
    /**
     * The site provides the state of when an upgrade is available
     */
    private Boolean upgradeAvailable;
    /**
     * The site's upgrade window end time of day
     */
    private LocalTime upgradeWindowEndTime;
    /**
     * The site's upgrade window start time of day
     */
    private LocalTime upgradeWindowStartTime;
    /**
     * The site's timezone represented as a minute offset from UTC
     */
    private Integer upgradeWindowUtcOffsetInMinutes;
    /**
     * Instantiates a new microsoftTunnelSite and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public MicrosoftTunnelSite() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a microsoftTunnelSite
     */
    @jakarta.annotation.Nonnull
    public static MicrosoftTunnelSite createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MicrosoftTunnelSite();
    }
    /**
     * Gets the description property value. The site's description (optional)
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the displayName property value. The display name for the site. This property is required when a site is created.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
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
     * Gets the internalNetworkProbeUrl property value. The site's Internal Network Access Probe URL
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getInternalNetworkProbeUrl() {
        return this.internalNetworkProbeUrl;
    }
    /**
     * Gets the microsoftTunnelConfiguration property value. The MicrosoftTunnelConfiguration that has been applied to this MicrosoftTunnelSite
     * @return a microsoftTunnelConfiguration
     */
    @jakarta.annotation.Nullable
    public MicrosoftTunnelConfiguration getMicrosoftTunnelConfiguration() {
        return this.microsoftTunnelConfiguration;
    }
    /**
     * Gets the microsoftTunnelServers property value. A list of MicrosoftTunnelServers that are registered to this MicrosoftTunnelSite
     * @return a microsoftTunnelServer
     */
    @jakarta.annotation.Nullable
    public java.util.List<MicrosoftTunnelServer> getMicrosoftTunnelServers() {
        return this.microsoftTunnelServers;
    }
    /**
     * Gets the publicAddress property value. The site's public domain name or IP address
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getPublicAddress() {
        return this.publicAddress;
    }
    /**
     * Gets the roleScopeTagIds property value. List of Scope Tags for this Entity instance
     * @return a string
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getRoleScopeTagIds() {
        return this.roleScopeTagIds;
    }
    /**
     * Gets the upgradeAutomatically property value. The site's automatic upgrade setting. True for automatic upgrades, false for manual control
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getUpgradeAutomatically() {
        return this.upgradeAutomatically;
    }
    /**
     * Gets the upgradeAvailable property value. The site provides the state of when an upgrade is available
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getUpgradeAvailable() {
        return this.upgradeAvailable;
    }
    /**
     * Gets the upgradeWindowEndTime property value. The site's upgrade window end time of day
     * @return a LocalTime
     */
    @jakarta.annotation.Nullable
    public LocalTime getUpgradeWindowEndTime() {
        return this.upgradeWindowEndTime;
    }
    /**
     * Gets the upgradeWindowStartTime property value. The site's upgrade window start time of day
     * @return a LocalTime
     */
    @jakarta.annotation.Nullable
    public LocalTime getUpgradeWindowStartTime() {
        return this.upgradeWindowStartTime;
    }
    /**
     * Gets the upgradeWindowUtcOffsetInMinutes property value. The site's timezone represented as a minute offset from UTC
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getUpgradeWindowUtcOffsetInMinutes() {
        return this.upgradeWindowUtcOffsetInMinutes;
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
     * Sets the description property value. The site's description (optional)
     * @param value Value to set for the description property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the displayName property value. The display name for the site. This property is required when a site is created.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the internalNetworkProbeUrl property value. The site's Internal Network Access Probe URL
     * @param value Value to set for the internalNetworkProbeUrl property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setInternalNetworkProbeUrl(@jakarta.annotation.Nullable final String value) {
        this.internalNetworkProbeUrl = value;
    }
    /**
     * Sets the microsoftTunnelConfiguration property value. The MicrosoftTunnelConfiguration that has been applied to this MicrosoftTunnelSite
     * @param value Value to set for the microsoftTunnelConfiguration property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setMicrosoftTunnelConfiguration(@jakarta.annotation.Nullable final MicrosoftTunnelConfiguration value) {
        this.microsoftTunnelConfiguration = value;
    }
    /**
     * Sets the microsoftTunnelServers property value. A list of MicrosoftTunnelServers that are registered to this MicrosoftTunnelSite
     * @param value Value to set for the microsoftTunnelServers property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setMicrosoftTunnelServers(@jakarta.annotation.Nullable final java.util.List<MicrosoftTunnelServer> value) {
        this.microsoftTunnelServers = value;
    }
    /**
     * Sets the publicAddress property value. The site's public domain name or IP address
     * @param value Value to set for the publicAddress property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setPublicAddress(@jakarta.annotation.Nullable final String value) {
        this.publicAddress = value;
    }
    /**
     * Sets the roleScopeTagIds property value. List of Scope Tags for this Entity instance
     * @param value Value to set for the roleScopeTagIds property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setRoleScopeTagIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.roleScopeTagIds = value;
    }
    /**
     * Sets the upgradeAutomatically property value. The site's automatic upgrade setting. True for automatic upgrades, false for manual control
     * @param value Value to set for the upgradeAutomatically property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setUpgradeAutomatically(@jakarta.annotation.Nullable final Boolean value) {
        this.upgradeAutomatically = value;
    }
    /**
     * Sets the upgradeAvailable property value. The site provides the state of when an upgrade is available
     * @param value Value to set for the upgradeAvailable property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setUpgradeAvailable(@jakarta.annotation.Nullable final Boolean value) {
        this.upgradeAvailable = value;
    }
    /**
     * Sets the upgradeWindowEndTime property value. The site's upgrade window end time of day
     * @param value Value to set for the upgradeWindowEndTime property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setUpgradeWindowEndTime(@jakarta.annotation.Nullable final LocalTime value) {
        this.upgradeWindowEndTime = value;
    }
    /**
     * Sets the upgradeWindowStartTime property value. The site's upgrade window start time of day
     * @param value Value to set for the upgradeWindowStartTime property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setUpgradeWindowStartTime(@jakarta.annotation.Nullable final LocalTime value) {
        this.upgradeWindowStartTime = value;
    }
    /**
     * Sets the upgradeWindowUtcOffsetInMinutes property value. The site's timezone represented as a minute offset from UTC
     * @param value Value to set for the upgradeWindowUtcOffsetInMinutes property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setUpgradeWindowUtcOffsetInMinutes(@jakarta.annotation.Nullable final Integer value) {
        this.upgradeWindowUtcOffsetInMinutes = value;
    }
}
