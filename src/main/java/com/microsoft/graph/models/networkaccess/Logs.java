package com.microsoft.graph.models.networkaccess;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Logs extends Entity implements Parsable {
    /**
     * Instantiates a new Logs and sets the default values.
     */
    public Logs() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Logs
     */
    @jakarta.annotation.Nonnull
    public static Logs createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Logs();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("remoteNetworks", (n) -> { this.setRemoteNetworks(n.getCollectionOfObjectValues(RemoteNetworkHealthEvent::createFromDiscriminatorValue)); });
        deserializerMap.put("traffic", (n) -> { this.setTraffic(n.getCollectionOfObjectValues(NetworkAccessTraffic::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the remoteNetworks property value. A collection of remote network health events.
     * @return a java.util.List<RemoteNetworkHealthEvent>
     */
    @jakarta.annotation.Nullable
    public java.util.List<RemoteNetworkHealthEvent> getRemoteNetworks() {
        return this.backingStore.get("remoteNetworks");
    }
    /**
     * Gets the traffic property value. A network access traffic log entry that contains comprehensive information about network traffic events.
     * @return a java.util.List<NetworkAccessTraffic>
     */
    @jakarta.annotation.Nullable
    public java.util.List<NetworkAccessTraffic> getTraffic() {
        return this.backingStore.get("traffic");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("remoteNetworks", this.getRemoteNetworks());
        writer.writeCollectionOfObjectValues("traffic", this.getTraffic());
    }
    /**
     * Sets the remoteNetworks property value. A collection of remote network health events.
     * @param value Value to set for the remoteNetworks property.
     */
    public void setRemoteNetworks(@jakarta.annotation.Nullable final java.util.List<RemoteNetworkHealthEvent> value) {
        this.backingStore.set("remoteNetworks", value);
    }
    /**
     * Sets the traffic property value. A network access traffic log entry that contains comprehensive information about network traffic events.
     * @param value Value to set for the traffic property.
     */
    public void setTraffic(@jakarta.annotation.Nullable final java.util.List<NetworkAccessTraffic> value) {
        this.backingStore.set("traffic", value);
    }
}
