package microsoft.graph.models.managedtenants;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import microsoft.graph.models.Entity;
/** Provides operations to manage the collection of accessReview entities. */
public class AggregatedPolicyCompliance extends Entity implements Parsable {
    /** Identifier for the device compliance policy. Optional. Read-only. */
    private String _compliancePolicyId;
    /** Name of the device compliance policy. Optional. Read-only. */
    private String _compliancePolicyName;
    /** Platform for the device compliance policy. Possible values are: android, androidForWork, iOS, macOS, windowsPhone81, windows81AndLater, windows10AndLater, androidWorkProfile, androidAOSP, all. Optional. Read-only. */
    private String _compliancePolicyPlatform;
    /** The type of compliance policy. Optional. Read-only. */
    private String _compliancePolicyType;
    /** Date and time the entity was last updated in the multi-tenant management platform. Optional. Read-only. */
    private OffsetDateTime _lastRefreshedDateTime;
    /** The number of devices that are in a compliant status. Optional. Read-only. */
    private Long _numberOfCompliantDevices;
    /** The number of devices that are in an error status. Optional. Read-only. */
    private Long _numberOfErrorDevices;
    /** The number of device that are in a non-compliant status. Optional. Read-only. */
    private Long _numberOfNonCompliantDevices;
    /** The date and time the device policy was last modified. Optional. Read-only. */
    private OffsetDateTime _policyModifiedDateTime;
    /** The display name for the managed tenant. Optional. Read-only. */
    private String _tenantDisplayName;
    /** The Azure Active Directory tenant identifier for the managed tenant. Optional. Read-only. */
    private String _tenantId;
    /**
     * Instantiates a new aggregatedPolicyCompliance and sets the default values.
     * @return a void
     */
    public AggregatedPolicyCompliance() {
        super();
        this.setOdataType("#microsoft.graph.managedTenants.aggregatedPolicyCompliance");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a aggregatedPolicyCompliance
     */
    @javax.annotation.Nonnull
    public static AggregatedPolicyCompliance createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AggregatedPolicyCompliance();
    }
    /**
     * Gets the compliancePolicyId property value. Identifier for the device compliance policy. Optional. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCompliancePolicyId() {
        return this._compliancePolicyId;
    }
    /**
     * Gets the compliancePolicyName property value. Name of the device compliance policy. Optional. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCompliancePolicyName() {
        return this._compliancePolicyName;
    }
    /**
     * Gets the compliancePolicyPlatform property value. Platform for the device compliance policy. Possible values are: android, androidForWork, iOS, macOS, windowsPhone81, windows81AndLater, windows10AndLater, androidWorkProfile, androidAOSP, all. Optional. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCompliancePolicyPlatform() {
        return this._compliancePolicyPlatform;
    }
    /**
     * Gets the compliancePolicyType property value. The type of compliance policy. Optional. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCompliancePolicyType() {
        return this._compliancePolicyType;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AggregatedPolicyCompliance currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("compliancePolicyId", (n) -> { currentObject.setCompliancePolicyId(n.getStringValue()); });
            this.put("compliancePolicyName", (n) -> { currentObject.setCompliancePolicyName(n.getStringValue()); });
            this.put("compliancePolicyPlatform", (n) -> { currentObject.setCompliancePolicyPlatform(n.getStringValue()); });
            this.put("compliancePolicyType", (n) -> { currentObject.setCompliancePolicyType(n.getStringValue()); });
            this.put("lastRefreshedDateTime", (n) -> { currentObject.setLastRefreshedDateTime(n.getOffsetDateTimeValue()); });
            this.put("numberOfCompliantDevices", (n) -> { currentObject.setNumberOfCompliantDevices(n.getLongValue()); });
            this.put("numberOfErrorDevices", (n) -> { currentObject.setNumberOfErrorDevices(n.getLongValue()); });
            this.put("numberOfNonCompliantDevices", (n) -> { currentObject.setNumberOfNonCompliantDevices(n.getLongValue()); });
            this.put("policyModifiedDateTime", (n) -> { currentObject.setPolicyModifiedDateTime(n.getOffsetDateTimeValue()); });
            this.put("tenantDisplayName", (n) -> { currentObject.setTenantDisplayName(n.getStringValue()); });
            this.put("tenantId", (n) -> { currentObject.setTenantId(n.getStringValue()); });
        }};
    }
    /**
     * Gets the lastRefreshedDateTime property value. Date and time the entity was last updated in the multi-tenant management platform. Optional. Read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastRefreshedDateTime() {
        return this._lastRefreshedDateTime;
    }
    /**
     * Gets the numberOfCompliantDevices property value. The number of devices that are in a compliant status. Optional. Read-only.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getNumberOfCompliantDevices() {
        return this._numberOfCompliantDevices;
    }
    /**
     * Gets the numberOfErrorDevices property value. The number of devices that are in an error status. Optional. Read-only.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getNumberOfErrorDevices() {
        return this._numberOfErrorDevices;
    }
    /**
     * Gets the numberOfNonCompliantDevices property value. The number of device that are in a non-compliant status. Optional. Read-only.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getNumberOfNonCompliantDevices() {
        return this._numberOfNonCompliantDevices;
    }
    /**
     * Gets the policyModifiedDateTime property value. The date and time the device policy was last modified. Optional. Read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getPolicyModifiedDateTime() {
        return this._policyModifiedDateTime;
    }
    /**
     * Gets the tenantDisplayName property value. The display name for the managed tenant. Optional. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTenantDisplayName() {
        return this._tenantDisplayName;
    }
    /**
     * Gets the tenantId property value. The Azure Active Directory tenant identifier for the managed tenant. Optional. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTenantId() {
        return this._tenantId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("compliancePolicyId", this.getCompliancePolicyId());
        writer.writeStringValue("compliancePolicyName", this.getCompliancePolicyName());
        writer.writeStringValue("compliancePolicyPlatform", this.getCompliancePolicyPlatform());
        writer.writeStringValue("compliancePolicyType", this.getCompliancePolicyType());
        writer.writeOffsetDateTimeValue("lastRefreshedDateTime", this.getLastRefreshedDateTime());
        writer.writeLongValue("numberOfCompliantDevices", this.getNumberOfCompliantDevices());
        writer.writeLongValue("numberOfErrorDevices", this.getNumberOfErrorDevices());
        writer.writeLongValue("numberOfNonCompliantDevices", this.getNumberOfNonCompliantDevices());
        writer.writeOffsetDateTimeValue("policyModifiedDateTime", this.getPolicyModifiedDateTime());
        writer.writeStringValue("tenantDisplayName", this.getTenantDisplayName());
        writer.writeStringValue("tenantId", this.getTenantId());
    }
    /**
     * Sets the compliancePolicyId property value. Identifier for the device compliance policy. Optional. Read-only.
     * @param value Value to set for the compliancePolicyId property.
     * @return a void
     */
    public void setCompliancePolicyId(@javax.annotation.Nullable final String value) {
        this._compliancePolicyId = value;
    }
    /**
     * Sets the compliancePolicyName property value. Name of the device compliance policy. Optional. Read-only.
     * @param value Value to set for the compliancePolicyName property.
     * @return a void
     */
    public void setCompliancePolicyName(@javax.annotation.Nullable final String value) {
        this._compliancePolicyName = value;
    }
    /**
     * Sets the compliancePolicyPlatform property value. Platform for the device compliance policy. Possible values are: android, androidForWork, iOS, macOS, windowsPhone81, windows81AndLater, windows10AndLater, androidWorkProfile, androidAOSP, all. Optional. Read-only.
     * @param value Value to set for the compliancePolicyPlatform property.
     * @return a void
     */
    public void setCompliancePolicyPlatform(@javax.annotation.Nullable final String value) {
        this._compliancePolicyPlatform = value;
    }
    /**
     * Sets the compliancePolicyType property value. The type of compliance policy. Optional. Read-only.
     * @param value Value to set for the compliancePolicyType property.
     * @return a void
     */
    public void setCompliancePolicyType(@javax.annotation.Nullable final String value) {
        this._compliancePolicyType = value;
    }
    /**
     * Sets the lastRefreshedDateTime property value. Date and time the entity was last updated in the multi-tenant management platform. Optional. Read-only.
     * @param value Value to set for the lastRefreshedDateTime property.
     * @return a void
     */
    public void setLastRefreshedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastRefreshedDateTime = value;
    }
    /**
     * Sets the numberOfCompliantDevices property value. The number of devices that are in a compliant status. Optional. Read-only.
     * @param value Value to set for the numberOfCompliantDevices property.
     * @return a void
     */
    public void setNumberOfCompliantDevices(@javax.annotation.Nullable final Long value) {
        this._numberOfCompliantDevices = value;
    }
    /**
     * Sets the numberOfErrorDevices property value. The number of devices that are in an error status. Optional. Read-only.
     * @param value Value to set for the numberOfErrorDevices property.
     * @return a void
     */
    public void setNumberOfErrorDevices(@javax.annotation.Nullable final Long value) {
        this._numberOfErrorDevices = value;
    }
    /**
     * Sets the numberOfNonCompliantDevices property value. The number of device that are in a non-compliant status. Optional. Read-only.
     * @param value Value to set for the numberOfNonCompliantDevices property.
     * @return a void
     */
    public void setNumberOfNonCompliantDevices(@javax.annotation.Nullable final Long value) {
        this._numberOfNonCompliantDevices = value;
    }
    /**
     * Sets the policyModifiedDateTime property value. The date and time the device policy was last modified. Optional. Read-only.
     * @param value Value to set for the policyModifiedDateTime property.
     * @return a void
     */
    public void setPolicyModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._policyModifiedDateTime = value;
    }
    /**
     * Sets the tenantDisplayName property value. The display name for the managed tenant. Optional. Read-only.
     * @param value Value to set for the tenantDisplayName property.
     * @return a void
     */
    public void setTenantDisplayName(@javax.annotation.Nullable final String value) {
        this._tenantDisplayName = value;
    }
    /**
     * Sets the tenantId property value. The Azure Active Directory tenant identifier for the managed tenant. Optional. Read-only.
     * @param value Value to set for the tenantId property.
     * @return a void
     */
    public void setTenantId(@javax.annotation.Nullable final String value) {
        this._tenantId = value;
    }
}
