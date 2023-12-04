package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceManagementConfigurationRedirectSettingDefinition extends DeviceManagementConfigurationSettingDefinition implements Parsable {
    /**
     * Instantiates a new DeviceManagementConfigurationRedirectSettingDefinition and sets the default values.
     */
    public DeviceManagementConfigurationRedirectSettingDefinition() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceManagementConfigurationRedirectSettingDefinition
     */
    @jakarta.annotation.Nonnull
    public static DeviceManagementConfigurationRedirectSettingDefinition createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementConfigurationRedirectSettingDefinition();
    }
    /**
     * Gets the deepLink property value. A deep link that points to the specific location in the Intune console where feature support must be managed from.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDeepLink() {
        return this.backingStore.get("deepLink");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("deepLink", (n) -> { this.setDeepLink(n.getStringValue()); });
        deserializerMap.put("redirectMessage", (n) -> { this.setRedirectMessage(n.getStringValue()); });
        deserializerMap.put("redirectReason", (n) -> { this.setRedirectReason(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the redirectMessage property value. A message that explains that clicking the link will redirect the user to a supported page to manage the settings.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getRedirectMessage() {
        return this.backingStore.get("redirectMessage");
    }
    /**
     * Gets the redirectReason property value. Indicates the reason for redirecting the user to an alternative location in the console.  For example: WiFi profiles are not supported in the settings catalog and must be created with a template policy.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getRedirectReason() {
        return this.backingStore.get("redirectReason");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("deepLink", this.getDeepLink());
        writer.writeStringValue("redirectMessage", this.getRedirectMessage());
        writer.writeStringValue("redirectReason", this.getRedirectReason());
    }
    /**
     * Sets the deepLink property value. A deep link that points to the specific location in the Intune console where feature support must be managed from.
     * @param value Value to set for the deepLink property.
     */
    public void setDeepLink(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("deepLink", value);
    }
    /**
     * Sets the redirectMessage property value. A message that explains that clicking the link will redirect the user to a supported page to manage the settings.
     * @param value Value to set for the redirectMessage property.
     */
    public void setRedirectMessage(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("redirectMessage", value);
    }
    /**
     * Sets the redirectReason property value. Indicates the reason for redirecting the user to an alternative location in the console.  For example: WiFi profiles are not supported in the settings catalog and must be created with a template policy.
     * @param value Value to set for the redirectReason property.
     */
    public void setRedirectReason(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("redirectReason", value);
    }
}
