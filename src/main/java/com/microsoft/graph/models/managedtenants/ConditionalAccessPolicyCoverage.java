package com.microsoft.graph.models.managedtenants;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of accessReview entities. */
public class ConditionalAccessPolicyCoverage extends Entity implements Parsable {
    /** The state for the conditional access policy. Possible values are: enabled, disabled, enabledForReportingButNotEnforced. Required. Read-only. */
    private String _conditionalAccessPolicyState;
    /** The date and time the conditional access policy was last modified. Required. Read-only. */
    private OffsetDateTime _latestPolicyModifiedDateTime;
    /** A flag indicating whether the conditional access policy requires device compliance. Required. Read-only. */
    private Boolean _requiresDeviceCompliance;
    /** The display name for the managed tenant. Required. Read-only. */
    private String _tenantDisplayName;
    /**
     * Instantiates a new conditionalAccessPolicyCoverage and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ConditionalAccessPolicyCoverage() {
        super();
        this.setOdataType("#microsoft.graph.managedTenants.conditionalAccessPolicyCoverage");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a conditionalAccessPolicyCoverage
     */
    @javax.annotation.Nonnull
    public static ConditionalAccessPolicyCoverage createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ConditionalAccessPolicyCoverage();
    }
    /**
     * Gets the conditionalAccessPolicyState property value. The state for the conditional access policy. Possible values are: enabled, disabled, enabledForReportingButNotEnforced. Required. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getConditionalAccessPolicyState() {
        return this._conditionalAccessPolicyState;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ConditionalAccessPolicyCoverage currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("conditionalAccessPolicyState", (n) -> { currentObject.setConditionalAccessPolicyState(n.getStringValue()); });
            this.put("latestPolicyModifiedDateTime", (n) -> { currentObject.setLatestPolicyModifiedDateTime(n.getOffsetDateTimeValue()); });
            this.put("requiresDeviceCompliance", (n) -> { currentObject.setRequiresDeviceCompliance(n.getBooleanValue()); });
            this.put("tenantDisplayName", (n) -> { currentObject.setTenantDisplayName(n.getStringValue()); });
        }};
    }
    /**
     * Gets the latestPolicyModifiedDateTime property value. The date and time the conditional access policy was last modified. Required. Read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLatestPolicyModifiedDateTime() {
        return this._latestPolicyModifiedDateTime;
    }
    /**
     * Gets the requiresDeviceCompliance property value. A flag indicating whether the conditional access policy requires device compliance. Required. Read-only.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getRequiresDeviceCompliance() {
        return this._requiresDeviceCompliance;
    }
    /**
     * Gets the tenantDisplayName property value. The display name for the managed tenant. Required. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTenantDisplayName() {
        return this._tenantDisplayName;
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
        writer.writeStringValue("conditionalAccessPolicyState", this.getConditionalAccessPolicyState());
        writer.writeOffsetDateTimeValue("latestPolicyModifiedDateTime", this.getLatestPolicyModifiedDateTime());
        writer.writeBooleanValue("requiresDeviceCompliance", this.getRequiresDeviceCompliance());
        writer.writeStringValue("tenantDisplayName", this.getTenantDisplayName());
    }
    /**
     * Sets the conditionalAccessPolicyState property value. The state for the conditional access policy. Possible values are: enabled, disabled, enabledForReportingButNotEnforced. Required. Read-only.
     * @param value Value to set for the conditionalAccessPolicyState property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setConditionalAccessPolicyState(@javax.annotation.Nullable final String value) {
        this._conditionalAccessPolicyState = value;
    }
    /**
     * Sets the latestPolicyModifiedDateTime property value. The date and time the conditional access policy was last modified. Required. Read-only.
     * @param value Value to set for the latestPolicyModifiedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLatestPolicyModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._latestPolicyModifiedDateTime = value;
    }
    /**
     * Sets the requiresDeviceCompliance property value. A flag indicating whether the conditional access policy requires device compliance. Required. Read-only.
     * @param value Value to set for the requiresDeviceCompliance property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRequiresDeviceCompliance(@javax.annotation.Nullable final Boolean value) {
        this._requiresDeviceCompliance = value;
    }
    /**
     * Sets the tenantDisplayName property value. The display name for the managed tenant. Required. Read-only.
     * @param value Value to set for the tenantDisplayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTenantDisplayName(@javax.annotation.Nullable final String value) {
        this._tenantDisplayName = value;
    }
}
