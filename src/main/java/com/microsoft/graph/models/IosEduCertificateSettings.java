package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Trusted Root and PFX certificates for iOS EDU. */
public class IosEduCertificateSettings implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** File name to display in UI. */
    private String _certFileName;
    /** PKCS Certificate Template Name. */
    private String _certificateTemplateName;
    /** Certificate Validity Period Options. */
    private CertificateValidityPeriodScale _certificateValidityPeriodScale;
    /** Value for the Certificate Validity Period. */
    private Integer _certificateValidityPeriodValue;
    /** PKCS Certification Authority. */
    private String _certificationAuthority;
    /** PKCS Certification Authority Name. */
    private String _certificationAuthorityName;
    /** The OdataType property */
    private String _odataType;
    /** Certificate renewal threshold percentage. Valid values 1 to 99 */
    private Integer _renewalThresholdPercentage;
    /** Trusted Root Certificate. */
    private byte[] _trustedRootCertificate;
    /**
     * Instantiates a new iosEduCertificateSettings and sets the default values.
     * @return a void
     */
    public IosEduCertificateSettings() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.iosEduCertificateSettings");
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
        return this._additionalData;
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
     * Gets the certificateTemplateName property value. PKCS Certificate Template Name.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCertificateTemplateName() {
        return this._certificateTemplateName;
    }
    /**
     * Gets the certificateValidityPeriodScale property value. Certificate Validity Period Options.
     * @return a certificateValidityPeriodScale
     */
    @javax.annotation.Nullable
    public CertificateValidityPeriodScale getCertificateValidityPeriodScale() {
        return this._certificateValidityPeriodScale;
    }
    /**
     * Gets the certificateValidityPeriodValue property value. Value for the Certificate Validity Period.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getCertificateValidityPeriodValue() {
        return this._certificateValidityPeriodValue;
    }
    /**
     * Gets the certificationAuthority property value. PKCS Certification Authority.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCertificationAuthority() {
        return this._certificationAuthority;
    }
    /**
     * Gets the certificationAuthorityName property value. PKCS Certification Authority Name.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCertificationAuthorityName() {
        return this._certificationAuthorityName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final IosEduCertificateSettings currentObject = this;
        return new HashMap<>(9) {{
            this.put("certFileName", (n) -> { currentObject.setCertFileName(n.getStringValue()); });
            this.put("certificateTemplateName", (n) -> { currentObject.setCertificateTemplateName(n.getStringValue()); });
            this.put("certificateValidityPeriodScale", (n) -> { currentObject.setCertificateValidityPeriodScale(n.getEnumValue(CertificateValidityPeriodScale.class)); });
            this.put("certificateValidityPeriodValue", (n) -> { currentObject.setCertificateValidityPeriodValue(n.getIntegerValue()); });
            this.put("certificationAuthority", (n) -> { currentObject.setCertificationAuthority(n.getStringValue()); });
            this.put("certificationAuthorityName", (n) -> { currentObject.setCertificationAuthorityName(n.getStringValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("renewalThresholdPercentage", (n) -> { currentObject.setRenewalThresholdPercentage(n.getIntegerValue()); });
            this.put("trustedRootCertificate", (n) -> { currentObject.setTrustedRootCertificate(n.getByteArrayValue()); });
        }};
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
    }
    /**
     * Gets the renewalThresholdPercentage property value. Certificate renewal threshold percentage. Valid values 1 to 99
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getRenewalThresholdPercentage() {
        return this._renewalThresholdPercentage;
    }
    /**
     * Gets the trustedRootCertificate property value. Trusted Root Certificate.
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
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the certFileName property value. File name to display in UI.
     * @param value Value to set for the certFileName property.
     * @return a void
     */
    public void setCertFileName(@javax.annotation.Nullable final String value) {
        this._certFileName = value;
    }
    /**
     * Sets the certificateTemplateName property value. PKCS Certificate Template Name.
     * @param value Value to set for the certificateTemplateName property.
     * @return a void
     */
    public void setCertificateTemplateName(@javax.annotation.Nullable final String value) {
        this._certificateTemplateName = value;
    }
    /**
     * Sets the certificateValidityPeriodScale property value. Certificate Validity Period Options.
     * @param value Value to set for the certificateValidityPeriodScale property.
     * @return a void
     */
    public void setCertificateValidityPeriodScale(@javax.annotation.Nullable final CertificateValidityPeriodScale value) {
        this._certificateValidityPeriodScale = value;
    }
    /**
     * Sets the certificateValidityPeriodValue property value. Value for the Certificate Validity Period.
     * @param value Value to set for the certificateValidityPeriodValue property.
     * @return a void
     */
    public void setCertificateValidityPeriodValue(@javax.annotation.Nullable final Integer value) {
        this._certificateValidityPeriodValue = value;
    }
    /**
     * Sets the certificationAuthority property value. PKCS Certification Authority.
     * @param value Value to set for the certificationAuthority property.
     * @return a void
     */
    public void setCertificationAuthority(@javax.annotation.Nullable final String value) {
        this._certificationAuthority = value;
    }
    /**
     * Sets the certificationAuthorityName property value. PKCS Certification Authority Name.
     * @param value Value to set for the certificationAuthorityName property.
     * @return a void
     */
    public void setCertificationAuthorityName(@javax.annotation.Nullable final String value) {
        this._certificationAuthorityName = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the renewalThresholdPercentage property value. Certificate renewal threshold percentage. Valid values 1 to 99
     * @param value Value to set for the renewalThresholdPercentage property.
     * @return a void
     */
    public void setRenewalThresholdPercentage(@javax.annotation.Nullable final Integer value) {
        this._renewalThresholdPercentage = value;
    }
    /**
     * Sets the trustedRootCertificate property value. Trusted Root Certificate.
     * @param value Value to set for the trustedRootCertificate property.
     * @return a void
     */
    public void setTrustedRootCertificate(@javax.annotation.Nullable final byte[] value) {
        this._trustedRootCertificate = value;
    }
}
