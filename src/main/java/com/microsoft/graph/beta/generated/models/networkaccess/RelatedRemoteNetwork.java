package com.microsoft.graph.beta.models.networkaccess;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RelatedRemoteNetwork extends RelatedResource implements Parsable {
    /**
     * Instantiates a new {@link RelatedRemoteNetwork} and sets the default values.
     */
    public RelatedRemoteNetwork() {
        super();
        this.setOdataType("#microsoft.graph.networkaccess.relatedRemoteNetwork");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link RelatedRemoteNetwork}
     */
    @jakarta.annotation.Nonnull
    public static RelatedRemoteNetwork createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RelatedRemoteNetwork();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("remoteNetworkId", (n) -> { this.setRemoteNetworkId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the remoteNetworkId property value. Unique identifier of the remote network. Required.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRemoteNetworkId() {
        return this.backingStore.get("remoteNetworkId");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("remoteNetworkId", this.getRemoteNetworkId());
    }
    /**
     * Sets the remoteNetworkId property value. Unique identifier of the remote network. Required.
     * @param value Value to set for the remoteNetworkId property.
     */
    public void setRemoteNetworkId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("remoteNetworkId", value);
    }
}
