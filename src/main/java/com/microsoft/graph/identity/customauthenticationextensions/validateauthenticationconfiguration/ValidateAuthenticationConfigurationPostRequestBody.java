package com.microsoft.graph.identity.customauthenticationextensions.validateauthenticationconfiguration;

import com.microsoft.graph.models.CustomExtensionAuthenticationConfiguration;
import com.microsoft.graph.models.CustomExtensionEndpointConfiguration;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to call the validateAuthenticationConfiguration method. */
public class ValidateAuthenticationConfigurationPostRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The authenticationConfiguration property */
    private CustomExtensionAuthenticationConfiguration _authenticationConfiguration;
    /** The endpointConfiguration property */
    private CustomExtensionEndpointConfiguration _endpointConfiguration;
    /**
     * Instantiates a new validateAuthenticationConfigurationPostRequestBody and sets the default values.
     * @return a void
     */
    public ValidateAuthenticationConfigurationPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a validateAuthenticationConfigurationPostRequestBody
     */
    @javax.annotation.Nonnull
    public static ValidateAuthenticationConfigurationPostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ValidateAuthenticationConfigurationPostRequestBody();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * Gets the authenticationConfiguration property value. The authenticationConfiguration property
     * @return a customExtensionAuthenticationConfiguration
     */
    @javax.annotation.Nullable
    public CustomExtensionAuthenticationConfiguration getAuthenticationConfiguration() {
        return this._authenticationConfiguration;
    }
    /**
     * Gets the endpointConfiguration property value. The endpointConfiguration property
     * @return a customExtensionEndpointConfiguration
     */
    @javax.annotation.Nullable
    public CustomExtensionEndpointConfiguration getEndpointConfiguration() {
        return this._endpointConfiguration;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ValidateAuthenticationConfigurationPostRequestBody currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(2) {{
            this.put("authenticationConfiguration", (n) -> { currentObject.setAuthenticationConfiguration(n.getObjectValue(CustomExtensionAuthenticationConfiguration::createFromDiscriminatorValue)); });
            this.put("endpointConfiguration", (n) -> { currentObject.setEndpointConfiguration(n.getObjectValue(CustomExtensionEndpointConfiguration::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("authenticationConfiguration", this.getAuthenticationConfiguration());
        writer.writeObjectValue("endpointConfiguration", this.getEndpointConfiguration());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the authenticationConfiguration property value. The authenticationConfiguration property
     * @param value Value to set for the authenticationConfiguration property.
     * @return a void
     */
    public void setAuthenticationConfiguration(@javax.annotation.Nullable final CustomExtensionAuthenticationConfiguration value) {
        this._authenticationConfiguration = value;
    }
    /**
     * Sets the endpointConfiguration property value. The endpointConfiguration property
     * @param value Value to set for the endpointConfiguration property.
     * @return a void
     */
    public void setEndpointConfiguration(@javax.annotation.Nullable final CustomExtensionEndpointConfiguration value) {
        this._endpointConfiguration = value;
    }
}
