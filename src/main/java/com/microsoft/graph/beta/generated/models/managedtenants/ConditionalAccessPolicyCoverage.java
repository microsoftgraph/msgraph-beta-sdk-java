package com.microsoft.graph.beta.models.managedtenants;

import com.microsoft.graph.beta.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ConditionalAccessPolicyCoverage extends Entity implements Parsable {
    /**
     * Instantiates a new {@link ConditionalAccessPolicyCoverage} and sets the default values.
     */
    public ConditionalAccessPolicyCoverage() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ConditionalAccessPolicyCoverage}
     */
    @jakarta.annotation.Nonnull
    public static ConditionalAccessPolicyCoverage createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ConditionalAccessPolicyCoverage();
    }
    /**
     * Gets the conditionalAccessPolicyState property value. The state for the conditional access policy. Possible values are: enabled, disabled, enabledForReportingButNotEnforced. Required. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getConditionalAccessPolicyState() {
        return this.backingStore.get("conditionalAccessPolicyState");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("conditionalAccessPolicyState", (n) -> { this.setConditionalAccessPolicyState(n.getStringValue()); });
        deserializerMap.put("latestPolicyModifiedDateTime", (n) -> { this.setLatestPolicyModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("requiresDeviceCompliance", (n) -> { this.setRequiresDeviceCompliance(n.getBooleanValue()); });
        deserializerMap.put("tenantDisplayName", (n) -> { this.setTenantDisplayName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the latestPolicyModifiedDateTime property value. The date and time the conditional access policy was last modified. Required. Read-only.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLatestPolicyModifiedDateTime() {
        return this.backingStore.get("latestPolicyModifiedDateTime");
    }
    /**
     * Gets the requiresDeviceCompliance property value. A flag indicating whether the conditional access policy requires device compliance. Required. Read-only.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getRequiresDeviceCompliance() {
        return this.backingStore.get("requiresDeviceCompliance");
    }
    /**
     * Gets the tenantDisplayName property value. The display name for the managed tenant. Required. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTenantDisplayName() {
        return this.backingStore.get("tenantDisplayName");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     */
    public void setConditionalAccessPolicyState(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("conditionalAccessPolicyState", value);
    }
    /**
     * Sets the latestPolicyModifiedDateTime property value. The date and time the conditional access policy was last modified. Required. Read-only.
     * @param value Value to set for the latestPolicyModifiedDateTime property.
     */
    public void setLatestPolicyModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("latestPolicyModifiedDateTime", value);
    }
    /**
     * Sets the requiresDeviceCompliance property value. A flag indicating whether the conditional access policy requires device compliance. Required. Read-only.
     * @param value Value to set for the requiresDeviceCompliance property.
     */
    public void setRequiresDeviceCompliance(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("requiresDeviceCompliance", value);
    }
    /**
     * Sets the tenantDisplayName property value. The display name for the managed tenant. Required. Read-only.
     * @param value Value to set for the tenantDisplayName property.
     */
    public void setTenantDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("tenantDisplayName", value);
    }
}
