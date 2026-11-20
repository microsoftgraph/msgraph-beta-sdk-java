package com.microsoft.graph.beta.models;

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
public class TaskCapability implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link TaskCapability} and sets the default values.
     */
    public TaskCapability() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link TaskCapability}
     */
    @jakarta.annotation.Nonnull
    public static TaskCapability createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TaskCapability();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a {@link Map<String, Object>}
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
     * Gets the assignedPriorityForTaskPersonalView property value. Indicates whether assigned priority is shown in the task&apos;s personal view.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getAssignedPriorityForTaskPersonalView() {
        return this.backingStore.get("assignedPriorityForTaskPersonalView");
    }
    /**
     * Gets the backingStore property value. Stores model information.
     * @return a {@link BackingStore}
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * Gets the dependencies property value. Indicates whether dependencies are enabled for the task.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getDependencies() {
        return this.backingStore.get("dependencies");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("assignedPriorityForTaskPersonalView", (n) -> { this.setAssignedPriorityForTaskPersonalView(n.getBooleanValue()); });
        deserializerMap.put("dependencies", (n) -> { this.setDependencies(n.getBooleanValue()); });
        deserializerMap.put("history", (n) -> { this.setHistory(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the history property value. Indicates whether history tracking is enabled for the task.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getHistory() {
        return this.backingStore.get("history");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("assignedPriorityForTaskPersonalView", this.getAssignedPriorityForTaskPersonalView());
        writer.writeBooleanValue("dependencies", this.getDependencies());
        writer.writeBooleanValue("history", this.getHistory());
        writer.writeStringValue("@odata.type", this.getOdataType());
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
     * Sets the assignedPriorityForTaskPersonalView property value. Indicates whether assigned priority is shown in the task&apos;s personal view.
     * @param value Value to set for the assignedPriorityForTaskPersonalView property.
     */
    public void setAssignedPriorityForTaskPersonalView(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("assignedPriorityForTaskPersonalView", value);
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
     * Sets the dependencies property value. Indicates whether dependencies are enabled for the task.
     * @param value Value to set for the dependencies property.
     */
    public void setDependencies(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("dependencies", value);
    }
    /**
     * Sets the history property value. Indicates whether history tracking is enabled for the task.
     * @param value Value to set for the history property.
     */
    public void setHistory(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("history", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
}
