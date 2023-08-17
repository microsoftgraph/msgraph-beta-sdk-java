package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DeviceComplianceScriptRuleError extends DeviceComplianceScriptError implements Parsable {
    /**
     * Setting name for the rule with error.
     */
    private String settingName;
    /**
     * Instantiates a new deviceComplianceScriptRuleError and sets the default values.
     */
    public DeviceComplianceScriptRuleError() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceComplianceScriptRuleError
     */
    @jakarta.annotation.Nonnull
    public static DeviceComplianceScriptRuleError createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceComplianceScriptRuleError();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("settingName", (n) -> { this.setSettingName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the settingName property value. Setting name for the rule with error.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getSettingName() {
        return this.settingName;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("settingName", this.getSettingName());
    }
    /**
     * Sets the settingName property value. Setting name for the rule with error.
     * @param value Value to set for the settingName property.
     */
    public void setSettingName(@jakarta.annotation.Nullable final String value) {
        this.settingName = value;
    }
}
