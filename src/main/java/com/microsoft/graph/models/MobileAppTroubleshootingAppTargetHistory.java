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
public class MobileAppTroubleshootingAppTargetHistory extends MobileAppTroubleshootingHistoryItem implements Parsable {
    /**
     * Error code for the failure, empty if no failure.
     */
    private String errorCode;
    /**
     * Indicates the type of execution status of the device management script.
     */
    private RunState runState;
    /**
     * AAD security group id to which it was targeted.
     */
    private String securityGroupId;
    /**
     * Instantiates a new mobileAppTroubleshootingAppTargetHistory and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public MobileAppTroubleshootingAppTargetHistory() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a mobileAppTroubleshootingAppTargetHistory
     */
    @javax.annotation.Nonnull
    public static MobileAppTroubleshootingAppTargetHistory createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MobileAppTroubleshootingAppTargetHistory();
    }
    /**
     * Gets the errorCode property value. Error code for the failure, empty if no failure.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getErrorCode() {
        return this.errorCode;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("errorCode", (n) -> { this.setErrorCode(n.getStringValue()); });
        deserializerMap.put("runState", (n) -> { this.setRunState(n.getEnumValue(RunState.class)); });
        deserializerMap.put("securityGroupId", (n) -> { this.setSecurityGroupId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the runState property value. Indicates the type of execution status of the device management script.
     * @return a runState
     */
    @javax.annotation.Nullable
    public RunState getRunState() {
        return this.runState;
    }
    /**
     * Gets the securityGroupId property value. AAD security group id to which it was targeted.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSecurityGroupId() {
        return this.securityGroupId;
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
        writer.writeStringValue("errorCode", this.getErrorCode());
        writer.writeEnumValue("runState", this.getRunState());
        writer.writeStringValue("securityGroupId", this.getSecurityGroupId());
    }
    /**
     * Sets the errorCode property value. Error code for the failure, empty if no failure.
     * @param value Value to set for the errorCode property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setErrorCode(@javax.annotation.Nullable final String value) {
        this.errorCode = value;
    }
    /**
     * Sets the runState property value. Indicates the type of execution status of the device management script.
     * @param value Value to set for the runState property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRunState(@javax.annotation.Nullable final RunState value) {
        this.runState = value;
    }
    /**
     * Sets the securityGroupId property value. AAD security group id to which it was targeted.
     * @param value Value to set for the securityGroupId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSecurityGroupId(@javax.annotation.Nullable final String value) {
        this.securityGroupId = value;
    }
}
