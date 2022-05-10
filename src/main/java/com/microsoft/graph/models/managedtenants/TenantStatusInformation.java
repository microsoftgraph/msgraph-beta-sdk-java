package microsoft.graph.models.managedtenants;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class TenantStatusInformation implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The status of the delegated admin privilege relationship between the managing entity and the managed tenant. Possible values are: none, delegatedAdminPrivileges, unknownFutureValue. Optional. Read-only. */
    private DelegatedPrivilegeStatus _delegatedPrivilegeStatus;
    /** The date and time the delegated admin privileges status was updated. Optional. Read-only. */
    private OffsetDateTime _lastDelegatedPrivilegeRefreshDateTime;
    /** The identifier for the account that offboarded the managed tenant. Optional. Read-only. */
    private String _offboardedByUserId;
    /** The date and time when the managed tenant was offboarded. Optional. Read-only. */
    private OffsetDateTime _offboardedDateTime;
    /** The identifier for the account that onboarded the managed tenant. Optional. Read-only. */
    private String _onboardedByUserId;
    /** The date and time when the managed tenant was onboarded. Optional. Read-only. */
    private OffsetDateTime _onboardedDateTime;
    /** The onboarding status for the managed tenant.. Possible values are: ineligible, inProcess, active, inactive, unknownFutureValue. Optional. Read-only. */
    private TenantOnboardingStatus _onboardingStatus;
    /** Organization's onboarding eligibility reason in Microsoft 365 Lighthouse.. Possible values are: none, contractType, delegatedAdminPrivileges,usersCount,license and unknownFutureValue. Optional. Read-only. */
    private TenantOnboardingEligibilityReason _tenantOnboardingEligibilityReason;
    /** The collection of workload statues for the managed tenant. Optional. Read-only. */
    private java.util.List<WorkloadStatus> _workloadStatuses;
    /**
     * Instantiates a new tenantStatusInformation and sets the default values.
     * @return a void
     */
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
        return this._additionalData;
    }
    /**
     * Gets the delegatedPrivilegeStatus property value. The status of the delegated admin privilege relationship between the managing entity and the managed tenant. Possible values are: none, delegatedAdminPrivileges, unknownFutureValue. Optional. Read-only.
     * @return a delegatedPrivilegeStatus
     */
    @javax.annotation.Nullable
    public DelegatedPrivilegeStatus getDelegatedPrivilegeStatus() {
        return this._delegatedPrivilegeStatus;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final TenantStatusInformation currentObject = this;
        return new HashMap<>(9) {{
            this.put("delegatedPrivilegeStatus", (n) -> { currentObject.setDelegatedPrivilegeStatus(n.getEnumValue(DelegatedPrivilegeStatus.class)); });
            this.put("lastDelegatedPrivilegeRefreshDateTime", (n) -> { currentObject.setLastDelegatedPrivilegeRefreshDateTime(n.getOffsetDateTimeValue()); });
            this.put("offboardedByUserId", (n) -> { currentObject.setOffboardedByUserId(n.getStringValue()); });
            this.put("offboardedDateTime", (n) -> { currentObject.setOffboardedDateTime(n.getOffsetDateTimeValue()); });
            this.put("onboardedByUserId", (n) -> { currentObject.setOnboardedByUserId(n.getStringValue()); });
            this.put("onboardedDateTime", (n) -> { currentObject.setOnboardedDateTime(n.getOffsetDateTimeValue()); });
            this.put("onboardingStatus", (n) -> { currentObject.setOnboardingStatus(n.getEnumValue(TenantOnboardingStatus.class)); });
            this.put("tenantOnboardingEligibilityReason", (n) -> { currentObject.setTenantOnboardingEligibilityReason(n.getEnumValue(TenantOnboardingEligibilityReason.class)); });
            this.put("workloadStatuses", (n) -> { currentObject.setWorkloadStatuses(n.getCollectionOfObjectValues(WorkloadStatus::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the lastDelegatedPrivilegeRefreshDateTime property value. The date and time the delegated admin privileges status was updated. Optional. Read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastDelegatedPrivilegeRefreshDateTime() {
        return this._lastDelegatedPrivilegeRefreshDateTime;
    }
    /**
     * Gets the offboardedByUserId property value. The identifier for the account that offboarded the managed tenant. Optional. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOffboardedByUserId() {
        return this._offboardedByUserId;
    }
    /**
     * Gets the offboardedDateTime property value. The date and time when the managed tenant was offboarded. Optional. Read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getOffboardedDateTime() {
        return this._offboardedDateTime;
    }
    /**
     * Gets the onboardedByUserId property value. The identifier for the account that onboarded the managed tenant. Optional. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOnboardedByUserId() {
        return this._onboardedByUserId;
    }
    /**
     * Gets the onboardedDateTime property value. The date and time when the managed tenant was onboarded. Optional. Read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getOnboardedDateTime() {
        return this._onboardedDateTime;
    }
    /**
     * Gets the onboardingStatus property value. The onboarding status for the managed tenant.. Possible values are: ineligible, inProcess, active, inactive, unknownFutureValue. Optional. Read-only.
     * @return a tenantOnboardingStatus
     */
    @javax.annotation.Nullable
    public TenantOnboardingStatus getOnboardingStatus() {
        return this._onboardingStatus;
    }
    /**
     * Gets the tenantOnboardingEligibilityReason property value. Organization's onboarding eligibility reason in Microsoft 365 Lighthouse.. Possible values are: none, contractType, delegatedAdminPrivileges,usersCount,license and unknownFutureValue. Optional. Read-only.
     * @return a tenantOnboardingEligibilityReason
     */
    @javax.annotation.Nullable
    public TenantOnboardingEligibilityReason getTenantOnboardingEligibilityReason() {
        return this._tenantOnboardingEligibilityReason;
    }
    /**
     * Gets the workloadStatuses property value. The collection of workload statues for the managed tenant. Optional. Read-only.
     * @return a workloadStatus
     */
    @javax.annotation.Nullable
    public java.util.List<WorkloadStatus> getWorkloadStatuses() {
        return this._workloadStatuses;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("delegatedPrivilegeStatus", this.getDelegatedPrivilegeStatus());
        writer.writeOffsetDateTimeValue("lastDelegatedPrivilegeRefreshDateTime", this.getLastDelegatedPrivilegeRefreshDateTime());
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
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the delegatedPrivilegeStatus property value. The status of the delegated admin privilege relationship between the managing entity and the managed tenant. Possible values are: none, delegatedAdminPrivileges, unknownFutureValue. Optional. Read-only.
     * @param value Value to set for the delegatedPrivilegeStatus property.
     * @return a void
     */
    public void setDelegatedPrivilegeStatus(@javax.annotation.Nullable final DelegatedPrivilegeStatus value) {
        this._delegatedPrivilegeStatus = value;
    }
    /**
     * Sets the lastDelegatedPrivilegeRefreshDateTime property value. The date and time the delegated admin privileges status was updated. Optional. Read-only.
     * @param value Value to set for the lastDelegatedPrivilegeRefreshDateTime property.
     * @return a void
     */
    public void setLastDelegatedPrivilegeRefreshDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastDelegatedPrivilegeRefreshDateTime = value;
    }
    /**
     * Sets the offboardedByUserId property value. The identifier for the account that offboarded the managed tenant. Optional. Read-only.
     * @param value Value to set for the offboardedByUserId property.
     * @return a void
     */
    public void setOffboardedByUserId(@javax.annotation.Nullable final String value) {
        this._offboardedByUserId = value;
    }
    /**
     * Sets the offboardedDateTime property value. The date and time when the managed tenant was offboarded. Optional. Read-only.
     * @param value Value to set for the offboardedDateTime property.
     * @return a void
     */
    public void setOffboardedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._offboardedDateTime = value;
    }
    /**
     * Sets the onboardedByUserId property value. The identifier for the account that onboarded the managed tenant. Optional. Read-only.
     * @param value Value to set for the onboardedByUserId property.
     * @return a void
     */
    public void setOnboardedByUserId(@javax.annotation.Nullable final String value) {
        this._onboardedByUserId = value;
    }
    /**
     * Sets the onboardedDateTime property value. The date and time when the managed tenant was onboarded. Optional. Read-only.
     * @param value Value to set for the onboardedDateTime property.
     * @return a void
     */
    public void setOnboardedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._onboardedDateTime = value;
    }
    /**
     * Sets the onboardingStatus property value. The onboarding status for the managed tenant.. Possible values are: ineligible, inProcess, active, inactive, unknownFutureValue. Optional. Read-only.
     * @param value Value to set for the onboardingStatus property.
     * @return a void
     */
    public void setOnboardingStatus(@javax.annotation.Nullable final TenantOnboardingStatus value) {
        this._onboardingStatus = value;
    }
    /**
     * Sets the tenantOnboardingEligibilityReason property value. Organization's onboarding eligibility reason in Microsoft 365 Lighthouse.. Possible values are: none, contractType, delegatedAdminPrivileges,usersCount,license and unknownFutureValue. Optional. Read-only.
     * @param value Value to set for the tenantOnboardingEligibilityReason property.
     * @return a void
     */
    public void setTenantOnboardingEligibilityReason(@javax.annotation.Nullable final TenantOnboardingEligibilityReason value) {
        this._tenantOnboardingEligibilityReason = value;
    }
    /**
     * Sets the workloadStatuses property value. The collection of workload statues for the managed tenant. Optional. Read-only.
     * @param value Value to set for the workloadStatuses property.
     * @return a void
     */
    public void setWorkloadStatuses(@javax.annotation.Nullable final java.util.List<WorkloadStatus> value) {
        this._workloadStatuses = value;
    }
}
