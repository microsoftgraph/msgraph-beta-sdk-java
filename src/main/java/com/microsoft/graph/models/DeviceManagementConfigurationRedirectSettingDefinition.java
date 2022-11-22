package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DeviceManagementConfigurationRedirectSettingDefinition extends DeviceManagementConfigurationSettingDefinition implements Parsable {
    /** A deep link that points to the specific location in the Intune console where feature support must be managed from. */
    private String _deepLink;
    /** A message that explains that clicking the link will redirect the user to a supported page to manage the settings. */
    private String _redirectMessage;
    /** Indicates the reason for redirecting the user to an alternative location in the console.  For example: WiFi profiles are not supported in the settings catalog and must be created with a template policy. */
    private String _redirectReason;
    /**
     * Instantiates a new DeviceManagementConfigurationRedirectSettingDefinition and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DeviceManagementConfigurationRedirectSettingDefinition() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceManagementConfigurationRedirectSettingDefinition
     */
    @javax.annotation.Nonnull
    public static DeviceManagementConfigurationRedirectSettingDefinition createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementConfigurationRedirectSettingDefinition();
    }
    /**
     * Gets the deepLink property value. A deep link that points to the specific location in the Intune console where feature support must be managed from.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeepLink() {
        return this._deepLink;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("deepLink", (n) -> { this.setDeepLink(n.getStringValue()); });
        deserializerMap.put("redirectMessage", (n) -> { this.setRedirectMessage(n.getStringValue()); });
        deserializerMap.put("redirectReason", (n) -> { this.setRedirectReason(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the redirectMessage property value. A message that explains that clicking the link will redirect the user to a supported page to manage the settings.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRedirectMessage() {
        return this._redirectMessage;
    }
    /**
     * Gets the redirectReason property value. Indicates the reason for redirecting the user to an alternative location in the console.  For example: WiFi profiles are not supported in the settings catalog and must be created with a template policy.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRedirectReason() {
        return this._redirectReason;
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
        writer.writeStringValue("deepLink", this.getDeepLink());
        writer.writeStringValue("redirectMessage", this.getRedirectMessage());
        writer.writeStringValue("redirectReason", this.getRedirectReason());
    }
    /**
     * Sets the deepLink property value. A deep link that points to the specific location in the Intune console where feature support must be managed from.
     * @param value Value to set for the deepLink property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeepLink(@javax.annotation.Nullable final String value) {
        this._deepLink = value;
    }
    /**
     * Sets the redirectMessage property value. A message that explains that clicking the link will redirect the user to a supported page to manage the settings.
     * @param value Value to set for the redirectMessage property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRedirectMessage(@javax.annotation.Nullable final String value) {
        this._redirectMessage = value;
    }
    /**
     * Sets the redirectReason property value. Indicates the reason for redirecting the user to an alternative location in the console.  For example: WiFi profiles are not supported in the settings catalog and must be created with a template policy.
     * @param value Value to set for the redirectReason property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRedirectReason(@javax.annotation.Nullable final String value) {
        this._redirectReason = value;
    }
}
