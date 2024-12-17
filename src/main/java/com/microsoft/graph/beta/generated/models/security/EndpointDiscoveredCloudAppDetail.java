package com.microsoft.graph.beta.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EndpointDiscoveredCloudAppDetail extends DiscoveredCloudAppDetail implements Parsable {
    /**
     * Instantiates a new {@link EndpointDiscoveredCloudAppDetail} and sets the default values.
     */
    public EndpointDiscoveredCloudAppDetail() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link EndpointDiscoveredCloudAppDetail}
     */
    @jakarta.annotation.Nonnull
    public static EndpointDiscoveredCloudAppDetail createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EndpointDiscoveredCloudAppDetail();
    }
    /**
     * Gets the deviceCount property value. The number of devices that accessed the discovered app.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getDeviceCount() {
        return this.backingStore.get("deviceCount");
    }
    /**
     * Gets the devices property value. Represents the devices that access the discovered apps.
     * @return a {@link java.util.List<DiscoveredCloudAppDevice>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DiscoveredCloudAppDevice> getDevices() {
        return this.backingStore.get("devices");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("deviceCount", (n) -> { this.setDeviceCount(n.getLongValue()); });
        deserializerMap.put("devices", (n) -> { this.setDevices(n.getCollectionOfObjectValues(DiscoveredCloudAppDevice::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeLongValue("deviceCount", this.getDeviceCount());
        writer.writeCollectionOfObjectValues("devices", this.getDevices());
    }
    /**
     * Sets the deviceCount property value. The number of devices that accessed the discovered app.
     * @param value Value to set for the deviceCount property.
     */
    public void setDeviceCount(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("deviceCount", value);
    }
    /**
     * Sets the devices property value. Represents the devices that access the discovered apps.
     * @param value Value to set for the devices property.
     */
    public void setDevices(@jakarta.annotation.Nullable final java.util.List<DiscoveredCloudAppDevice> value) {
        this.backingStore.set("devices", value);
    }
}
