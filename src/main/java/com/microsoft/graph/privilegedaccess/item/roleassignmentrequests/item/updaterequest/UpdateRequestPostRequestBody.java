package com.microsoft.graph.privilegedaccess.item.roleassignmentrequests.item.updaterequest;

import com.microsoft.graph.models.GovernanceSchedule;
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
public class UpdateRequestPostRequestBody implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    private BackingStore BackingStore;
    /**
     * Instantiates a new UpdateRequestPostRequestBody and sets the default values.
     */
    public UpdateRequestPostRequestBody() {
        this.BackingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a UpdateRequestPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static UpdateRequestPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UpdateRequestPostRequestBody();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.BackingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the assignmentState property value. The assignmentState property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAssignmentState() {
        return this.BackingStore.get("assignmentState");
    }
    /**
     * Gets the BackingStore property value. Stores model information.
     * @return a BackingStore
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.BackingStore;
    }
    /**
     * Gets the decision property value. The decision property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDecision() {
        return this.BackingStore.get("decision");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("assignmentState", (n) -> { this.setAssignmentState(n.getStringValue()); });
        deserializerMap.put("decision", (n) -> { this.setDecision(n.getStringValue()); });
        deserializerMap.put("reason", (n) -> { this.setReason(n.getStringValue()); });
        deserializerMap.put("schedule", (n) -> { this.setSchedule(n.getObjectValue(GovernanceSchedule::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the reason property value. The reason property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getReason() {
        return this.BackingStore.get("reason");
    }
    /**
     * Gets the schedule property value. The schedule property
     * @return a GovernanceSchedule
     */
    @jakarta.annotation.Nullable
    public GovernanceSchedule getSchedule() {
        return this.BackingStore.get("schedule");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("assignmentState", this.getAssignmentState());
        writer.writeStringValue("decision", this.getDecision());
        writer.writeStringValue("reason", this.getReason());
        writer.writeObjectValue("schedule", this.getSchedule());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.BackingStore.set("additionalData", value);
    }
    /**
     * Sets the assignmentState property value. The assignmentState property
     * @param value Value to set for the assignmentState property.
     */
    public void setAssignmentState(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("assignmentState", value);
    }
    /**
     * Sets the BackingStore property value. Stores model information.
     * @param value Value to set for the BackingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.BackingStore = value;
    }
    /**
     * Sets the decision property value. The decision property
     * @param value Value to set for the decision property.
     */
    public void setDecision(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("decision", value);
    }
    /**
     * Sets the reason property value. The reason property
     * @param value Value to set for the reason property.
     */
    public void setReason(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("reason", value);
    }
    /**
     * Sets the schedule property value. The schedule property
     * @param value Value to set for the schedule property.
     */
    public void setSchedule(@jakarta.annotation.Nullable final GovernanceSchedule value) {
        this.BackingStore.set("schedule", value);
    }
}
