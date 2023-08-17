package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * History Item contained in the Mobile App Troubleshooting Event.
 */
public class MobileAppTroubleshootingAppPolicyCreationHistory extends MobileAppTroubleshootingHistoryItem implements Parsable {
    /**
     * Error code for the failure, empty if no failure.
     */
    private String errorCode;
    /**
     * Indicates the type of execution status of the device management script.
     */
    private RunState runState;
    /**
     * Instantiates a new mobileAppTroubleshootingAppPolicyCreationHistory and sets the default values.
     */
    public MobileAppTroubleshootingAppPolicyCreationHistory() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a mobileAppTroubleshootingAppPolicyCreationHistory
     */
    @jakarta.annotation.Nonnull
    public static MobileAppTroubleshootingAppPolicyCreationHistory createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MobileAppTroubleshootingAppPolicyCreationHistory();
    }
    /**
     * Gets the errorCode property value. Error code for the failure, empty if no failure.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getErrorCode() {
        return this.errorCode;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("errorCode", (n) -> { this.setErrorCode(n.getStringValue()); });
        deserializerMap.put("runState", (n) -> { this.setRunState(n.getEnumValue(RunState.class)); });
        return deserializerMap;
    }
    /**
     * Gets the runState property value. Indicates the type of execution status of the device management script.
     * @return a runState
     */
    @jakarta.annotation.Nullable
    public RunState getRunState() {
        return this.runState;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("errorCode", this.getErrorCode());
        writer.writeEnumValue("runState", this.getRunState());
    }
    /**
     * Sets the errorCode property value. Error code for the failure, empty if no failure.
     * @param value Value to set for the errorCode property.
     */
    public void setErrorCode(@jakarta.annotation.Nullable final String value) {
        this.errorCode = value;
    }
    /**
     * Sets the runState property value. Indicates the type of execution status of the device management script.
     * @param value Value to set for the runState property.
     */
    public void setRunState(@jakarta.annotation.Nullable final RunState value) {
        this.runState = value;
    }
}
