package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TrustedCertificateAuthorityBase extends DirectoryObject implements Parsable {
    /**
     * Instantiates a new {@link TrustedCertificateAuthorityBase} and sets the default values.
     */
    public TrustedCertificateAuthorityBase() {
        super();
        this.setOdataType("#microsoft.graph.trustedCertificateAuthorityBase");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link TrustedCertificateAuthorityBase}
     */
    @jakarta.annotation.Nonnull
    public static TrustedCertificateAuthorityBase createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.mutualTlsOauthConfiguration": return new MutualTlsOauthConfiguration();
            }
        }
        return new TrustedCertificateAuthorityBase();
    }
    /**
     * Gets the certificateAuthorities property value. Multi-value property that represents a list of trusted certificate authorities.
     * @return a {@link java.util.List<CertificateAuthority>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<CertificateAuthority> getCertificateAuthorities() {
        return this.backingStore.get("certificateAuthorities");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("certificateAuthorities", (n) -> { this.setCertificateAuthorities(n.getCollectionOfObjectValues(CertificateAuthority::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("certificateAuthorities", this.getCertificateAuthorities());
    }
    /**
     * Sets the certificateAuthorities property value. Multi-value property that represents a list of trusted certificate authorities.
     * @param value Value to set for the certificateAuthorities property.
     */
    public void setCertificateAuthorities(@jakarta.annotation.Nullable final java.util.List<CertificateAuthority> value) {
        this.backingStore.set("certificateAuthorities", value);
    }
}
