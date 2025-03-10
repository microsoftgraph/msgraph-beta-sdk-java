package com.microsoft.graph.beta.models;

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
     * Instantiates a new {@link UserExperienceAnalyticsNotAutopilotReadyDevice} and sets the default values.
     */
    public UserExperienceAnalyticsNotAutopilotReadyDevice() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link UserExperienceAnalyticsNotAutopilotReadyDevice}
     */
    @jakarta.annotation.Nonnull
    public static UserExperienceAnalyticsNotAutopilotReadyDevice createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserExperienceAnalyticsNotAutopilotReadyDevice();
    }
    /**
     * Gets the autoPilotProfileAssigned property value. The intune device&apos;s autopilotProfileAssigned.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getAutoPilotProfileAssigned() {
        return this.backingStore.get("autoPilotProfileAssigned");
    }
    /**
     * Gets the autoPilotRegistered property value. The intune device&apos;s autopilotRegistered.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getAutoPilotRegistered() {
        return this.backingStore.get("autoPilotRegistered");
    }
    /**
     * Gets the azureAdJoinType property value. The intune device&apos;s azure Ad joinType.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAzureAdJoinType() {
        return this.backingStore.get("azureAdJoinType");
    }
    /**
     * Gets the azureAdRegistered property value. The intune device&apos;s azureAdRegistered.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getAzureAdRegistered() {
        return this.backingStore.get("azureAdRegistered");
    }
    /**
     * Gets the deviceName property value. The intune device&apos;s name.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDeviceName() {
        return this.backingStore.get("deviceName");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
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
     * Gets the managedBy property value. The intune device&apos;s managed by.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getManagedBy() {
        return this.backingStore.get("managedBy");
    }
    /**
     * Gets the manufacturer property value. The intune device&apos;s manufacturer.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getManufacturer() {
        return this.backingStore.get("manufacturer");
    }
    /**
     * Gets the model property value. The intune device&apos;s model.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getModel() {
        return this.backingStore.get("model");
    }
    /**
     * Gets the serialNumber property value. The intune device&apos;s serial number.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSerialNumber() {
        return this.backingStore.get("serialNumber");
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
     * Sets the autoPilotProfileAssigned property value. The intune device&apos;s autopilotProfileAssigned.
     * @param value Value to set for the autoPilotProfileAssigned property.
     */
    public void setAutoPilotProfileAssigned(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("autoPilotProfileAssigned", value);
    }
    /**
     * Sets the autoPilotRegistered property value. The intune device&apos;s autopilotRegistered.
     * @param value Value to set for the autoPilotRegistered property.
     */
    public void setAutoPilotRegistered(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("autoPilotRegistered", value);
    }
    /**
     * Sets the azureAdJoinType property value. The intune device&apos;s azure Ad joinType.
     * @param value Value to set for the azureAdJoinType property.
     */
    public void setAzureAdJoinType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("azureAdJoinType", value);
    }
    /**
     * Sets the azureAdRegistered property value. The intune device&apos;s azureAdRegistered.
     * @param value Value to set for the azureAdRegistered property.
     */
    public void setAzureAdRegistered(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("azureAdRegistered", value);
    }
    /**
     * Sets the deviceName property value. The intune device&apos;s name.
     * @param value Value to set for the deviceName property.
     */
    public void setDeviceName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("deviceName", value);
    }
    /**
     * Sets the managedBy property value. The intune device&apos;s managed by.
     * @param value Value to set for the managedBy property.
     */
    public void setManagedBy(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("managedBy", value);
    }
    /**
     * Sets the manufacturer property value. The intune device&apos;s manufacturer.
     * @param value Value to set for the manufacturer property.
     */
    public void setManufacturer(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("manufacturer", value);
    }
    /**
     * Sets the model property value. The intune device&apos;s model.
     * @param value Value to set for the model property.
     */
    public void setModel(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("model", value);
    }
    /**
     * Sets the serialNumber property value. The intune device&apos;s serial number.
     * @param value Value to set for the serialNumber property.
     */
    public void setSerialNumber(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("serialNumber", value);
    }
}
