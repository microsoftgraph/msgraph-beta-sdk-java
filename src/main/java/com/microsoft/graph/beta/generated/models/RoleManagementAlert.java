package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RoleManagementAlert extends Entity implements Parsable {
    /**
     * Instantiates a new {@link RoleManagementAlert} and sets the default values.
     */
    public RoleManagementAlert() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link RoleManagementAlert}
     */
    @jakarta.annotation.Nonnull
    public static RoleManagementAlert createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RoleManagementAlert();
    }
    /**
     * Gets the alertConfigurations property value. The various configurations of an alert for Microsoft Entra roles. The configurations are predefined and can't be created or deleted, but some of the configurations can be modified.
     * @return a {@link java.util.List<UnifiedRoleManagementAlertConfiguration>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<UnifiedRoleManagementAlertConfiguration> getAlertConfigurations() {
        return this.backingStore.get("alertConfigurations");
    }
    /**
     * Gets the alertDefinitions property value. Defines an alert, its impact, and measures to mitigate or prevent it.
     * @return a {@link java.util.List<UnifiedRoleManagementAlertDefinition>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<UnifiedRoleManagementAlertDefinition> getAlertDefinitions() {
        return this.backingStore.get("alertDefinitions");
    }
    /**
     * Gets the alerts property value. Represents the alert entity.
     * @return a {@link java.util.List<UnifiedRoleManagementAlert>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<UnifiedRoleManagementAlert> getAlerts() {
        return this.backingStore.get("alerts");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("alertConfigurations", (n) -> { this.setAlertConfigurations(n.getCollectionOfObjectValues(UnifiedRoleManagementAlertConfiguration::createFromDiscriminatorValue)); });
        deserializerMap.put("alertDefinitions", (n) -> { this.setAlertDefinitions(n.getCollectionOfObjectValues(UnifiedRoleManagementAlertDefinition::createFromDiscriminatorValue)); });
        deserializerMap.put("alerts", (n) -> { this.setAlerts(n.getCollectionOfObjectValues(UnifiedRoleManagementAlert::createFromDiscriminatorValue)); });
        deserializerMap.put("operations", (n) -> { this.setOperations(n.getCollectionOfObjectValues(LongRunningOperation::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the operations property value. Represents operations on resources that take a long time to complete and can run in the background until completion.
     * @return a {@link java.util.List<LongRunningOperation>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<LongRunningOperation> getOperations() {
        return this.backingStore.get("operations");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("alertConfigurations", this.getAlertConfigurations());
        writer.writeCollectionOfObjectValues("alertDefinitions", this.getAlertDefinitions());
        writer.writeCollectionOfObjectValues("alerts", this.getAlerts());
        writer.writeCollectionOfObjectValues("operations", this.getOperations());
    }
    /**
     * Sets the alertConfigurations property value. The various configurations of an alert for Microsoft Entra roles. The configurations are predefined and can't be created or deleted, but some of the configurations can be modified.
     * @param value Value to set for the alertConfigurations property.
     */
    public void setAlertConfigurations(@jakarta.annotation.Nullable final java.util.List<UnifiedRoleManagementAlertConfiguration> value) {
        this.backingStore.set("alertConfigurations", value);
    }
    /**
     * Sets the alertDefinitions property value. Defines an alert, its impact, and measures to mitigate or prevent it.
     * @param value Value to set for the alertDefinitions property.
     */
    public void setAlertDefinitions(@jakarta.annotation.Nullable final java.util.List<UnifiedRoleManagementAlertDefinition> value) {
        this.backingStore.set("alertDefinitions", value);
    }
    /**
     * Sets the alerts property value. Represents the alert entity.
     * @param value Value to set for the alerts property.
     */
    public void setAlerts(@jakarta.annotation.Nullable final java.util.List<UnifiedRoleManagementAlert> value) {
        this.backingStore.set("alerts", value);
    }
    /**
     * Sets the operations property value. Represents operations on resources that take a long time to complete and can run in the background until completion.
     * @param value Value to set for the operations property.
     */
    public void setOperations(@jakarta.annotation.Nullable final java.util.List<LongRunningOperation> value) {
        this.backingStore.set("operations", value);
    }
}
