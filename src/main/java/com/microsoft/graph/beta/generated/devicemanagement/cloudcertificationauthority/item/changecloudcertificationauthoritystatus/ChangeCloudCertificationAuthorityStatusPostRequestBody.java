package com.microsoft.graph.beta.devicemanagement.cloudcertificationauthority.item.changecloudcertificationauthoritystatus;

import com.microsoft.graph.beta.models.CloudCertificationAuthorityStatus;
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
public class ChangeCloudCertificationAuthorityStatusPostRequestBody implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link ChangeCloudCertificationAuthorityStatusPostRequestBody} and sets the default values.
     */
    public ChangeCloudCertificationAuthorityStatusPostRequestBody() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ChangeCloudCertificationAuthorityStatusPostRequestBody}
     */
    @jakarta.annotation.Nonnull
    public static ChangeCloudCertificationAuthorityStatusPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ChangeCloudCertificationAuthorityStatusPostRequestBody();
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
     * Gets the certificationAuthorityStatus property value. Enum type of possible certification authority statuses. These statuses indicate whether a certification authority is currently able to issue certificates or temporarily paused or permanently revoked.
     * @return a {@link CloudCertificationAuthorityStatus}
     */
    @jakarta.annotation.Nullable
    public CloudCertificationAuthorityStatus getCertificationAuthorityStatus() {
        return this.backingStore.get("certificationAuthorityStatus");
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("certificationAuthorityStatus", (n) -> { this.setCertificationAuthorityStatus(n.getEnumValue(CloudCertificationAuthorityStatus::forValue)); });
        deserializerMap.put("certificationAuthorityVersion", (n) -> { this.setCertificationAuthorityVersion(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("certificationAuthorityStatus", this.getCertificationAuthorityStatus());
        writer.writeIntegerValue("certificationAuthorityVersion", this.getCertificationAuthorityVersion());
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
     * Sets the certificationAuthorityStatus property value. Enum type of possible certification authority statuses. These statuses indicate whether a certification authority is currently able to issue certificates or temporarily paused or permanently revoked.
     * @param value Value to set for the certificationAuthorityStatus property.
     */
    public void setCertificationAuthorityStatus(@jakarta.annotation.Nullable final CloudCertificationAuthorityStatus value) {
        this.backingStore.set("certificationAuthorityStatus", value);
    }
    /**
     * Sets the certificationAuthorityVersion property value. The certificationAuthorityVersion property
     * @param value Value to set for the certificationAuthorityVersion property.
     */
    public void setCertificationAuthorityVersion(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("certificationAuthorityVersion", value);
    }
}
