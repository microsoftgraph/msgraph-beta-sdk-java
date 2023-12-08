package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * History Item contained in the Mobile App Troubleshooting Event.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MobileAppTroubleshootingAppStateHistory extends MobileAppTroubleshootingHistoryItem implements Parsable {
    /**
     * Instantiates a new MobileAppTroubleshootingAppStateHistory and sets the default values.
     */
    public MobileAppTroubleshootingAppStateHistory() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a MobileAppTroubleshootingAppStateHistory
     */
    @jakarta.annotation.Nonnull
    public static MobileAppTroubleshootingAppStateHistory createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MobileAppTroubleshootingAppStateHistory();
    }
    /**
     * Gets the actionType property value. Defines the Action Types for an Intune Application.
     * @return a MobileAppActionType
     */
    @jakarta.annotation.Nullable
    public MobileAppActionType getActionType() {
        return this.backingStore.get("actionType");
    }
    /**
     * Gets the errorCode property value. Error code for the failure, empty if no failure.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getErrorCode() {
        return this.backingStore.get("errorCode");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("actionType", (n) -> { this.setActionType(n.getEnumValue(MobileAppActionType::forValue)); });
        deserializerMap.put("errorCode", (n) -> { this.setErrorCode(n.getStringValue()); });
        deserializerMap.put("runState", (n) -> { this.setRunState(n.getEnumValue(RunState::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the runState property value. Indicates the type of execution status of the device management script.
     * @return a RunState
     */
    @jakarta.annotation.Nullable
    public RunState getRunState() {
        return this.backingStore.get("runState");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("actionType", this.getActionType());
        writer.writeStringValue("errorCode", this.getErrorCode());
        writer.writeEnumValue("runState", this.getRunState());
    }
    /**
     * Sets the actionType property value. Defines the Action Types for an Intune Application.
     * @param value Value to set for the actionType property.
     */
    public void setActionType(@jakarta.annotation.Nullable final MobileAppActionType value) {
        this.backingStore.set("actionType", value);
    }
    /**
     * Sets the errorCode property value. Error code for the failure, empty if no failure.
     * @param value Value to set for the errorCode property.
     */
    public void setErrorCode(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("errorCode", value);
    }
    /**
     * Sets the runState property value. Indicates the type of execution status of the device management script.
     * @param value Value to set for the runState property.
     */
    public void setRunState(@jakarta.annotation.Nullable final RunState value) {
        this.backingStore.set("runState", value);
    }
}
