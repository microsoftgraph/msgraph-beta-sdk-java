package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class SimulationNotification extends BaseEndUserNotification implements Parsable {
    /**
     * The targettedUserType property
     */
    private TargettedUserType targettedUserType;
    /**
     * Instantiates a new simulationNotification and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public SimulationNotification() {
        super();
        this.setOdataType("#microsoft.graph.simulationNotification");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a simulationNotification
     */
    @javax.annotation.Nonnull
    public static SimulationNotification createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SimulationNotification();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("targettedUserType", (n) -> { this.setTargettedUserType(n.getEnumValue(TargettedUserType.class)); });
        return deserializerMap;
    }
    /**
     * Gets the targettedUserType property value. The targettedUserType property
     * @return a targettedUserType
     */
    @javax.annotation.Nullable
    public TargettedUserType getTargettedUserType() {
        return this.targettedUserType;
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
        writer.writeEnumValue("targettedUserType", this.getTargettedUserType());
    }
    /**
     * Sets the targettedUserType property value. The targettedUserType property
     * @param value Value to set for the targettedUserType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTargettedUserType(@javax.annotation.Nullable final TargettedUserType value) {
        this.targettedUserType = value;
    }
}
