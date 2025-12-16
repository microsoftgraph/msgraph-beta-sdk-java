package com.microsoft.graph.beta.models.managedtenants;

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
public class TenantStatusInformation implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link TenantStatusInformation} and sets the default values.
     */
    public TenantStatusInformation() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link TenantStatusInformation}
     */
    @jakarta.annotation.Nonnull
    public static TenantStatusInformation createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TenantStatusInformation();
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
     * Gets the delegatedPrivilegeStatus property value. The status of the delegated admin privilege relationship between the managing entity and the managed tenant. The possible values are: none, delegatedAdminPrivileges, unknownFutureValue, granularDelegatedAdminPrivileges, delegatedAndGranularDelegetedAdminPrivileges. Use the Prefer: include-unknown-enum-members request header to get the following values from this evolvable enum: granularDelegatedAdminPrivileges , delegatedAndGranularDelegetedAdminPrivileges. Optional. Read-only.
     * @return a {@link DelegatedPrivilegeStatus}
     */
    @jakarta.annotation.Nullable
    public DelegatedPrivilegeStatus getDelegatedPrivilegeStatus() {
        return this.backingStore.get("delegatedPrivilegeStatus");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(10);
        deserializerMap.put("delegatedPrivilegeStatus", (n) -> { this.setDelegatedPrivilegeStatus(n.getEnumValue(DelegatedPrivilegeStatus::forValue)); });
        deserializerMap.put("lastDelegatedPrivilegeRefreshDateTime", (n) -> { this.setLastDelegatedPrivilegeRefreshDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("offboardedByUserId", (n) -> { this.setOffboardedByUserId(n.getStringValue()); });
        deserializerMap.put("offboardedDateTime", (n) -> { this.setOffboardedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("onboardedByUserId", (n) -> { this.setOnboardedByUserId(n.getStringValue()); });
        deserializerMap.put("onboardedDateTime", (n) -> { this.setOnboardedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("onboardingStatus", (n) -> { this.setOnboardingStatus(n.getEnumValue(TenantOnboardingStatus::forValue)); });
        deserializerMap.put("tenantOnboardingEligibilityReason", (n) -> { this.setTenantOnboardingEligibilityReason(n.getEnumValue(TenantOnboardingEligibilityReason::forValue)); });
        deserializerMap.put("workloadStatuses", (n) -> { this.setWorkloadStatuses(n.getCollectionOfObjectValues(WorkloadStatus::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the lastDelegatedPrivilegeRefreshDateTime property value. The date and time the delegated admin privileges status was updated. Optional. Read-only.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastDelegatedPrivilegeRefreshDateTime() {
        return this.backingStore.get("lastDelegatedPrivilegeRefreshDateTime");
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
     * Gets the offboardedByUserId property value. The identifier for the account that offboarded the managed tenant. Optional. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOffboardedByUserId() {
        return this.backingStore.get("offboardedByUserId");
    }
    /**
     * Gets the offboardedDateTime property value. The date and time when the managed tenant was offboarded. Optional. Read-only.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getOffboardedDateTime() {
        return this.backingStore.get("offboardedDateTime");
    }
    /**
     * Gets the onboardedByUserId property value. The identifier for the account that onboarded the managed tenant. Optional. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOnboardedByUserId() {
        return this.backingStore.get("onboardedByUserId");
    }
    /**
     * Gets the onboardedDateTime property value. The date and time when the managed tenant was onboarded. Optional. Read-only.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getOnboardedDateTime() {
        return this.backingStore.get("onboardedDateTime");
    }
    /**
     * Gets the onboardingStatus property value. The onboarding status for the managed tenant.. The possible values are: ineligible, inProcess, active, inactive, unknownFutureValue. Optional. Read-only.
     * @return a {@link TenantOnboardingStatus}
     */
    @jakarta.annotation.Nullable
    public TenantOnboardingStatus getOnboardingStatus() {
        return this.backingStore.get("onboardingStatus");
    }
    /**
     * Gets the tenantOnboardingEligibilityReason property value. Organization&apos;s onboarding eligibility reason in Microsoft 365 Lighthouse.. The possible values are: none, contractType, delegatedAdminPrivileges,usersCount,license and unknownFutureValue. Optional. Read-only.
     * @return a {@link TenantOnboardingEligibilityReason}
     */
    @jakarta.annotation.Nullable
    public TenantOnboardingEligibilityReason getTenantOnboardingEligibilityReason() {
        return this.backingStore.get("tenantOnboardingEligibilityReason");
    }
    /**
     * Gets the workloadStatuses property value. The collection of workload statues for the managed tenant. Optional. Read-only.
     * @return a {@link java.util.List<WorkloadStatus>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<WorkloadStatus> getWorkloadStatuses() {
        return this.backingStore.get("workloadStatuses");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("delegatedPrivilegeStatus", this.getDelegatedPrivilegeStatus());
        writer.writeOffsetDateTimeValue("lastDelegatedPrivilegeRefreshDateTime", this.getLastDelegatedPrivilegeRefreshDateTime());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("offboardedByUserId", this.getOffboardedByUserId());
        writer.writeOffsetDateTimeValue("offboardedDateTime", this.getOffboardedDateTime());
        writer.writeStringValue("onboardedByUserId", this.getOnboardedByUserId());
        writer.writeOffsetDateTimeValue("onboardedDateTime", this.getOnboardedDateTime());
        writer.writeEnumValue("onboardingStatus", this.getOnboardingStatus());
        writer.writeEnumValue("tenantOnboardingEligibilityReason", this.getTenantOnboardingEligibilityReason());
        writer.writeCollectionOfObjectValues("workloadStatuses", this.getWorkloadStatuses());
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
     * Sets the delegatedPrivilegeStatus property value. The status of the delegated admin privilege relationship between the managing entity and the managed tenant. The possible values are: none, delegatedAdminPrivileges, unknownFutureValue, granularDelegatedAdminPrivileges, delegatedAndGranularDelegetedAdminPrivileges. Use the Prefer: include-unknown-enum-members request header to get the following values from this evolvable enum: granularDelegatedAdminPrivileges , delegatedAndGranularDelegetedAdminPrivileges. Optional. Read-only.
     * @param value Value to set for the delegatedPrivilegeStatus property.
     */
    public void setDelegatedPrivilegeStatus(@jakarta.annotation.Nullable final DelegatedPrivilegeStatus value) {
        this.backingStore.set("delegatedPrivilegeStatus", value);
    }
    /**
     * Sets the lastDelegatedPrivilegeRefreshDateTime property value. The date and time the delegated admin privileges status was updated. Optional. Read-only.
     * @param value Value to set for the lastDelegatedPrivilegeRefreshDateTime property.
     */
    public void setLastDelegatedPrivilegeRefreshDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastDelegatedPrivilegeRefreshDateTime", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the offboardedByUserId property value. The identifier for the account that offboarded the managed tenant. Optional. Read-only.
     * @param value Value to set for the offboardedByUserId property.
     */
    public void setOffboardedByUserId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("offboardedByUserId", value);
    }
    /**
     * Sets the offboardedDateTime property value. The date and time when the managed tenant was offboarded. Optional. Read-only.
     * @param value Value to set for the offboardedDateTime property.
     */
    public void setOffboardedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("offboardedDateTime", value);
    }
    /**
     * Sets the onboardedByUserId property value. The identifier for the account that onboarded the managed tenant. Optional. Read-only.
     * @param value Value to set for the onboardedByUserId property.
     */
    public void setOnboardedByUserId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("onboardedByUserId", value);
    }
    /**
     * Sets the onboardedDateTime property value. The date and time when the managed tenant was onboarded. Optional. Read-only.
     * @param value Value to set for the onboardedDateTime property.
     */
    public void setOnboardedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("onboardedDateTime", value);
    }
    /**
     * Sets the onboardingStatus property value. The onboarding status for the managed tenant.. The possible values are: ineligible, inProcess, active, inactive, unknownFutureValue. Optional. Read-only.
     * @param value Value to set for the onboardingStatus property.
     */
    public void setOnboardingStatus(@jakarta.annotation.Nullable final TenantOnboardingStatus value) {
        this.backingStore.set("onboardingStatus", value);
    }
    /**
     * Sets the tenantOnboardingEligibilityReason property value. Organization&apos;s onboarding eligibility reason in Microsoft 365 Lighthouse.. The possible values are: none, contractType, delegatedAdminPrivileges,usersCount,license and unknownFutureValue. Optional. Read-only.
     * @param value Value to set for the tenantOnboardingEligibilityReason property.
     */
    public void setTenantOnboardingEligibilityReason(@jakarta.annotation.Nullable final TenantOnboardingEligibilityReason value) {
        this.backingStore.set("tenantOnboardingEligibilityReason", value);
    }
    /**
     * Sets the workloadStatuses property value. The collection of workload statues for the managed tenant. Optional. Read-only.
     * @param value Value to set for the workloadStatuses property.
     */
    public void setWorkloadStatuses(@jakarta.annotation.Nullable final java.util.List<WorkloadStatus> value) {
        this.backingStore.set("workloadStatuses", value);
    }
}
