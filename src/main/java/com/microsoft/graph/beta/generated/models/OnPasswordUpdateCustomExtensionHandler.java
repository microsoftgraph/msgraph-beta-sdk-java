package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OnPasswordUpdateCustomExtensionHandler extends OnPasswordUpdateHandler implements Parsable {
    /**
     * Instantiates a new {@link OnPasswordUpdateCustomExtensionHandler} and sets the default values.
     */
    public OnPasswordUpdateCustomExtensionHandler() {
        super();
        this.setOdataType("#microsoft.graph.onPasswordUpdateCustomExtensionHandler");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link OnPasswordUpdateCustomExtensionHandler}
     */
    @jakarta.annotation.Nonnull
    public static OnPasswordUpdateCustomExtensionHandler createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OnPasswordUpdateCustomExtensionHandler();
    }
    /**
     * Gets the configuration property value. Configuration that overrides the default settings from the referenced custom extension, such as timeout and retry values.
     * @return a {@link CustomExtensionOverwriteConfiguration}
     */
    @jakarta.annotation.Nullable
    public CustomExtensionOverwriteConfiguration getConfiguration() {
        return this.backingStore.get("configuration");
    }
    /**
     * Gets the customExtension property value. The customExtension property
     * @return a {@link OnPasswordUpdateCustomExtension}
     */
    @jakarta.annotation.Nullable
    public OnPasswordUpdateCustomExtension getCustomExtension() {
        return this.backingStore.get("customExtension");
    }
    /**
     * Gets the expirationDateTime property value. The date and time at which the listener stops invoking the custom extension. The value must be in the future and can&apos;t be more than six months after the create or PATCH request. Renew the value by updating the listener. After the value passes, the callout is skipped until the listener is renewed or recreated.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getExpirationDateTime() {
        return this.backingStore.get("expirationDateTime");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("configuration", (n) -> { this.setConfiguration(n.getObjectValue(CustomExtensionOverwriteConfiguration::createFromDiscriminatorValue)); });
        deserializerMap.put("customExtension", (n) -> { this.setCustomExtension(n.getObjectValue(OnPasswordUpdateCustomExtension::createFromDiscriminatorValue)); });
        deserializerMap.put("expirationDateTime", (n) -> { this.setExpirationDateTime(n.getOffsetDateTimeValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("configuration", this.getConfiguration());
        writer.writeObjectValue("customExtension", this.getCustomExtension());
        writer.writeOffsetDateTimeValue("expirationDateTime", this.getExpirationDateTime());
    }
    /**
     * Sets the configuration property value. Configuration that overrides the default settings from the referenced custom extension, such as timeout and retry values.
     * @param value Value to set for the configuration property.
     */
    public void setConfiguration(@jakarta.annotation.Nullable final CustomExtensionOverwriteConfiguration value) {
        this.backingStore.set("configuration", value);
    }
    /**
     * Sets the customExtension property value. The customExtension property
     * @param value Value to set for the customExtension property.
     */
    public void setCustomExtension(@jakarta.annotation.Nullable final OnPasswordUpdateCustomExtension value) {
        this.backingStore.set("customExtension", value);
    }
    /**
     * Sets the expirationDateTime property value. The date and time at which the listener stops invoking the custom extension. The value must be in the future and can&apos;t be more than six months after the create or PATCH request. Renew the value by updating the listener. After the value passes, the callout is skipped until the listener is renewed or recreated.
     * @param value Value to set for the expirationDateTime property.
     */
    public void setExpirationDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("expirationDateTime", value);
    }
}
