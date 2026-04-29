package com.microsoft.graph.beta.models.networkaccess;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ForwardingPolicyLink extends PolicyLink implements Parsable {
    /**
     * Instantiates a new {@link ForwardingPolicyLink} and sets the default values.
     */
    public ForwardingPolicyLink() {
        super();
        this.setOdataType("#microsoft.graph.networkaccess.forwardingPolicyLink");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ForwardingPolicyLink}
     */
    @jakarta.annotation.Nonnull
    public static ForwardingPolicyLink createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ForwardingPolicyLink();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("priority", (n) -> { this.setPriority(n.getLongValue()); });
        return deserializerMap;
    }
    /**
     * Gets the priority property value. The priority property
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getPriority() {
        return this.backingStore.get("priority");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeLongValue("priority", this.getPriority());
    }
    /**
     * Sets the priority property value. The priority property
     * @param value Value to set for the priority property.
     */
    public void setPriority(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("priority", value);
    }
}
