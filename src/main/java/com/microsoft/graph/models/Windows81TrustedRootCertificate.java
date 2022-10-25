package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Windows81TrustedRootCertificate extends DeviceConfiguration implements Parsable {
    /** File name to display in UI. */
    private String _certFileName;
    /** Possible values for the Certificate Destination Store. */
    private CertificateDestinationStore _destinationStore;
    /** Trusted Root Certificate */
    private byte[] _trustedRootCertificate;
    /**
     * Instantiates a new windows81TrustedRootCertificate and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public Windows81TrustedRootCertificate() {
        super();
        this.setOdataType("#microsoft.graph.windows81TrustedRootCertificate");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a windows81TrustedRootCertificate
     */
    @javax.annotation.Nonnull
    public static Windows81TrustedRootCertificate createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Windows81TrustedRootCertificate();
    }
    /**
     * Gets the certFileName property value. File name to display in UI.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCertFileName() {
        return this._certFileName;
    }
    /**
     * Gets the destinationStore property value. Possible values for the Certificate Destination Store.
     * @return a certificateDestinationStore
     */
    @javax.annotation.Nullable
    public CertificateDestinationStore getDestinationStore() {
        return this._destinationStore;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final Windows81TrustedRootCertificate currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("certFileName", (n) -> { currentObject.setCertFileName(n.getStringValue()); });
            this.put("destinationStore", (n) -> { currentObject.setDestinationStore(n.getEnumValue(CertificateDestinationStore.class)); });
            this.put("trustedRootCertificate", (n) -> { currentObject.setTrustedRootCertificate(n.getByteArrayValue()); });
        }};
    }
    /**
     * Gets the trustedRootCertificate property value. Trusted Root Certificate
     * @return a binary
     */
    @javax.annotation.Nullable
    public byte[] getTrustedRootCertificate() {
        return this._trustedRootCertificate;
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
        writer.writeEnumValue("destinationStore", this.getDestinationStore());
        writer.writeByteArrayValue("trustedRootCertificate", this.getTrustedRootCertificate());
    }
    /**
     * Sets the certFileName property value. File name to display in UI.
     * @param value Value to set for the certFileName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCertFileName(@javax.annotation.Nullable final String value) {
        this._certFileName = value;
    }
    /**
     * Sets the destinationStore property value. Possible values for the Certificate Destination Store.
     * @param value Value to set for the destinationStore property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDestinationStore(@javax.annotation.Nullable final CertificateDestinationStore value) {
        this._destinationStore = value;
    }
    /**
     * Sets the trustedRootCertificate property value. Trusted Root Certificate
     * @param value Value to set for the trustedRootCertificate property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTrustedRootCertificate(@javax.annotation.Nullable final byte[] value) {
        this._trustedRootCertificate = value;
    }
}
