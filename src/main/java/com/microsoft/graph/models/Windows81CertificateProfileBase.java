package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Windows81CertificateProfileBase extends WindowsCertificateProfileBase implements Parsable {
    /** Custom Subject Alternative Name Settings. This collection can contain a maximum of 500 elements. */
    private java.util.List<CustomSubjectAlternativeName> customSubjectAlternativeNames;
    /** Extended Key Usage (EKU) settings. This collection can contain a maximum of 500 elements. */
    private java.util.List<ExtendedKeyUsage> extendedKeyUsages;
    /**
     * Instantiates a new Windows81CertificateProfileBase and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public Windows81CertificateProfileBase() {
        super();
        this.setOdataType("#microsoft.graph.windows81CertificateProfileBase");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Windows81CertificateProfileBase
     */
    @javax.annotation.Nonnull
    public static Windows81CertificateProfileBase createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.windows81SCEPCertificateProfile": return new Windows81SCEPCertificateProfile();
            }
        }
        return new Windows81CertificateProfileBase();
    }
    /**
     * Gets the customSubjectAlternativeNames property value. Custom Subject Alternative Name Settings. This collection can contain a maximum of 500 elements.
     * @return a customSubjectAlternativeName
     */
    @javax.annotation.Nullable
    public java.util.List<CustomSubjectAlternativeName> getCustomSubjectAlternativeNames() {
        return this.customSubjectAlternativeNames;
    }
    /**
     * Gets the extendedKeyUsages property value. Extended Key Usage (EKU) settings. This collection can contain a maximum of 500 elements.
     * @return a extendedKeyUsage
     */
    @javax.annotation.Nullable
    public java.util.List<ExtendedKeyUsage> getExtendedKeyUsages() {
        return this.extendedKeyUsages;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("customSubjectAlternativeNames", (n) -> { this.setCustomSubjectAlternativeNames(n.getCollectionOfObjectValues(CustomSubjectAlternativeName::createFromDiscriminatorValue)); });
        deserializerMap.put("extendedKeyUsages", (n) -> { this.setExtendedKeyUsages(n.getCollectionOfObjectValues(ExtendedKeyUsage::createFromDiscriminatorValue)); });
        return deserializerMap;
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
        writer.writeCollectionOfObjectValues("customSubjectAlternativeNames", this.getCustomSubjectAlternativeNames());
        writer.writeCollectionOfObjectValues("extendedKeyUsages", this.getExtendedKeyUsages());
    }
    /**
     * Sets the customSubjectAlternativeNames property value. Custom Subject Alternative Name Settings. This collection can contain a maximum of 500 elements.
     * @param value Value to set for the customSubjectAlternativeNames property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCustomSubjectAlternativeNames(@javax.annotation.Nullable final java.util.List<CustomSubjectAlternativeName> value) {
        this.customSubjectAlternativeNames = value;
    }
    /**
     * Sets the extendedKeyUsages property value. Extended Key Usage (EKU) settings. This collection can contain a maximum of 500 elements.
     * @param value Value to set for the extendedKeyUsages property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExtendedKeyUsages(@javax.annotation.Nullable final java.util.List<ExtendedKeyUsage> value) {
        this.extendedKeyUsages = value;
    }
}
