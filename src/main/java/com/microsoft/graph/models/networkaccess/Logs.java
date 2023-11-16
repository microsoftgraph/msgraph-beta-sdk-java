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
        deserializerMap.put("traffic", (n) -> { this.setTraffic(n.getCollectionOfObjectValues(NetworkAccessTraffic::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the traffic property value. Represents a collection of log entries in the network access traffic log.
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
        writer.writeCollectionOfObjectValues("traffic", this.getTraffic());
    }
    /**
     * Sets the traffic property value. Represents a collection of log entries in the network access traffic log.
     * @param value Value to set for the traffic property.
     */
    public void setTraffic(@jakarta.annotation.Nullable final java.util.List<NetworkAccessTraffic> value) {
        this.backingStore.set("traffic", value);
    }
}
