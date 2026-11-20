package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AgentIdentityBlueprintPrincipal extends ServicePrincipal implements Parsable {
    /**
     * Instantiates a new {@link AgentIdentityBlueprintPrincipal} and sets the default values.
     */
    public AgentIdentityBlueprintPrincipal() {
        super();
        this.setOdataType("#microsoft.graph.agentIdentityBlueprintPrincipal");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AgentIdentityBlueprintPrincipal}
     */
    @jakarta.annotation.Nonnull
    public static AgentIdentityBlueprintPrincipal createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AgentIdentityBlueprintPrincipal();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("lifecyclePolicyComplianceState", (n) -> { this.setLifecyclePolicyComplianceState(n.getEnumValue(LifecyclePolicyComplianceState::forValue)); });
        deserializerMap.put("lifecyclePolicyComplianceStateLastModifiedDateTime", (n) -> { this.setLifecyclePolicyComplianceStateLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("lifecyclePolicyComplianceStateReason", (n) -> { this.setLifecyclePolicyComplianceStateReason(n.getStringValue()); });
        deserializerMap.put("lifecyclePolicyNonComplianceDisablementDateTime", (n) -> { this.setLifecyclePolicyNonComplianceDisablementDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("managerApplications", (n) -> { this.setManagerApplications(n.getCollectionOfPrimitiveValues(UUID.class)); });
        deserializerMap.put("sponsors", (n) -> { this.setSponsors(n.getCollectionOfObjectValues(DirectoryObject::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the lifecyclePolicyComplianceState property value. The lifecyclePolicyComplianceState property
     * @return a {@link LifecyclePolicyComplianceState}
     */
    @jakarta.annotation.Nullable
    public LifecyclePolicyComplianceState getLifecyclePolicyComplianceState() {
        return this.backingStore.get("lifecyclePolicyComplianceState");
    }
    /**
     * Gets the lifecyclePolicyComplianceStateLastModifiedDateTime property value. The lifecyclePolicyComplianceStateLastModifiedDateTime property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLifecyclePolicyComplianceStateLastModifiedDateTime() {
        return this.backingStore.get("lifecyclePolicyComplianceStateLastModifiedDateTime");
    }
    /**
     * Gets the lifecyclePolicyComplianceStateReason property value. The lifecyclePolicyComplianceStateReason property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLifecyclePolicyComplianceStateReason() {
        return this.backingStore.get("lifecyclePolicyComplianceStateReason");
    }
    /**
     * Gets the lifecyclePolicyNonComplianceDisablementDateTime property value. The lifecyclePolicyNonComplianceDisablementDateTime property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLifecyclePolicyNonComplianceDisablementDateTime() {
        return this.backingStore.get("lifecyclePolicyNonComplianceDisablementDateTime");
    }
    /**
     * Gets the managerApplications property value. The collection of application IDs designated as managers of this agent identity blueprint principal&apos;s backing agentIdentityBlueprint. Read-only; the value is server-managed and reflects the managerApplications of the backing agentIdentityBlueprint. To change the managers, an owner or administrator must update the managerApplications property on the backing agentIdentityBlueprint in the tenant where it&apos;s registered. For multitenant agent identity blueprints, admins in a tenant where the blueprint is only consumed can&apos;t make this change  they must ask an owner or administrator in the blueprint&apos;s home tenant. Not nullable. Returned only on $select.
     * @return a {@link java.util.List<UUID>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<UUID> getManagerApplications() {
        return this.backingStore.get("managerApplications");
    }
    /**
     * Gets the sponsors property value. The sponsors for this agent identity blueprint principal. Sponsors are users or service principals who can authorize and manage the lifecycle of agent identity instances.
     * @return a {@link java.util.List<DirectoryObject>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DirectoryObject> getSponsors() {
        return this.backingStore.get("sponsors");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("lifecyclePolicyComplianceState", this.getLifecyclePolicyComplianceState());
        writer.writeOffsetDateTimeValue("lifecyclePolicyComplianceStateLastModifiedDateTime", this.getLifecyclePolicyComplianceStateLastModifiedDateTime());
        writer.writeStringValue("lifecyclePolicyComplianceStateReason", this.getLifecyclePolicyComplianceStateReason());
        writer.writeOffsetDateTimeValue("lifecyclePolicyNonComplianceDisablementDateTime", this.getLifecyclePolicyNonComplianceDisablementDateTime());
        writer.writeCollectionOfObjectValues("sponsors", this.getSponsors());
    }
    /**
     * Sets the lifecyclePolicyComplianceState property value. The lifecyclePolicyComplianceState property
     * @param value Value to set for the lifecyclePolicyComplianceState property.
     */
    public void setLifecyclePolicyComplianceState(@jakarta.annotation.Nullable final LifecyclePolicyComplianceState value) {
        this.backingStore.set("lifecyclePolicyComplianceState", value);
    }
    /**
     * Sets the lifecyclePolicyComplianceStateLastModifiedDateTime property value. The lifecyclePolicyComplianceStateLastModifiedDateTime property
     * @param value Value to set for the lifecyclePolicyComplianceStateLastModifiedDateTime property.
     */
    public void setLifecyclePolicyComplianceStateLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lifecyclePolicyComplianceStateLastModifiedDateTime", value);
    }
    /**
     * Sets the lifecyclePolicyComplianceStateReason property value. The lifecyclePolicyComplianceStateReason property
     * @param value Value to set for the lifecyclePolicyComplianceStateReason property.
     */
    public void setLifecyclePolicyComplianceStateReason(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("lifecyclePolicyComplianceStateReason", value);
    }
    /**
     * Sets the lifecyclePolicyNonComplianceDisablementDateTime property value. The lifecyclePolicyNonComplianceDisablementDateTime property
     * @param value Value to set for the lifecyclePolicyNonComplianceDisablementDateTime property.
     */
    public void setLifecyclePolicyNonComplianceDisablementDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lifecyclePolicyNonComplianceDisablementDateTime", value);
    }
    /**
     * Sets the managerApplications property value. The collection of application IDs designated as managers of this agent identity blueprint principal&apos;s backing agentIdentityBlueprint. Read-only; the value is server-managed and reflects the managerApplications of the backing agentIdentityBlueprint. To change the managers, an owner or administrator must update the managerApplications property on the backing agentIdentityBlueprint in the tenant where it&apos;s registered. For multitenant agent identity blueprints, admins in a tenant where the blueprint is only consumed can&apos;t make this change  they must ask an owner or administrator in the blueprint&apos;s home tenant. Not nullable. Returned only on $select.
     * @param value Value to set for the managerApplications property.
     */
    public void setManagerApplications(@jakarta.annotation.Nullable final java.util.List<UUID> value) {
        this.backingStore.set("managerApplications", value);
    }
    /**
     * Sets the sponsors property value. The sponsors for this agent identity blueprint principal. Sponsors are users or service principals who can authorize and manage the lifecycle of agent identity instances.
     * @param value Value to set for the sponsors property.
     */
    public void setSponsors(@jakarta.annotation.Nullable final java.util.List<DirectoryObject> value) {
        this.backingStore.set("sponsors", value);
    }
}
