package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CertificateAuthorityPath extends Entity implements Parsable {
    /**
     * Instantiates a new {@link CertificateAuthorityPath} and sets the default values.
     */
    public CertificateAuthorityPath() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CertificateAuthorityPath}
     */
    @jakarta.annotation.Nonnull
    public static CertificateAuthorityPath createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CertificateAuthorityPath();
    }
    /**
     * Gets the certificateBasedApplicationConfigurations property value. Defines the trusted certificate authorities for certificates that can be added to apps and service principals in the tenant.
     * @return a {@link java.util.List<CertificateBasedApplicationConfiguration>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<CertificateBasedApplicationConfiguration> getCertificateBasedApplicationConfigurations() {
        return this.backingStore.get("certificateBasedApplicationConfigurations");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("certificateBasedApplicationConfigurations", (n) -> { this.setCertificateBasedApplicationConfigurations(n.getCollectionOfObjectValues(CertificateBasedApplicationConfiguration::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("certificateBasedApplicationConfigurations", this.getCertificateBasedApplicationConfigurations());
    }
    /**
     * Sets the certificateBasedApplicationConfigurations property value. Defines the trusted certificate authorities for certificates that can be added to apps and service principals in the tenant.
     * @param value Value to set for the certificateBasedApplicationConfigurations property.
     */
    public void setCertificateBasedApplicationConfigurations(@jakarta.annotation.Nullable final java.util.List<CertificateBasedApplicationConfiguration> value) {
        this.backingStore.set("certificateBasedApplicationConfigurations", value);
    }
}
