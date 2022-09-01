package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Win32LobAppRegistryDetection extends Win32LobAppDetection implements Parsable {
    /** A value indicating whether this registry path is for checking 32-bit app on 64-bit system */
    private Boolean _check32BitOn64System;
    /** Contains all supported registry data detection type. */
    private Win32LobAppRegistryDetectionType _detectionType;
    /** The registry detection value */
    private String _detectionValue;
    /** The registry key path to detect Win32 Line of Business (LoB) app */
    private String _keyPath;
    /** Contains properties for detection operator. */
    private Win32LobAppDetectionOperator _operator;
    /** The registry value name */
    private String _valueName;
    /**
     * Instantiates a new Win32LobAppRegistryDetection and sets the default values.
     * @return a void
     */
    public Win32LobAppRegistryDetection() {
        super();
        this.setOdataType("#microsoft.graph.win32LobAppRegistryDetection");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Win32LobAppRegistryDetection
     */
    @javax.annotation.Nonnull
    public static Win32LobAppRegistryDetection createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Win32LobAppRegistryDetection();
    }
    /**
     * Gets the check32BitOn64System property value. A value indicating whether this registry path is for checking 32-bit app on 64-bit system
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getCheck32BitOn64System() {
        return this._check32BitOn64System;
    }
    /**
     * Gets the detectionType property value. Contains all supported registry data detection type.
     * @return a win32LobAppRegistryDetectionType
     */
    @javax.annotation.Nullable
    public Win32LobAppRegistryDetectionType getDetectionType() {
        return this._detectionType;
    }
    /**
     * Gets the detectionValue property value. The registry detection value
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDetectionValue() {
        return this._detectionValue;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final Win32LobAppRegistryDetection currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("check32BitOn64System", (n) -> { currentObject.setCheck32BitOn64System(n.getBooleanValue()); });
            this.put("detectionType", (n) -> { currentObject.setDetectionType(n.getEnumValue(Win32LobAppRegistryDetectionType.class)); });
            this.put("detectionValue", (n) -> { currentObject.setDetectionValue(n.getStringValue()); });
            this.put("keyPath", (n) -> { currentObject.setKeyPath(n.getStringValue()); });
            this.put("operator", (n) -> { currentObject.setOperator(n.getEnumValue(Win32LobAppDetectionOperator.class)); });
            this.put("valueName", (n) -> { currentObject.setValueName(n.getStringValue()); });
        }};
    }
    /**
     * Gets the keyPath property value. The registry key path to detect Win32 Line of Business (LoB) app
     * @return a string
     */
    @javax.annotation.Nullable
    public String getKeyPath() {
        return this._keyPath;
    }
    /**
     * Gets the operator property value. Contains properties for detection operator.
     * @return a win32LobAppDetectionOperator
     */
    @javax.annotation.Nullable
    public Win32LobAppDetectionOperator getOperator() {
        return this._operator;
    }
    /**
     * Gets the valueName property value. The registry value name
     * @return a string
     */
    @javax.annotation.Nullable
    public String getValueName() {
        return this._valueName;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
    public void setCheck32BitOn64System(@javax.annotation.Nullable final Boolean value) {
        this._check32BitOn64System = value;
    }
    /**
     * Sets the detectionType property value. Contains all supported registry data detection type.
     * @param value Value to set for the detectionType property.
     * @return a void
     */
    public void setDetectionType(@javax.annotation.Nullable final Win32LobAppRegistryDetectionType value) {
        this._detectionType = value;
    }
    /**
     * Sets the detectionValue property value. The registry detection value
     * @param value Value to set for the detectionValue property.
     * @return a void
     */
    public void setDetectionValue(@javax.annotation.Nullable final String value) {
        this._detectionValue = value;
    }
    /**
     * Sets the keyPath property value. The registry key path to detect Win32 Line of Business (LoB) app
     * @param value Value to set for the keyPath property.
     * @return a void
     */
    public void setKeyPath(@javax.annotation.Nullable final String value) {
        this._keyPath = value;
    }
    /**
     * Sets the operator property value. Contains properties for detection operator.
     * @param value Value to set for the operator property.
     * @return a void
     */
    public void setOperator(@javax.annotation.Nullable final Win32LobAppDetectionOperator value) {
        this._operator = value;
    }
    /**
     * Sets the valueName property value. The registry value name
     * @param value Value to set for the valueName property.
     * @return a void
     */
    public void setValueName(@javax.annotation.Nullable final String value) {
        this._valueName = value;
    }
}
