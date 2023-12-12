package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PlannerTaskRoleBasedRule implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new PlannerTaskRoleBasedRule and sets the default values.
     */
    public PlannerTaskRoleBasedRule() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a PlannerTaskRoleBasedRule
     */
    @jakarta.annotation.Nonnull
    public static PlannerTaskRoleBasedRule createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PlannerTaskRoleBasedRule();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.backingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the backingStore property value. Stores model information.
     * @return a BackingStore
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * Gets the defaultRule property value. Default rule that applies when a property or action-specific rule is not provided. Possible values are: Allow, Block
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDefaultRule() {
        return this.backingStore.get("defaultRule");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("defaultRule", (n) -> { this.setDefaultRule(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("propertyRule", (n) -> { this.setPropertyRule(n.getObjectValue(PlannerTaskPropertyRule::createFromDiscriminatorValue)); });
        deserializerMap.put("role", (n) -> { this.setRole(n.getObjectValue(PlannerTaskConfigurationRoleBase::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the propertyRule property value. Rules for specific properties and actions.
     * @return a PlannerTaskPropertyRule
     */
    @jakarta.annotation.Nullable
    public PlannerTaskPropertyRule getPropertyRule() {
        return this.backingStore.get("propertyRule");
    }
    /**
     * Gets the role property value. The role these rules apply to.
     * @return a PlannerTaskConfigurationRoleBase
     */
    @jakarta.annotation.Nullable
    public PlannerTaskConfigurationRoleBase getRole() {
        return this.backingStore.get("role");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("defaultRule", this.getDefaultRule());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeObjectValue("propertyRule", this.getPropertyRule());
        writer.writeObjectValue("role", this.getRole());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the defaultRule property value. Default rule that applies when a property or action-specific rule is not provided. Possible values are: Allow, Block
     * @param value Value to set for the defaultRule property.
     */
    public void setDefaultRule(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("defaultRule", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the propertyRule property value. Rules for specific properties and actions.
     * @param value Value to set for the propertyRule property.
     */
    public void setPropertyRule(@jakarta.annotation.Nullable final PlannerTaskPropertyRule value) {
        this.backingStore.set("propertyRule", value);
    }
    /**
     * Sets the role property value. The role these rules apply to.
     * @param value Value to set for the role property.
     */
    public void setRole(@jakarta.annotation.Nullable final PlannerTaskConfigurationRoleBase value) {
        this.backingStore.set("role", value);
    }
}
