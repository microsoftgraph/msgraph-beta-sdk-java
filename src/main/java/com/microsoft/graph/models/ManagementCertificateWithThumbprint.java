package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ManagementCertificateWithThumbprint implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The Base 64 encoded management certificate */
    private String _certificate;
    /** The thumbprint of the management certificate */
    private String _thumbprint;
    /**
     * Instantiates a new managementCertificateWithThumbprint and sets the default values.
     * @return a void
     */
    public ManagementCertificateWithThumbprint() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a managementCertificateWithThumbprint
     */
    @javax.annotation.Nonnull
    public static ManagementCertificateWithThumbprint createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ManagementCertificateWithThumbprint();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * Gets the certificate property value. The Base 64 encoded management certificate
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCertificate() {
        return this._certificate;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ManagementCertificateWithThumbprint currentObject = this;
        return new HashMap<>(2) {{
            this.put("certificate", (n) -> { currentObject.setCertificate(n.getStringValue()); });
            this.put("thumbprint", (n) -> { currentObject.setThumbprint(n.getStringValue()); });
        }};
    }
    /**
     * Gets the thumbprint property value. The thumbprint of the management certificate
     * @return a string
     */
    @javax.annotation.Nullable
    public String getThumbprint() {
        return this._thumbprint;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("certificate", this.getCertificate());
        writer.writeStringValue("thumbprint", this.getThumbprint());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the certificate property value. The Base 64 encoded management certificate
     * @param value Value to set for the certificate property.
     * @return a void
     */
    public void setCertificate(@javax.annotation.Nullable final String value) {
        this._certificate = value;
    }
    /**
     * Sets the thumbprint property value. The thumbprint of the management certificate
     * @param value Value to set for the thumbprint property.
     * @return a void
     */
    public void setThumbprint(@javax.annotation.Nullable final String value) {
        this._thumbprint = value;
    }
}
