package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CertificateAuthorityAsEntity extends Entity implements Parsable {
    /**
     * Instantiates a new {@link CertificateAuthorityAsEntity} and sets the default values.
     */
    public CertificateAuthorityAsEntity() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CertificateAuthorityAsEntity}
     */
    @jakarta.annotation.Nonnull
    public static CertificateAuthorityAsEntity createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CertificateAuthorityAsEntity();
    }
    /**
     * Gets the certificate property value. The trusted certificate.
     * @return a {@link byte[]}
     */
    @jakarta.annotation.Nullable
    public byte[] getCertificate() {
        return this.backingStore.get("certificate");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
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
     * Gets the isRootAuthority property value. Indicates if the certificate is a root authority. In a certificateBasedApplicationConfiguration object, at least one object in the trustedCertificateAuthorities collection must be a root authority.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsRootAuthority() {
        return this.backingStore.get("isRootAuthority");
    }
    /**
     * Gets the issuer property value. The issuer of the trusted certificate.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getIssuer() {
        return this.backingStore.get("issuer");
    }
    /**
     * Gets the issuerSubjectKeyIdentifier property value. The subject key identifier of the trusted certificate.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getIssuerSubjectKeyIdentifier() {
        return this.backingStore.get("issuerSubjectKeyIdentifier");
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
     * Sets the certificate property value. The trusted certificate.
     * @param value Value to set for the certificate property.
     */
    public void setCertificate(@jakarta.annotation.Nullable final byte[] value) {
        this.backingStore.set("certificate", value);
    }
    /**
     * Sets the isRootAuthority property value. Indicates if the certificate is a root authority. In a certificateBasedApplicationConfiguration object, at least one object in the trustedCertificateAuthorities collection must be a root authority.
     * @param value Value to set for the isRootAuthority property.
     */
    public void setIsRootAuthority(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isRootAuthority", value);
    }
    /**
     * Sets the issuer property value. The issuer of the trusted certificate.
     * @param value Value to set for the issuer property.
     */
    public void setIssuer(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("issuer", value);
    }
    /**
     * Sets the issuerSubjectKeyIdentifier property value. The subject key identifier of the trusted certificate.
     * @param value Value to set for the issuerSubjectKeyIdentifier property.
     */
    public void setIssuerSubjectKeyIdentifier(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("issuerSubjectKeyIdentifier", value);
    }
}
