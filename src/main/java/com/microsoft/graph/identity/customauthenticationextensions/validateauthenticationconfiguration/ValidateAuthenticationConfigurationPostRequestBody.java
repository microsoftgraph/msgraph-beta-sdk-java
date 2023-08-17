package com.microsoft.graph.identity.customauthenticationextensions.validateauthenticationconfiguration;

import com.microsoft.graph.models.CustomExtensionAuthenticationConfiguration;
import com.microsoft.graph.models.CustomExtensionEndpointConfiguration;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ValidateAuthenticationConfigurationPostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The authenticationConfiguration property
     */
    private CustomExtensionAuthenticationConfiguration authenticationConfiguration;
    /**
     * The endpointConfiguration property
     */
    private CustomExtensionEndpointConfiguration endpointConfiguration;
    /**
     * Instantiates a new validateAuthenticationConfigurationPostRequestBody and sets the default values.
     */
    public ValidateAuthenticationConfigurationPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a validateAuthenticationConfigurationPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static ValidateAuthenticationConfigurationPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ValidateAuthenticationConfigurationPostRequestBody();
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
     * Gets the authenticationConfiguration property value. The authenticationConfiguration property
     * @return a customExtensionAuthenticationConfiguration
     */
    @jakarta.annotation.Nullable
    public CustomExtensionAuthenticationConfiguration getAuthenticationConfiguration() {
        return this.authenticationConfiguration;
    }
    /**
     * Gets the endpointConfiguration property value. The endpointConfiguration property
     * @return a customExtensionEndpointConfiguration
     */
    @jakarta.annotation.Nullable
    public CustomExtensionEndpointConfiguration getEndpointConfiguration() {
        return this.endpointConfiguration;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("authenticationConfiguration", (n) -> { this.setAuthenticationConfiguration(n.getObjectValue(CustomExtensionAuthenticationConfiguration::createFromDiscriminatorValue)); });
        deserializerMap.put("endpointConfiguration", (n) -> { this.setEndpointConfiguration(n.getObjectValue(CustomExtensionEndpointConfiguration::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("authenticationConfiguration", this.getAuthenticationConfiguration());
        writer.writeObjectValue("endpointConfiguration", this.getEndpointConfiguration());
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
     * Sets the authenticationConfiguration property value. The authenticationConfiguration property
     * @param value Value to set for the authenticationConfiguration property.
     */
    public void setAuthenticationConfiguration(@jakarta.annotation.Nullable final CustomExtensionAuthenticationConfiguration value) {
        this.authenticationConfiguration = value;
    }
    /**
     * Sets the endpointConfiguration property value. The endpointConfiguration property
     * @param value Value to set for the endpointConfiguration property.
     */
    public void setEndpointConfiguration(@jakarta.annotation.Nullable final CustomExtensionEndpointConfiguration value) {
        this.endpointConfiguration = value;
    }
}
