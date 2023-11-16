package com.microsoft.graph.groups.item.sites.item.informationprotection.policy.labels.evaluateapplication;

import com.microsoft.graph.models.ContentInfo;
import com.microsoft.graph.models.LabelingOptions;
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
public class EvaluateApplicationPostRequestBody implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    public BackingStore backingStore;
    /**
     * Instantiates a new EvaluateApplicationPostRequestBody and sets the default values.
     */
    public EvaluateApplicationPostRequestBody() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a EvaluateApplicationPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static EvaluateApplicationPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EvaluateApplicationPostRequestBody();
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
     * Gets the contentInfo property value. The contentInfo property
     * @return a ContentInfo
     */
    @jakarta.annotation.Nullable
    public ContentInfo getContentInfo() {
        return this.backingStore.get("contentInfo");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("contentInfo", (n) -> { this.setContentInfo(n.getObjectValue(ContentInfo::createFromDiscriminatorValue)); });
        deserializerMap.put("labelingOptions", (n) -> { this.setLabelingOptions(n.getObjectValue(LabelingOptions::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the labelingOptions property value. The labelingOptions property
     * @return a LabelingOptions
     */
    @jakarta.annotation.Nullable
    public LabelingOptions getLabelingOptions() {
        return this.backingStore.get("labelingOptions");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("contentInfo", this.getContentInfo());
        writer.writeObjectValue("labelingOptions", this.getLabelingOptions());
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
     * Sets the contentInfo property value. The contentInfo property
     * @param value Value to set for the contentInfo property.
     */
    public void setContentInfo(@jakarta.annotation.Nullable final ContentInfo value) {
        this.backingStore.set("contentInfo", value);
    }
    /**
     * Sets the labelingOptions property value. The labelingOptions property
     * @param value Value to set for the labelingOptions property.
     */
    public void setLabelingOptions(@jakarta.annotation.Nullable final LabelingOptions value) {
        this.backingStore.set("labelingOptions", value);
    }
}
