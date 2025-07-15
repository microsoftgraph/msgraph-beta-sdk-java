package com.microsoft.graph.beta.models.networkaccess;

import com.microsoft.graph.beta.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ExternalCertificateAuthorityCertificate extends Entity implements Parsable {
    /**
     * Instantiates a new {@link ExternalCertificateAuthorityCertificate} and sets the default values.
     */
    public ExternalCertificateAuthorityCertificate() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ExternalCertificateAuthorityCertificate}
     */
    @jakarta.annotation.Nonnull
    public static ExternalCertificateAuthorityCertificate createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ExternalCertificateAuthorityCertificate();
    }
    /**
     * Gets the certificate property value. The signed X.509 certificate in PEM format.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCertificate() {
        return this.backingStore.get("certificate");
    }
    /**
     * Gets the certificateSigningRequest property value. The Certificate Signing Request (CSR) generated when creating the CA. This CSR should be signed using the customer&apos;s PKI infrastructure. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCertificateSigningRequest() {
        return this.backingStore.get("certificateSigningRequest");
    }
    /**
     * Gets the chain property value. The certificate chain in PEM format, containing all intermediate certificates up to the root CA.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getChain() {
        return this.backingStore.get("chain");
    }
    /**
     * Gets the commonName property value. The common name (CN) field of the certificate. Supports $filter (eq, ne, startsWith)
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCommonName() {
        return this.backingStore.get("commonName");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("certificate", (n) -> { this.setCertificate(n.getStringValue()); });
        deserializerMap.put("certificateSigningRequest", (n) -> { this.setCertificateSigningRequest(n.getStringValue()); });
        deserializerMap.put("chain", (n) -> { this.setChain(n.getStringValue()); });
        deserializerMap.put("commonName", (n) -> { this.setCommonName(n.getStringValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("organizationName", (n) -> { this.setOrganizationName(n.getStringValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(TlsCertificateStatus::forValue)); });
        deserializerMap.put("validity", (n) -> { this.setValidity(n.getObjectValue(ValidityDate::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the name property value. The display name of the CA. Supports $filter (eq, ne, startsWith)
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.backingStore.get("name");
    }
    /**
     * Gets the organizationName property value. The organization name (OU) field of the certificate. Supports $filter (eq, ne, startsWith)
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOrganizationName() {
        return this.backingStore.get("organizationName");
    }
    /**
     * Gets the status property value. The status property
     * @return a {@link TlsCertificateStatus}
     */
    @jakarta.annotation.Nullable
    public TlsCertificateStatus getStatus() {
        return this.backingStore.get("status");
    }
    /**
     * Gets the validity property value. The validity property
     * @return a {@link ValidityDate}
     */
    @jakarta.annotation.Nullable
    public ValidityDate getValidity() {
        return this.backingStore.get("validity");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("certificate", this.getCertificate());
        writer.writeStringValue("certificateSigningRequest", this.getCertificateSigningRequest());
        writer.writeStringValue("chain", this.getChain());
        writer.writeStringValue("commonName", this.getCommonName());
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("organizationName", this.getOrganizationName());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeObjectValue("validity", this.getValidity());
    }
    /**
     * Sets the certificate property value. The signed X.509 certificate in PEM format.
     * @param value Value to set for the certificate property.
     */
    public void setCertificate(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("certificate", value);
    }
    /**
     * Sets the certificateSigningRequest property value. The Certificate Signing Request (CSR) generated when creating the CA. This CSR should be signed using the customer&apos;s PKI infrastructure. Read-only.
     * @param value Value to set for the certificateSigningRequest property.
     */
    public void setCertificateSigningRequest(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("certificateSigningRequest", value);
    }
    /**
     * Sets the chain property value. The certificate chain in PEM format, containing all intermediate certificates up to the root CA.
     * @param value Value to set for the chain property.
     */
    public void setChain(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("chain", value);
    }
    /**
     * Sets the commonName property value. The common name (CN) field of the certificate. Supports $filter (eq, ne, startsWith)
     * @param value Value to set for the commonName property.
     */
    public void setCommonName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("commonName", value);
    }
    /**
     * Sets the name property value. The display name of the CA. Supports $filter (eq, ne, startsWith)
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("name", value);
    }
    /**
     * Sets the organizationName property value. The organization name (OU) field of the certificate. Supports $filter (eq, ne, startsWith)
     * @param value Value to set for the organizationName property.
     */
    public void setOrganizationName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("organizationName", value);
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final TlsCertificateStatus value) {
        this.backingStore.set("status", value);
    }
    /**
     * Sets the validity property value. The validity property
     * @param value Value to set for the validity property.
     */
    public void setValidity(@jakarta.annotation.Nullable final ValidityDate value) {
        this.backingStore.set("validity", value);
    }
}
