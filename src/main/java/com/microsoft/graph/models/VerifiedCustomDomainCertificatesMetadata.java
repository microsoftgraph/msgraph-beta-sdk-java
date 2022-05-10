package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class VerifiedCustomDomainCertificatesMetadata implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The expiry date of the custom domain certificate. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. */
    private OffsetDateTime _expiryDate;
    /** The issue date of the custom domain. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. */
    private OffsetDateTime _issueDate;
    /** The issuer name of the custom domain certificate. */
    private String _issuerName;
    /** The subject name of the custom domain certificate. */
    private String _subjectName;
    /** The thumbprint associated with the custom domain certificate. */
    private String _thumbprint;
    /**
     * Instantiates a new verifiedCustomDomainCertificatesMetadata and sets the default values.
     * @return a void
     */
    public VerifiedCustomDomainCertificatesMetadata() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a verifiedCustomDomainCertificatesMetadata
     */
    @javax.annotation.Nonnull
    public static VerifiedCustomDomainCertificatesMetadata createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new VerifiedCustomDomainCertificatesMetadata();
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
     * Gets the expiryDate property value. The expiry date of the custom domain certificate. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getExpiryDate() {
        return this._expiryDate;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final VerifiedCustomDomainCertificatesMetadata currentObject = this;
        return new HashMap<>(5) {{
            this.put("expiryDate", (n) -> { currentObject.setExpiryDate(n.getOffsetDateTimeValue()); });
            this.put("issueDate", (n) -> { currentObject.setIssueDate(n.getOffsetDateTimeValue()); });
            this.put("issuerName", (n) -> { currentObject.setIssuerName(n.getStringValue()); });
            this.put("subjectName", (n) -> { currentObject.setSubjectName(n.getStringValue()); });
            this.put("thumbprint", (n) -> { currentObject.setThumbprint(n.getStringValue()); });
        }};
    }
    /**
     * Gets the issueDate property value. The issue date of the custom domain. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getIssueDate() {
        return this._issueDate;
    }
    /**
     * Gets the issuerName property value. The issuer name of the custom domain certificate.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getIssuerName() {
        return this._issuerName;
    }
    /**
     * Gets the subjectName property value. The subject name of the custom domain certificate.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSubjectName() {
        return this._subjectName;
    }
    /**
     * Gets the thumbprint property value. The thumbprint associated with the custom domain certificate.
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
        writer.writeOffsetDateTimeValue("expiryDate", this.getExpiryDate());
        writer.writeOffsetDateTimeValue("issueDate", this.getIssueDate());
        writer.writeStringValue("issuerName", this.getIssuerName());
        writer.writeStringValue("subjectName", this.getSubjectName());
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
     * Sets the expiryDate property value. The expiry date of the custom domain certificate. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the expiryDate property.
     * @return a void
     */
    public void setExpiryDate(@javax.annotation.Nullable final OffsetDateTime value) {
        this._expiryDate = value;
    }
    /**
     * Sets the issueDate property value. The issue date of the custom domain. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the issueDate property.
     * @return a void
     */
    public void setIssueDate(@javax.annotation.Nullable final OffsetDateTime value) {
        this._issueDate = value;
    }
    /**
     * Sets the issuerName property value. The issuer name of the custom domain certificate.
     * @param value Value to set for the issuerName property.
     * @return a void
     */
    public void setIssuerName(@javax.annotation.Nullable final String value) {
        this._issuerName = value;
    }
    /**
     * Sets the subjectName property value. The subject name of the custom domain certificate.
     * @param value Value to set for the subjectName property.
     * @return a void
     */
    public void setSubjectName(@javax.annotation.Nullable final String value) {
        this._subjectName = value;
    }
    /**
     * Sets the thumbprint property value. The thumbprint associated with the custom domain certificate.
     * @param value Value to set for the thumbprint property.
     * @return a void
     */
    public void setThumbprint(@javax.annotation.Nullable final String value) {
        this._thumbprint = value;
    }
}
