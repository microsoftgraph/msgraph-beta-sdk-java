package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class External extends Entity implements Parsable {
    /**
     * Instantiates a new {@link External} and sets the default values.
     */
    public External() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link External}
     */
    @jakarta.annotation.Nonnull
    public static External createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new External();
    }
    /**
     * Gets the connections property value. The connections property
     * @return a {@link java.util.List<ExternalConnection>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ExternalConnection> getConnections() {
        return this.backingStore.get("connections");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("connections", (n) -> { this.setConnections(n.getCollectionOfObjectValues(ExternalConnection::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("connections", this.getConnections());
    }
    /**
     * Sets the connections property value. The connections property
     * @param value Value to set for the connections property.
     */
    public void setConnections(@jakarta.annotation.Nullable final java.util.List<ExternalConnection> value) {
        this.backingStore.set("connections", value);
    }
}
