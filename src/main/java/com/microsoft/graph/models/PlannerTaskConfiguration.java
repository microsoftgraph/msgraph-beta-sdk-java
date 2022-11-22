package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class PlannerTaskConfiguration extends Entity implements Parsable {
    /** The editPolicy property */
    private PlannerTaskPolicy _editPolicy;
    /**
     * Instantiates a new plannerTaskConfiguration and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public PlannerTaskConfiguration() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a plannerTaskConfiguration
     */
    @javax.annotation.Nonnull
    public static PlannerTaskConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PlannerTaskConfiguration();
    }
    /**
     * Gets the editPolicy property value. The editPolicy property
     * @return a plannerTaskPolicy
     */
    @javax.annotation.Nullable
    public PlannerTaskPolicy getEditPolicy() {
        return this._editPolicy;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("editPolicy", (n) -> { this.setEditPolicy(n.getObjectValue(PlannerTaskPolicy::createFromDiscriminatorValue)); });
        return deserializerMap;
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
        writer.writeObjectValue("editPolicy", this.getEditPolicy());
    }
    /**
     * Sets the editPolicy property value. The editPolicy property
     * @param value Value to set for the editPolicy property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEditPolicy(@javax.annotation.Nullable final PlannerTaskPolicy value) {
        this._editPolicy = value;
    }
}
