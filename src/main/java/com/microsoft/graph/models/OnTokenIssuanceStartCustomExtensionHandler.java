package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class OnTokenIssuanceStartCustomExtensionHandler extends OnTokenIssuanceStartHandler implements Parsable {
    /**
     * The configuration property
     */
    private CustomExtensionOverwriteConfiguration configuration;
    /**
     * The customExtension property
     */
    private OnTokenIssuanceStartCustomExtension customExtension;
    /**
     * Instantiates a new onTokenIssuanceStartCustomExtensionHandler and sets the default values.
     */
    public OnTokenIssuanceStartCustomExtensionHandler() {
        super();
        this.setOdataType("#microsoft.graph.onTokenIssuanceStartCustomExtensionHandler");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a onTokenIssuanceStartCustomExtensionHandler
     */
    @jakarta.annotation.Nonnull
    public static OnTokenIssuanceStartCustomExtensionHandler createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OnTokenIssuanceStartCustomExtensionHandler();
    }
    /**
     * Gets the configuration property value. The configuration property
     * @return a customExtensionOverwriteConfiguration
     */
    @jakarta.annotation.Nullable
    public CustomExtensionOverwriteConfiguration getConfiguration() {
        return this.configuration;
    }
    /**
     * Gets the customExtension property value. The customExtension property
     * @return a onTokenIssuanceStartCustomExtension
     */
    @jakarta.annotation.Nullable
    public OnTokenIssuanceStartCustomExtension getCustomExtension() {
        return this.customExtension;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("configuration", (n) -> { this.setConfiguration(n.getObjectValue(CustomExtensionOverwriteConfiguration::createFromDiscriminatorValue)); });
        deserializerMap.put("customExtension", (n) -> { this.setCustomExtension(n.getObjectValue(OnTokenIssuanceStartCustomExtension::createFromDiscriminatorValue)); });
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
     * Sets the configuration property value. The configuration property
     * @param value Value to set for the configuration property.
     */
    public void setConfiguration(@jakarta.annotation.Nullable final CustomExtensionOverwriteConfiguration value) {
        this.configuration = value;
    }
    /**
     * Sets the customExtension property value. The customExtension property
     * @param value Value to set for the customExtension property.
     */
    public void setCustomExtension(@jakarta.annotation.Nullable final OnTokenIssuanceStartCustomExtension value) {
        this.customExtension = value;
    }
}
