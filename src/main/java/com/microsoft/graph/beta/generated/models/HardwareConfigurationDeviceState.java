package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Contains properties for device run state of the hardware configuration
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class HardwareConfigurationDeviceState extends Entity implements Parsable {
    /**
     * Instantiates a new {@link HardwareConfigurationDeviceState} and sets the default values.
     */
    public HardwareConfigurationDeviceState() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link HardwareConfigurationDeviceState}
     */
    @jakarta.annotation.Nonnull
    public static HardwareConfigurationDeviceState createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new HardwareConfigurationDeviceState();
    }
    /**
     * Gets the assignmentFilterIds property value. A list of identifier strings of different assignment filters applied
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAssignmentFilterIds() {
        return this.backingStore.get("assignmentFilterIds");
    }
    /**
     * Gets the configurationError property value. Error from the hardware configuration execution
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getConfigurationError() {
        return this.backingStore.get("configurationError");
    }
    /**
     * Gets the configurationOutput property value. Output of the hardware configuration execution
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getConfigurationOutput() {
        return this.backingStore.get("configurationOutput");
    }
    /**
     * Gets the configurationState property value. Indicates the type of execution status of the device management script.
     * @return a {@link RunState}
     */
    @jakarta.annotation.Nullable
    public RunState getConfigurationState() {
        return this.backingStore.get("configurationState");
    }
    /**
     * Gets the deviceName property value. The name of the device
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
        deserializerMap.put("assignmentFilterIds", (n) -> { this.setAssignmentFilterIds(n.getStringValue()); });
        deserializerMap.put("configurationError", (n) -> { this.setConfigurationError(n.getStringValue()); });
        deserializerMap.put("configurationOutput", (n) -> { this.setConfigurationOutput(n.getStringValue()); });
        deserializerMap.put("configurationState", (n) -> { this.setConfigurationState(n.getEnumValue(RunState::forValue)); });
        deserializerMap.put("deviceName", (n) -> { this.setDeviceName(n.getStringValue()); });
        deserializerMap.put("internalVersion", (n) -> { this.setInternalVersion(n.getIntegerValue()); });
        deserializerMap.put("lastStateUpdateDateTime", (n) -> { this.setLastStateUpdateDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("osVersion", (n) -> { this.setOsVersion(n.getStringValue()); });
        deserializerMap.put("upn", (n) -> { this.setUpn(n.getStringValue()); });
        deserializerMap.put("userId", (n) -> { this.setUserId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the internalVersion property value. The Policy internal version
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getInternalVersion() {
        return this.backingStore.get("internalVersion");
    }
    /**
     * Gets the lastStateUpdateDateTime property value. The last timestamp of when the hardware configuration executed
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastStateUpdateDateTime() {
        return this.backingStore.get("lastStateUpdateDateTime");
    }
    /**
     * Gets the osVersion property value. Operating system version of the device (E.g. 10.0.19042.1165, 10.0.19042.1288 etc.)
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOsVersion() {
        return this.backingStore.get("osVersion");
    }
    /**
     * Gets the upn property value. User Principal Name (UPN).
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUpn() {
        return this.backingStore.get("upn");
    }
    /**
     * Gets the userId property value. The unique identifier of the Entra user associated with the device for which policy is applied. Read-Only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUserId() {
        return this.backingStore.get("userId");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("assignmentFilterIds", this.getAssignmentFilterIds());
        writer.writeStringValue("configurationError", this.getConfigurationError());
        writer.writeStringValue("configurationOutput", this.getConfigurationOutput());
        writer.writeEnumValue("configurationState", this.getConfigurationState());
        writer.writeStringValue("deviceName", this.getDeviceName());
        writer.writeIntegerValue("internalVersion", this.getInternalVersion());
        writer.writeOffsetDateTimeValue("lastStateUpdateDateTime", this.getLastStateUpdateDateTime());
        writer.writeStringValue("osVersion", this.getOsVersion());
        writer.writeStringValue("upn", this.getUpn());
        writer.writeStringValue("userId", this.getUserId());
    }
    /**
     * Sets the assignmentFilterIds property value. A list of identifier strings of different assignment filters applied
     * @param value Value to set for the assignmentFilterIds property.
     */
    public void setAssignmentFilterIds(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("assignmentFilterIds", value);
    }
    /**
     * Sets the configurationError property value. Error from the hardware configuration execution
     * @param value Value to set for the configurationError property.
     */
    public void setConfigurationError(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("configurationError", value);
    }
    /**
     * Sets the configurationOutput property value. Output of the hardware configuration execution
     * @param value Value to set for the configurationOutput property.
     */
    public void setConfigurationOutput(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("configurationOutput", value);
    }
    /**
     * Sets the configurationState property value. Indicates the type of execution status of the device management script.
     * @param value Value to set for the configurationState property.
     */
    public void setConfigurationState(@jakarta.annotation.Nullable final RunState value) {
        this.backingStore.set("configurationState", value);
    }
    /**
     * Sets the deviceName property value. The name of the device
     * @param value Value to set for the deviceName property.
     */
    public void setDeviceName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("deviceName", value);
    }
    /**
     * Sets the internalVersion property value. The Policy internal version
     * @param value Value to set for the internalVersion property.
     */
    public void setInternalVersion(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("internalVersion", value);
    }
    /**
     * Sets the lastStateUpdateDateTime property value. The last timestamp of when the hardware configuration executed
     * @param value Value to set for the lastStateUpdateDateTime property.
     */
    public void setLastStateUpdateDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastStateUpdateDateTime", value);
    }
    /**
     * Sets the osVersion property value. Operating system version of the device (E.g. 10.0.19042.1165, 10.0.19042.1288 etc.)
     * @param value Value to set for the osVersion property.
     */
    public void setOsVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("osVersion", value);
    }
    /**
     * Sets the upn property value. User Principal Name (UPN).
     * @param value Value to set for the upn property.
     */
    public void setUpn(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("upn", value);
    }
    /**
     * Sets the userId property value. The unique identifier of the Entra user associated with the device for which policy is applied. Read-Only.
     * @param value Value to set for the userId property.
     */
    public void setUserId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("userId", value);
    }
}
