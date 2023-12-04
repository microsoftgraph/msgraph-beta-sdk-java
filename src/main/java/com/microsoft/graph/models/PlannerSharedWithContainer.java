package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PlannerSharedWithContainer extends PlannerPlanContainer implements Parsable {
    /**
     * Instantiates a new PlannerSharedWithContainer and sets the default values.
     */
    public PlannerSharedWithContainer() {
        super();
        this.setOdataType("#microsoft.graph.plannerSharedWithContainer");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a PlannerSharedWithContainer
     */
    @jakarta.annotation.Nonnull
    public static PlannerSharedWithContainer createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PlannerSharedWithContainer();
    }
    /**
     * Gets the accessLevel property value. The accessLevel property
     * @return a PlannerPlanAccessLevel
     */
    @jakarta.annotation.Nullable
    public PlannerPlanAccessLevel getAccessLevel() {
        return this.backingStore.get("accessLevel");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("accessLevel", (n) -> { this.setAccessLevel(n.getEnumValue(PlannerPlanAccessLevel::forValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("accessLevel", this.getAccessLevel());
    }
    /**
     * Sets the accessLevel property value. The accessLevel property
     * @param value Value to set for the accessLevel property.
     */
    public void setAccessLevel(@jakarta.annotation.Nullable final PlannerPlanAccessLevel value) {
        this.backingStore.set("accessLevel", value);
    }
}
