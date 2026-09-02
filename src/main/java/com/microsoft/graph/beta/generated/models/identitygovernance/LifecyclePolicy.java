package com.microsoft.graph.beta.models.identitygovernance;

import com.microsoft.graph.beta.models.DirectoryObject;
import com.microsoft.graph.beta.models.Entity;
import com.microsoft.graph.beta.models.SubjectSet;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class LifecyclePolicy extends Entity implements Parsable {
    /**
     * Instantiates a new {@link LifecyclePolicy} and sets the default values.
     */
    public LifecyclePolicy() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link LifecyclePolicy}
     */
    @jakarta.annotation.Nonnull
    public static LifecyclePolicy createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.identityGovernance.agentIdentityLifecyclePolicy": return new AgentIdentityLifecyclePolicy();
            }
        }
        return new LifecyclePolicy();
    }
    /**
     * Gets the createdBy property value. The createdBy property
     * @return a {@link DirectoryObject}
     */
    @jakarta.annotation.Nullable
    public DirectoryObject getCreatedBy() {
        return this.backingStore.get("createdBy");
    }
    /**
     * Gets the createdDateTime property value. The createdDateTime property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * Gets the description property value. The description property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * Gets the displayName property value. The displayName property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * Gets the enforcementAction property value. The enforcementAction property
     * @return a {@link LifecyclePolicyEnforcementAction}
     */
    @jakarta.annotation.Nullable
    public LifecyclePolicyEnforcementAction getEnforcementAction() {
        return this.backingStore.get("enforcementAction");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("createdBy", (n) -> { this.setCreatedBy(n.getObjectValue(DirectoryObject::createFromDiscriminatorValue)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("enforcementAction", (n) -> { this.setEnforcementAction(n.getObjectValue(LifecyclePolicyEnforcementAction::createFromDiscriminatorValue)); });
        deserializerMap.put("gracePeriodInDays", (n) -> { this.setGracePeriodInDays(n.getIntegerValue()); });
        deserializerMap.put("isEnabled", (n) -> { this.setIsEnabled(n.getBooleanValue()); });
        deserializerMap.put("lastModifiedBy", (n) -> { this.setLastModifiedBy(n.getObjectValue(DirectoryObject::createFromDiscriminatorValue)); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("notificationSchedule", (n) -> { this.setNotificationSchedule(n.getObjectValue(LifecyclePolicyNotificationSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("policySource", (n) -> { this.setPolicySource(n.getEnumValue(LifecyclePolicySource::forValue)); });
        deserializerMap.put("rules", (n) -> { this.setRules(n.getCollectionOfObjectValues(LifecyclePolicyRule::createFromDiscriminatorValue)); });
        deserializerMap.put("scope", (n) -> { this.setScope(n.getObjectValue(SubjectSet::createFromDiscriminatorValue)); });
        deserializerMap.put("versionNumber", (n) -> { this.setVersionNumber(n.getIntegerValue()); });
        deserializerMap.put("versions", (n) -> { this.setVersions(n.getCollectionOfObjectValues(LifecyclePolicy::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the gracePeriodInDays property value. The gracePeriodInDays property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getGracePeriodInDays() {
        return this.backingStore.get("gracePeriodInDays");
    }
    /**
     * Gets the isEnabled property value. The isEnabled property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsEnabled() {
        return this.backingStore.get("isEnabled");
    }
    /**
     * Gets the lastModifiedBy property value. The lastModifiedBy property
     * @return a {@link DirectoryObject}
     */
    @jakarta.annotation.Nullable
    public DirectoryObject getLastModifiedBy() {
        return this.backingStore.get("lastModifiedBy");
    }
    /**
     * Gets the lastModifiedDateTime property value. The lastModifiedDateTime property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.backingStore.get("lastModifiedDateTime");
    }
    /**
     * Gets the notificationSchedule property value. The notificationSchedule property
     * @return a {@link LifecyclePolicyNotificationSettings}
     */
    @jakarta.annotation.Nullable
    public LifecyclePolicyNotificationSettings getNotificationSchedule() {
        return this.backingStore.get("notificationSchedule");
    }
    /**
     * Gets the policySource property value. The policySource property
     * @return a {@link LifecyclePolicySource}
     */
    @jakarta.annotation.Nullable
    public LifecyclePolicySource getPolicySource() {
        return this.backingStore.get("policySource");
    }
    /**
     * Gets the rules property value. The rules property
     * @return a {@link java.util.List<LifecyclePolicyRule>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<LifecyclePolicyRule> getRules() {
        return this.backingStore.get("rules");
    }
    /**
     * Gets the scope property value. The scope property
     * @return a {@link SubjectSet}
     */
    @jakarta.annotation.Nullable
    public SubjectSet getScope() {
        return this.backingStore.get("scope");
    }
    /**
     * Gets the versionNumber property value. The versionNumber property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getVersionNumber() {
        return this.backingStore.get("versionNumber");
    }
    /**
     * Gets the versions property value. The versions property
     * @return a {@link java.util.List<LifecyclePolicy>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<LifecyclePolicy> getVersions() {
        return this.backingStore.get("versions");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("createdBy", this.getCreatedBy());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeObjectValue("enforcementAction", this.getEnforcementAction());
        writer.writeIntegerValue("gracePeriodInDays", this.getGracePeriodInDays());
        writer.writeBooleanValue("isEnabled", this.getIsEnabled());
        writer.writeObjectValue("lastModifiedBy", this.getLastModifiedBy());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeObjectValue("notificationSchedule", this.getNotificationSchedule());
        writer.writeEnumValue("policySource", this.getPolicySource());
        writer.writeCollectionOfObjectValues("rules", this.getRules());
        writer.writeObjectValue("scope", this.getScope());
        writer.writeIntegerValue("versionNumber", this.getVersionNumber());
        writer.writeCollectionOfObjectValues("versions", this.getVersions());
    }
    /**
     * Sets the createdBy property value. The createdBy property
     * @param value Value to set for the createdBy property.
     */
    public void setCreatedBy(@jakarta.annotation.Nullable final DirectoryObject value) {
        this.backingStore.set("createdBy", value);
    }
    /**
     * Sets the createdDateTime property value. The createdDateTime property
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the description property value. The description property
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the displayName property value. The displayName property
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the enforcementAction property value. The enforcementAction property
     * @param value Value to set for the enforcementAction property.
     */
    public void setEnforcementAction(@jakarta.annotation.Nullable final LifecyclePolicyEnforcementAction value) {
        this.backingStore.set("enforcementAction", value);
    }
    /**
     * Sets the gracePeriodInDays property value. The gracePeriodInDays property
     * @param value Value to set for the gracePeriodInDays property.
     */
    public void setGracePeriodInDays(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("gracePeriodInDays", value);
    }
    /**
     * Sets the isEnabled property value. The isEnabled property
     * @param value Value to set for the isEnabled property.
     */
    public void setIsEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isEnabled", value);
    }
    /**
     * Sets the lastModifiedBy property value. The lastModifiedBy property
     * @param value Value to set for the lastModifiedBy property.
     */
    public void setLastModifiedBy(@jakarta.annotation.Nullable final DirectoryObject value) {
        this.backingStore.set("lastModifiedBy", value);
    }
    /**
     * Sets the lastModifiedDateTime property value. The lastModifiedDateTime property
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastModifiedDateTime", value);
    }
    /**
     * Sets the notificationSchedule property value. The notificationSchedule property
     * @param value Value to set for the notificationSchedule property.
     */
    public void setNotificationSchedule(@jakarta.annotation.Nullable final LifecyclePolicyNotificationSettings value) {
        this.backingStore.set("notificationSchedule", value);
    }
    /**
     * Sets the policySource property value. The policySource property
     * @param value Value to set for the policySource property.
     */
    public void setPolicySource(@jakarta.annotation.Nullable final LifecyclePolicySource value) {
        this.backingStore.set("policySource", value);
    }
    /**
     * Sets the rules property value. The rules property
     * @param value Value to set for the rules property.
     */
    public void setRules(@jakarta.annotation.Nullable final java.util.List<LifecyclePolicyRule> value) {
        this.backingStore.set("rules", value);
    }
    /**
     * Sets the scope property value. The scope property
     * @param value Value to set for the scope property.
     */
    public void setScope(@jakarta.annotation.Nullable final SubjectSet value) {
        this.backingStore.set("scope", value);
    }
    /**
     * Sets the versionNumber property value. The versionNumber property
     * @param value Value to set for the versionNumber property.
     */
    public void setVersionNumber(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("versionNumber", value);
    }
    /**
     * Sets the versions property value. The versions property
     * @param value Value to set for the versions property.
     */
    public void setVersions(@jakarta.annotation.Nullable final java.util.List<LifecyclePolicy> value) {
        this.backingStore.set("versions", value);
    }
}
