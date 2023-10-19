package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The user experience analytics Device not windows autopilot ready.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UserExperienceAnalyticsNotAutopilotReadyDevice extends Entity implements Parsable {
    /**
     * The intune device's autopilotProfileAssigned.
     */
    private Boolean autoPilotProfileAssigned;
    /**
     * The intune device's autopilotRegistered.
     */
    private Boolean autoPilotRegistered;
    /**
     * The intune device's azure Ad joinType.
     */
    private String azureAdJoinType;
    /**
     * The intune device's azureAdRegistered.
     */
    private Boolean azureAdRegistered;
    /**
     * The intune device's name.
     */
    private String deviceName;
    /**
     * The intune device's managed by.
     */
    private String managedBy;
    /**
     * The intune device's manufacturer.
     */
    private String manufacturer;
    /**
     * The intune device's model.
     */
    private String model;
    /**
     * The intune device's serial number.
     */
    private String serialNumber;
    /**
     * Instantiates a new UserExperienceAnalyticsNotAutopilotReadyDevice and sets the default values.
     */
    public UserExperienceAnalyticsNotAutopilotReadyDevice() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a UserExperienceAnalyticsNotAutopilotReadyDevice
     */
    @jakarta.annotation.Nonnull
    public static UserExperienceAnalyticsNotAutopilotReadyDevice createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserExperienceAnalyticsNotAutopilotReadyDevice();
    }
    /**
     * Gets the autoPilotProfileAssigned property value. The intune device's autopilotProfileAssigned.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAutoPilotProfileAssigned() {
        return this.autoPilotProfileAssigned;
    }
    /**
     * Gets the autoPilotRegistered property value. The intune device's autopilotRegistered.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAutoPilotRegistered() {
        return this.autoPilotRegistered;
    }
    /**
     * Gets the azureAdJoinType property value. The intune device's azure Ad joinType.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAzureAdJoinType() {
        return this.azureAdJoinType;
    }
    /**
     * Gets the azureAdRegistered property value. The intune device's azureAdRegistered.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAzureAdRegistered() {
        return this.azureAdRegistered;
    }
    /**
     * Gets the deviceName property value. The intune device's name.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDeviceName() {
        return this.deviceName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("autoPilotProfileAssigned", (n) -> { this.setAutoPilotProfileAssigned(n.getBooleanValue()); });
        deserializerMap.put("autoPilotRegistered", (n) -> { this.setAutoPilotRegistered(n.getBooleanValue()); });
        deserializerMap.put("azureAdJoinType", (n) -> { this.setAzureAdJoinType(n.getStringValue()); });
        deserializerMap.put("azureAdRegistered", (n) -> { this.setAzureAdRegistered(n.getBooleanValue()); });
        deserializerMap.put("deviceName", (n) -> { this.setDeviceName(n.getStringValue()); });
        deserializerMap.put("managedBy", (n) -> { this.setManagedBy(n.getStringValue()); });
        deserializerMap.put("manufacturer", (n) -> { this.setManufacturer(n.getStringValue()); });
        deserializerMap.put("model", (n) -> { this.setModel(n.getStringValue()); });
        deserializerMap.put("serialNumber", (n) -> { this.setSerialNumber(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the managedBy property value. The intune device's managed by.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getManagedBy() {
        return this.managedBy;
    }
    /**
     * Gets the manufacturer property value. The intune device's manufacturer.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getManufacturer() {
        return this.manufacturer;
    }
    /**
     * Gets the model property value. The intune device's model.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getModel() {
        return this.model;
    }
    /**
     * Gets the serialNumber property value. The intune device's serial number.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSerialNumber() {
        return this.serialNumber;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("autoPilotProfileAssigned", this.getAutoPilotProfileAssigned());
        writer.writeBooleanValue("autoPilotRegistered", this.getAutoPilotRegistered());
        writer.writeStringValue("azureAdJoinType", this.getAzureAdJoinType());
        writer.writeBooleanValue("azureAdRegistered", this.getAzureAdRegistered());
        writer.writeStringValue("deviceName", this.getDeviceName());
        writer.writeStringValue("managedBy", this.getManagedBy());
        writer.writeStringValue("manufacturer", this.getManufacturer());
        writer.writeStringValue("model", this.getModel());
        writer.writeStringValue("serialNumber", this.getSerialNumber());
    }
    /**
     * Sets the autoPilotProfileAssigned property value. The intune device's autopilotProfileAssigned.
     * @param value Value to set for the autoPilotProfileAssigned property.
     */
    public void setAutoPilotProfileAssigned(@jakarta.annotation.Nullable final Boolean value) {
        this.autoPilotProfileAssigned = value;
    }
    /**
     * Sets the autoPilotRegistered property value. The intune device's autopilotRegistered.
     * @param value Value to set for the autoPilotRegistered property.
     */
    public void setAutoPilotRegistered(@jakarta.annotation.Nullable final Boolean value) {
        this.autoPilotRegistered = value;
    }
    /**
     * Sets the azureAdJoinType property value. The intune device's azure Ad joinType.
     * @param value Value to set for the azureAdJoinType property.
     */
    public void setAzureAdJoinType(@jakarta.annotation.Nullable final String value) {
        this.azureAdJoinType = value;
    }
    /**
     * Sets the azureAdRegistered property value. The intune device's azureAdRegistered.
     * @param value Value to set for the azureAdRegistered property.
     */
    public void setAzureAdRegistered(@jakarta.annotation.Nullable final Boolean value) {
        this.azureAdRegistered = value;
    }
    /**
     * Sets the deviceName property value. The intune device's name.
     * @param value Value to set for the deviceName property.
     */
    public void setDeviceName(@jakarta.annotation.Nullable final String value) {
        this.deviceName = value;
    }
    /**
     * Sets the managedBy property value. The intune device's managed by.
     * @param value Value to set for the managedBy property.
     */
    public void setManagedBy(@jakarta.annotation.Nullable final String value) {
        this.managedBy = value;
    }
    /**
     * Sets the manufacturer property value. The intune device's manufacturer.
     * @param value Value to set for the manufacturer property.
     */
    public void setManufacturer(@jakarta.annotation.Nullable final String value) {
        this.manufacturer = value;
    }
    /**
     * Sets the model property value. The intune device's model.
     * @param value Value to set for the model property.
     */
    public void setModel(@jakarta.annotation.Nullable final String value) {
        this.model = value;
    }
    /**
     * Sets the serialNumber property value. The intune device's serial number.
     * @param value Value to set for the serialNumber property.
     */
    public void setSerialNumber(@jakarta.annotation.Nullable final String value) {
        this.serialNumber = value;
    }
}
