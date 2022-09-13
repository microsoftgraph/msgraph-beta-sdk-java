package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class SymantecCodeSigningCertificate extends Entity implements Parsable {
    /** The Windows Symantec Code-Signing Certificate in the raw data format. */
    private byte[] _content;
    /** The Cert Expiration Date. */
    private OffsetDateTime _expirationDateTime;
    /** The Issuer value for the cert. */
    private String _issuer;
    /** The Issuer Name for the cert. */
    private String _issuerName;
    /** The Password required for .pfx file. */
    private String _password;
    /** The status property */
    private CertificateStatus _status;
    /** The Subject value for the cert. */
    private String _subject;
    /** The Subject Name for the cert. */
    private String _subjectName;
    /** The Type of the CodeSigning Cert as Symantec Cert. */
    private OffsetDateTime _uploadDateTime;
    /**
     * Instantiates a new symantecCodeSigningCertificate and sets the default values.
     * @return a void
     */
    public SymantecCodeSigningCertificate() {
        super();
        this.setOdataType("#microsoft.graph.symantecCodeSigningCertificate");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a symantecCodeSigningCertificate
     */
    @javax.annotation.Nonnull
    public static SymantecCodeSigningCertificate createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SymantecCodeSigningCertificate();
    }
    /**
     * Gets the content property value. The Windows Symantec Code-Signing Certificate in the raw data format.
     * @return a binary
     */
    @javax.annotation.Nullable
    public byte[] getContent() {
        return this._content;
    }
    /**
     * Gets the expirationDateTime property value. The Cert Expiration Date.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getExpirationDateTime() {
        return this._expirationDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final SymantecCodeSigningCertificate currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("content", (n) -> { currentObject.setContent(n.getByteArrayValue()); });
            this.put("expirationDateTime", (n) -> { currentObject.setExpirationDateTime(n.getOffsetDateTimeValue()); });
            this.put("issuer", (n) -> { currentObject.setIssuer(n.getStringValue()); });
            this.put("issuerName", (n) -> { currentObject.setIssuerName(n.getStringValue()); });
            this.put("password", (n) -> { currentObject.setPassword(n.getStringValue()); });
            this.put("status", (n) -> { currentObject.setStatus(n.getEnumValue(CertificateStatus.class)); });
            this.put("subject", (n) -> { currentObject.setSubject(n.getStringValue()); });
            this.put("subjectName", (n) -> { currentObject.setSubjectName(n.getStringValue()); });
            this.put("uploadDateTime", (n) -> { currentObject.setUploadDateTime(n.getOffsetDateTimeValue()); });
        }};
    }
    /**
     * Gets the issuer property value. The Issuer value for the cert.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getIssuer() {
        return this._issuer;
    }
    /**
     * Gets the issuerName property value. The Issuer Name for the cert.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getIssuerName() {
        return this._issuerName;
    }
    /**
     * Gets the password property value. The Password required for .pfx file.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPassword() {
        return this._password;
    }
    /**
     * Gets the status property value. The status property
     * @return a certificateStatus
     */
    @javax.annotation.Nullable
    public CertificateStatus getStatus() {
        return this._status;
    }
    /**
     * Gets the subject property value. The Subject value for the cert.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSubject() {
        return this._subject;
    }
    /**
     * Gets the subjectName property value. The Subject Name for the cert.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSubjectName() {
        return this._subjectName;
    }
    /**
     * Gets the uploadDateTime property value. The Type of the CodeSigning Cert as Symantec Cert.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getUploadDateTime() {
        return this._uploadDateTime;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeByteArrayValue("content", this.getContent());
        writer.writeOffsetDateTimeValue("expirationDateTime", this.getExpirationDateTime());
        writer.writeStringValue("issuer", this.getIssuer());
        writer.writeStringValue("issuerName", this.getIssuerName());
        writer.writeStringValue("password", this.getPassword());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeStringValue("subject", this.getSubject());
        writer.writeStringValue("subjectName", this.getSubjectName());
        writer.writeOffsetDateTimeValue("uploadDateTime", this.getUploadDateTime());
    }
    /**
     * Sets the content property value. The Windows Symantec Code-Signing Certificate in the raw data format.
     * @param value Value to set for the content property.
     * @return a void
     */
    public void setContent(@javax.annotation.Nullable final byte[] value) {
        this._content = value;
    }
    /**
     * Sets the expirationDateTime property value. The Cert Expiration Date.
     * @param value Value to set for the expirationDateTime property.
     * @return a void
     */
    public void setExpirationDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._expirationDateTime = value;
    }
    /**
     * Sets the issuer property value. The Issuer value for the cert.
     * @param value Value to set for the issuer property.
     * @return a void
     */
    public void setIssuer(@javax.annotation.Nullable final String value) {
        this._issuer = value;
    }
    /**
     * Sets the issuerName property value. The Issuer Name for the cert.
     * @param value Value to set for the issuerName property.
     * @return a void
     */
    public void setIssuerName(@javax.annotation.Nullable final String value) {
        this._issuerName = value;
    }
    /**
     * Sets the password property value. The Password required for .pfx file.
     * @param value Value to set for the password property.
     * @return a void
     */
    public void setPassword(@javax.annotation.Nullable final String value) {
        this._password = value;
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     * @return a void
     */
    public void setStatus(@javax.annotation.Nullable final CertificateStatus value) {
        this._status = value;
    }
    /**
     * Sets the subject property value. The Subject value for the cert.
     * @param value Value to set for the subject property.
     * @return a void
     */
    public void setSubject(@javax.annotation.Nullable final String value) {
        this._subject = value;
    }
    /**
     * Sets the subjectName property value. The Subject Name for the cert.
     * @param value Value to set for the subjectName property.
     * @return a void
     */
    public void setSubjectName(@javax.annotation.Nullable final String value) {
        this._subjectName = value;
    }
    /**
     * Sets the uploadDateTime property value. The Type of the CodeSigning Cert as Symantec Cert.
     * @param value Value to set for the uploadDateTime property.
     * @return a void
     */
    public void setUploadDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._uploadDateTime = value;
    }
}
