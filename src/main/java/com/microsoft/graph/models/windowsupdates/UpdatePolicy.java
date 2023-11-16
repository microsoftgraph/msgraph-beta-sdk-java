package com.microsoft.graph.models.windowsupdates;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UpdatePolicy extends Entity implements Parsable {
    /**
     * Instantiates a new UpdatePolicy and sets the default values.
     */
    public UpdatePolicy() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a UpdatePolicy
     */
    @jakarta.annotation.Nonnull
    public static UpdatePolicy createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UpdatePolicy();
    }
    /**
     * Gets the audience property value. Specifies the audience to target.
     * @return a DeploymentAudience
     */
    @jakarta.annotation.Nullable
    public DeploymentAudience getAudience() {
        return this.BackingStore.get("audience");
    }
    /**
     * Gets the complianceChangeRules property value. Rules for governing the automatic creation of compliance changes.
     * @return a java.util.List<ComplianceChangeRule>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ComplianceChangeRule> getComplianceChangeRules() {
        return this.BackingStore.get("complianceChangeRules");
    }
    /**
     * Gets the complianceChanges property value. Compliance changes like content approvals which result in the automatic creation of deployments using the audience and deploymentSettings of the policy.
     * @return a java.util.List<ComplianceChange>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ComplianceChange> getComplianceChanges() {
        return this.BackingStore.get("complianceChanges");
    }
    /**
     * Gets the createdDateTime property value. The date and time when the update policy was created. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.BackingStore.get("createdDateTime");
    }
    /**
     * Gets the deploymentSettings property value. Settings for governing how to deploy content.
     * @return a DeploymentSettings
     */
    @jakarta.annotation.Nullable
    public DeploymentSettings getDeploymentSettings() {
        return this.BackingStore.get("deploymentSettings");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("audience", (n) -> { this.setAudience(n.getObjectValue(DeploymentAudience::createFromDiscriminatorValue)); });
        deserializerMap.put("complianceChangeRules", (n) -> { this.setComplianceChangeRules(n.getCollectionOfObjectValues(ComplianceChangeRule::createFromDiscriminatorValue)); });
        deserializerMap.put("complianceChanges", (n) -> { this.setComplianceChanges(n.getCollectionOfObjectValues(ComplianceChange::createFromDiscriminatorValue)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("deploymentSettings", (n) -> { this.setDeploymentSettings(n.getObjectValue(DeploymentSettings::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("audience", this.getAudience());
        writer.writeCollectionOfObjectValues("complianceChangeRules", this.getComplianceChangeRules());
        writer.writeCollectionOfObjectValues("complianceChanges", this.getComplianceChanges());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeObjectValue("deploymentSettings", this.getDeploymentSettings());
    }
    /**
     * Sets the audience property value. Specifies the audience to target.
     * @param value Value to set for the audience property.
     */
    public void setAudience(@jakarta.annotation.Nullable final DeploymentAudience value) {
        this.BackingStore.set("audience", value);
    }
    /**
     * Sets the complianceChangeRules property value. Rules for governing the automatic creation of compliance changes.
     * @param value Value to set for the complianceChangeRules property.
     */
    public void setComplianceChangeRules(@jakarta.annotation.Nullable final java.util.List<ComplianceChangeRule> value) {
        this.BackingStore.set("complianceChangeRules", value);
    }
    /**
     * Sets the complianceChanges property value. Compliance changes like content approvals which result in the automatic creation of deployments using the audience and deploymentSettings of the policy.
     * @param value Value to set for the complianceChanges property.
     */
    public void setComplianceChanges(@jakarta.annotation.Nullable final java.util.List<ComplianceChange> value) {
        this.BackingStore.set("complianceChanges", value);
    }
    /**
     * Sets the createdDateTime property value. The date and time when the update policy was created. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.BackingStore.set("createdDateTime", value);
    }
    /**
     * Sets the deploymentSettings property value. Settings for governing how to deploy content.
     * @param value Value to set for the deploymentSettings property.
     */
    public void setDeploymentSettings(@jakarta.annotation.Nullable final DeploymentSettings value) {
        this.BackingStore.set("deploymentSettings", value);
    }
}
