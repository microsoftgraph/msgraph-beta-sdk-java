package com.microsoft.graph.beta.models.security;

import com.microsoft.graph.beta.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TriggersRoot extends Entity implements Parsable {
    /**
     * Instantiates a new {@link TriggersRoot} and sets the default values.
     */
    public TriggersRoot() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link TriggersRoot}
     */
    @jakarta.annotation.Nonnull
    public static TriggersRoot createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TriggersRoot();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("retentionEvents", (n) -> { this.setRetentionEvents(n.getCollectionOfObjectValues(RetentionEvent::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the retentionEvents property value. The retentionEvents property
     * @return a {@link java.util.List<RetentionEvent>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<RetentionEvent> getRetentionEvents() {
        return this.backingStore.get("retentionEvents");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("retentionEvents", this.getRetentionEvents());
    }
    /**
     * Sets the retentionEvents property value. The retentionEvents property
     * @param value Value to set for the retentionEvents property.
     */
    public void setRetentionEvents(@jakarta.annotation.Nullable final java.util.List<RetentionEvent> value) {
        this.backingStore.set("retentionEvents", value);
    }
}
