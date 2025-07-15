package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Indicates the applicability for an apple setting.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceManagementConfigurationIosSettingApplicability extends DeviceManagementConfigurationSettingApplicability implements Parsable {
    /**
     * Instantiates a new {@link DeviceManagementConfigurationIosSettingApplicability} and sets the default values.
     */
    public DeviceManagementConfigurationIosSettingApplicability() {
        super();
        this.setOdataType("#microsoft.graph.deviceManagementConfigurationIosSettingApplicability");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link DeviceManagementConfigurationIosSettingApplicability}
     */
    @jakarta.annotation.Nonnull
    public static DeviceManagementConfigurationIosSettingApplicability createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementConfigurationIosSettingApplicability();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("versionApplicabilities", (n) -> { this.setVersionApplicabilities(n.getCollectionOfObjectValues(DeviceManagementConfigurationAppleSettingVersionApplicability::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the versionApplicabilities property value. Gets a list of Apple applicability objects.
     * @return a {@link java.util.List<DeviceManagementConfigurationAppleSettingVersionApplicability>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceManagementConfigurationAppleSettingVersionApplicability> getVersionApplicabilities() {
        return this.backingStore.get("versionApplicabilities");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("versionApplicabilities", this.getVersionApplicabilities());
    }
    /**
     * Sets the versionApplicabilities property value. Gets a list of Apple applicability objects.
     * @param value Value to set for the versionApplicabilities property.
     */
    public void setVersionApplicabilities(@jakarta.annotation.Nullable final java.util.List<DeviceManagementConfigurationAppleSettingVersionApplicability> value) {
        this.backingStore.set("versionApplicabilities", value);
    }
}
