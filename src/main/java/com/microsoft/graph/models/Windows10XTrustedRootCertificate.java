package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Windows X Trusted Root Certificate configuration profile
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Windows10XTrustedRootCertificate extends DeviceManagementResourceAccessProfileBase implements Parsable {
    /**
     * Instantiates a new Windows10XTrustedRootCertificate and sets the default values.
     */
    public Windows10XTrustedRootCertificate() {
        super();
        this.setOdataType("#microsoft.graph.windows10XTrustedRootCertificate");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Windows10XTrustedRootCertificate
     */
    @jakarta.annotation.Nonnull
    public static Windows10XTrustedRootCertificate createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Windows10XTrustedRootCertificate();
    }
    /**
     * Gets the certFileName property value. File name to display in UI.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCertFileName() {
        return this.BackingStore.get("certFileName");
    }
    /**
     * Gets the destinationStore property value. Possible values for the Certificate Destination Store.
     * @return a CertificateDestinationStore
     */
    @jakarta.annotation.Nullable
    public CertificateDestinationStore getDestinationStore() {
        return this.BackingStore.get("destinationStore");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("certFileName", (n) -> { this.setCertFileName(n.getStringValue()); });
        deserializerMap.put("destinationStore", (n) -> { this.setDestinationStore(n.getEnumValue(CertificateDestinationStore.class)); });
        deserializerMap.put("trustedRootCertificate", (n) -> { this.setTrustedRootCertificate(n.getByteArrayValue()); });
        return deserializerMap;
    }
    /**
     * Gets the trustedRootCertificate property value. Trusted Root Certificate
     * @return a byte[]
     */
    @jakarta.annotation.Nullable
    public byte[] getTrustedRootCertificate() {
        return this.BackingStore.get("trustedRootCertificate");
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
        this.BackingStore.set("certFileName", value);
    }
    /**
     * Sets the destinationStore property value. Possible values for the Certificate Destination Store.
     * @param value Value to set for the destinationStore property.
     */
    public void setDestinationStore(@jakarta.annotation.Nullable final CertificateDestinationStore value) {
        this.BackingStore.set("destinationStore", value);
    }
    /**
     * Sets the trustedRootCertificate property value. Trusted Root Certificate
     * @param value Value to set for the trustedRootCertificate property.
     */
    public void setTrustedRootCertificate(@jakarta.annotation.Nullable final byte[] value) {
        this.BackingStore.set("trustedRootCertificate", value);
    }
}
