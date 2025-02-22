package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.serialization.UntypedNode;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Represents an un-typed status report about organizations app protection and configuration.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ManagedAppStatusRaw extends ManagedAppStatus implements Parsable {
    /**
     * Instantiates a new {@link ManagedAppStatusRaw} and sets the default values.
     */
    public ManagedAppStatusRaw() {
        super();
        this.setOdataType("#microsoft.graph.managedAppStatusRaw");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ManagedAppStatusRaw}
     */
    @jakarta.annotation.Nonnull
    public static ManagedAppStatusRaw createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ManagedAppStatusRaw();
    }
    /**
     * Gets the content property value. Status report content.
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getContent() {
        return this.backingStore.get("content");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("content", (n) -> { this.setContent(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("content", this.getContent());
    }
    /**
     * Sets the content property value. Status report content.
     * @param value Value to set for the content property.
     */
    public void setContent(@jakarta.annotation.Nullable final UntypedNode value) {
        this.backingStore.set("content", value);
    }
}
