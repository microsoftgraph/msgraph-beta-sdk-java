package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DeviceManagementConfigurationStringSettingValueDefinition extends DeviceManagementConfigurationSettingValueDefinition implements Parsable {
    /** Supported file types for this setting. */
    private java.util.List<String> _fileTypes;
    /** The format property */
    private DeviceManagementConfigurationStringFormat _format;
    /** Regular expression or any xml or json schema that the input string should match */
    private String _inputValidationSchema;
    /** Specifies whether the setting needs to be treated as a secret. Settings marked as yes will be encrypted in transit and at rest and will be displayed as asterisks when represented in the UX. */
    private Boolean _isSecret;
    /** Maximum length of string. Valid values 0 to 87516 */
    private Long _maximumLength;
    /** Minimum length of string. Valid values 0 to 87516 */
    private Long _minimumLength;
    /**
     * Instantiates a new DeviceManagementConfigurationStringSettingValueDefinition and sets the default values.
     * @return a void
     */
    public DeviceManagementConfigurationStringSettingValueDefinition() {
        super();
        this.setOdataType("#microsoft.graph.deviceManagementConfigurationStringSettingValueDefinition");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceManagementConfigurationStringSettingValueDefinition
     */
    @javax.annotation.Nonnull
    public static DeviceManagementConfigurationStringSettingValueDefinition createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementConfigurationStringSettingValueDefinition();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DeviceManagementConfigurationStringSettingValueDefinition currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("fileTypes", (n) -> { currentObject.setFileTypes(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("format", (n) -> { currentObject.setFormat(n.getEnumValue(DeviceManagementConfigurationStringFormat.class)); });
            this.put("inputValidationSchema", (n) -> { currentObject.setInputValidationSchema(n.getStringValue()); });
            this.put("isSecret", (n) -> { currentObject.setIsSecret(n.getBooleanValue()); });
            this.put("maximumLength", (n) -> { currentObject.setMaximumLength(n.getLongValue()); });
            this.put("minimumLength", (n) -> { currentObject.setMinimumLength(n.getLongValue()); });
        }};
    }
    /**
     * Gets the fileTypes property value. Supported file types for this setting.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getFileTypes() {
        return this._fileTypes;
    }
    /**
     * Gets the format property value. The format property
     * @return a deviceManagementConfigurationStringFormat
     */
    @javax.annotation.Nullable
    public DeviceManagementConfigurationStringFormat getFormat() {
        return this._format;
    }
    /**
     * Gets the inputValidationSchema property value. Regular expression or any xml or json schema that the input string should match
     * @return a string
     */
    @javax.annotation.Nullable
    public String getInputValidationSchema() {
        return this._inputValidationSchema;
    }
    /**
     * Gets the isSecret property value. Specifies whether the setting needs to be treated as a secret. Settings marked as yes will be encrypted in transit and at rest and will be displayed as asterisks when represented in the UX.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsSecret() {
        return this._isSecret;
    }
    /**
     * Gets the maximumLength property value. Maximum length of string. Valid values 0 to 87516
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getMaximumLength() {
        return this._maximumLength;
    }
    /**
     * Gets the minimumLength property value. Minimum length of string. Valid values 0 to 87516
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getMinimumLength() {
        return this._minimumLength;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfPrimitiveValues("fileTypes", this.getFileTypes());
        writer.writeEnumValue("format", this.getFormat());
        writer.writeStringValue("inputValidationSchema", this.getInputValidationSchema());
        writer.writeBooleanValue("isSecret", this.getIsSecret());
        writer.writeLongValue("maximumLength", this.getMaximumLength());
        writer.writeLongValue("minimumLength", this.getMinimumLength());
    }
    /**
     * Sets the fileTypes property value. Supported file types for this setting.
     * @param value Value to set for the fileTypes property.
     * @return a void
     */
    public void setFileTypes(@javax.annotation.Nullable final java.util.List<String> value) {
        this._fileTypes = value;
    }
    /**
     * Sets the format property value. The format property
     * @param value Value to set for the format property.
     * @return a void
     */
    public void setFormat(@javax.annotation.Nullable final DeviceManagementConfigurationStringFormat value) {
        this._format = value;
    }
    /**
     * Sets the inputValidationSchema property value. Regular expression or any xml or json schema that the input string should match
     * @param value Value to set for the inputValidationSchema property.
     * @return a void
     */
    public void setInputValidationSchema(@javax.annotation.Nullable final String value) {
        this._inputValidationSchema = value;
    }
    /**
     * Sets the isSecret property value. Specifies whether the setting needs to be treated as a secret. Settings marked as yes will be encrypted in transit and at rest and will be displayed as asterisks when represented in the UX.
     * @param value Value to set for the isSecret property.
     * @return a void
     */
    public void setIsSecret(@javax.annotation.Nullable final Boolean value) {
        this._isSecret = value;
    }
    /**
     * Sets the maximumLength property value. Maximum length of string. Valid values 0 to 87516
     * @param value Value to set for the maximumLength property.
     * @return a void
     */
    public void setMaximumLength(@javax.annotation.Nullable final Long value) {
        this._maximumLength = value;
    }
    /**
     * Sets the minimumLength property value. Minimum length of string. Valid values 0 to 87516
     * @param value Value to set for the minimumLength property.
     * @return a void
     */
    public void setMinimumLength(@javax.annotation.Nullable final Long value) {
        this._minimumLength = value;
    }
}
