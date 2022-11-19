package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class MobileAppTroubleshootingAppStateHistory extends MobileAppTroubleshootingHistoryItem implements Parsable {
    /** Defines the Action Types for an Intune Application. */
    private MobileAppActionType _actionType;
    /** Error code for the failure, empty if no failure. */
    private String _errorCode;
    /** Indicates the type of execution status of the device management script. */
    private RunState _runState;
    /**
     * Instantiates a new MobileAppTroubleshootingAppStateHistory and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public MobileAppTroubleshootingAppStateHistory() {
        super();
        this.setOdataType("#microsoft.graph.mobileAppTroubleshootingAppStateHistory");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a MobileAppTroubleshootingAppStateHistory
     */
    @javax.annotation.Nonnull
    public static MobileAppTroubleshootingAppStateHistory createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MobileAppTroubleshootingAppStateHistory();
    }
    /**
     * Gets the actionType property value. Defines the Action Types for an Intune Application.
     * @return a mobileAppActionType
     */
    @javax.annotation.Nullable
    public MobileAppActionType getActionType() {
        return this._actionType;
    }
    /**
     * Gets the errorCode property value. Error code for the failure, empty if no failure.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getErrorCode() {
        return this._errorCode;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final MobileAppTroubleshootingAppStateHistory currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("actionType", (n) -> { currentObject.setActionType(n.getEnumValue(MobileAppActionType.class)); });
        deserializerMap.put("errorCode", (n) -> { currentObject.setErrorCode(n.getStringValue()); });
        deserializerMap.put("runState", (n) -> { currentObject.setRunState(n.getEnumValue(RunState.class)); });
        return deserializerMap
    }
    /**
     * Gets the runState property value. Indicates the type of execution status of the device management script.
     * @return a runState
     */
    @javax.annotation.Nullable
    public RunState getRunState() {
        return this._runState;
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
        writer.writeEnumValue("actionType", this.getActionType());
        writer.writeStringValue("errorCode", this.getErrorCode());
        writer.writeEnumValue("runState", this.getRunState());
    }
    /**
     * Sets the actionType property value. Defines the Action Types for an Intune Application.
     * @param value Value to set for the actionType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setActionType(@javax.annotation.Nullable final MobileAppActionType value) {
        this._actionType = value;
    }
    /**
     * Sets the errorCode property value. Error code for the failure, empty if no failure.
     * @param value Value to set for the errorCode property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setErrorCode(@javax.annotation.Nullable final String value) {
        this._errorCode = value;
    }
    /**
     * Sets the runState property value. Indicates the type of execution status of the device management script.
     * @param value Value to set for the runState property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRunState(@javax.annotation.Nullable final RunState value) {
        this._runState = value;
    }
}
