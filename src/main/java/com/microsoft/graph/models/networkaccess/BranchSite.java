package com.microsoft.graph.models.networkaccess;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class BranchSite extends Entity implements Parsable {
    /**
     * Determines the maximum allowed Mbps (megabits per second) bandwidth from a branch site. The possible values are:250,500,750,1000.
     */
    private Long bandwidthCapacity;
    /**
     * The connectivityConfiguration property
     */
    private BranchConnectivityConfiguration connectivityConfiguration;
    /**
     * Determines the branch site status. The possible values are: pending, connected, inactive, error.
     */
    private ConnectivityState connectivityState;
    /**
     * The branch site is created in the specified country.
     */
    private String country;
    /**
     * Each unique CPE device associated with a branch is specified. Supports $expand.
     */
    private java.util.List<DeviceLink> deviceLinks;
    /**
     * Each forwarding profile associated with a branch site is specified. Supports $expand.
     */
    private java.util.List<ForwardingProfile> forwardingProfiles;
    /**
     * last modified time.
     */
    private OffsetDateTime lastModifiedDateTime;
    /**
     * Name.
     */
    private String name;
    /**
     * The region property
     */
    private Region region;
    /**
     * The branch version.
     */
    private String version;
    /**
     * Instantiates a new branchSite and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public BranchSite() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a branchSite
     */
    @jakarta.annotation.Nonnull
    public static BranchSite createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BranchSite();
    }
    /**
     * Gets the bandwidthCapacity property value. Determines the maximum allowed Mbps (megabits per second) bandwidth from a branch site. The possible values are:250,500,750,1000.
     * @return a int64
     */
    @jakarta.annotation.Nullable
    public Long getBandwidthCapacity() {
        return this.bandwidthCapacity;
    }
    /**
     * Gets the connectivityConfiguration property value. The connectivityConfiguration property
     * @return a branchConnectivityConfiguration
     */
    @jakarta.annotation.Nullable
    public BranchConnectivityConfiguration getConnectivityConfiguration() {
        return this.connectivityConfiguration;
    }
    /**
     * Gets the connectivityState property value. Determines the branch site status. The possible values are: pending, connected, inactive, error.
     * @return a connectivityState
     */
    @jakarta.annotation.Nullable
    public ConnectivityState getConnectivityState() {
        return this.connectivityState;
    }
    /**
     * Gets the country property value. The branch site is created in the specified country.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getCountry() {
        return this.country;
    }
    /**
     * Gets the deviceLinks property value. Each unique CPE device associated with a branch is specified. Supports $expand.
     * @return a deviceLink
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceLink> getDeviceLinks() {
        return this.deviceLinks;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("bandwidthCapacity", (n) -> { this.setBandwidthCapacity(n.getLongValue()); });
        deserializerMap.put("connectivityConfiguration", (n) -> { this.setConnectivityConfiguration(n.getObjectValue(BranchConnectivityConfiguration::createFromDiscriminatorValue)); });
        deserializerMap.put("connectivityState", (n) -> { this.setConnectivityState(n.getEnumValue(ConnectivityState.class)); });
        deserializerMap.put("country", (n) -> { this.setCountry(n.getStringValue()); });
        deserializerMap.put("deviceLinks", (n) -> { this.setDeviceLinks(n.getCollectionOfObjectValues(DeviceLink::createFromDiscriminatorValue)); });
        deserializerMap.put("forwardingProfiles", (n) -> { this.setForwardingProfiles(n.getCollectionOfObjectValues(ForwardingProfile::createFromDiscriminatorValue)); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("region", (n) -> { this.setRegion(n.getEnumValue(Region.class)); });
        deserializerMap.put("version", (n) -> { this.setVersion(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the forwardingProfiles property value. Each forwarding profile associated with a branch site is specified. Supports $expand.
     * @return a forwardingProfile
     */
    @jakarta.annotation.Nullable
    public java.util.List<ForwardingProfile> getForwardingProfiles() {
        return this.forwardingProfiles;
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
     * Gets the region property value. The region property
     * @return a region
     */
    @jakarta.annotation.Nullable
    public Region getRegion() {
        return this.region;
    }
    /**
     * Gets the version property value. The branch version.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getVersion() {
        return this.version;
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
        writer.writeLongValue("bandwidthCapacity", this.getBandwidthCapacity());
        writer.writeObjectValue("connectivityConfiguration", this.getConnectivityConfiguration());
        writer.writeEnumValue("connectivityState", this.getConnectivityState());
        writer.writeStringValue("country", this.getCountry());
        writer.writeCollectionOfObjectValues("deviceLinks", this.getDeviceLinks());
        writer.writeCollectionOfObjectValues("forwardingProfiles", this.getForwardingProfiles());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeStringValue("name", this.getName());
        writer.writeEnumValue("region", this.getRegion());
        writer.writeStringValue("version", this.getVersion());
    }
    /**
     * Sets the bandwidthCapacity property value. Determines the maximum allowed Mbps (megabits per second) bandwidth from a branch site. The possible values are:250,500,750,1000.
     * @param value Value to set for the bandwidthCapacity property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setBandwidthCapacity(@jakarta.annotation.Nullable final Long value) {
        this.bandwidthCapacity = value;
    }
    /**
     * Sets the connectivityConfiguration property value. The connectivityConfiguration property
     * @param value Value to set for the connectivityConfiguration property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setConnectivityConfiguration(@jakarta.annotation.Nullable final BranchConnectivityConfiguration value) {
        this.connectivityConfiguration = value;
    }
    /**
     * Sets the connectivityState property value. Determines the branch site status. The possible values are: pending, connected, inactive, error.
     * @param value Value to set for the connectivityState property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setConnectivityState(@jakarta.annotation.Nullable final ConnectivityState value) {
        this.connectivityState = value;
    }
    /**
     * Sets the country property value. The branch site is created in the specified country.
     * @param value Value to set for the country property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setCountry(@jakarta.annotation.Nullable final String value) {
        this.country = value;
    }
    /**
     * Sets the deviceLinks property value. Each unique CPE device associated with a branch is specified. Supports $expand.
     * @param value Value to set for the deviceLinks property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDeviceLinks(@jakarta.annotation.Nullable final java.util.List<DeviceLink> value) {
        this.deviceLinks = value;
    }
    /**
     * Sets the forwardingProfiles property value. Each forwarding profile associated with a branch site is specified. Supports $expand.
     * @param value Value to set for the forwardingProfiles property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setForwardingProfiles(@jakarta.annotation.Nullable final java.util.List<ForwardingProfile> value) {
        this.forwardingProfiles = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. last modified time.
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastModifiedDateTime = value;
    }
    /**
     * Sets the name property value. Name.
     * @param value Value to set for the name property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the region property value. The region property
     * @param value Value to set for the region property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setRegion(@jakarta.annotation.Nullable final Region value) {
        this.region = value;
    }
    /**
     * Sets the version property value. The branch version.
     * @param value Value to set for the version property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setVersion(@jakarta.annotation.Nullable final String value) {
        this.version = value;
    }
}
