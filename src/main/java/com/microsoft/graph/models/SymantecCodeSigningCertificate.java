package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class SymantecCodeSigningCertificate extends Entity implements Parsable {
    /**
     * The Windows Symantec Code-Signing Certificate in the raw data format.
     */
    private byte[] content;
    /**
     * The Cert Expiration Date.
     */
    private OffsetDateTime expirationDateTime;
    /**
     * The Issuer value for the cert.
     */
    private String issuer;
    /**
     * The Issuer Name for the cert.
     */
    private String issuerName;
    /**
     * The Password required for .pfx file.
     */
    private String password;
    /**
     * The status property
     */
    private CertificateStatus status;
    /**
     * The Subject value for the cert.
     */
    private String subject;
    /**
     * The Subject Name for the cert.
     */
    private String subjectName;
    /**
     * The Type of the CodeSigning Cert as Symantec Cert.
     */
    private OffsetDateTime uploadDateTime;
    /**
     * Instantiates a new symantecCodeSigningCertificate and sets the default values.
     */
    public SymantecCodeSigningCertificate() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a symantecCodeSigningCertificate
     */
    @jakarta.annotation.Nonnull
    public static SymantecCodeSigningCertificate createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SymantecCodeSigningCertificate();
    }
    /**
     * Gets the content property value. The Windows Symantec Code-Signing Certificate in the raw data format.
     * @return a base64url
     */
    @jakarta.annotation.Nullable
    public byte[] getContent() {
        return this.content;
    }
    /**
     * Gets the expirationDateTime property value. The Cert Expiration Date.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getExpirationDateTime() {
        return this.expirationDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("content", (n) -> { this.setContent(n.getByteArrayValue()); });
        deserializerMap.put("expirationDateTime", (n) -> { this.setExpirationDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("issuer", (n) -> { this.setIssuer(n.getStringValue()); });
        deserializerMap.put("issuerName", (n) -> { this.setIssuerName(n.getStringValue()); });
        deserializerMap.put("password", (n) -> { this.setPassword(n.getStringValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(CertificateStatus.class)); });
        deserializerMap.put("subject", (n) -> { this.setSubject(n.getStringValue()); });
        deserializerMap.put("subjectName", (n) -> { this.setSubjectName(n.getStringValue()); });
        deserializerMap.put("uploadDateTime", (n) -> { this.setUploadDateTime(n.getOffsetDateTimeValue()); });
        return deserializerMap;
    }
    /**
     * Gets the issuer property value. The Issuer value for the cert.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getIssuer() {
        return this.issuer;
    }
    /**
     * Gets the issuerName property value. The Issuer Name for the cert.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getIssuerName() {
        return this.issuerName;
    }
    /**
     * Gets the password property value. The Password required for .pfx file.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getPassword() {
        return this.password;
    }
    /**
     * Gets the status property value. The status property
     * @return a certificateStatus
     */
    @jakarta.annotation.Nullable
    public CertificateStatus getStatus() {
        return this.status;
    }
    /**
     * Gets the subject property value. The Subject value for the cert.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getSubject() {
        return this.subject;
    }
    /**
     * Gets the subjectName property value. The Subject Name for the cert.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getSubjectName() {
        return this.subjectName;
    }
    /**
     * Gets the uploadDateTime property value. The Type of the CodeSigning Cert as Symantec Cert.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getUploadDateTime() {
        return this.uploadDateTime;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     */
    public void setContent(@jakarta.annotation.Nullable final byte[] value) {
        this.content = value;
    }
    /**
     * Sets the expirationDateTime property value. The Cert Expiration Date.
     * @param value Value to set for the expirationDateTime property.
     */
    public void setExpirationDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.expirationDateTime = value;
    }
    /**
     * Sets the issuer property value. The Issuer value for the cert.
     * @param value Value to set for the issuer property.
     */
    public void setIssuer(@jakarta.annotation.Nullable final String value) {
        this.issuer = value;
    }
    /**
     * Sets the issuerName property value. The Issuer Name for the cert.
     * @param value Value to set for the issuerName property.
     */
    public void setIssuerName(@jakarta.annotation.Nullable final String value) {
        this.issuerName = value;
    }
    /**
     * Sets the password property value. The Password required for .pfx file.
     * @param value Value to set for the password property.
     */
    public void setPassword(@jakarta.annotation.Nullable final String value) {
        this.password = value;
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final CertificateStatus value) {
        this.status = value;
    }
    /**
     * Sets the subject property value. The Subject value for the cert.
     * @param value Value to set for the subject property.
     */
    public void setSubject(@jakarta.annotation.Nullable final String value) {
        this.subject = value;
    }
    /**
     * Sets the subjectName property value. The Subject Name for the cert.
     * @param value Value to set for the subjectName property.
     */
    public void setSubjectName(@jakarta.annotation.Nullable final String value) {
        this.subjectName = value;
    }
    /**
     * Sets the uploadDateTime property value. The Type of the CodeSigning Cert as Symantec Cert.
     * @param value Value to set for the uploadDateTime property.
     */
    public void setUploadDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.uploadDateTime = value;
    }
}
