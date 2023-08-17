package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class CertificateAuthorityAsEntity extends Entity implements Parsable {
    /**
     * The certificate property
     */
    private byte[] certificate;
    /**
     * The isRootAuthority property
     */
    private Boolean isRootAuthority;
    /**
     * The issuer property
     */
    private String issuer;
    /**
     * The issuerSubjectKeyIdentifier property
     */
    private String issuerSubjectKeyIdentifier;
    /**
     * Instantiates a new certificateAuthorityAsEntity and sets the default values.
     */
    public CertificateAuthorityAsEntity() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a certificateAuthorityAsEntity
     */
    @jakarta.annotation.Nonnull
    public static CertificateAuthorityAsEntity createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CertificateAuthorityAsEntity();
    }
    /**
     * Gets the certificate property value. The certificate property
     * @return a base64url
     */
    @jakarta.annotation.Nullable
    public byte[] getCertificate() {
        return this.certificate;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("certificate", (n) -> { this.setCertificate(n.getByteArrayValue()); });
        deserializerMap.put("isRootAuthority", (n) -> { this.setIsRootAuthority(n.getBooleanValue()); });
        deserializerMap.put("issuer", (n) -> { this.setIssuer(n.getStringValue()); });
        deserializerMap.put("issuerSubjectKeyIdentifier", (n) -> { this.setIssuerSubjectKeyIdentifier(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isRootAuthority property value. The isRootAuthority property
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsRootAuthority() {
        return this.isRootAuthority;
    }
    /**
     * Gets the issuer property value. The issuer property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getIssuer() {
        return this.issuer;
    }
    /**
     * Gets the issuerSubjectKeyIdentifier property value. The issuerSubjectKeyIdentifier property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getIssuerSubjectKeyIdentifier() {
        return this.issuerSubjectKeyIdentifier;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeByteArrayValue("certificate", this.getCertificate());
        writer.writeBooleanValue("isRootAuthority", this.getIsRootAuthority());
        writer.writeStringValue("issuer", this.getIssuer());
        writer.writeStringValue("issuerSubjectKeyIdentifier", this.getIssuerSubjectKeyIdentifier());
    }
    /**
     * Sets the certificate property value. The certificate property
     * @param value Value to set for the certificate property.
     */
    public void setCertificate(@jakarta.annotation.Nullable final byte[] value) {
        this.certificate = value;
    }
    /**
     * Sets the isRootAuthority property value. The isRootAuthority property
     * @param value Value to set for the isRootAuthority property.
     */
    public void setIsRootAuthority(@jakarta.annotation.Nullable final Boolean value) {
        this.isRootAuthority = value;
    }
    /**
     * Sets the issuer property value. The issuer property
     * @param value Value to set for the issuer property.
     */
    public void setIssuer(@jakarta.annotation.Nullable final String value) {
        this.issuer = value;
    }
    /**
     * Sets the issuerSubjectKeyIdentifier property value. The issuerSubjectKeyIdentifier property
     * @param value Value to set for the issuerSubjectKeyIdentifier property.
     */
    public void setIssuerSubjectKeyIdentifier(@jakarta.annotation.Nullable final String value) {
        this.issuerSubjectKeyIdentifier = value;
    }
}
