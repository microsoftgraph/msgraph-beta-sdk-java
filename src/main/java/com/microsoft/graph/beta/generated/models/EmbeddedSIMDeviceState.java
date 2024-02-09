package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Describes the embedded SIM activation code deployment state in relation to a device.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EmbeddedSIMDeviceState extends Entity implements Parsable {
    /**
     * Instantiates a new {@link EmbeddedSIMDeviceState} and sets the default values.
     */
    public EmbeddedSIMDeviceState() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link EmbeddedSIMDeviceState}
     */
    @jakarta.annotation.Nonnull
    public static EmbeddedSIMDeviceState createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EmbeddedSIMDeviceState();
    }
    /**
     * Gets the createdDateTime property value. The time the embedded SIM device status was created. Generated service side.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * Gets the deviceName property value. Device name to which the subscription was provisioned e.g. DESKTOP-JOE
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
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("deviceName", (n) -> { this.setDeviceName(n.getStringValue()); });
        deserializerMap.put("lastSyncDateTime", (n) -> { this.setLastSyncDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("modifiedDateTime", (n) -> { this.setModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("state", (n) -> { this.setState(n.getEnumValue(EmbeddedSIMDeviceStateValue::forValue)); });
        deserializerMap.put("stateDetails", (n) -> { this.setStateDetails(n.getStringValue()); });
        deserializerMap.put("universalIntegratedCircuitCardIdentifier", (n) -> { this.setUniversalIntegratedCircuitCardIdentifier(n.getStringValue()); });
        deserializerMap.put("userName", (n) -> { this.setUserName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the lastSyncDateTime property value. The time the embedded SIM device last checked in. Updated service side.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastSyncDateTime() {
        return this.backingStore.get("lastSyncDateTime");
    }
    /**
     * Gets the modifiedDateTime property value. The time the embedded SIM device status was last modified. Updated service side.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getModifiedDateTime() {
        return this.backingStore.get("modifiedDateTime");
    }
    /**
     * Gets the state property value. Describes the various states for an embedded SIM activation code.
     * @return a {@link EmbeddedSIMDeviceStateValue}
     */
    @jakarta.annotation.Nullable
    public EmbeddedSIMDeviceStateValue getState() {
        return this.backingStore.get("state");
    }
    /**
     * Gets the stateDetails property value. String description of the provisioning state.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getStateDetails() {
        return this.backingStore.get("stateDetails");
    }
    /**
     * Gets the universalIntegratedCircuitCardIdentifier property value. The Universal Integrated Circuit Card Identifier (UICCID) identifying the hardware onto which a profile is to be deployed.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUniversalIntegratedCircuitCardIdentifier() {
        return this.backingStore.get("universalIntegratedCircuitCardIdentifier");
    }
    /**
     * Gets the userName property value. Username which the subscription was provisioned to e.g. joe@contoso.com
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUserName() {
        return this.backingStore.get("userName");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("deviceName", this.getDeviceName());
        writer.writeOffsetDateTimeValue("lastSyncDateTime", this.getLastSyncDateTime());
        writer.writeOffsetDateTimeValue("modifiedDateTime", this.getModifiedDateTime());
        writer.writeEnumValue("state", this.getState());
        writer.writeStringValue("stateDetails", this.getStateDetails());
        writer.writeStringValue("universalIntegratedCircuitCardIdentifier", this.getUniversalIntegratedCircuitCardIdentifier());
        writer.writeStringValue("userName", this.getUserName());
    }
    /**
     * Sets the createdDateTime property value. The time the embedded SIM device status was created. Generated service side.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the deviceName property value. Device name to which the subscription was provisioned e.g. DESKTOP-JOE
     * @param value Value to set for the deviceName property.
     */
    public void setDeviceName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("deviceName", value);
    }
    /**
     * Sets the lastSyncDateTime property value. The time the embedded SIM device last checked in. Updated service side.
     * @param value Value to set for the lastSyncDateTime property.
     */
    public void setLastSyncDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastSyncDateTime", value);
    }
    /**
     * Sets the modifiedDateTime property value. The time the embedded SIM device status was last modified. Updated service side.
     * @param value Value to set for the modifiedDateTime property.
     */
    public void setModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("modifiedDateTime", value);
    }
    /**
     * Sets the state property value. Describes the various states for an embedded SIM activation code.
     * @param value Value to set for the state property.
     */
    public void setState(@jakarta.annotation.Nullable final EmbeddedSIMDeviceStateValue value) {
        this.backingStore.set("state", value);
    }
    /**
     * Sets the stateDetails property value. String description of the provisioning state.
     * @param value Value to set for the stateDetails property.
     */
    public void setStateDetails(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("stateDetails", value);
    }
    /**
     * Sets the universalIntegratedCircuitCardIdentifier property value. The Universal Integrated Circuit Card Identifier (UICCID) identifying the hardware onto which a profile is to be deployed.
     * @param value Value to set for the universalIntegratedCircuitCardIdentifier property.
     */
    public void setUniversalIntegratedCircuitCardIdentifier(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("universalIntegratedCircuitCardIdentifier", value);
    }
    /**
     * Sets the userName property value. Username which the subscription was provisioned to e.g. joe@contoso.com
     * @param value Value to set for the userName property.
     */
    public void setUserName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("userName", value);
    }
}
