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
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MobileAppTroubleshootingAppTargetHistory extends MobileAppTroubleshootingHistoryItem implements Parsable {
    /**
     * Instantiates a new MobileAppTroubleshootingAppTargetHistory and sets the default values.
     */
    public MobileAppTroubleshootingAppTargetHistory() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a MobileAppTroubleshootingAppTargetHistory
     */
    @jakarta.annotation.Nonnull
    public static MobileAppTroubleshootingAppTargetHistory createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MobileAppTroubleshootingAppTargetHistory();
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
        deserializerMap.put("errorCode", (n) -> { this.setErrorCode(n.getStringValue()); });
        deserializerMap.put("runState", (n) -> { this.setRunState(n.getEnumValue(RunState.class)); });
        deserializerMap.put("securityGroupId", (n) -> { this.setSecurityGroupId(n.getStringValue()); });
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
     * Gets the securityGroupId property value. AAD security group id to which it was targeted.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSecurityGroupId() {
        return this.backingStore.get("securityGroupId");
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
        writer.writeStringValue("securityGroupId", this.getSecurityGroupId());
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
    /**
     * Sets the securityGroupId property value. AAD security group id to which it was targeted.
     * @param value Value to set for the securityGroupId property.
     */
    public void setSecurityGroupId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("securityGroupId", value);
    }
}
