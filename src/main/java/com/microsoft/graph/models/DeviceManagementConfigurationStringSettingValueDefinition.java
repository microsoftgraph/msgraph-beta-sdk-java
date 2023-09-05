package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * String constraints
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceManagementConfigurationStringSettingValueDefinition extends DeviceManagementConfigurationSettingValueDefinition implements Parsable {
    /**
     * Supported file types for this setting.
     */
    private java.util.List<String> fileTypes;
    /**
     * Pre-defined format of the string. Possible values are: none, email, guid, ip, base64, url, version, xml, date, time, binary, regEx, json, dateTime, surfaceHub, bashScript, unknownFutureValue.
     */
    private DeviceManagementConfigurationStringFormat format;
    /**
     * Regular expression or any xml or json schema that the input string should match
     */
    private String inputValidationSchema;
    /**
     * Specifies whether the setting needs to be treated as a secret. Settings marked as yes will be encrypted in transit and at rest and will be displayed as asterisks when represented in the UX.
     */
    private Boolean isSecret;
    /**
     * Maximum length of string. Valid values 0 to 87516
     */
    private Long maximumLength;
    /**
     * Minimum length of string. Valid values 0 to 87516
     */
    private Long minimumLength;
    /**
     * Instantiates a new deviceManagementConfigurationStringSettingValueDefinition and sets the default values.
     */
    public DeviceManagementConfigurationStringSettingValueDefinition() {
        super();
        this.setOdataType("#microsoft.graph.deviceManagementConfigurationStringSettingValueDefinition");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceManagementConfigurationStringSettingValueDefinition
     */
    @jakarta.annotation.Nonnull
    public static DeviceManagementConfigurationStringSettingValueDefinition createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementConfigurationStringSettingValueDefinition();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("fileTypes", (n) -> { this.setFileTypes(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("format", (n) -> { this.setFormat(n.getEnumValue(DeviceManagementConfigurationStringFormat.class)); });
        deserializerMap.put("inputValidationSchema", (n) -> { this.setInputValidationSchema(n.getStringValue()); });
        deserializerMap.put("isSecret", (n) -> { this.setIsSecret(n.getBooleanValue()); });
        deserializerMap.put("maximumLength", (n) -> { this.setMaximumLength(n.getLongValue()); });
        deserializerMap.put("minimumLength", (n) -> { this.setMinimumLength(n.getLongValue()); });
        return deserializerMap;
    }
    /**
     * Gets the fileTypes property value. Supported file types for this setting.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getFileTypes() {
        return this.fileTypes;
    }
    /**
     * Gets the format property value. Pre-defined format of the string. Possible values are: none, email, guid, ip, base64, url, version, xml, date, time, binary, regEx, json, dateTime, surfaceHub, bashScript, unknownFutureValue.
     * @return a deviceManagementConfigurationStringFormat
     */
    @jakarta.annotation.Nullable
    public DeviceManagementConfigurationStringFormat getFormat() {
        return this.format;
    }
    /**
     * Gets the inputValidationSchema property value. Regular expression or any xml or json schema that the input string should match
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getInputValidationSchema() {
        return this.inputValidationSchema;
    }
    /**
     * Gets the isSecret property value. Specifies whether the setting needs to be treated as a secret. Settings marked as yes will be encrypted in transit and at rest and will be displayed as asterisks when represented in the UX.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsSecret() {
        return this.isSecret;
    }
    /**
     * Gets the maximumLength property value. Maximum length of string. Valid values 0 to 87516
     * @return a int64
     */
    @jakarta.annotation.Nullable
    public Long getMaximumLength() {
        return this.maximumLength;
    }
    /**
     * Gets the minimumLength property value. Minimum length of string. Valid values 0 to 87516
     * @return a int64
     */
    @jakarta.annotation.Nullable
    public Long getMinimumLength() {
        return this.minimumLength;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     */
    public void setFileTypes(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.fileTypes = value;
    }
    /**
     * Sets the format property value. Pre-defined format of the string. Possible values are: none, email, guid, ip, base64, url, version, xml, date, time, binary, regEx, json, dateTime, surfaceHub, bashScript, unknownFutureValue.
     * @param value Value to set for the format property.
     */
    public void setFormat(@jakarta.annotation.Nullable final DeviceManagementConfigurationStringFormat value) {
        this.format = value;
    }
    /**
     * Sets the inputValidationSchema property value. Regular expression or any xml or json schema that the input string should match
     * @param value Value to set for the inputValidationSchema property.
     */
    public void setInputValidationSchema(@jakarta.annotation.Nullable final String value) {
        this.inputValidationSchema = value;
    }
    /**
     * Sets the isSecret property value. Specifies whether the setting needs to be treated as a secret. Settings marked as yes will be encrypted in transit and at rest and will be displayed as asterisks when represented in the UX.
     * @param value Value to set for the isSecret property.
     */
    public void setIsSecret(@jakarta.annotation.Nullable final Boolean value) {
        this.isSecret = value;
    }
    /**
     * Sets the maximumLength property value. Maximum length of string. Valid values 0 to 87516
     * @param value Value to set for the maximumLength property.
     */
    public void setMaximumLength(@jakarta.annotation.Nullable final Long value) {
        this.maximumLength = value;
    }
    /**
     * Sets the minimumLength property value. Minimum length of string. Valid values 0 to 87516
     * @param value Value to set for the minimumLength property.
     */
    public void setMinimumLength(@jakarta.annotation.Nullable final Long value) {
        this.minimumLength = value;
    }
}
