package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TrustedCertificateAuthorityAsEntityBase extends DirectoryObject implements Parsable {
    /**
     * Instantiates a new TrustedCertificateAuthorityAsEntityBase and sets the default values.
     */
    public TrustedCertificateAuthorityAsEntityBase() {
        super();
        this.setOdataType("#microsoft.graph.trustedCertificateAuthorityAsEntityBase");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a TrustedCertificateAuthorityAsEntityBase
     */
    @jakarta.annotation.Nonnull
    public static TrustedCertificateAuthorityAsEntityBase createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.certificateBasedApplicationConfiguration": return new CertificateBasedApplicationConfiguration();
            }
        }
        return new TrustedCertificateAuthorityAsEntityBase();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("trustedCertificateAuthorities", (n) -> { this.setTrustedCertificateAuthorities(n.getCollectionOfObjectValues(CertificateAuthorityAsEntity::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the trustedCertificateAuthorities property value. Collection of trusted certificate authorities.
     * @return a java.util.List<CertificateAuthorityAsEntity>
     */
    @jakarta.annotation.Nullable
    public java.util.List<CertificateAuthorityAsEntity> getTrustedCertificateAuthorities() {
        return this.backingStore.get("trustedCertificateAuthorities");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("trustedCertificateAuthorities", this.getTrustedCertificateAuthorities());
    }
    /**
     * Sets the trustedCertificateAuthorities property value. Collection of trusted certificate authorities.
     * @param value Value to set for the trustedCertificateAuthorities property.
     */
    public void setTrustedCertificateAuthorities(@jakarta.annotation.Nullable final java.util.List<CertificateAuthorityAsEntity> value) {
        this.backingStore.set("trustedCertificateAuthorities", value);
    }
}
