package com.microsoft.graph.models;

import com.microsoft.graph.models.MacOSImportedPFXCertificateProfile;
import com.microsoft.graph.models.MacOSPkcsCertificateProfile;
import com.microsoft.graph.models.MacOSScepCertificateProfile;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class MacOSCertificateProfileBase extends DeviceConfiguration implements Parsable {
    /** Certificate Validity Period Options. */
    private CertificateValidityPeriodScale _certificateValidityPeriodScale;
    /** Value for the Certificate Validity Period. */
    private Integer _certificateValidityPeriodValue;
    /** Certificate renewal threshold percentage. */
    private Integer _renewalThresholdPercentage;
    /** Certificate Subject Alternative Name Type. Possible values are: none, emailAddress, userPrincipalName, customAzureADAttribute, domainNameService, universalResourceIdentifier. */
    private SubjectAlternativeNameType _subjectAlternativeNameType;
    /** Subject Name Format Options for Apple devices. */
    private AppleSubjectNameFormat _subjectNameFormat;
    /**
     * Instantiates a new macOSCertificateProfileBase and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public MacOSCertificateProfileBase() {
        super();
        this.setOdataType("#microsoft.graph.macOSCertificateProfileBase");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a macOSCertificateProfileBase
     */
    @javax.annotation.Nonnull
    public static MacOSCertificateProfileBase createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.macOSImportedPFXCertificateProfile": return new MacOSImportedPFXCertificateProfile();
                case "#microsoft.graph.macOSPkcsCertificateProfile": return new MacOSPkcsCertificateProfile();
                case "#microsoft.graph.macOSScepCertificateProfile": return new MacOSScepCertificateProfile();
            }
        }
        return new MacOSCertificateProfileBase();
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
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final MacOSCertificateProfileBase currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("certificateValidityPeriodScale", (n) -> { currentObject.setCertificateValidityPeriodScale(n.getEnumValue(CertificateValidityPeriodScale.class)); });
        deserializerMap.put("certificateValidityPeriodValue", (n) -> { currentObject.setCertificateValidityPeriodValue(n.getIntegerValue()); });
        deserializerMap.put("renewalThresholdPercentage", (n) -> { currentObject.setRenewalThresholdPercentage(n.getIntegerValue()); });
        deserializerMap.put("subjectAlternativeNameType", (n) -> { currentObject.setSubjectAlternativeNameType(n.getEnumValue(SubjectAlternativeNameType.class)); });
        deserializerMap.put("subjectNameFormat", (n) -> { currentObject.setSubjectNameFormat(n.getEnumValue(AppleSubjectNameFormat.class)); });
        return deserializerMap;
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
     * Gets the subjectAlternativeNameType property value. Certificate Subject Alternative Name Type. Possible values are: none, emailAddress, userPrincipalName, customAzureADAttribute, domainNameService, universalResourceIdentifier.
     * @return a subjectAlternativeNameType
     */
    @javax.annotation.Nullable
    public SubjectAlternativeNameType getSubjectAlternativeNameType() {
        return this._subjectAlternativeNameType;
    }
    /**
     * Gets the subjectNameFormat property value. Subject Name Format Options for Apple devices.
     * @return a appleSubjectNameFormat
     */
    @javax.annotation.Nullable
    public AppleSubjectNameFormat getSubjectNameFormat() {
        return this._subjectNameFormat;
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
        writer.writeEnumValue("certificateValidityPeriodScale", this.getCertificateValidityPeriodScale());
        writer.writeIntegerValue("certificateValidityPeriodValue", this.getCertificateValidityPeriodValue());
        writer.writeIntegerValue("renewalThresholdPercentage", this.getRenewalThresholdPercentage());
        writer.writeEnumValue("subjectAlternativeNameType", this.getSubjectAlternativeNameType());
        writer.writeEnumValue("subjectNameFormat", this.getSubjectNameFormat());
    }
    /**
     * Sets the certificateValidityPeriodScale property value. Certificate Validity Period Options.
     * @param value Value to set for the certificateValidityPeriodScale property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCertificateValidityPeriodScale(@javax.annotation.Nullable final CertificateValidityPeriodScale value) {
        this._certificateValidityPeriodScale = value;
    }
    /**
     * Sets the certificateValidityPeriodValue property value. Value for the Certificate Validity Period.
     * @param value Value to set for the certificateValidityPeriodValue property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCertificateValidityPeriodValue(@javax.annotation.Nullable final Integer value) {
        this._certificateValidityPeriodValue = value;
    }
    /**
     * Sets the renewalThresholdPercentage property value. Certificate renewal threshold percentage.
     * @param value Value to set for the renewalThresholdPercentage property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRenewalThresholdPercentage(@javax.annotation.Nullable final Integer value) {
        this._renewalThresholdPercentage = value;
    }
    /**
     * Sets the subjectAlternativeNameType property value. Certificate Subject Alternative Name Type. Possible values are: none, emailAddress, userPrincipalName, customAzureADAttribute, domainNameService, universalResourceIdentifier.
     * @param value Value to set for the subjectAlternativeNameType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSubjectAlternativeNameType(@javax.annotation.Nullable final SubjectAlternativeNameType value) {
        this._subjectAlternativeNameType = value;
    }
    /**
     * Sets the subjectNameFormat property value. Subject Name Format Options for Apple devices.
     * @param value Value to set for the subjectNameFormat property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSubjectNameFormat(@javax.annotation.Nullable final AppleSubjectNameFormat value) {
        this._subjectNameFormat = value;
    }
}
