package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DeviceRestrictionAction extends DlpActionInfo implements Parsable {
    /** The message property */
    private String message;
    /** The restrictionAction property */
    private RestrictionAction restrictionAction;
    /** The triggers property */
    private java.util.List<RestrictionTrigger> triggers;
    /**
     * Instantiates a new DeviceRestrictionAction and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DeviceRestrictionAction() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceRestrictionAction
     */
    @javax.annotation.Nonnull
    public static DeviceRestrictionAction createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceRestrictionAction();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("message", (n) -> { this.setMessage(n.getStringValue()); });
        deserializerMap.put("restrictionAction", (n) -> { this.setRestrictionAction(n.getEnumValue(RestrictionAction.class)); });
        deserializerMap.put("triggers", (n) -> { this.setTriggers(n.getCollectionOfEnumValues(RestrictionTrigger.class)); });
        return deserializerMap;
    }
    /**
     * Gets the message property value. The message property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMessage() {
        return this.message;
    }
    /**
     * Gets the restrictionAction property value. The restrictionAction property
     * @return a restrictionAction
     */
    @javax.annotation.Nullable
    public RestrictionAction getRestrictionAction() {
        return this.restrictionAction;
    }
    /**
     * Gets the triggers property value. The triggers property
     * @return a restrictionTrigger
     */
    @javax.annotation.Nullable
    public java.util.List<RestrictionTrigger> getTriggers() {
        return this.triggers;
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
        writer.writeStringValue("message", this.getMessage());
        writer.writeEnumValue("restrictionAction", this.getRestrictionAction());
        writer.writeCollectionOfEnumValues("triggers", this.getTriggers());
    }
    /**
     * Sets the message property value. The message property
     * @param value Value to set for the message property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMessage(@javax.annotation.Nullable final String value) {
        this.message = value;
    }
    /**
     * Sets the restrictionAction property value. The restrictionAction property
     * @param value Value to set for the restrictionAction property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRestrictionAction(@javax.annotation.Nullable final RestrictionAction value) {
        this.restrictionAction = value;
    }
    /**
     * Sets the triggers property value. The triggers property
     * @param value Value to set for the triggers property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTriggers(@javax.annotation.Nullable final java.util.List<RestrictionTrigger> value) {
        this.triggers = value;
    }
}
