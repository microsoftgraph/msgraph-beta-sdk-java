package com.microsoft.graph.beta.users.item.mailfolders.item.messages.item.reportmessage;

import com.microsoft.graph.beta.models.ReportAction;
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
public class ReportMessagePostRequestBody implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link ReportMessagePostRequestBody} and sets the default values.
     */
    public ReportMessagePostRequestBody() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ReportMessagePostRequestBody}
     */
    @jakarta.annotation.Nonnull
    public static ReportMessagePostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ReportMessagePostRequestBody();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("IsMessageMoveRequested", (n) -> { this.setIsMessageMoveRequested(n.getBooleanValue()); });
        deserializerMap.put("ReportAction", (n) -> { this.setReportAction(n.getEnumValue(ReportAction::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the IsMessageMoveRequested property value. The IsMessageMoveRequested property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsMessageMoveRequested() {
        return this.backingStore.get("isMessageMoveRequested");
    }
    /**
     * Gets the ReportAction property value. The ReportAction property
     * @return a {@link ReportAction}
     */
    @jakarta.annotation.Nullable
    public ReportAction getReportAction() {
        return this.backingStore.get("reportAction");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("IsMessageMoveRequested", this.getIsMessageMoveRequested());
        writer.writeEnumValue("ReportAction", this.getReportAction());
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
     * Sets the IsMessageMoveRequested property value. The IsMessageMoveRequested property
     * @param value Value to set for the IsMessageMoveRequested property.
     */
    public void setIsMessageMoveRequested(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isMessageMoveRequested", value);
    }
    /**
     * Sets the ReportAction property value. The ReportAction property
     * @param value Value to set for the ReportAction property.
     */
    public void setReportAction(@jakarta.annotation.Nullable final ReportAction value) {
        this.backingStore.set("reportAction", value);
    }
}
