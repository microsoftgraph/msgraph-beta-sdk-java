package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Trusted Root and PFX certificates for iOS EDU.
 */
public class IosEduCertificateSettings implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** File name to display in UI. */
    private String certFileName;
    /** PKCS Certificate Template Name. */
    private String certificateTemplateName;
    /** Certificate Validity Period Options. */
    private CertificateValidityPeriodScale certificateValidityPeriodScale;
    /** Value for the Certificate Validity Period. */
    private Integer certificateValidityPeriodValue;
    /** PKCS Certification Authority. */
    private String certificationAuthority;
    /** PKCS Certification Authority Name. */
    private String certificationAuthorityName;
    /** The OdataType property */
    private String odataType;
    /** Certificate renewal threshold percentage. Valid values 1 to 99 */
    private Integer renewalThresholdPercentage;
    /** Trusted Root Certificate. */
    private byte[] trustedRootCertificate;
    /**
     * Instantiates a new iosEduCertificateSettings and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public IosEduCertificateSettings() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a iosEduCertificateSettings
     */
    @javax.annotation.Nonnull
    public static IosEduCertificateSettings createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IosEduCertificateSettings();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
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
     * Gets the certificateTemplateName property value. PKCS Certificate Template Name.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCertificateTemplateName() {
        return this.certificateTemplateName;
    }
    /**
     * Gets the certificateValidityPeriodScale property value. Certificate Validity Period Options.
     * @return a CertificateValidityPeriodScale
     */
    @javax.annotation.Nullable
    public CertificateValidityPeriodScale getCertificateValidityPeriodScale() {
        return this.certificateValidityPeriodScale;
    }
    /**
     * Gets the certificateValidityPeriodValue property value. Value for the Certificate Validity Period.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getCertificateValidityPeriodValue() {
        return this.certificateValidityPeriodValue;
    }
    /**
     * Gets the certificationAuthority property value. PKCS Certification Authority.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCertificationAuthority() {
        return this.certificationAuthority;
    }
    /**
     * Gets the certificationAuthorityName property value. PKCS Certification Authority Name.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCertificationAuthorityName() {
        return this.certificationAuthorityName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(9);
        deserializerMap.put("certFileName", (n) -> { this.setCertFileName(n.getStringValue()); });
        deserializerMap.put("certificateTemplateName", (n) -> { this.setCertificateTemplateName(n.getStringValue()); });
        deserializerMap.put("certificateValidityPeriodScale", (n) -> { this.setCertificateValidityPeriodScale(n.getEnumValue(CertificateValidityPeriodScale.class)); });
        deserializerMap.put("certificateValidityPeriodValue", (n) -> { this.setCertificateValidityPeriodValue(n.getIntegerValue()); });
        deserializerMap.put("certificationAuthority", (n) -> { this.setCertificationAuthority(n.getStringValue()); });
        deserializerMap.put("certificationAuthorityName", (n) -> { this.setCertificationAuthorityName(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("renewalThresholdPercentage", (n) -> { this.setRenewalThresholdPercentage(n.getIntegerValue()); });
        deserializerMap.put("trustedRootCertificate", (n) -> { this.setTrustedRootCertificate(n.getByteArrayValue()); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the renewalThresholdPercentage property value. Certificate renewal threshold percentage. Valid values 1 to 99
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getRenewalThresholdPercentage() {
        return this.renewalThresholdPercentage;
    }
    /**
     * Gets the trustedRootCertificate property value. Trusted Root Certificate.
     * @return a base64url
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
        writer.writeStringValue("certFileName", this.getCertFileName());
        writer.writeStringValue("certificateTemplateName", this.getCertificateTemplateName());
        writer.writeEnumValue("certificateValidityPeriodScale", this.getCertificateValidityPeriodScale());
        writer.writeIntegerValue("certificateValidityPeriodValue", this.getCertificateValidityPeriodValue());
        writer.writeStringValue("certificationAuthority", this.getCertificationAuthority());
        writer.writeStringValue("certificationAuthorityName", this.getCertificationAuthorityName());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeIntegerValue("renewalThresholdPercentage", this.getRenewalThresholdPercentage());
        writer.writeByteArrayValue("trustedRootCertificate", this.getTrustedRootCertificate());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
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
     * Sets the certificateTemplateName property value. PKCS Certificate Template Name.
     * @param value Value to set for the certificateTemplateName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCertificateTemplateName(@javax.annotation.Nullable final String value) {
        this.certificateTemplateName = value;
    }
    /**
     * Sets the certificateValidityPeriodScale property value. Certificate Validity Period Options.
     * @param value Value to set for the certificateValidityPeriodScale property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCertificateValidityPeriodScale(@javax.annotation.Nullable final CertificateValidityPeriodScale value) {
        this.certificateValidityPeriodScale = value;
    }
    /**
     * Sets the certificateValidityPeriodValue property value. Value for the Certificate Validity Period.
     * @param value Value to set for the certificateValidityPeriodValue property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCertificateValidityPeriodValue(@javax.annotation.Nullable final Integer value) {
        this.certificateValidityPeriodValue = value;
    }
    /**
     * Sets the certificationAuthority property value. PKCS Certification Authority.
     * @param value Value to set for the certificationAuthority property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCertificationAuthority(@javax.annotation.Nullable final String value) {
        this.certificationAuthority = value;
    }
    /**
     * Sets the certificationAuthorityName property value. PKCS Certification Authority Name.
     * @param value Value to set for the certificationAuthorityName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCertificationAuthorityName(@javax.annotation.Nullable final String value) {
        this.certificationAuthorityName = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the renewalThresholdPercentage property value. Certificate renewal threshold percentage. Valid values 1 to 99
     * @param value Value to set for the renewalThresholdPercentage property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRenewalThresholdPercentage(@javax.annotation.Nullable final Integer value) {
        this.renewalThresholdPercentage = value;
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
