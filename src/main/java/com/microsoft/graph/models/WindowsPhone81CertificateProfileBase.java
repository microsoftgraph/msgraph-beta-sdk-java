package com.microsoft.graph.models;

import com.microsoft.graph.models.WindowsPhone81SCEPCertificateProfile;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WindowsPhone81CertificateProfileBase extends DeviceConfiguration implements Parsable {
    /** Certificate Validity Period Options. */
    private CertificateValidityPeriodScale _certificateValidityPeriodScale;
    /** Value for the Certificate Validtiy Period. */
    private Integer _certificateValidityPeriodValue;
    /** Extended Key Usage (EKU) settings. This collection can contain a maximum of 500 elements. */
    private java.util.List<ExtendedKeyUsage> _extendedKeyUsages;
    /** Key Storage Provider (KSP) Import Options. */
    private KeyStorageProviderOption _keyStorageProvider;
    /** Certificate renewal threshold percentage. */
    private Integer _renewalThresholdPercentage;
    /** Subject Alternative Name Options. */
    private SubjectAlternativeNameType _subjectAlternativeNameType;
    /** Subject Name Format Options. */
    private SubjectNameFormat _subjectNameFormat;
    /**
     * Instantiates a new windowsPhone81CertificateProfileBase and sets the default values.
     * @return a void
     */
    public WindowsPhone81CertificateProfileBase() {
        super();
        this.setOdataType("#microsoft.graph.windowsPhone81CertificateProfileBase");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a windowsPhone81CertificateProfileBase
     */
    @javax.annotation.Nonnull
    public static WindowsPhone81CertificateProfileBase createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.windowsPhone81SCEPCertificateProfile": return new WindowsPhone81SCEPCertificateProfile();
            }
        }
        return new WindowsPhone81CertificateProfileBase();
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
     * Gets the certificateValidityPeriodValue property value. Value for the Certificate Validtiy Period.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getCertificateValidityPeriodValue() {
        return this._certificateValidityPeriodValue;
    }
    /**
     * Gets the extendedKeyUsages property value. Extended Key Usage (EKU) settings. This collection can contain a maximum of 500 elements.
     * @return a extendedKeyUsage
     */
    @javax.annotation.Nullable
    public java.util.List<ExtendedKeyUsage> getExtendedKeyUsages() {
        return this._extendedKeyUsages;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final WindowsPhone81CertificateProfileBase currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("certificateValidityPeriodScale", (n) -> { currentObject.setCertificateValidityPeriodScale(n.getEnumValue(CertificateValidityPeriodScale.class)); });
            this.put("certificateValidityPeriodValue", (n) -> { currentObject.setCertificateValidityPeriodValue(n.getIntegerValue()); });
            this.put("extendedKeyUsages", (n) -> { currentObject.setExtendedKeyUsages(n.getCollectionOfObjectValues(ExtendedKeyUsage::createFromDiscriminatorValue)); });
            this.put("keyStorageProvider", (n) -> { currentObject.setKeyStorageProvider(n.getEnumValue(KeyStorageProviderOption.class)); });
            this.put("renewalThresholdPercentage", (n) -> { currentObject.setRenewalThresholdPercentage(n.getIntegerValue()); });
            this.put("subjectAlternativeNameType", (n) -> { currentObject.setSubjectAlternativeNameType(n.getEnumValue(SubjectAlternativeNameType.class)); });
            this.put("subjectNameFormat", (n) -> { currentObject.setSubjectNameFormat(n.getEnumValue(SubjectNameFormat.class)); });
        }};
    }
    /**
     * Gets the keyStorageProvider property value. Key Storage Provider (KSP) Import Options.
     * @return a keyStorageProviderOption
     */
    @javax.annotation.Nullable
    public KeyStorageProviderOption getKeyStorageProvider() {
        return this._keyStorageProvider;
    }
    /**
     * Gets the renewalThresholdPercentage property value. Certificate renewal threshold percentage.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getRenewalThresholdPercentage() {
        return this._renewalThresholdPercentage;
    }
    /**
     * Gets the subjectAlternativeNameType property value. Subject Alternative Name Options.
     * @return a subjectAlternativeNameType
     */
    @javax.annotation.Nullable
    public SubjectAlternativeNameType getSubjectAlternativeNameType() {
        return this._subjectAlternativeNameType;
    }
    /**
     * Gets the subjectNameFormat property value. Subject Name Format Options.
     * @return a subjectNameFormat
     */
    @javax.annotation.Nullable
    public SubjectNameFormat getSubjectNameFormat() {
        return this._subjectNameFormat;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("certificateValidityPeriodScale", this.getCertificateValidityPeriodScale());
        writer.writeIntegerValue("certificateValidityPeriodValue", this.getCertificateValidityPeriodValue());
        writer.writeCollectionOfObjectValues("extendedKeyUsages", this.getExtendedKeyUsages());
        writer.writeEnumValue("keyStorageProvider", this.getKeyStorageProvider());
        writer.writeIntegerValue("renewalThresholdPercentage", this.getRenewalThresholdPercentage());
        writer.writeEnumValue("subjectAlternativeNameType", this.getSubjectAlternativeNameType());
        writer.writeEnumValue("subjectNameFormat", this.getSubjectNameFormat());
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
     * Sets the certificateValidityPeriodValue property value. Value for the Certificate Validtiy Period.
     * @param value Value to set for the certificateValidityPeriodValue property.
     * @return a void
     */
    public void setCertificateValidityPeriodValue(@javax.annotation.Nullable final Integer value) {
        this._certificateValidityPeriodValue = value;
    }
    /**
     * Sets the extendedKeyUsages property value. Extended Key Usage (EKU) settings. This collection can contain a maximum of 500 elements.
     * @param value Value to set for the extendedKeyUsages property.
     * @return a void
     */
    public void setExtendedKeyUsages(@javax.annotation.Nullable final java.util.List<ExtendedKeyUsage> value) {
        this._extendedKeyUsages = value;
    }
    /**
     * Sets the keyStorageProvider property value. Key Storage Provider (KSP) Import Options.
     * @param value Value to set for the keyStorageProvider property.
     * @return a void
     */
    public void setKeyStorageProvider(@javax.annotation.Nullable final KeyStorageProviderOption value) {
        this._keyStorageProvider = value;
    }
    /**
     * Sets the renewalThresholdPercentage property value. Certificate renewal threshold percentage.
     * @param value Value to set for the renewalThresholdPercentage property.
     * @return a void
     */
    public void setRenewalThresholdPercentage(@javax.annotation.Nullable final Integer value) {
        this._renewalThresholdPercentage = value;
    }
    /**
     * Sets the subjectAlternativeNameType property value. Subject Alternative Name Options.
     * @param value Value to set for the subjectAlternativeNameType property.
     * @return a void
     */
    public void setSubjectAlternativeNameType(@javax.annotation.Nullable final SubjectAlternativeNameType value) {
        this._subjectAlternativeNameType = value;
    }
    /**
     * Sets the subjectNameFormat property value. Subject Name Format Options.
     * @param value Value to set for the subjectNameFormat property.
     * @return a void
     */
    public void setSubjectNameFormat(@javax.annotation.Nullable final SubjectNameFormat value) {
        this._subjectNameFormat = value;
    }
}
