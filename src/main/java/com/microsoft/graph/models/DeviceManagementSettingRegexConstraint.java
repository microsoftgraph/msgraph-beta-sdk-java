package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Constraint enforcing the setting matches against a given RegEx pattern
 */
public class DeviceManagementSettingRegexConstraint extends DeviceManagementConstraint implements Parsable {
    /**
     * The RegEx pattern to match against
     */
    private String regex;
    /**
     * Instantiates a new deviceManagementSettingRegexConstraint and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public DeviceManagementSettingRegexConstraint() {
        super();
        this.setOdataType("#microsoft.graph.deviceManagementSettingRegexConstraint");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceManagementSettingRegexConstraint
     */
    @jakarta.annotation.Nonnull
    public static DeviceManagementSettingRegexConstraint createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementSettingRegexConstraint();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("regex", (n) -> { this.setRegex(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the regex property value. The RegEx pattern to match against
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getRegex() {
        return this.regex;
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
        writer.writeStringValue("regex", this.getRegex());
    }
    /**
     * Sets the regex property value. The RegEx pattern to match against
     * @param value Value to set for the regex property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setRegex(@jakarta.annotation.Nullable final String value) {
        this.regex = value;
    }
}
