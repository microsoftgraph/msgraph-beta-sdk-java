package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Contains registry properties to detect a Win32 App
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Win32LobAppRegistryRequirement extends Win32LobAppRequirement implements Parsable {
    /**
     * Instantiates a new Win32LobAppRegistryRequirement and sets the default values.
     */
    public Win32LobAppRegistryRequirement() {
        super();
        this.setOdataType("#microsoft.graph.win32LobAppRegistryRequirement");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Win32LobAppRegistryRequirement
     */
    @jakarta.annotation.Nonnull
    public static Win32LobAppRegistryRequirement createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Win32LobAppRegistryRequirement();
    }
    /**
     * Gets the check32BitOn64System property value. A value indicating whether this registry path is for checking 32-bit app on 64-bit system
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getCheck32BitOn64System() {
        return this.backingStore.get("check32BitOn64System");
    }
    /**
     * Gets the detectionType property value. Contains all supported registry data detection type.
     * @return a Win32LobAppRegistryDetectionType
     */
    @jakarta.annotation.Nullable
    public Win32LobAppRegistryDetectionType getDetectionType() {
        return this.backingStore.get("detectionType");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("check32BitOn64System", (n) -> { this.setCheck32BitOn64System(n.getBooleanValue()); });
        deserializerMap.put("detectionType", (n) -> { this.setDetectionType(n.getEnumValue(Win32LobAppRegistryDetectionType::forValue)); });
        deserializerMap.put("keyPath", (n) -> { this.setKeyPath(n.getStringValue()); });
        deserializerMap.put("valueName", (n) -> { this.setValueName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the keyPath property value. The registry key path to detect Win32 Line of Business (LoB) app
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getKeyPath() {
        return this.backingStore.get("keyPath");
    }
    /**
     * Gets the valueName property value. The registry value name
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getValueName() {
        return this.backingStore.get("valueName");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("check32BitOn64System", this.getCheck32BitOn64System());
        writer.writeEnumValue("detectionType", this.getDetectionType());
        writer.writeStringValue("keyPath", this.getKeyPath());
        writer.writeStringValue("valueName", this.getValueName());
    }
    /**
     * Sets the check32BitOn64System property value. A value indicating whether this registry path is for checking 32-bit app on 64-bit system
     * @param value Value to set for the check32BitOn64System property.
     */
    public void setCheck32BitOn64System(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("check32BitOn64System", value);
    }
    /**
     * Sets the detectionType property value. Contains all supported registry data detection type.
     * @param value Value to set for the detectionType property.
     */
    public void setDetectionType(@jakarta.annotation.Nullable final Win32LobAppRegistryDetectionType value) {
        this.backingStore.set("detectionType", value);
    }
    /**
     * Sets the keyPath property value. The registry key path to detect Win32 Line of Business (LoB) app
     * @param value Value to set for the keyPath property.
     */
    public void setKeyPath(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("keyPath", value);
    }
    /**
     * Sets the valueName property value. The registry value name
     * @param value Value to set for the valueName property.
     */
    public void setValueName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("valueName", value);
    }
}
