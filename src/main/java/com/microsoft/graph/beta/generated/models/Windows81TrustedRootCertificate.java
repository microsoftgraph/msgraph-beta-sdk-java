package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Windows 8.1 Trusted Certificate configuration profile
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Windows81TrustedRootCertificate extends DeviceConfiguration implements Parsable {
    /**
     * Instantiates a new {@link Windows81TrustedRootCertificate} and sets the default values.
     */
    public Windows81TrustedRootCertificate() {
        super();
        this.setOdataType("#microsoft.graph.windows81TrustedRootCertificate");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Windows81TrustedRootCertificate}
     */
    @jakarta.annotation.Nonnull
    public static Windows81TrustedRootCertificate createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Windows81TrustedRootCertificate();
    }
    /**
     * Gets the certFileName property value. File name to display in UI.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCertFileName() {
        return this.backingStore.get("certFileName");
    }
    /**
     * Gets the destinationStore property value. Possible values for the Certificate Destination Store.
     * @return a {@link CertificateDestinationStore}
     */
    @jakarta.annotation.Nullable
    public CertificateDestinationStore getDestinationStore() {
        return this.backingStore.get("destinationStore");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("certFileName", (n) -> { this.setCertFileName(n.getStringValue()); });
        deserializerMap.put("destinationStore", (n) -> { this.setDestinationStore(n.getEnumValue(CertificateDestinationStore::forValue)); });
        deserializerMap.put("trustedRootCertificate", (n) -> { this.setTrustedRootCertificate(n.getByteArrayValue()); });
        return deserializerMap;
    }
    /**
     * Gets the trustedRootCertificate property value. Trusted Root Certificate
     * @return a {@link byte[]}
     */
    @jakarta.annotation.Nullable
    public byte[] getTrustedRootCertificate() {
        return this.backingStore.get("trustedRootCertificate");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("certFileName", this.getCertFileName());
        writer.writeEnumValue("destinationStore", this.getDestinationStore());
        writer.writeByteArrayValue("trustedRootCertificate", this.getTrustedRootCertificate());
    }
    /**
     * Sets the certFileName property value. File name to display in UI.
     * @param value Value to set for the certFileName property.
     */
    public void setCertFileName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("certFileName", value);
    }
    /**
     * Sets the destinationStore property value. Possible values for the Certificate Destination Store.
     * @param value Value to set for the destinationStore property.
     */
    public void setDestinationStore(@jakarta.annotation.Nullable final CertificateDestinationStore value) {
        this.backingStore.set("destinationStore", value);
    }
    /**
     * Sets the trustedRootCertificate property value. Trusted Root Certificate
     * @param value Value to set for the trustedRootCertificate property.
     */
    public void setTrustedRootCertificate(@jakarta.annotation.Nullable final byte[] value) {
        this.backingStore.set("trustedRootCertificate", value);
    }
}
