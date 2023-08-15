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
public class Win32LobAppRegistryDetection extends Win32LobAppDetection implements Parsable {
    /**
     * A value indicating whether this registry path is for checking 32-bit app on 64-bit system
     */
    private Boolean check32BitOn64System;
    /**
     * Contains all supported registry data detection type.
     */
    private Win32LobAppRegistryDetectionType detectionType;
    /**
     * The registry detection value
     */
    private String detectionValue;
    /**
     * The registry key path to detect Win32 Line of Business (LoB) app
     */
    private String keyPath;
    /**
     * Contains properties for detection operator.
     */
    private Win32LobAppDetectionOperator operator;
    /**
     * The registry value name
     */
    private String valueName;
    /**
     * Instantiates a new win32LobAppRegistryDetection and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public Win32LobAppRegistryDetection() {
        super();
        this.setOdataType("#microsoft.graph.win32LobAppRegistryDetection");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a win32LobAppRegistryDetection
     */
    @jakarta.annotation.Nonnull
    public static Win32LobAppRegistryDetection createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Win32LobAppRegistryDetection();
    }
    /**
     * Gets the check32BitOn64System property value. A value indicating whether this registry path is for checking 32-bit app on 64-bit system
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getCheck32BitOn64System() {
        return this.check32BitOn64System;
    }
    /**
     * Gets the detectionType property value. Contains all supported registry data detection type.
     * @return a win32LobAppRegistryDetectionType
     */
    @jakarta.annotation.Nullable
    public Win32LobAppRegistryDetectionType getDetectionType() {
        return this.detectionType;
    }
    /**
     * Gets the detectionValue property value. The registry detection value
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDetectionValue() {
        return this.detectionValue;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("check32BitOn64System", (n) -> { this.setCheck32BitOn64System(n.getBooleanValue()); });
        deserializerMap.put("detectionType", (n) -> { this.setDetectionType(n.getEnumValue(Win32LobAppRegistryDetectionType.class)); });
        deserializerMap.put("detectionValue", (n) -> { this.setDetectionValue(n.getStringValue()); });
        deserializerMap.put("keyPath", (n) -> { this.setKeyPath(n.getStringValue()); });
        deserializerMap.put("operator", (n) -> { this.setOperator(n.getEnumValue(Win32LobAppDetectionOperator.class)); });
        deserializerMap.put("valueName", (n) -> { this.setValueName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the keyPath property value. The registry key path to detect Win32 Line of Business (LoB) app
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getKeyPath() {
        return this.keyPath;
    }
    /**
     * Gets the operator property value. Contains properties for detection operator.
     * @return a win32LobAppDetectionOperator
     */
    @jakarta.annotation.Nullable
    public Win32LobAppDetectionOperator getOperator() {
        return this.operator;
    }
    /**
     * Gets the valueName property value. The registry value name
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getValueName() {
        return this.valueName;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("check32BitOn64System", this.getCheck32BitOn64System());
        writer.writeEnumValue("detectionType", this.getDetectionType());
        writer.writeStringValue("detectionValue", this.getDetectionValue());
        writer.writeStringValue("keyPath", this.getKeyPath());
        writer.writeEnumValue("operator", this.getOperator());
        writer.writeStringValue("valueName", this.getValueName());
    }
    /**
     * Sets the check32BitOn64System property value. A value indicating whether this registry path is for checking 32-bit app on 64-bit system
     * @param value Value to set for the check32BitOn64System property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setCheck32BitOn64System(@jakarta.annotation.Nullable final Boolean value) {
        this.check32BitOn64System = value;
    }
    /**
     * Sets the detectionType property value. Contains all supported registry data detection type.
     * @param value Value to set for the detectionType property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDetectionType(@jakarta.annotation.Nullable final Win32LobAppRegistryDetectionType value) {
        this.detectionType = value;
    }
    /**
     * Sets the detectionValue property value. The registry detection value
     * @param value Value to set for the detectionValue property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDetectionValue(@jakarta.annotation.Nullable final String value) {
        this.detectionValue = value;
    }
    /**
     * Sets the keyPath property value. The registry key path to detect Win32 Line of Business (LoB) app
     * @param value Value to set for the keyPath property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setKeyPath(@jakarta.annotation.Nullable final String value) {
        this.keyPath = value;
    }
    /**
     * Sets the operator property value. Contains properties for detection operator.
     * @param value Value to set for the operator property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setOperator(@jakarta.annotation.Nullable final Win32LobAppDetectionOperator value) {
        this.operator = value;
    }
    /**
     * Sets the valueName property value. The registry value name
     * @param value Value to set for the valueName property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setValueName(@jakarta.annotation.Nullable final String value) {
        this.valueName = value;
    }
}
