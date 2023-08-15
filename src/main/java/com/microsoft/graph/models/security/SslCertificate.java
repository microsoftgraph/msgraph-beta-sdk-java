package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class SslCertificate extends Artifact implements Parsable {
    /**
     * The expirationDateTime property
     */
    private OffsetDateTime expirationDateTime;
    /**
     * The fingerprint property
     */
    private String fingerprint;
    /**
     * The firstSeenDateTime property
     */
    private OffsetDateTime firstSeenDateTime;
    /**
     * The issueDateTime property
     */
    private OffsetDateTime issueDateTime;
    /**
     * The issuer property
     */
    private SslCertificateEntity issuer;
    /**
     * The lastSeenDateTime property
     */
    private OffsetDateTime lastSeenDateTime;
    /**
     * The relatedHosts property
     */
    private java.util.List<Host> relatedHosts;
    /**
     * The serialNumber property
     */
    private String serialNumber;
    /**
     * The sha1 property
     */
    private String sha1;
    /**
     * The subject property
     */
    private SslCertificateEntity subject;
    /**
     * Instantiates a new sslCertificate and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public SslCertificate() {
        super();
        this.setOdataType("#microsoft.graph.security.sslCertificate");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a sslCertificate
     */
    @javax.annotation.Nonnull
    public static SslCertificate createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SslCertificate();
    }
    /**
     * Gets the expirationDateTime property value. The expirationDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getExpirationDateTime() {
        return this.expirationDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("expirationDateTime", (n) -> { this.setExpirationDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("fingerprint", (n) -> { this.setFingerprint(n.getStringValue()); });
        deserializerMap.put("firstSeenDateTime", (n) -> { this.setFirstSeenDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("issueDateTime", (n) -> { this.setIssueDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("issuer", (n) -> { this.setIssuer(n.getObjectValue(SslCertificateEntity::createFromDiscriminatorValue)); });
        deserializerMap.put("lastSeenDateTime", (n) -> { this.setLastSeenDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("relatedHosts", (n) -> { this.setRelatedHosts(n.getCollectionOfObjectValues(Host::createFromDiscriminatorValue)); });
        deserializerMap.put("serialNumber", (n) -> { this.setSerialNumber(n.getStringValue()); });
        deserializerMap.put("sha1", (n) -> { this.setSha1(n.getStringValue()); });
        deserializerMap.put("subject", (n) -> { this.setSubject(n.getObjectValue(SslCertificateEntity::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the fingerprint property value. The fingerprint property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getFingerprint() {
        return this.fingerprint;
    }
    /**
     * Gets the firstSeenDateTime property value. The firstSeenDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getFirstSeenDateTime() {
        return this.firstSeenDateTime;
    }
    /**
     * Gets the issueDateTime property value. The issueDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getIssueDateTime() {
        return this.issueDateTime;
    }
    /**
     * Gets the issuer property value. The issuer property
     * @return a sslCertificateEntity
     */
    @javax.annotation.Nullable
    public SslCertificateEntity getIssuer() {
        return this.issuer;
    }
    /**
     * Gets the lastSeenDateTime property value. The lastSeenDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastSeenDateTime() {
        return this.lastSeenDateTime;
    }
    /**
     * Gets the relatedHosts property value. The relatedHosts property
     * @return a host
     */
    @javax.annotation.Nullable
    public java.util.List<Host> getRelatedHosts() {
        return this.relatedHosts;
    }
    /**
     * Gets the serialNumber property value. The serialNumber property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSerialNumber() {
        return this.serialNumber;
    }
    /**
     * Gets the sha1 property value. The sha1 property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSha1() {
        return this.sha1;
    }
    /**
     * Gets the subject property value. The subject property
     * @return a sslCertificateEntity
     */
    @javax.annotation.Nullable
    public SslCertificateEntity getSubject() {
        return this.subject;
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
        writer.writeOffsetDateTimeValue("expirationDateTime", this.getExpirationDateTime());
        writer.writeStringValue("fingerprint", this.getFingerprint());
        writer.writeOffsetDateTimeValue("firstSeenDateTime", this.getFirstSeenDateTime());
        writer.writeOffsetDateTimeValue("issueDateTime", this.getIssueDateTime());
        writer.writeObjectValue("issuer", this.getIssuer());
        writer.writeOffsetDateTimeValue("lastSeenDateTime", this.getLastSeenDateTime());
        writer.writeCollectionOfObjectValues("relatedHosts", this.getRelatedHosts());
        writer.writeStringValue("serialNumber", this.getSerialNumber());
        writer.writeStringValue("sha1", this.getSha1());
        writer.writeObjectValue("subject", this.getSubject());
    }
    /**
     * Sets the expirationDateTime property value. The expirationDateTime property
     * @param value Value to set for the expirationDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExpirationDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.expirationDateTime = value;
    }
    /**
     * Sets the fingerprint property value. The fingerprint property
     * @param value Value to set for the fingerprint property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFingerprint(@javax.annotation.Nullable final String value) {
        this.fingerprint = value;
    }
    /**
     * Sets the firstSeenDateTime property value. The firstSeenDateTime property
     * @param value Value to set for the firstSeenDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFirstSeenDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.firstSeenDateTime = value;
    }
    /**
     * Sets the issueDateTime property value. The issueDateTime property
     * @param value Value to set for the issueDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIssueDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.issueDateTime = value;
    }
    /**
     * Sets the issuer property value. The issuer property
     * @param value Value to set for the issuer property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIssuer(@javax.annotation.Nullable final SslCertificateEntity value) {
        this.issuer = value;
    }
    /**
     * Sets the lastSeenDateTime property value. The lastSeenDateTime property
     * @param value Value to set for the lastSeenDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastSeenDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.lastSeenDateTime = value;
    }
    /**
     * Sets the relatedHosts property value. The relatedHosts property
     * @param value Value to set for the relatedHosts property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRelatedHosts(@javax.annotation.Nullable final java.util.List<Host> value) {
        this.relatedHosts = value;
    }
    /**
     * Sets the serialNumber property value. The serialNumber property
     * @param value Value to set for the serialNumber property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSerialNumber(@javax.annotation.Nullable final String value) {
        this.serialNumber = value;
    }
    /**
     * Sets the sha1 property value. The sha1 property
     * @param value Value to set for the sha1 property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSha1(@javax.annotation.Nullable final String value) {
        this.sha1 = value;
    }
    /**
     * Sets the subject property value. The subject property
     * @param value Value to set for the subject property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSubject(@javax.annotation.Nullable final SslCertificateEntity value) {
        this.subject = value;
    }
}
