package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * iOS Trusted Root Certificate configuration profile.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class IosTrustedRootCertificate extends DeviceConfiguration implements Parsable {
    /**
     * Instantiates a new IosTrustedRootCertificate and sets the default values.
     */
    public IosTrustedRootCertificate() {
        super();
        this.setOdataType("#microsoft.graph.iosTrustedRootCertificate");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a IosTrustedRootCertificate
     */
    @jakarta.annotation.Nonnull
    public static IosTrustedRootCertificate createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IosTrustedRootCertificate();
    }
    /**
     * Gets the certFileName property value. File name to display in UI.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCertFileName() {
        return this.backingStore.get("certFileName");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("certFileName", (n) -> { this.setCertFileName(n.getStringValue()); });
        deserializerMap.put("trustedRootCertificate", (n) -> { this.setTrustedRootCertificate(n.getByteArrayValue()); });
        return deserializerMap;
    }
    /**
     * Gets the trustedRootCertificate property value. Trusted Root Certificate.
     * @return a byte[]
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
     * Sets the trustedRootCertificate property value. Trusted Root Certificate.
     * @param value Value to set for the trustedRootCertificate property.
     */
    public void setTrustedRootCertificate(@jakarta.annotation.Nullable final byte[] value) {
        this.backingStore.set("trustedRootCertificate", value);
    }
}
