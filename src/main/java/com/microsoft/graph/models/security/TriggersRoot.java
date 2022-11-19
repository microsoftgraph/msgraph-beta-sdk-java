package com.microsoft.graph.models.security;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class TriggersRoot extends Entity implements Parsable {
    /** The retentionEvents property */
    private java.util.List<RetentionEvent> _retentionEvents;
    /**
     * Instantiates a new triggersRoot and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public TriggersRoot() {
        super();
        this.setOdataType("#microsoft.graph.security.triggersRoot");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a triggersRoot
     */
    @javax.annotation.Nonnull
    public static TriggersRoot createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TriggersRoot();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final TriggersRoot currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("retentionEvents", (n) -> { currentObject.setRetentionEvents(n.getCollectionOfObjectValues(RetentionEvent::createFromDiscriminatorValue)); });
        return deserializerMap
    }
    /**
     * Gets the retentionEvents property value. The retentionEvents property
     * @return a retentionEvent
     */
    @javax.annotation.Nullable
    public java.util.List<RetentionEvent> getRetentionEvents() {
        return this._retentionEvents;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("retentionEvents", this.getRetentionEvents());
    }
    /**
     * Sets the retentionEvents property value. The retentionEvents property
     * @param value Value to set for the retentionEvents property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRetentionEvents(@javax.annotation.Nullable final java.util.List<RetentionEvent> value) {
        this._retentionEvents = value;
    }
}
