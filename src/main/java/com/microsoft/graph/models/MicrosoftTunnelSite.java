package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.LocalTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Entity that represents a Microsoft Tunnel site */
public class MicrosoftTunnelSite extends Entity implements Parsable {
    /** The site's description (optional) */
    private String _description;
    /** The display name for the site. This property is required when a site is created. */
    private String _displayName;
    /** When set to true, certificate pinning will be enforced on connections between the Microsoft Tunnel server and Microsoft Tunnel clients. When set to false, certificate pinning will be disabled. */
    private Boolean _enableCertificatePinning;
    /** The site's Internal Network Access Probe URL */
    private String _internalNetworkProbeUrl;
    /** The MicrosoftTunnelConfiguration that has been applied to this MicrosoftTunnelSite */
    private MicrosoftTunnelConfiguration _microsoftTunnelConfiguration;
    /** A list of MicrosoftTunnelServers that are registered to this MicrosoftTunnelSite */
    private java.util.List<MicrosoftTunnelServer> _microsoftTunnelServers;
    /** The site's public domain name or IP address */
    private String _publicAddress;
    /** List of Scope Tags for this Entity instance */
    private java.util.List<String> _roleScopeTagIds;
    /** The site's automatic upgrade setting. True for automatic upgrades, false for manual control */
    private Boolean _upgradeAutomatically;
    /** The site provides the state of when an upgrade is available */
    private Boolean _upgradeAvailable;
    /** The site's upgrade window end time of day */
    private LocalTime _upgradeWindowEndTime;
    /** The site's upgrade window start time of day */
    private LocalTime _upgradeWindowStartTime;
    /** The site's timezone represented as a minute offset from UTC */
    private Integer _upgradeWindowUtcOffsetInMinutes;
    /**
     * Instantiates a new microsoftTunnelSite and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public MicrosoftTunnelSite() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a microsoftTunnelSite
     */
    @javax.annotation.Nonnull
    public static MicrosoftTunnelSite createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MicrosoftTunnelSite();
    }
    /**
     * Gets the description property value. The site's description (optional)
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * Gets the displayName property value. The display name for the site. This property is required when a site is created.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * Gets the enableCertificatePinning property value. When set to true, certificate pinning will be enforced on connections between the Microsoft Tunnel server and Microsoft Tunnel clients. When set to false, certificate pinning will be disabled.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEnableCertificatePinning() {
        return this._enableCertificatePinning;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("enableCertificatePinning", (n) -> { this.setEnableCertificatePinning(n.getBooleanValue()); });
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
    @javax.annotation.Nullable
    public String getInternalNetworkProbeUrl() {
        return this._internalNetworkProbeUrl;
    }
    /**
     * Gets the microsoftTunnelConfiguration property value. The MicrosoftTunnelConfiguration that has been applied to this MicrosoftTunnelSite
     * @return a microsoftTunnelConfiguration
     */
    @javax.annotation.Nullable
    public MicrosoftTunnelConfiguration getMicrosoftTunnelConfiguration() {
        return this._microsoftTunnelConfiguration;
    }
    /**
     * Gets the microsoftTunnelServers property value. A list of MicrosoftTunnelServers that are registered to this MicrosoftTunnelSite
     * @return a microsoftTunnelServer
     */
    @javax.annotation.Nullable
    public java.util.List<MicrosoftTunnelServer> getMicrosoftTunnelServers() {
        return this._microsoftTunnelServers;
    }
    /**
     * Gets the publicAddress property value. The site's public domain name or IP address
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPublicAddress() {
        return this._publicAddress;
    }
    /**
     * Gets the roleScopeTagIds property value. List of Scope Tags for this Entity instance
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getRoleScopeTagIds() {
        return this._roleScopeTagIds;
    }
    /**
     * Gets the upgradeAutomatically property value. The site's automatic upgrade setting. True for automatic upgrades, false for manual control
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getUpgradeAutomatically() {
        return this._upgradeAutomatically;
    }
    /**
     * Gets the upgradeAvailable property value. The site provides the state of when an upgrade is available
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getUpgradeAvailable() {
        return this._upgradeAvailable;
    }
    /**
     * Gets the upgradeWindowEndTime property value. The site's upgrade window end time of day
     * @return a LocalTime
     */
    @javax.annotation.Nullable
    public LocalTime getUpgradeWindowEndTime() {
        return this._upgradeWindowEndTime;
    }
    /**
     * Gets the upgradeWindowStartTime property value. The site's upgrade window start time of day
     * @return a LocalTime
     */
    @javax.annotation.Nullable
    public LocalTime getUpgradeWindowStartTime() {
        return this._upgradeWindowStartTime;
    }
    /**
     * Gets the upgradeWindowUtcOffsetInMinutes property value. The site's timezone represented as a minute offset from UTC
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getUpgradeWindowUtcOffsetInMinutes() {
        return this._upgradeWindowUtcOffsetInMinutes;
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
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeBooleanValue("enableCertificatePinning", this.getEnableCertificatePinning());
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
    @javax.annotation.Nonnull
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the displayName property value. The display name for the site. This property is required when a site is created.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the enableCertificatePinning property value. When set to true, certificate pinning will be enforced on connections between the Microsoft Tunnel server and Microsoft Tunnel clients. When set to false, certificate pinning will be disabled.
     * @param value Value to set for the enableCertificatePinning property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEnableCertificatePinning(@javax.annotation.Nullable final Boolean value) {
        this._enableCertificatePinning = value;
    }
    /**
     * Sets the internalNetworkProbeUrl property value. The site's Internal Network Access Probe URL
     * @param value Value to set for the internalNetworkProbeUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInternalNetworkProbeUrl(@javax.annotation.Nullable final String value) {
        this._internalNetworkProbeUrl = value;
    }
    /**
     * Sets the microsoftTunnelConfiguration property value. The MicrosoftTunnelConfiguration that has been applied to this MicrosoftTunnelSite
     * @param value Value to set for the microsoftTunnelConfiguration property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMicrosoftTunnelConfiguration(@javax.annotation.Nullable final MicrosoftTunnelConfiguration value) {
        this._microsoftTunnelConfiguration = value;
    }
    /**
     * Sets the microsoftTunnelServers property value. A list of MicrosoftTunnelServers that are registered to this MicrosoftTunnelSite
     * @param value Value to set for the microsoftTunnelServers property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMicrosoftTunnelServers(@javax.annotation.Nullable final java.util.List<MicrosoftTunnelServer> value) {
        this._microsoftTunnelServers = value;
    }
    /**
     * Sets the publicAddress property value. The site's public domain name or IP address
     * @param value Value to set for the publicAddress property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPublicAddress(@javax.annotation.Nullable final String value) {
        this._publicAddress = value;
    }
    /**
     * Sets the roleScopeTagIds property value. List of Scope Tags for this Entity instance
     * @param value Value to set for the roleScopeTagIds property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRoleScopeTagIds(@javax.annotation.Nullable final java.util.List<String> value) {
        this._roleScopeTagIds = value;
    }
    /**
     * Sets the upgradeAutomatically property value. The site's automatic upgrade setting. True for automatic upgrades, false for manual control
     * @param value Value to set for the upgradeAutomatically property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUpgradeAutomatically(@javax.annotation.Nullable final Boolean value) {
        this._upgradeAutomatically = value;
    }
    /**
     * Sets the upgradeAvailable property value. The site provides the state of when an upgrade is available
     * @param value Value to set for the upgradeAvailable property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUpgradeAvailable(@javax.annotation.Nullable final Boolean value) {
        this._upgradeAvailable = value;
    }
    /**
     * Sets the upgradeWindowEndTime property value. The site's upgrade window end time of day
     * @param value Value to set for the upgradeWindowEndTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUpgradeWindowEndTime(@javax.annotation.Nullable final LocalTime value) {
        this._upgradeWindowEndTime = value;
    }
    /**
     * Sets the upgradeWindowStartTime property value. The site's upgrade window start time of day
     * @param value Value to set for the upgradeWindowStartTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUpgradeWindowStartTime(@javax.annotation.Nullable final LocalTime value) {
        this._upgradeWindowStartTime = value;
    }
    /**
     * Sets the upgradeWindowUtcOffsetInMinutes property value. The site's timezone represented as a minute offset from UTC
     * @param value Value to set for the upgradeWindowUtcOffsetInMinutes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUpgradeWindowUtcOffsetInMinutes(@javax.annotation.Nullable final Integer value) {
        this._upgradeWindowUtcOffsetInMinutes = value;
    }
}
