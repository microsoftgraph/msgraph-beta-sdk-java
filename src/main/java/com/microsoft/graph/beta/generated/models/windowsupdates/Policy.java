package com.microsoft.graph.beta.models.windowsupdates;

import com.microsoft.graph.beta.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Policy extends Entity implements Parsable {
    /**
     * Instantiates a new {@link Policy} and sets the default values.
     */
    public Policy() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Policy}
     */
    @jakarta.annotation.Nonnull
    public static Policy createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.windowsUpdates.qualityUpdatePolicy": return new QualityUpdatePolicy();
            }
        }
        return new Policy();
    }
    /**
     * Gets the applicableContent property value. Represents content applicable for offering to the related collection of devices.
     * @return a {@link java.util.List<ApplicableContent>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ApplicableContent> getApplicableContent() {
        return this.backingStore.get("applicableContent");
    }
    /**
     * Gets the approvalRules property value. The approved rule of the policy that determines which published content matches the rule on an ongoing basis.
     * @return a {@link java.util.List<ApprovalRule>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ApprovalRule> getApprovalRules() {
        return this.backingStore.get("approvalRules");
    }
    /**
     * Gets the approvals property value. Represents a set of quality updates policy approval types.
     * @return a {@link java.util.List<PolicyApproval>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<PolicyApproval> getApprovals() {
        return this.backingStore.get("approvals");
    }
    /**
     * Gets the createdDateTime property value. The date and time when the policy is created. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * Gets the description property value. The policy description. The maximum length is 1,500 characters.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * Gets the displayName property value. The policy display name. The maximum length is 200 characters.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("applicableContent", (n) -> { this.setApplicableContent(n.getCollectionOfObjectValues(ApplicableContent::createFromDiscriminatorValue)); });
        deserializerMap.put("approvalRules", (n) -> { this.setApprovalRules(n.getCollectionOfObjectValues(ApprovalRule::createFromDiscriminatorValue)); });
        deserializerMap.put("approvals", (n) -> { this.setApprovals(n.getCollectionOfObjectValues(PolicyApproval::createFromDiscriminatorValue)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("rings", (n) -> { this.setRings(n.getCollectionOfObjectValues(Ring::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the lastModifiedDateTime property value. The date and time when the policy was last modified. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.backingStore.get("lastModifiedDateTime");
    }
    /**
     * Gets the rings property value. Represents a set of deployment rings that contains update deployment settings.
     * @return a {@link java.util.List<Ring>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Ring> getRings() {
        return this.backingStore.get("rings");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("applicableContent", this.getApplicableContent());
        writer.writeCollectionOfObjectValues("approvalRules", this.getApprovalRules());
        writer.writeCollectionOfObjectValues("approvals", this.getApprovals());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeCollectionOfObjectValues("rings", this.getRings());
    }
    /**
     * Sets the applicableContent property value. Represents content applicable for offering to the related collection of devices.
     * @param value Value to set for the applicableContent property.
     */
    public void setApplicableContent(@jakarta.annotation.Nullable final java.util.List<ApplicableContent> value) {
        this.backingStore.set("applicableContent", value);
    }
    /**
     * Sets the approvalRules property value. The approved rule of the policy that determines which published content matches the rule on an ongoing basis.
     * @param value Value to set for the approvalRules property.
     */
    public void setApprovalRules(@jakarta.annotation.Nullable final java.util.List<ApprovalRule> value) {
        this.backingStore.set("approvalRules", value);
    }
    /**
     * Sets the approvals property value. Represents a set of quality updates policy approval types.
     * @param value Value to set for the approvals property.
     */
    public void setApprovals(@jakarta.annotation.Nullable final java.util.List<PolicyApproval> value) {
        this.backingStore.set("approvals", value);
    }
    /**
     * Sets the createdDateTime property value. The date and time when the policy is created. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the description property value. The policy description. The maximum length is 1,500 characters.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the displayName property value. The policy display name. The maximum length is 200 characters.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the lastModifiedDateTime property value. The date and time when the policy was last modified. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastModifiedDateTime", value);
    }
    /**
     * Sets the rings property value. Represents a set of deployment rings that contains update deployment settings.
     * @param value Value to set for the rings property.
     */
    public void setRings(@jakarta.annotation.Nullable final java.util.List<Ring> value) {
        this.backingStore.set("rings", value);
    }
}
