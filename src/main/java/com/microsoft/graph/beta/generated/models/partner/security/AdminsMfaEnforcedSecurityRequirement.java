package com.microsoft.graph.beta.models.partner.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AdminsMfaEnforcedSecurityRequirement extends SecurityRequirement implements Parsable {
    /**
     * Instantiates a new {@link AdminsMfaEnforcedSecurityRequirement} and sets the default values.
     */
    public AdminsMfaEnforcedSecurityRequirement() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AdminsMfaEnforcedSecurityRequirement}
     */
    @jakarta.annotation.Nonnull
    public static AdminsMfaEnforcedSecurityRequirement createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AdminsMfaEnforcedSecurityRequirement();
    }
    /**
     * Gets the adminsRequiredNotUsingMfaCount property value. The number of admins who are required to use MFA, but haven't completed registration.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getAdminsRequiredNotUsingMfaCount() {
        return this.backingStore.get("adminsRequiredNotUsingMfaCount");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("adminsRequiredNotUsingMfaCount", (n) -> { this.setAdminsRequiredNotUsingMfaCount(n.getLongValue()); });
        deserializerMap.put("legacyPerUserMfaStatus", (n) -> { this.setLegacyPerUserMfaStatus(n.getEnumValue(PolicyStatus::forValue)); });
        deserializerMap.put("mfaConditionalAccessPolicyStatus", (n) -> { this.setMfaConditionalAccessPolicyStatus(n.getEnumValue(PolicyStatus::forValue)); });
        deserializerMap.put("mfaEnabledAdminsCount", (n) -> { this.setMfaEnabledAdminsCount(n.getLongValue()); });
        deserializerMap.put("mfaEnabledUsersCount", (n) -> { this.setMfaEnabledUsersCount(n.getLongValue()); });
        deserializerMap.put("securityDefaultsStatus", (n) -> { this.setSecurityDefaultsStatus(n.getEnumValue(PolicyStatus::forValue)); });
        deserializerMap.put("totalAdminsCount", (n) -> { this.setTotalAdminsCount(n.getLongValue()); });
        deserializerMap.put("totalUsersCount", (n) -> { this.setTotalUsersCount(n.getLongValue()); });
        deserializerMap.put("usersRequiredNotUsingMfaCount", (n) -> { this.setUsersRequiredNotUsingMfaCount(n.getLongValue()); });
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
     * Gets the mfaEnabledAdminsCount property value. The number of admins who are using MFA.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getMfaEnabledAdminsCount() {
        return this.backingStore.get("mfaEnabledAdminsCount");
    }
    /**
     * Gets the mfaEnabledUsersCount property value. The number of users who are using MFA.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getMfaEnabledUsersCount() {
        return this.backingStore.get("mfaEnabledUsersCount");
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
     * Gets the totalAdminsCount property value. The total number of admins in the partner's tenant.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getTotalAdminsCount() {
        return this.backingStore.get("totalAdminsCount");
    }
    /**
     * Gets the totalUsersCount property value. The total number of users in the partner's tenant.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getTotalUsersCount() {
        return this.backingStore.get("totalUsersCount");
    }
    /**
     * Gets the usersRequiredNotUsingMfaCount property value. The number of users who are required to use MFA, but haven't completed registration.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getUsersRequiredNotUsingMfaCount() {
        return this.backingStore.get("usersRequiredNotUsingMfaCount");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeLongValue("adminsRequiredNotUsingMfaCount", this.getAdminsRequiredNotUsingMfaCount());
        writer.writeEnumValue("legacyPerUserMfaStatus", this.getLegacyPerUserMfaStatus());
        writer.writeEnumValue("mfaConditionalAccessPolicyStatus", this.getMfaConditionalAccessPolicyStatus());
        writer.writeLongValue("mfaEnabledAdminsCount", this.getMfaEnabledAdminsCount());
        writer.writeLongValue("mfaEnabledUsersCount", this.getMfaEnabledUsersCount());
        writer.writeEnumValue("securityDefaultsStatus", this.getSecurityDefaultsStatus());
        writer.writeLongValue("totalAdminsCount", this.getTotalAdminsCount());
        writer.writeLongValue("totalUsersCount", this.getTotalUsersCount());
        writer.writeLongValue("usersRequiredNotUsingMfaCount", this.getUsersRequiredNotUsingMfaCount());
    }
    /**
     * Sets the adminsRequiredNotUsingMfaCount property value. The number of admins who are required to use MFA, but haven't completed registration.
     * @param value Value to set for the adminsRequiredNotUsingMfaCount property.
     */
    public void setAdminsRequiredNotUsingMfaCount(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("adminsRequiredNotUsingMfaCount", value);
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
     * Sets the mfaEnabledAdminsCount property value. The number of admins who are using MFA.
     * @param value Value to set for the mfaEnabledAdminsCount property.
     */
    public void setMfaEnabledAdminsCount(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("mfaEnabledAdminsCount", value);
    }
    /**
     * Sets the mfaEnabledUsersCount property value. The number of users who are using MFA.
     * @param value Value to set for the mfaEnabledUsersCount property.
     */
    public void setMfaEnabledUsersCount(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("mfaEnabledUsersCount", value);
    }
    /**
     * Sets the securityDefaultsStatus property value. The securityDefaultsStatus property
     * @param value Value to set for the securityDefaultsStatus property.
     */
    public void setSecurityDefaultsStatus(@jakarta.annotation.Nullable final PolicyStatus value) {
        this.backingStore.set("securityDefaultsStatus", value);
    }
    /**
     * Sets the totalAdminsCount property value. The total number of admins in the partner's tenant.
     * @param value Value to set for the totalAdminsCount property.
     */
    public void setTotalAdminsCount(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("totalAdminsCount", value);
    }
    /**
     * Sets the totalUsersCount property value. The total number of users in the partner's tenant.
     * @param value Value to set for the totalUsersCount property.
     */
    public void setTotalUsersCount(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("totalUsersCount", value);
    }
    /**
     * Sets the usersRequiredNotUsingMfaCount property value. The number of users who are required to use MFA, but haven't completed registration.
     * @param value Value to set for the usersRequiredNotUsingMfaCount property.
     */
    public void setUsersRequiredNotUsingMfaCount(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("usersRequiredNotUsingMfaCount", value);
    }
}
