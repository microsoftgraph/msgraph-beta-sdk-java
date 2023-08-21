package com.microsoft.graph.deviceappmanagement.targetedmanagedappconfigurations.item.changesettings;

import com.microsoft.graph.models.DeviceManagementConfigurationSetting;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ChangeSettingsPostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The settings property
     */
    private java.util.List<DeviceManagementConfigurationSetting> settings;
    /**
     * Instantiates a new changeSettingsPostRequestBody and sets the default values.
     */
    public ChangeSettingsPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a changeSettingsPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static ChangeSettingsPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ChangeSettingsPostRequestBody();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("settings", (n) -> { this.setSettings(n.getCollectionOfObjectValues(DeviceManagementConfigurationSetting::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the settings property value. The settings property
     * @return a deviceManagementConfigurationSetting
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceManagementConfigurationSetting> getSettings() {
        return this.settings;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("settings", this.getSettings());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the settings property value. The settings property
     * @param value Value to set for the settings property.
     */
    public void setSettings(@jakarta.annotation.Nullable final java.util.List<DeviceManagementConfigurationSetting> value) {
        this.settings = value;
    }
}
