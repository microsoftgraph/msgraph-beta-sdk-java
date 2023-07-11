package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class NoTrainingNotificationSetting extends EndUserNotificationSetting implements Parsable {
    /**
     * The simulationNotification property
     */
    private SimulationNotification simulationNotification;
    /**
     * Instantiates a new noTrainingNotificationSetting and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public NoTrainingNotificationSetting() {
        super();
        this.setOdataType("#microsoft.graph.noTrainingNotificationSetting");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a noTrainingNotificationSetting
     */
    @javax.annotation.Nonnull
    public static NoTrainingNotificationSetting createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new NoTrainingNotificationSetting();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("simulationNotification", (n) -> { this.setSimulationNotification(n.getObjectValue(SimulationNotification::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the simulationNotification property value. The simulationNotification property
     * @return a simulationNotification
     */
    @javax.annotation.Nullable
    public SimulationNotification getSimulationNotification() {
        return this.simulationNotification;
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
        writer.writeObjectValue("simulationNotification", this.getSimulationNotification());
    }
    /**
     * Sets the simulationNotification property value. The simulationNotification property
     * @param value Value to set for the simulationNotification property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSimulationNotification(@javax.annotation.Nullable final SimulationNotification value) {
        this.simulationNotification = value;
    }
}
