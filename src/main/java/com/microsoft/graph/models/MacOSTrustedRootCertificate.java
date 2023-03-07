package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class MacOSTrustedRootCertificate extends DeviceConfiguration implements Parsable {
    /** File name to display in UI. */
    private String certFileName;
    /** Trusted Root Certificate. */
    private byte[] trustedRootCertificate;
    /**
     * Instantiates a new macOSTrustedRootCertificate and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public MacOSTrustedRootCertificate() {
        super();
        this.setOdataType("#microsoft.graph.macOSTrustedRootCertificate");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a macOSTrustedRootCertificate
     */
    @javax.annotation.Nonnull
    public static MacOSTrustedRootCertificate createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MacOSTrustedRootCertificate();
    }
    /**
     * Gets the certFileName property value. File name to display in UI.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCertFileName() {
        return this.certFileName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("certFileName", (n) -> { this.setCertFileName(n.getStringValue()); });
        deserializerMap.put("trustedRootCertificate", (n) -> { this.setTrustedRootCertificate(n.getByteArrayValue()); });
        return deserializerMap;
    }
    /**
     * Gets the trustedRootCertificate property value. Trusted Root Certificate.
     * @return a binary
     */
    @javax.annotation.Nullable
    public byte[] getTrustedRootCertificate() {
        return this.trustedRootCertificate;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("certFileName", this.getCertFileName());
        writer.writeByteArrayValue("trustedRootCertificate", this.getTrustedRootCertificate());
    }
    /**
     * Sets the certFileName property value. File name to display in UI.
     * @param value Value to set for the certFileName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCertFileName(@javax.annotation.Nullable final String value) {
        this.certFileName = value;
    }
    /**
     * Sets the trustedRootCertificate property value. Trusted Root Certificate.
     * @param value Value to set for the trustedRootCertificate property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTrustedRootCertificate(@javax.annotation.Nullable final byte[] value) {
        this.trustedRootCertificate = value;
    }
}
