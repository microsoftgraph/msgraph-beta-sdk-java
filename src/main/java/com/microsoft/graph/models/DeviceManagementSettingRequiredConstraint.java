package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DeviceManagementSettingRequiredConstraint extends DeviceManagementConstraint implements Parsable {
    /** List of value which means not configured for the setting */
    private String _notConfiguredValue;
    /**
     * Instantiates a new DeviceManagementSettingRequiredConstraint and sets the default values.
     * @return a void
     */
    public DeviceManagementSettingRequiredConstraint() {
        super();
        this.setOdataType("#microsoft.graph.deviceManagementSettingRequiredConstraint");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceManagementSettingRequiredConstraint
     */
    @javax.annotation.Nonnull
    public static DeviceManagementSettingRequiredConstraint createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementSettingRequiredConstraint();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DeviceManagementSettingRequiredConstraint currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("notConfiguredValue", (n) -> { currentObject.setNotConfiguredValue(n.getStringValue()); });
        }};
    }
    /**
     * Gets the notConfiguredValue property value. List of value which means not configured for the setting
     * @return a string
     */
    @javax.annotation.Nullable
    public String getNotConfiguredValue() {
        return this._notConfiguredValue;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("notConfiguredValue", this.getNotConfiguredValue());
    }
    /**
     * Sets the notConfiguredValue property value. List of value which means not configured for the setting
     * @param value Value to set for the notConfiguredValue property.
     * @return a void
     */
    public void setNotConfiguredValue(@javax.annotation.Nullable final String value) {
        this._notConfiguredValue = value;
    }
}
