package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Android Trusted Root Certificate configuration profile
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AndroidTrustedRootCertificate extends DeviceConfiguration implements Parsable {
    /**
     * File name to display in UI.
     */
    private String certFileName;
    /**
     * Trusted Root Certificate
     */
    private byte[] trustedRootCertificate;
    /**
     * Instantiates a new AndroidTrustedRootCertificate and sets the default values.
     */
    public AndroidTrustedRootCertificate() {
        super();
        this.setOdataType("#microsoft.graph.androidTrustedRootCertificate");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AndroidTrustedRootCertificate
     */
    @jakarta.annotation.Nonnull
    public static AndroidTrustedRootCertificate createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AndroidTrustedRootCertificate();
    }
    /**
     * Gets the certFileName property value. File name to display in UI.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCertFileName() {
        return this.certFileName;
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
     * Gets the trustedRootCertificate property value. Trusted Root Certificate
     * @return a byte[]
     */
    @jakarta.annotation.Nullable
    public byte[] getTrustedRootCertificate() {
        return this.trustedRootCertificate;
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
        this.certFileName = value;
    }
    /**
     * Sets the trustedRootCertificate property value. Trusted Root Certificate
     * @param value Value to set for the trustedRootCertificate property.
     */
    public void setTrustedRootCertificate(@jakarta.annotation.Nullable final byte[] value) {
        this.trustedRootCertificate = value;
    }
}
