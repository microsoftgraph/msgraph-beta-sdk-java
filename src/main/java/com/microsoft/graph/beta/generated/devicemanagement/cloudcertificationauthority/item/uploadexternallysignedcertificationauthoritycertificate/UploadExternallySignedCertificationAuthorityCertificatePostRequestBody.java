package com.microsoft.graph.beta.devicemanagement.cloudcertificationauthority.item.uploadexternallysignedcertificationauthoritycertificate;

import com.microsoft.graph.beta.models.TrustChainCertificate;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UploadExternallySignedCertificationAuthorityCertificatePostRequestBody implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link UploadExternallySignedCertificationAuthorityCertificatePostRequestBody} and sets the default values.
     */
    public UploadExternallySignedCertificationAuthorityCertificatePostRequestBody() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link UploadExternallySignedCertificationAuthorityCertificatePostRequestBody}
     */
    @jakarta.annotation.Nonnull
    public static UploadExternallySignedCertificationAuthorityCertificatePostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UploadExternallySignedCertificationAuthorityCertificatePostRequestBody();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a {@link Map<String, Object>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.backingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the backingStore property value. Stores model information.
     * @return a {@link BackingStore}
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * Gets the certificationAuthorityVersion property value. The certificationAuthorityVersion property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getCertificationAuthorityVersion() {
        return this.backingStore.get("certificationAuthorityVersion");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("certificationAuthorityVersion", (n) -> { this.setCertificationAuthorityVersion(n.getIntegerValue()); });
        deserializerMap.put("signedCertificate", (n) -> { this.setSignedCertificate(n.getStringValue()); });
        deserializerMap.put("trustChainCertificates", (n) -> { this.setTrustChainCertificates(n.getCollectionOfObjectValues(TrustChainCertificate::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the signedCertificate property value. The signedCertificate property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSignedCertificate() {
        return this.backingStore.get("signedCertificate");
    }
    /**
     * Gets the trustChainCertificates property value. The trustChainCertificates property
     * @return a {@link java.util.List<TrustChainCertificate>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<TrustChainCertificate> getTrustChainCertificates() {
        return this.backingStore.get("trustChainCertificates");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("certificationAuthorityVersion", this.getCertificationAuthorityVersion());
        writer.writeStringValue("signedCertificate", this.getSignedCertificate());
        writer.writeCollectionOfObjectValues("trustChainCertificates", this.getTrustChainCertificates());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the certificationAuthorityVersion property value. The certificationAuthorityVersion property
     * @param value Value to set for the certificationAuthorityVersion property.
     */
    public void setCertificationAuthorityVersion(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("certificationAuthorityVersion", value);
    }
    /**
     * Sets the signedCertificate property value. The signedCertificate property
     * @param value Value to set for the signedCertificate property.
     */
    public void setSignedCertificate(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("signedCertificate", value);
    }
    /**
     * Sets the trustChainCertificates property value. The trustChainCertificates property
     * @param value Value to set for the trustChainCertificates property.
     */
    public void setTrustChainCertificates(@jakarta.annotation.Nullable final java.util.List<TrustChainCertificate> value) {
        this.backingStore.set("trustChainCertificates", value);
    }
}
