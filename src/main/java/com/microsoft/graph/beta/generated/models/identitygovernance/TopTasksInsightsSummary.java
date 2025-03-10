package com.microsoft.graph.beta.models.identitygovernance;

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
public class TopTasksInsightsSummary implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link TopTasksInsightsSummary} and sets the default values.
     */
    public TopTasksInsightsSummary() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link TopTasksInsightsSummary}
     */
    @jakarta.annotation.Nonnull
    public static TopTasksInsightsSummary createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TopTasksInsightsSummary();
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
     * Gets the backingStore property value. Stores model information.
     * @return a {@link BackingStore}
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * Gets the failedTasks property value. Count of failed runs of the task.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getFailedTasks() {
        return this.backingStore.get("failedTasks");
    }
    /**
     * Gets the failedUsers property value. Count of failed users who were processed by the task.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getFailedUsers() {
        return this.backingStore.get("failedUsers");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(9);
        deserializerMap.put("failedTasks", (n) -> { this.setFailedTasks(n.getIntegerValue()); });
        deserializerMap.put("failedUsers", (n) -> { this.setFailedUsers(n.getIntegerValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("successfulTasks", (n) -> { this.setSuccessfulTasks(n.getIntegerValue()); });
        deserializerMap.put("successfulUsers", (n) -> { this.setSuccessfulUsers(n.getIntegerValue()); });
        deserializerMap.put("taskDefinitionDisplayName", (n) -> { this.setTaskDefinitionDisplayName(n.getStringValue()); });
        deserializerMap.put("taskDefinitionId", (n) -> { this.setTaskDefinitionId(n.getStringValue()); });
        deserializerMap.put("totalTasks", (n) -> { this.setTotalTasks(n.getIntegerValue()); });
        deserializerMap.put("totalUsers", (n) -> { this.setTotalUsers(n.getIntegerValue()); });
        return deserializerMap;
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
     * Gets the successfulTasks property value. Count of successful runs of the task.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getSuccessfulTasks() {
        return this.backingStore.get("successfulTasks");
    }
    /**
     * Gets the successfulUsers property value. Count of successful users processed by the task.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getSuccessfulUsers() {
        return this.backingStore.get("successfulUsers");
    }
    /**
     * Gets the taskDefinitionDisplayName property value. The name of the task.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTaskDefinitionDisplayName() {
        return this.backingStore.get("taskDefinitionDisplayName");
    }
    /**
     * Gets the taskDefinitionId property value. The task ID.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTaskDefinitionId() {
        return this.backingStore.get("taskDefinitionId");
    }
    /**
     * Gets the totalTasks property value. Count of total runs of the task.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getTotalTasks() {
        return this.backingStore.get("totalTasks");
    }
    /**
     * Gets the totalUsers property value. Count of total users processed by the task.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getTotalUsers() {
        return this.backingStore.get("totalUsers");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("failedTasks", this.getFailedTasks());
        writer.writeIntegerValue("failedUsers", this.getFailedUsers());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeIntegerValue("successfulTasks", this.getSuccessfulTasks());
        writer.writeIntegerValue("successfulUsers", this.getSuccessfulUsers());
        writer.writeStringValue("taskDefinitionDisplayName", this.getTaskDefinitionDisplayName());
        writer.writeStringValue("taskDefinitionId", this.getTaskDefinitionId());
        writer.writeIntegerValue("totalTasks", this.getTotalTasks());
        writer.writeIntegerValue("totalUsers", this.getTotalUsers());
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
     * Sets the failedTasks property value. Count of failed runs of the task.
     * @param value Value to set for the failedTasks property.
     */
    public void setFailedTasks(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("failedTasks", value);
    }
    /**
     * Sets the failedUsers property value. Count of failed users who were processed by the task.
     * @param value Value to set for the failedUsers property.
     */
    public void setFailedUsers(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("failedUsers", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the successfulTasks property value. Count of successful runs of the task.
     * @param value Value to set for the successfulTasks property.
     */
    public void setSuccessfulTasks(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("successfulTasks", value);
    }
    /**
     * Sets the successfulUsers property value. Count of successful users processed by the task.
     * @param value Value to set for the successfulUsers property.
     */
    public void setSuccessfulUsers(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("successfulUsers", value);
    }
    /**
     * Sets the taskDefinitionDisplayName property value. The name of the task.
     * @param value Value to set for the taskDefinitionDisplayName property.
     */
    public void setTaskDefinitionDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("taskDefinitionDisplayName", value);
    }
    /**
     * Sets the taskDefinitionId property value. The task ID.
     * @param value Value to set for the taskDefinitionId property.
     */
    public void setTaskDefinitionId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("taskDefinitionId", value);
    }
    /**
     * Sets the totalTasks property value. Count of total runs of the task.
     * @param value Value to set for the totalTasks property.
     */
    public void setTotalTasks(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("totalTasks", value);
    }
    /**
     * Sets the totalUsers property value. Count of total users processed by the task.
     * @param value Value to set for the totalUsers property.
     */
    public void setTotalUsers(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("totalUsers", value);
    }
}
