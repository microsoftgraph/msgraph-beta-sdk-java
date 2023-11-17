package com.microsoft.graph.devicemanagement.windowsdriverupdateprofiles.item.executeaction;

import com.microsoft.graph.models.DriverApprovalAction;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ExecuteActionPostRequestBody implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new ExecuteActionPostRequestBody and sets the default values.
     */
    public ExecuteActionPostRequestBody() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ExecuteActionPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static ExecuteActionPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ExecuteActionPostRequestBody();
    }
    /**
     * Gets the actionName property value. An enum type to represent approval actions of single or list of drivers.
     * @return a DriverApprovalAction
     */
    @jakarta.annotation.Nullable
    public DriverApprovalAction getActionName() {
        return this.backingStore.get("actionName");
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
     * Gets the deploymentDate property value. The deploymentDate property
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getDeploymentDate() {
        return this.backingStore.get("deploymentDate");
    }
    /**
     * Gets the driverIds property value. The driverIds property
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getDriverIds() {
        return this.backingStore.get("driverIds");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("actionName", (n) -> { this.setActionName(n.getEnumValue(DriverApprovalAction.class)); });
        deserializerMap.put("deploymentDate", (n) -> { this.setDeploymentDate(n.getOffsetDateTimeValue()); });
        deserializerMap.put("driverIds", (n) -> { this.setDriverIds(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("actionName", this.getActionName());
        writer.writeOffsetDateTimeValue("deploymentDate", this.getDeploymentDate());
        writer.writeCollectionOfPrimitiveValues("driverIds", this.getDriverIds());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the actionName property value. An enum type to represent approval actions of single or list of drivers.
     * @param value Value to set for the actionName property.
     */
    public void setActionName(@jakarta.annotation.Nullable final DriverApprovalAction value) {
        this.backingStore.set("actionName", value);
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
     * Sets the deploymentDate property value. The deploymentDate property
     * @param value Value to set for the deploymentDate property.
     */
    public void setDeploymentDate(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("deploymentDate", value);
    }
    /**
     * Sets the driverIds property value. The driverIds property
     * @param value Value to set for the driverIds property.
     */
    public void setDriverIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("driverIds", value);
    }
}
