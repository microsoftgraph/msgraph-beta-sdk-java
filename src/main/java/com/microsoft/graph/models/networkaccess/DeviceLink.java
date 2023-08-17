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
     * Determines the maximum allowed Mbps (megabits per second) bandwidth from a branch site. The possible values are:250,500,750,1000.
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
     * Specifies the client IPv4 of the link
     */
    private String ipAddress;
    /**
     * last modified time.
     */
    private OffsetDateTime lastModifiedDateTime;
    /**
     * Name.
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
     */
    public DeviceLink() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceLink
     */
    @jakarta.annotation.Nonnull
    public static DeviceLink createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceLink();
    }
    /**
     * Gets the bandwidthCapacityInMbps property value. Determines the maximum allowed Mbps (megabits per second) bandwidth from a branch site. The possible values are:250,500,750,1000.
     * @return a bandwidthCapacityInMbps
     */
    @jakarta.annotation.Nullable
    public BandwidthCapacityInMbps getBandwidthCapacityInMbps() {
        return this.bandwidthCapacityInMbps;
    }
    /**
     * Gets the bgpConfiguration property value. The bgpConfiguration property
     * @return a bgpConfiguration
     */
    @jakarta.annotation.Nullable
    public BgpConfiguration getBgpConfiguration() {
        return this.bgpConfiguration;
    }
    /**
     * Gets the deviceVendor property value. The deviceVendor property
     * @return a deviceVendor
     */
    @jakarta.annotation.Nullable
    public DeviceVendor getDeviceVendor() {
        return this.deviceVendor;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
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
     * Gets the ipAddress property value. Specifies the client IPv4 of the link
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getIpAddress() {
        return this.ipAddress;
    }
    /**
     * Gets the lastModifiedDateTime property value. last modified time.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.lastModifiedDateTime;
    }
    /**
     * Gets the name property value. Name.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the redundancyConfiguration property value. The redundancyConfiguration property
     * @return a redundancyConfiguration
     */
    @jakarta.annotation.Nullable
    public RedundancyConfiguration getRedundancyConfiguration() {
        return this.redundancyConfiguration;
    }
    /**
     * Gets the tunnelConfiguration property value. The tunnelConfiguration property
     * @return a tunnelConfiguration
     */
    @jakarta.annotation.Nullable
    public TunnelConfiguration getTunnelConfiguration() {
        return this.tunnelConfiguration;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     * Sets the bandwidthCapacityInMbps property value. Determines the maximum allowed Mbps (megabits per second) bandwidth from a branch site. The possible values are:250,500,750,1000.
     * @param value Value to set for the bandwidthCapacityInMbps property.
     */
    public void setBandwidthCapacityInMbps(@jakarta.annotation.Nullable final BandwidthCapacityInMbps value) {
        this.bandwidthCapacityInMbps = value;
    }
    /**
     * Sets the bgpConfiguration property value. The bgpConfiguration property
     * @param value Value to set for the bgpConfiguration property.
     */
    public void setBgpConfiguration(@jakarta.annotation.Nullable final BgpConfiguration value) {
        this.bgpConfiguration = value;
    }
    /**
     * Sets the deviceVendor property value. The deviceVendor property
     * @param value Value to set for the deviceVendor property.
     */
    public void setDeviceVendor(@jakarta.annotation.Nullable final DeviceVendor value) {
        this.deviceVendor = value;
    }
    /**
     * Sets the ipAddress property value. Specifies the client IPv4 of the link
     * @param value Value to set for the ipAddress property.
     */
    public void setIpAddress(@jakarta.annotation.Nullable final String value) {
        this.ipAddress = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. last modified time.
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastModifiedDateTime = value;
    }
    /**
     * Sets the name property value. Name.
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the redundancyConfiguration property value. The redundancyConfiguration property
     * @param value Value to set for the redundancyConfiguration property.
     */
    public void setRedundancyConfiguration(@jakarta.annotation.Nullable final RedundancyConfiguration value) {
        this.redundancyConfiguration = value;
    }
    /**
     * Sets the tunnelConfiguration property value. The tunnelConfiguration property
     * @param value Value to set for the tunnelConfiguration property.
     */
    public void setTunnelConfiguration(@jakarta.annotation.Nullable final TunnelConfiguration value) {
        this.tunnelConfiguration = value;
    }
}
