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
public class TrainingCampaignReportOverview implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link TrainingCampaignReportOverview} and sets the default values.
     */
    public TrainingCampaignReportOverview() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link TrainingCampaignReportOverview}
     */
    @jakarta.annotation.Nonnull
    public static TrainingCampaignReportOverview createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TrainingCampaignReportOverview();
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
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("trainingModuleCompletion", (n) -> { this.setTrainingModuleCompletion(n.getObjectValue(TrainingEventsContent::createFromDiscriminatorValue)); });
        deserializerMap.put("trainingNotificationDeliveryStatus", (n) -> { this.setTrainingNotificationDeliveryStatus(n.getObjectValue(TrainingNotificationDelivery::createFromDiscriminatorValue)); });
        deserializerMap.put("userCompletionStatus", (n) -> { this.setUserCompletionStatus(n.getObjectValue(UserTrainingCompletionSummary::createFromDiscriminatorValue)); });
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
     * Gets the trainingModuleCompletion property value. The trainingModuleCompletion property
     * @return a {@link TrainingEventsContent}
     */
    @jakarta.annotation.Nullable
    public TrainingEventsContent getTrainingModuleCompletion() {
        return this.backingStore.get("trainingModuleCompletion");
    }
    /**
     * Gets the trainingNotificationDeliveryStatus property value. The trainingNotificationDeliveryStatus property
     * @return a {@link TrainingNotificationDelivery}
     */
    @jakarta.annotation.Nullable
    public TrainingNotificationDelivery getTrainingNotificationDeliveryStatus() {
        return this.backingStore.get("trainingNotificationDeliveryStatus");
    }
    /**
     * Gets the userCompletionStatus property value. The userCompletionStatus property
     * @return a {@link UserTrainingCompletionSummary}
     */
    @jakarta.annotation.Nullable
    public UserTrainingCompletionSummary getUserCompletionStatus() {
        return this.backingStore.get("userCompletionStatus");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeObjectValue("trainingModuleCompletion", this.getTrainingModuleCompletion());
        writer.writeObjectValue("trainingNotificationDeliveryStatus", this.getTrainingNotificationDeliveryStatus());
        writer.writeObjectValue("userCompletionStatus", this.getUserCompletionStatus());
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
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the trainingModuleCompletion property value. The trainingModuleCompletion property
     * @param value Value to set for the trainingModuleCompletion property.
     */
    public void setTrainingModuleCompletion(@jakarta.annotation.Nullable final TrainingEventsContent value) {
        this.backingStore.set("trainingModuleCompletion", value);
    }
    /**
     * Sets the trainingNotificationDeliveryStatus property value. The trainingNotificationDeliveryStatus property
     * @param value Value to set for the trainingNotificationDeliveryStatus property.
     */
    public void setTrainingNotificationDeliveryStatus(@jakarta.annotation.Nullable final TrainingNotificationDelivery value) {
        this.backingStore.set("trainingNotificationDeliveryStatus", value);
    }
    /**
     * Sets the userCompletionStatus property value. The userCompletionStatus property
     * @param value Value to set for the userCompletionStatus property.
     */
    public void setUserCompletionStatus(@jakarta.annotation.Nullable final UserTrainingCompletionSummary value) {
        this.backingStore.set("userCompletionStatus", value);
    }
}
