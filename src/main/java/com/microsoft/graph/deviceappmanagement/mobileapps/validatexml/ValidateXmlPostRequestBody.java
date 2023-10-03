package com.microsoft.graph.deviceappmanagement.mobileapps.validatexml;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ValidateXmlPostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The officeConfigurationXml property
     */
    private Base64url officeConfigurationXml;
    /**
     * Instantiates a new ValidateXmlPostRequestBody and sets the default values.
     */
    public ValidateXmlPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ValidateXmlPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static ValidateXmlPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ValidateXmlPostRequestBody();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
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
        deserializerMap.put("officeConfigurationXml", (n) -> { this.setOfficeConfigurationXml(n.getObjectValue(Base64url::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the officeConfigurationXml property value. The officeConfigurationXml property
     * @return a Base64url
     */
    @jakarta.annotation.Nullable
    public Base64url getOfficeConfigurationXml() {
        return this.officeConfigurationXml;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("officeConfigurationXml", this.getOfficeConfigurationXml());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the officeConfigurationXml property value. The officeConfigurationXml property
     * @param value Value to set for the officeConfigurationXml property.
     */
    public void setOfficeConfigurationXml(@jakarta.annotation.Nullable final Base64url value) {
        this.officeConfigurationXml = value;
    }
}
