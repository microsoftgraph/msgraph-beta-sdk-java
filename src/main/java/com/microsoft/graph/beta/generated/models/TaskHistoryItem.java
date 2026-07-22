package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TaskHistoryItem extends PlannerHistoryItem implements Parsable {
    /**
     * Instantiates a new {@link TaskHistoryItem} and sets the default values.
     */
    public TaskHistoryItem() {
        super();
        this.setOdataType("#microsoft.graph.taskHistoryItem");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link TaskHistoryItem}
     */
    @jakarta.annotation.Nonnull
    public static TaskHistoryItem createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TaskHistoryItem();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("newData", (n) -> { this.setNewData(n.getObjectValue(PlannerTaskData::createFromDiscriminatorValue)); });
        deserializerMap.put("oldData", (n) -> { this.setOldData(n.getObjectValue(PlannerTaskData::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the newData property value. A snapshot of the task state after the change. This property is null for deletion events.
     * @return a {@link PlannerTaskData}
     */
    @jakarta.annotation.Nullable
    public PlannerTaskData getNewData() {
        return this.backingStore.get("newData");
    }
    /**
     * Gets the oldData property value. A snapshot of the task state before the change. This property is null for creation and undeletion events.
     * @return a {@link PlannerTaskData}
     */
    @jakarta.annotation.Nullable
    public PlannerTaskData getOldData() {
        return this.backingStore.get("oldData");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("newData", this.getNewData());
        writer.writeObjectValue("oldData", this.getOldData());
    }
    /**
     * Sets the newData property value. A snapshot of the task state after the change. This property is null for deletion events.
     * @param value Value to set for the newData property.
     */
    public void setNewData(@jakarta.annotation.Nullable final PlannerTaskData value) {
        this.backingStore.set("newData", value);
    }
    /**
     * Sets the oldData property value. A snapshot of the task state before the change. This property is null for creation and undeletion events.
     * @param value Value to set for the oldData property.
     */
    public void setOldData(@jakarta.annotation.Nullable final PlannerTaskData value) {
        this.backingStore.set("oldData", value);
    }
}
