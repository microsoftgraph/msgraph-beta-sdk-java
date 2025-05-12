package com.microsoft.graph.beta.models;

import com.microsoft.kiota.PeriodAndDuration;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PasswordCredentialConfiguration implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link PasswordCredentialConfiguration} and sets the default values.
     */
    public PasswordCredentialConfiguration() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PasswordCredentialConfiguration}
     */
    @jakarta.annotation.Nonnull
    public static PasswordCredentialConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PasswordCredentialConfiguration();
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
     * Gets the excludeActors property value. The excludeActors property
     * @return a {@link AppManagementPolicyActorExemptions}
     */
    @jakarta.annotation.Nullable
    public AppManagementPolicyActorExemptions getExcludeActors() {
        return this.backingStore.get("excludeActors");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("excludeActors", (n) -> { this.setExcludeActors(n.getObjectValue(AppManagementPolicyActorExemptions::createFromDiscriminatorValue)); });
        deserializerMap.put("maxLifetime", (n) -> { this.setMaxLifetime(n.getPeriodAndDurationValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("restrictForAppsCreatedAfterDateTime", (n) -> { this.setRestrictForAppsCreatedAfterDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("restrictionType", (n) -> { this.setRestrictionType(n.getEnumValue(AppCredentialRestrictionType::forValue)); });
        deserializerMap.put("state", (n) -> { this.setState(n.getEnumValue(AppManagementRestrictionState::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the maxLifetime property value. String value that indicates the maximum lifetime for password expiration, defined as an ISO 8601 duration. For example, P4DT12H30M5S represents four days, 12 hours, 30 minutes, and five seconds. This property is required when restrictionType is set to passwordLifetime.
     * @return a {@link PeriodAndDuration}
     */
    @jakarta.annotation.Nullable
    public PeriodAndDuration getMaxLifetime() {
        return this.backingStore.get("maxLifetime");
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
     * Gets the restrictForAppsCreatedAfterDateTime property value. Specifies the date from which the policy restriction applies to newly created applications. For existing applications, the enforcement date can be retroactively applied.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getRestrictForAppsCreatedAfterDateTime() {
        return this.backingStore.get("restrictForAppsCreatedAfterDateTime");
    }
    /**
     * Gets the restrictionType property value. The restrictionType property
     * @return a {@link AppCredentialRestrictionType}
     */
    @jakarta.annotation.Nullable
    public AppCredentialRestrictionType getRestrictionType() {
        return this.backingStore.get("restrictionType");
    }
    /**
     * Gets the state property value. Indicates whether the restriction is evaluated. The possible values are: enabled, disabled, unknownFutureValue. If enabled, the restriction is evaluated. If disabled, the restriction isn&apos;t evaluated or enforced.
     * @return a {@link AppManagementRestrictionState}
     */
    @jakarta.annotation.Nullable
    public AppManagementRestrictionState getState() {
        return this.backingStore.get("state");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("excludeActors", this.getExcludeActors());
        writer.writePeriodAndDurationValue("maxLifetime", this.getMaxLifetime());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeOffsetDateTimeValue("restrictForAppsCreatedAfterDateTime", this.getRestrictForAppsCreatedAfterDateTime());
        writer.writeEnumValue("restrictionType", this.getRestrictionType());
        writer.writeEnumValue("state", this.getState());
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
     * Sets the excludeActors property value. The excludeActors property
     * @param value Value to set for the excludeActors property.
     */
    public void setExcludeActors(@jakarta.annotation.Nullable final AppManagementPolicyActorExemptions value) {
        this.backingStore.set("excludeActors", value);
    }
    /**
     * Sets the maxLifetime property value. String value that indicates the maximum lifetime for password expiration, defined as an ISO 8601 duration. For example, P4DT12H30M5S represents four days, 12 hours, 30 minutes, and five seconds. This property is required when restrictionType is set to passwordLifetime.
     * @param value Value to set for the maxLifetime property.
     */
    public void setMaxLifetime(@jakarta.annotation.Nullable final PeriodAndDuration value) {
        this.backingStore.set("maxLifetime", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the restrictForAppsCreatedAfterDateTime property value. Specifies the date from which the policy restriction applies to newly created applications. For existing applications, the enforcement date can be retroactively applied.
     * @param value Value to set for the restrictForAppsCreatedAfterDateTime property.
     */
    public void setRestrictForAppsCreatedAfterDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("restrictForAppsCreatedAfterDateTime", value);
    }
    /**
     * Sets the restrictionType property value. The restrictionType property
     * @param value Value to set for the restrictionType property.
     */
    public void setRestrictionType(@jakarta.annotation.Nullable final AppCredentialRestrictionType value) {
        this.backingStore.set("restrictionType", value);
    }
    /**
     * Sets the state property value. Indicates whether the restriction is evaluated. The possible values are: enabled, disabled, unknownFutureValue. If enabled, the restriction is evaluated. If disabled, the restriction isn&apos;t evaluated or enforced.
     * @param value Value to set for the state property.
     */
    public void setState(@jakarta.annotation.Nullable final AppManagementRestrictionState value) {
        this.backingStore.set("state", value);
    }
}
