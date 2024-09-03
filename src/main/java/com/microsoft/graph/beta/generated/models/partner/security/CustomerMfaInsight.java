package com.microsoft.graph.beta.models.partner.security;

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
public class CustomerMfaInsight implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link CustomerMfaInsight} and sets the default values.
     */
    public CustomerMfaInsight() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CustomerMfaInsight}
     */
    @jakarta.annotation.Nonnull
    public static CustomerMfaInsight createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CustomerMfaInsight();
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
     * Gets the compliantAdminsCount property value. The number of admins that are compliant with the MFA requirements
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getCompliantAdminsCount() {
        return this.backingStore.get("compliantAdminsCount");
    }
    /**
     * Gets the compliantNonAdminsCount property value. The number of users that are compliant with the MFA requirements
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getCompliantNonAdminsCount() {
        return this.backingStore.get("compliantNonAdminsCount");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("compliantAdminsCount", (n) -> { this.setCompliantAdminsCount(n.getLongValue()); });
        deserializerMap.put("compliantNonAdminsCount", (n) -> { this.setCompliantNonAdminsCount(n.getLongValue()); });
        deserializerMap.put("legacyPerUserMfaStatus", (n) -> { this.setLegacyPerUserMfaStatus(n.getEnumValue(PolicyStatus::forValue)); });
        deserializerMap.put("mfaConditionalAccessPolicyStatus", (n) -> { this.setMfaConditionalAccessPolicyStatus(n.getEnumValue(PolicyStatus::forValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("securityDefaultsStatus", (n) -> { this.setSecurityDefaultsStatus(n.getEnumValue(PolicyStatus::forValue)); });
        deserializerMap.put("totalUsersCount", (n) -> { this.setTotalUsersCount(n.getLongValue()); });
        return deserializerMap;
    }
    /**
     * Gets the legacyPerUserMfaStatus property value. The legacyPerUserMfaStatus property
     * @return a {@link PolicyStatus}
     */
    @jakarta.annotation.Nullable
    public PolicyStatus getLegacyPerUserMfaStatus() {
        return this.backingStore.get("legacyPerUserMfaStatus");
    }
    /**
     * Gets the mfaConditionalAccessPolicyStatus property value. The mfaConditionalAccessPolicyStatus property
     * @return a {@link PolicyStatus}
     */
    @jakarta.annotation.Nullable
    public PolicyStatus getMfaConditionalAccessPolicyStatus() {
        return this.backingStore.get("mfaConditionalAccessPolicyStatus");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the securityDefaultsStatus property value. The securityDefaultsStatus property
     * @return a {@link PolicyStatus}
     */
    @jakarta.annotation.Nullable
    public PolicyStatus getSecurityDefaultsStatus() {
        return this.backingStore.get("securityDefaultsStatus");
    }
    /**
     * Gets the totalUsersCount property value. The total number of users in the tenant
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getTotalUsersCount() {
        return this.backingStore.get("totalUsersCount");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeLongValue("compliantAdminsCount", this.getCompliantAdminsCount());
        writer.writeLongValue("compliantNonAdminsCount", this.getCompliantNonAdminsCount());
        writer.writeEnumValue("legacyPerUserMfaStatus", this.getLegacyPerUserMfaStatus());
        writer.writeEnumValue("mfaConditionalAccessPolicyStatus", this.getMfaConditionalAccessPolicyStatus());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumValue("securityDefaultsStatus", this.getSecurityDefaultsStatus());
        writer.writeLongValue("totalUsersCount", this.getTotalUsersCount());
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
     * Sets the compliantAdminsCount property value. The number of admins that are compliant with the MFA requirements
     * @param value Value to set for the compliantAdminsCount property.
     */
    public void setCompliantAdminsCount(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("compliantAdminsCount", value);
    }
    /**
     * Sets the compliantNonAdminsCount property value. The number of users that are compliant with the MFA requirements
     * @param value Value to set for the compliantNonAdminsCount property.
     */
    public void setCompliantNonAdminsCount(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("compliantNonAdminsCount", value);
    }
    /**
     * Sets the legacyPerUserMfaStatus property value. The legacyPerUserMfaStatus property
     * @param value Value to set for the legacyPerUserMfaStatus property.
     */
    public void setLegacyPerUserMfaStatus(@jakarta.annotation.Nullable final PolicyStatus value) {
        this.backingStore.set("legacyPerUserMfaStatus", value);
    }
    /**
     * Sets the mfaConditionalAccessPolicyStatus property value. The mfaConditionalAccessPolicyStatus property
     * @param value Value to set for the mfaConditionalAccessPolicyStatus property.
     */
    public void setMfaConditionalAccessPolicyStatus(@jakarta.annotation.Nullable final PolicyStatus value) {
        this.backingStore.set("mfaConditionalAccessPolicyStatus", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the securityDefaultsStatus property value. The securityDefaultsStatus property
     * @param value Value to set for the securityDefaultsStatus property.
     */
    public void setSecurityDefaultsStatus(@jakarta.annotation.Nullable final PolicyStatus value) {
        this.backingStore.set("securityDefaultsStatus", value);
    }
    /**
     * Sets the totalUsersCount property value. The total number of users in the tenant
     * @param value Value to set for the totalUsersCount property.
     */
    public void setTotalUsersCount(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("totalUsersCount", value);
    }
}
