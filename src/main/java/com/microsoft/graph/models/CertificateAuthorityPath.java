package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class CertificateAuthorityPath extends Entity implements Parsable {
    /**
     * The certificateBasedApplicationConfigurations property
     */
    private java.util.List<CertificateBasedApplicationConfiguration> certificateBasedApplicationConfigurations;
    /**
     * Instantiates a new certificateAuthorityPath and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public CertificateAuthorityPath() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a certificateAuthorityPath
     */
    @jakarta.annotation.Nonnull
    public static CertificateAuthorityPath createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CertificateAuthorityPath();
    }
    /**
     * Gets the certificateBasedApplicationConfigurations property value. The certificateBasedApplicationConfigurations property
     * @return a certificateBasedApplicationConfiguration
     */
    @jakarta.annotation.Nullable
    public java.util.List<CertificateBasedApplicationConfiguration> getCertificateBasedApplicationConfigurations() {
        return this.certificateBasedApplicationConfigurations;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
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
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("certificateBasedApplicationConfigurations", this.getCertificateBasedApplicationConfigurations());
    }
    /**
     * Sets the certificateBasedApplicationConfigurations property value. The certificateBasedApplicationConfigurations property
     * @param value Value to set for the certificateBasedApplicationConfigurations property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setCertificateBasedApplicationConfigurations(@jakarta.annotation.Nullable final java.util.List<CertificateBasedApplicationConfiguration> value) {
        this.certificateBasedApplicationConfigurations = value;
    }
}
