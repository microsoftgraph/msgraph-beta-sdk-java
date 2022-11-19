package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of accessReviewDecision entities. */
public class OfficeClientConfigurationAssignment extends Entity implements Parsable {
    /** The target assignment defined by the admin. */
    private OfficeConfigurationAssignmentTarget _target;
    /**
     * Instantiates a new officeClientConfigurationAssignment and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public OfficeClientConfigurationAssignment() {
        super();
        this.setOdataType("#microsoft.graph.officeClientConfigurationAssignment");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a officeClientConfigurationAssignment
     */
    @javax.annotation.Nonnull
    public static OfficeClientConfigurationAssignment createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OfficeClientConfigurationAssignment();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final OfficeClientConfigurationAssignment currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("target", (n) -> { currentObject.setTarget(n.getObjectValue(OfficeConfigurationAssignmentTarget::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the target property value. The target assignment defined by the admin.
     * @return a officeConfigurationAssignmentTarget
     */
    @javax.annotation.Nullable
    public OfficeConfigurationAssignmentTarget getTarget() {
        return this._target;
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
        writer.writeObjectValue("target", this.getTarget());
    }
    /**
     * Sets the target property value. The target assignment defined by the admin.
     * @param value Value to set for the target property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTarget(@javax.annotation.Nullable final OfficeConfigurationAssignmentTarget value) {
        this._target = value;
    }
}
