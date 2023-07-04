package com.microsoft.graph.models.networkaccess;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DeviceLink extends Entity implements Parsable {
    /**
     * The bandwidthCapacityInMbps property
     */
    private BandwidthCapacityInMbps bandwidthCapacityInMbps;
    /**
     * The bgpConfiguration property
     */
    private BgpConfiguration bgpConfiguration;
    /**
     * The deviceVendor property
     */
    private DeviceVendor deviceVendor;
    /**
     * The ipAddress property
     */
    private String ipAddress;
    /**
     * The lastModifiedDateTime property
     */
    private OffsetDateTime lastModifiedDateTime;
    /**
     * The name property
     */
    private String name;
    /**
     * The redundancyConfiguration property
     */
    private RedundancyConfiguration redundancyConfiguration;
    /**
     * The tunnelConfiguration property
     */
    private TunnelConfiguration tunnelConfiguration;
    /**
     * Instantiates a new deviceLink and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DeviceLink() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceLink
     */
    @javax.annotation.Nonnull
    public static DeviceLink createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceLink();
    }
    /**
     * Gets the bandwidthCapacityInMbps property value. The bandwidthCapacityInMbps property
     * @return a bandwidthCapacityInMbps
     */
    @javax.annotation.Nullable
    public BandwidthCapacityInMbps getBandwidthCapacityInMbps() {
        return this.bandwidthCapacityInMbps;
    }
    /**
     * Gets the bgpConfiguration property value. The bgpConfiguration property
     * @return a BgpConfiguration
     */
    @javax.annotation.Nullable
    public BgpConfiguration getBgpConfiguration() {
        return this.bgpConfiguration;
    }
    /**
     * Gets the deviceVendor property value. The deviceVendor property
     * @return a DeviceVendor
     */
    @javax.annotation.Nullable
    public DeviceVendor getDeviceVendor() {
        return this.deviceVendor;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("bandwidthCapacityInMbps", (n) -> { this.setBandwidthCapacityInMbps(n.getEnumValue(BandwidthCapacityInMbps.class)); });
        deserializerMap.put("bgpConfiguration", (n) -> { this.setBgpConfiguration(n.getObjectValue(BgpConfiguration::createFromDiscriminatorValue)); });
        deserializerMap.put("deviceVendor", (n) -> { this.setDeviceVendor(n.getEnumValue(DeviceVendor.class)); });
        deserializerMap.put("ipAddress", (n) -> { this.setIpAddress(n.getStringValue()); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("redundancyConfiguration", (n) -> { this.setRedundancyConfiguration(n.getObjectValue(RedundancyConfiguration::createFromDiscriminatorValue)); });
        deserializerMap.put("tunnelConfiguration", (n) -> { this.setTunnelConfiguration(n.getObjectValue(TunnelConfiguration::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the ipAddress property value. The ipAddress property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getIpAddress() {
        return this.ipAddress;
    }
    /**
     * Gets the lastModifiedDateTime property value. The lastModifiedDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.lastModifiedDateTime;
    }
    /**
     * Gets the name property value. The name property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the redundancyConfiguration property value. The redundancyConfiguration property
     * @return a redundancyConfiguration
     */
    @javax.annotation.Nullable
    public RedundancyConfiguration getRedundancyConfiguration() {
        return this.redundancyConfiguration;
    }
    /**
     * Gets the tunnelConfiguration property value. The tunnelConfiguration property
     * @return a TunnelConfiguration
     */
    @javax.annotation.Nullable
    public TunnelConfiguration getTunnelConfiguration() {
        return this.tunnelConfiguration;
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
        writer.writeEnumValue("bandwidthCapacityInMbps", this.getBandwidthCapacityInMbps());
        writer.writeObjectValue("bgpConfiguration", this.getBgpConfiguration());
        writer.writeEnumValue("deviceVendor", this.getDeviceVendor());
        writer.writeStringValue("ipAddress", this.getIpAddress());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeStringValue("name", this.getName());
        writer.writeObjectValue("redundancyConfiguration", this.getRedundancyConfiguration());
        writer.writeObjectValue("tunnelConfiguration", this.getTunnelConfiguration());
    }
    /**
     * Sets the bandwidthCapacityInMbps property value. The bandwidthCapacityInMbps property
     * @param value Value to set for the bandwidthCapacityInMbps property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBandwidthCapacityInMbps(@javax.annotation.Nullable final BandwidthCapacityInMbps value) {
        this.bandwidthCapacityInMbps = value;
    }
    /**
     * Sets the bgpConfiguration property value. The bgpConfiguration property
     * @param value Value to set for the bgpConfiguration property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBgpConfiguration(@javax.annotation.Nullable final BgpConfiguration value) {
        this.bgpConfiguration = value;
    }
    /**
     * Sets the deviceVendor property value. The deviceVendor property
     * @param value Value to set for the deviceVendor property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceVendor(@javax.annotation.Nullable final DeviceVendor value) {
        this.deviceVendor = value;
    }
    /**
     * Sets the ipAddress property value. The ipAddress property
     * @param value Value to set for the ipAddress property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIpAddress(@javax.annotation.Nullable final String value) {
        this.ipAddress = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. The lastModifiedDateTime property
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.lastModifiedDateTime = value;
    }
    /**
     * Sets the name property value. The name property
     * @param value Value to set for the name property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setName(@javax.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the redundancyConfiguration property value. The redundancyConfiguration property
     * @param value Value to set for the redundancyConfiguration property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRedundancyConfiguration(@javax.annotation.Nullable final RedundancyConfiguration value) {
        this.redundancyConfiguration = value;
    }
    /**
     * Sets the tunnelConfiguration property value. The tunnelConfiguration property
     * @param value Value to set for the tunnelConfiguration property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTunnelConfiguration(@javax.annotation.Nullable final TunnelConfiguration value) {
        this.tunnelConfiguration = value;
    }
}
