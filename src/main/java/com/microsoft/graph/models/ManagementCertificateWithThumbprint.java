package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ManagementCertificateWithThumbprint implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The Base 64 encoded management certificate
     */
    private String certificate;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The thumbprint of the management certificate
     */
    private String thumbprint;
    /**
     * Instantiates a new managementCertificateWithThumbprint and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public ManagementCertificateWithThumbprint() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a managementCertificateWithThumbprint
     */
    @jakarta.annotation.Nonnull
    public static ManagementCertificateWithThumbprint createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ManagementCertificateWithThumbprint();
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
     * Gets the certificate property value. The Base 64 encoded management certificate
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getCertificate() {
        return this.certificate;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("certificate", (n) -> { this.setCertificate(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("thumbprint", (n) -> { this.setThumbprint(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the thumbprint property value. The thumbprint of the management certificate
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getThumbprint() {
        return this.thumbprint;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("certificate", this.getCertificate());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("thumbprint", this.getThumbprint());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the certificate property value. The Base 64 encoded management certificate
     * @param value Value to set for the certificate property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setCertificate(@jakarta.annotation.Nullable final String value) {
        this.certificate = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the thumbprint property value. The thumbprint of the management certificate
     * @param value Value to set for the thumbprint property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setThumbprint(@jakarta.annotation.Nullable final String value) {
        this.thumbprint = value;
    }
}
