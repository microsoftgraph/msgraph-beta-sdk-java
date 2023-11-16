package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Constraint enforcing the file extension is acceptable for a given setting
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceManagementSettingFileConstraint extends DeviceManagementConstraint implements Parsable {
    /**
     * Instantiates a new DeviceManagementSettingFileConstraint and sets the default values.
     */
    public DeviceManagementSettingFileConstraint() {
        super();
        this.setOdataType("#microsoft.graph.deviceManagementSettingFileConstraint");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceManagementSettingFileConstraint
     */
    @jakarta.annotation.Nonnull
    public static DeviceManagementSettingFileConstraint createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementSettingFileConstraint();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("supportedExtensions", (n) -> { this.setSupportedExtensions(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the supportedExtensions property value. Acceptable file extensions to upload for this setting
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getSupportedExtensions() {
        return this.BackingStore.get("supportedExtensions");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfPrimitiveValues("supportedExtensions", this.getSupportedExtensions());
    }
    /**
     * Sets the supportedExtensions property value. Acceptable file extensions to upload for this setting
     * @param value Value to set for the supportedExtensions property.
     */
    public void setSupportedExtensions(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.BackingStore.set("supportedExtensions", value);
    }
}
