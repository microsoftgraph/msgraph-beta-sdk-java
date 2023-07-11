package com.microsoft.graph.deviceappmanagement.mobileapps.validatexml;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ValidateXmlPostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The officeConfigurationXml property
     */
    private byte[] officeConfigurationXml;
    /**
     * Instantiates a new validateXmlPostRequestBody and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ValidateXmlPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a validateXmlPostRequestBody
     */
    @javax.annotation.Nonnull
    public static ValidateXmlPostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ValidateXmlPostRequestBody();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("officeConfigurationXml", (n) -> { this.setOfficeConfigurationXml(n.getByteArrayValue()); });
        return deserializerMap;
    }
    /**
     * Gets the officeConfigurationXml property value. The officeConfigurationXml property
     * @return a base64url
     */
    @javax.annotation.Nullable
    public byte[] getOfficeConfigurationXml() {
        return this.officeConfigurationXml;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeByteArrayValue("officeConfigurationXml", this.getOfficeConfigurationXml());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the officeConfigurationXml property value. The officeConfigurationXml property
     * @param value Value to set for the officeConfigurationXml property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOfficeConfigurationXml(@javax.annotation.Nullable final byte[] value) {
        this.officeConfigurationXml = value;
    }
}
