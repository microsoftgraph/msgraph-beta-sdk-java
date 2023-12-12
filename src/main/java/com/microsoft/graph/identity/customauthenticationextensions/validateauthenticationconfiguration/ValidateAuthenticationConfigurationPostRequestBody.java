package com.microsoft.graph.identity.customauthenticationextensions.validateauthenticationconfiguration;

import com.microsoft.graph.models.CustomExtensionAuthenticationConfiguration;
import com.microsoft.graph.models.CustomExtensionEndpointConfiguration;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ValidateAuthenticationConfigurationPostRequestBody implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new ValidateAuthenticationConfigurationPostRequestBody and sets the default values.
     */
    public ValidateAuthenticationConfigurationPostRequestBody() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ValidateAuthenticationConfigurationPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static ValidateAuthenticationConfigurationPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ValidateAuthenticationConfigurationPostRequestBody();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.backingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the authenticationConfiguration property value. The authenticationConfiguration property
     * @return a CustomExtensionAuthenticationConfiguration
     */
    @jakarta.annotation.Nullable
    public CustomExtensionAuthenticationConfiguration getAuthenticationConfiguration() {
        return this.backingStore.get("authenticationConfiguration");
    }
    /**
     * Gets the backingStore property value. Stores model information.
     * @return a BackingStore
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * Gets the endpointConfiguration property value. The endpointConfiguration property
     * @return a CustomExtensionEndpointConfiguration
     */
    @jakarta.annotation.Nullable
    public CustomExtensionEndpointConfiguration getEndpointConfiguration() {
        return this.backingStore.get("endpointConfiguration");
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
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the authenticationConfiguration property value. The authenticationConfiguration property
     * @param value Value to set for the authenticationConfiguration property.
     */
    public void setAuthenticationConfiguration(@jakarta.annotation.Nullable final CustomExtensionAuthenticationConfiguration value) {
        this.backingStore.set("authenticationConfiguration", value);
    }
    /**
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the endpointConfiguration property value. The endpointConfiguration property
     * @param value Value to set for the endpointConfiguration property.
     */
    public void setEndpointConfiguration(@jakarta.annotation.Nullable final CustomExtensionEndpointConfiguration value) {
        this.backingStore.set("endpointConfiguration", value);
    }
}
