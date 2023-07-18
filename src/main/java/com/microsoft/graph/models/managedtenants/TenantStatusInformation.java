package com.microsoft.graph.models.managedtenants;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class TenantStatusInformation implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The status of the delegated admin privilege relationship between the managing entity and the managed tenant. Possible values are: none, delegatedAdminPrivileges, unknownFutureValue, granularDelegatedAdminPrivileges, delegatedAndGranularDelegetedAdminPrivileges. Note that you must use the Prefer: include-unknown-enum-members request header to get the following values from this evolvable enum: granularDelegatedAdminPrivileges , delegatedAndGranularDelegetedAdminPrivileges. Optional. Read-only.
     */
    private DelegatedPrivilegeStatus delegatedPrivilegeStatus;
    /**
     * The date and time the delegated admin privileges status was updated. Optional. Read-only.
     */
    private OffsetDateTime lastDelegatedPrivilegeRefreshDateTime;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The identifier for the account that offboarded the managed tenant. Optional. Read-only.
     */
    private String offboardedByUserId;
    /**
     * The date and time when the managed tenant was offboarded. Optional. Read-only.
     */
    private OffsetDateTime offboardedDateTime;
    /**
     * The identifier for the account that onboarded the managed tenant. Optional. Read-only.
     */
    private String onboardedByUserId;
    /**
     * The date and time when the managed tenant was onboarded. Optional. Read-only.
     */
    private OffsetDateTime onboardedDateTime;
    /**
     * The onboarding status for the managed tenant.. Possible values are: ineligible, inProcess, active, inactive, unknownFutureValue. Optional. Read-only.
     */
    private TenantOnboardingStatus onboardingStatus;
    /**
     * Organization's onboarding eligibility reason in Microsoft 365 Lighthouse.. Possible values are: none, contractType, delegatedAdminPrivileges,usersCount,license and unknownFutureValue. Optional. Read-only.
     */
    private TenantOnboardingEligibilityReason tenantOnboardingEligibilityReason;
    /**
     * The collection of workload statues for the managed tenant. Optional. Read-only.
     */
    private java.util.List<WorkloadStatus> workloadStatuses;
    /**
     * Instantiates a new tenantStatusInformation and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public TenantStatusInformation() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a tenantStatusInformation
     */
    @javax.annotation.Nonnull
    public static TenantStatusInformation createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TenantStatusInformation();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the delegatedPrivilegeStatus property value. The status of the delegated admin privilege relationship between the managing entity and the managed tenant. Possible values are: none, delegatedAdminPrivileges, unknownFutureValue, granularDelegatedAdminPrivileges, delegatedAndGranularDelegetedAdminPrivileges. Note that you must use the Prefer: include-unknown-enum-members request header to get the following values from this evolvable enum: granularDelegatedAdminPrivileges , delegatedAndGranularDelegetedAdminPrivileges. Optional. Read-only.
     * @return a delegatedPrivilegeStatus
     */
    @javax.annotation.Nullable
    public DelegatedPrivilegeStatus getDelegatedPrivilegeStatus() {
        return this.delegatedPrivilegeStatus;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(10);
        deserializerMap.put("delegatedPrivilegeStatus", (n) -> { this.setDelegatedPrivilegeStatus(n.getEnumValue(DelegatedPrivilegeStatus.class)); });
        deserializerMap.put("lastDelegatedPrivilegeRefreshDateTime", (n) -> { this.setLastDelegatedPrivilegeRefreshDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("offboardedByUserId", (n) -> { this.setOffboardedByUserId(n.getStringValue()); });
        deserializerMap.put("offboardedDateTime", (n) -> { this.setOffboardedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("onboardedByUserId", (n) -> { this.setOnboardedByUserId(n.getStringValue()); });
        deserializerMap.put("onboardedDateTime", (n) -> { this.setOnboardedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("onboardingStatus", (n) -> { this.setOnboardingStatus(n.getEnumValue(TenantOnboardingStatus.class)); });
        deserializerMap.put("tenantOnboardingEligibilityReason", (n) -> { this.setTenantOnboardingEligibilityReason(n.getEnumValue(TenantOnboardingEligibilityReason.class)); });
        deserializerMap.put("workloadStatuses", (n) -> { this.setWorkloadStatuses(n.getCollectionOfObjectValues(WorkloadStatus::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the lastDelegatedPrivilegeRefreshDateTime property value. The date and time the delegated admin privileges status was updated. Optional. Read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastDelegatedPrivilegeRefreshDateTime() {
        return this.lastDelegatedPrivilegeRefreshDateTime;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the offboardedByUserId property value. The identifier for the account that offboarded the managed tenant. Optional. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOffboardedByUserId() {
        return this.offboardedByUserId;
    }
    /**
     * Gets the offboardedDateTime property value. The date and time when the managed tenant was offboarded. Optional. Read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getOffboardedDateTime() {
        return this.offboardedDateTime;
    }
    /**
     * Gets the onboardedByUserId property value. The identifier for the account that onboarded the managed tenant. Optional. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOnboardedByUserId() {
        return this.onboardedByUserId;
    }
    /**
     * Gets the onboardedDateTime property value. The date and time when the managed tenant was onboarded. Optional. Read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getOnboardedDateTime() {
        return this.onboardedDateTime;
    }
    /**
     * Gets the onboardingStatus property value. The onboarding status for the managed tenant.. Possible values are: ineligible, inProcess, active, inactive, unknownFutureValue. Optional. Read-only.
     * @return a tenantOnboardingStatus
     */
    @javax.annotation.Nullable
    public TenantOnboardingStatus getOnboardingStatus() {
        return this.onboardingStatus;
    }
    /**
     * Gets the tenantOnboardingEligibilityReason property value. Organization's onboarding eligibility reason in Microsoft 365 Lighthouse.. Possible values are: none, contractType, delegatedAdminPrivileges,usersCount,license and unknownFutureValue. Optional. Read-only.
     * @return a tenantOnboardingEligibilityReason
     */
    @javax.annotation.Nullable
    public TenantOnboardingEligibilityReason getTenantOnboardingEligibilityReason() {
        return this.tenantOnboardingEligibilityReason;
    }
    /**
     * Gets the workloadStatuses property value. The collection of workload statues for the managed tenant. Optional. Read-only.
     * @return a workloadStatus
     */
    @javax.annotation.Nullable
    public java.util.List<WorkloadStatus> getWorkloadStatuses() {
        return this.workloadStatuses;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the delegatedPrivilegeStatus property value. The status of the delegated admin privilege relationship between the managing entity and the managed tenant. Possible values are: none, delegatedAdminPrivileges, unknownFutureValue, granularDelegatedAdminPrivileges, delegatedAndGranularDelegetedAdminPrivileges. Note that you must use the Prefer: include-unknown-enum-members request header to get the following values from this evolvable enum: granularDelegatedAdminPrivileges , delegatedAndGranularDelegetedAdminPrivileges. Optional. Read-only.
     * @param value Value to set for the delegatedPrivilegeStatus property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDelegatedPrivilegeStatus(@javax.annotation.Nullable final DelegatedPrivilegeStatus value) {
        this.delegatedPrivilegeStatus = value;
    }
    /**
     * Sets the lastDelegatedPrivilegeRefreshDateTime property value. The date and time the delegated admin privileges status was updated. Optional. Read-only.
     * @param value Value to set for the lastDelegatedPrivilegeRefreshDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastDelegatedPrivilegeRefreshDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.lastDelegatedPrivilegeRefreshDateTime = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the offboardedByUserId property value. The identifier for the account that offboarded the managed tenant. Optional. Read-only.
     * @param value Value to set for the offboardedByUserId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOffboardedByUserId(@javax.annotation.Nullable final String value) {
        this.offboardedByUserId = value;
    }
    /**
     * Sets the offboardedDateTime property value. The date and time when the managed tenant was offboarded. Optional. Read-only.
     * @param value Value to set for the offboardedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOffboardedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.offboardedDateTime = value;
    }
    /**
     * Sets the onboardedByUserId property value. The identifier for the account that onboarded the managed tenant. Optional. Read-only.
     * @param value Value to set for the onboardedByUserId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOnboardedByUserId(@javax.annotation.Nullable final String value) {
        this.onboardedByUserId = value;
    }
    /**
     * Sets the onboardedDateTime property value. The date and time when the managed tenant was onboarded. Optional. Read-only.
     * @param value Value to set for the onboardedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOnboardedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.onboardedDateTime = value;
    }
    /**
     * Sets the onboardingStatus property value. The onboarding status for the managed tenant.. Possible values are: ineligible, inProcess, active, inactive, unknownFutureValue. Optional. Read-only.
     * @param value Value to set for the onboardingStatus property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOnboardingStatus(@javax.annotation.Nullable final TenantOnboardingStatus value) {
        this.onboardingStatus = value;
    }
    /**
     * Sets the tenantOnboardingEligibilityReason property value. Organization's onboarding eligibility reason in Microsoft 365 Lighthouse.. Possible values are: none, contractType, delegatedAdminPrivileges,usersCount,license and unknownFutureValue. Optional. Read-only.
     * @param value Value to set for the tenantOnboardingEligibilityReason property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTenantOnboardingEligibilityReason(@javax.annotation.Nullable final TenantOnboardingEligibilityReason value) {
        this.tenantOnboardingEligibilityReason = value;
    }
    /**
     * Sets the workloadStatuses property value. The collection of workload statues for the managed tenant. Optional. Read-only.
     * @param value Value to set for the workloadStatuses property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWorkloadStatuses(@javax.annotation.Nullable final java.util.List<WorkloadStatus> value) {
        this.workloadStatuses = value;
    }
}
