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
public class UserTrainingCompletionSummary implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link UserTrainingCompletionSummary} and sets the default values.
     */
    public UserTrainingCompletionSummary() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link UserTrainingCompletionSummary}
     */
    @jakarta.annotation.Nonnull
    public static UserTrainingCompletionSummary createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserTrainingCompletionSummary();
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
     * Gets the completedUsersCount property value. The number of users who completed all the trainings before the due date.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getCompletedUsersCount() {
        return this.backingStore.get("completedUsersCount");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("completedUsersCount", (n) -> { this.setCompletedUsersCount(n.getIntegerValue()); });
        deserializerMap.put("inProgressUsersCount", (n) -> { this.setInProgressUsersCount(n.getIntegerValue()); });
        deserializerMap.put("notCompletedUsersCount", (n) -> { this.setNotCompletedUsersCount(n.getIntegerValue()); });
        deserializerMap.put("notStartedUsersCount", (n) -> { this.setNotStartedUsersCount(n.getIntegerValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("previouslyAssignedUsersCount", (n) -> { this.setPreviouslyAssignedUsersCount(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the inProgressUsersCount property value. The number of users who started at least one training.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getInProgressUsersCount() {
        return this.backingStore.get("inProgressUsersCount");
    }
    /**
     * Gets the notCompletedUsersCount property value. The number of users who didn't complete all the trainings before the due date.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getNotCompletedUsersCount() {
        return this.backingStore.get("notCompletedUsersCount");
    }
    /**
     * Gets the notStartedUsersCount property value. The number of users who didn't start any training.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getNotStartedUsersCount() {
        return this.backingStore.get("notStartedUsersCount");
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
     * Gets the previouslyAssignedUsersCount property value. The number of users who are already assigned the same training.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getPreviouslyAssignedUsersCount() {
        return this.backingStore.get("previouslyAssignedUsersCount");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("completedUsersCount", this.getCompletedUsersCount());
        writer.writeIntegerValue("inProgressUsersCount", this.getInProgressUsersCount());
        writer.writeIntegerValue("notCompletedUsersCount", this.getNotCompletedUsersCount());
        writer.writeIntegerValue("notStartedUsersCount", this.getNotStartedUsersCount());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeIntegerValue("previouslyAssignedUsersCount", this.getPreviouslyAssignedUsersCount());
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
     * Sets the completedUsersCount property value. The number of users who completed all the trainings before the due date.
     * @param value Value to set for the completedUsersCount property.
     */
    public void setCompletedUsersCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("completedUsersCount", value);
    }
    /**
     * Sets the inProgressUsersCount property value. The number of users who started at least one training.
     * @param value Value to set for the inProgressUsersCount property.
     */
    public void setInProgressUsersCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("inProgressUsersCount", value);
    }
    /**
     * Sets the notCompletedUsersCount property value. The number of users who didn't complete all the trainings before the due date.
     * @param value Value to set for the notCompletedUsersCount property.
     */
    public void setNotCompletedUsersCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("notCompletedUsersCount", value);
    }
    /**
     * Sets the notStartedUsersCount property value. The number of users who didn't start any training.
     * @param value Value to set for the notStartedUsersCount property.
     */
    public void setNotStartedUsersCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("notStartedUsersCount", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the previouslyAssignedUsersCount property value. The number of users who are already assigned the same training.
     * @param value Value to set for the previouslyAssignedUsersCount property.
     */
    public void setPreviouslyAssignedUsersCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("previouslyAssignedUsersCount", value);
    }
}
