package com.microsoft.graph.beta.models.networkaccess;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RemoteNetwork extends BaseEntity implements Parsable {
    /**
     * Instantiates a new {@link RemoteNetwork} and sets the default values.
     */
    public RemoteNetwork() {
        super();
        this.setOdataType("#microsoft.graph.networkaccess.remoteNetwork");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link RemoteNetwork}
     */
    @jakarta.annotation.Nonnull
    public static RemoteNetwork createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RemoteNetwork();
    }
    /**
     * Gets the connectivityConfiguration property value. Specifies the connectivity details of all device links associated with a remote network.
     * @return a {@link RemoteNetworkConnectivityConfiguration}
     */
    @jakarta.annotation.Nullable
    public RemoteNetworkConnectivityConfiguration getConnectivityConfiguration() {
        return this.backingStore.get("connectivityConfiguration");
    }
    /**
     * Gets the deviceLinks property value. Each unique CPE device associated with a remote network is specified. Supports $expand.
     * @return a {@link java.util.List<DeviceLink>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceLink> getDeviceLinks() {
        return this.backingStore.get("deviceLinks");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("connectivityConfiguration", (n) -> { this.setConnectivityConfiguration(n.getObjectValue(RemoteNetworkConnectivityConfiguration::createFromDiscriminatorValue)); });
        deserializerMap.put("deviceLinks", (n) -> { this.setDeviceLinks(n.getCollectionOfObjectValues(DeviceLink::createFromDiscriminatorValue)); });
        deserializerMap.put("forwardingProfiles", (n) -> { this.setForwardingProfiles(n.getCollectionOfObjectValues(ForwardingProfile::createFromDiscriminatorValue)); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("region", (n) -> { this.setRegion(n.getEnumValue(Region::forValue)); });
        deserializerMap.put("version", (n) -> { this.setVersion(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the forwardingProfiles property value. Each forwarding profile associated with a remote network is specified. Supports $expand and $select.
     * @return a {@link java.util.List<ForwardingProfile>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ForwardingProfile> getForwardingProfiles() {
        return this.backingStore.get("forwardingProfiles");
    }
    /**
     * Gets the lastModifiedDateTime property value. last modified time.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.backingStore.get("lastModifiedDateTime");
    }
    /**
     * Gets the region property value. The region property
     * @return a {@link Region}
     */
    @jakarta.annotation.Nullable
    public Region getRegion() {
        return this.backingStore.get("region");
    }
    /**
     * Gets the version property value. Remote network version.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getVersion() {
        return this.backingStore.get("version");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("connectivityConfiguration", this.getConnectivityConfiguration());
        writer.writeCollectionOfObjectValues("deviceLinks", this.getDeviceLinks());
        writer.writeCollectionOfObjectValues("forwardingProfiles", this.getForwardingProfiles());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeEnumValue("region", this.getRegion());
        writer.writeStringValue("version", this.getVersion());
    }
    /**
     * Sets the connectivityConfiguration property value. Specifies the connectivity details of all device links associated with a remote network.
     * @param value Value to set for the connectivityConfiguration property.
     */
    public void setConnectivityConfiguration(@jakarta.annotation.Nullable final RemoteNetworkConnectivityConfiguration value) {
        this.backingStore.set("connectivityConfiguration", value);
    }
    /**
     * Sets the deviceLinks property value. Each unique CPE device associated with a remote network is specified. Supports $expand.
     * @param value Value to set for the deviceLinks property.
     */
    public void setDeviceLinks(@jakarta.annotation.Nullable final java.util.List<DeviceLink> value) {
        this.backingStore.set("deviceLinks", value);
    }
    /**
     * Sets the forwardingProfiles property value. Each forwarding profile associated with a remote network is specified. Supports $expand and $select.
     * @param value Value to set for the forwardingProfiles property.
     */
    public void setForwardingProfiles(@jakarta.annotation.Nullable final java.util.List<ForwardingProfile> value) {
        this.backingStore.set("forwardingProfiles", value);
    }
    /**
     * Sets the lastModifiedDateTime property value. last modified time.
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastModifiedDateTime", value);
    }
    /**
     * Sets the region property value. The region property
     * @param value Value to set for the region property.
     */
    public void setRegion(@jakarta.annotation.Nullable final Region value) {
        this.backingStore.set("region", value);
    }
    /**
     * Sets the version property value. Remote network version.
     * @param value Value to set for the version property.
     */
    public void setVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("version", value);
    }
}
