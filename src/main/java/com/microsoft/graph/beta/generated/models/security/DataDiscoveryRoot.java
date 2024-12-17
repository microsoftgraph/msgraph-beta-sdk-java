package com.microsoft.graph.beta.models.security;

import com.microsoft.graph.beta.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DataDiscoveryRoot extends Entity implements Parsable {
    /**
     * Instantiates a new {@link DataDiscoveryRoot} and sets the default values.
     */
    public DataDiscoveryRoot() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link DataDiscoveryRoot}
     */
    @jakarta.annotation.Nonnull
    public static DataDiscoveryRoot createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DataDiscoveryRoot();
    }
    /**
     * Gets the cloudAppDiscovery property value. The available entities are IP addresses, devices, and users who access a cloud app.
     * @return a {@link DataDiscoveryReport}
     */
    @jakarta.annotation.Nullable
    public DataDiscoveryReport getCloudAppDiscovery() {
        return this.backingStore.get("cloudAppDiscovery");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("cloudAppDiscovery", (n) -> { this.setCloudAppDiscovery(n.getObjectValue(DataDiscoveryReport::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("cloudAppDiscovery", this.getCloudAppDiscovery());
    }
    /**
     * Sets the cloudAppDiscovery property value. The available entities are IP addresses, devices, and users who access a cloud app.
     * @param value Value to set for the cloudAppDiscovery property.
     */
    public void setCloudAppDiscovery(@jakarta.annotation.Nullable final DataDiscoveryReport value) {
        this.backingStore.set("cloudAppDiscovery", value);
    }
}
