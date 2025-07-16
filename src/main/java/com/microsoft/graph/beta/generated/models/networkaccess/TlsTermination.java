package com.microsoft.graph.beta.models.networkaccess;

import com.microsoft.graph.beta.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TlsTermination extends Entity implements Parsable {
    /**
     * Instantiates a new {@link TlsTermination} and sets the default values.
     */
    public TlsTermination() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link TlsTermination}
     */
    @jakarta.annotation.Nonnull
    public static TlsTermination createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TlsTermination();
    }
    /**
     * Gets the externalCertificateAuthorityCertificates property value. List of customer&apos;s Certificate Authority (CA) certificates used for TLS inspection in Global Secure Access
     * @return a {@link java.util.List<ExternalCertificateAuthorityCertificate>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ExternalCertificateAuthorityCertificate> getExternalCertificateAuthorityCertificates() {
        return this.backingStore.get("externalCertificateAuthorityCertificates");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("externalCertificateAuthorityCertificates", (n) -> { this.setExternalCertificateAuthorityCertificates(n.getCollectionOfObjectValues(ExternalCertificateAuthorityCertificate::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("externalCertificateAuthorityCertificates", this.getExternalCertificateAuthorityCertificates());
    }
    /**
     * Sets the externalCertificateAuthorityCertificates property value. List of customer&apos;s Certificate Authority (CA) certificates used for TLS inspection in Global Secure Access
     * @param value Value to set for the externalCertificateAuthorityCertificates property.
     */
    public void setExternalCertificateAuthorityCertificates(@jakarta.annotation.Nullable final java.util.List<ExternalCertificateAuthorityCertificate> value) {
        this.backingStore.set("externalCertificateAuthorityCertificates", value);
    }
}
