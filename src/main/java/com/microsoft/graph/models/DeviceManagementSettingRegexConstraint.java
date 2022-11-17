package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DeviceManagementSettingRegexConstraint extends DeviceManagementConstraint implements Parsable {
    /** The RegEx pattern to match against */
    private String _regex;
    /**
     * Instantiates a new DeviceManagementSettingRegexConstraint and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DeviceManagementSettingRegexConstraint() {
        super();
        this.setOdataType("#microsoft.graph.deviceManagementSettingRegexConstraint");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceManagementSettingRegexConstraint
     */
    @javax.annotation.Nonnull
    public static DeviceManagementSettingRegexConstraint createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementSettingRegexConstraint();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DeviceManagementSettingRegexConstraint currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("regex", (n) -> { currentObject.setRegex(n.getStringValue()); });
        }};
    }
    /**
     * Gets the regex property value. The RegEx pattern to match against
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRegex() {
        return this._regex;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("regex", this.getRegex());
    }
    /**
     * Sets the regex property value. The RegEx pattern to match against
     * @param value Value to set for the regex property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRegex(@javax.annotation.Nullable final String value) {
        this._regex = value;
    }
}
