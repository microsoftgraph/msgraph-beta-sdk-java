package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OnOtpSendCustomExtensionHandler extends OnOtpSendHandler implements Parsable {
    /**
     * Instantiates a new {@link OnOtpSendCustomExtensionHandler} and sets the default values.
     */
    public OnOtpSendCustomExtensionHandler() {
        super();
        this.setOdataType("#microsoft.graph.onOtpSendCustomExtensionHandler");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link OnOtpSendCustomExtensionHandler}
     */
    @jakarta.annotation.Nonnull
    public static OnOtpSendCustomExtensionHandler createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OnOtpSendCustomExtensionHandler();
    }
    /**
     * Gets the configuration property value. Configuration regarding properties of the custom extension that are can be overwritten for the onEmailOtpSendListener event listener.
     * @return a {@link CustomExtensionOverwriteConfiguration}
     */
    @jakarta.annotation.Nullable
    public CustomExtensionOverwriteConfiguration getConfiguration() {
        return this.backingStore.get("configuration");
    }
    /**
     * Gets the customExtension property value. The customExtension property
     * @return a {@link OnOtpSendCustomExtension}
     */
    @jakarta.annotation.Nullable
    public OnOtpSendCustomExtension getCustomExtension() {
        return this.backingStore.get("customExtension");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("configuration", (n) -> { this.setConfiguration(n.getObjectValue(CustomExtensionOverwriteConfiguration::createFromDiscriminatorValue)); });
        deserializerMap.put("customExtension", (n) -> { this.setCustomExtension(n.getObjectValue(OnOtpSendCustomExtension::createFromDiscriminatorValue)); });
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
    }
    /**
     * Sets the configuration property value. Configuration regarding properties of the custom extension that are can be overwritten for the onEmailOtpSendListener event listener.
     * @param value Value to set for the configuration property.
     */
    public void setConfiguration(@jakarta.annotation.Nullable final CustomExtensionOverwriteConfiguration value) {
        this.backingStore.set("configuration", value);
    }
    /**
     * Sets the customExtension property value. The customExtension property
     * @param value Value to set for the customExtension property.
     */
    public void setCustomExtension(@jakarta.annotation.Nullable final OnOtpSendCustomExtension value) {
        this.backingStore.set("customExtension", value);
    }
}
