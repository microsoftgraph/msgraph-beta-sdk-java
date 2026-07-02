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
public class RestoreSearchArtifactQueryExpression implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link RestoreSearchArtifactQueryExpression} and sets the default values.
     */
    public RestoreSearchArtifactQueryExpression() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link RestoreSearchArtifactQueryExpression}
     */
    @jakarta.annotation.Nonnull
    public static RestoreSearchArtifactQueryExpression createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RestoreSearchArtifactQueryExpression();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("hasAttachment", (n) -> { this.setHasAttachment(n.getBooleanValue()); });
        deserializerMap.put("items", (n) -> { this.setItems(n.getCollectionOfEnumValues(GranularRestoreItems::forValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("recipients", (n) -> { this.setRecipients(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("senders", (n) -> { this.setSenders(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("subjects", (n) -> { this.setSubjects(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the hasAttachment property value. Indicates whether the artifact has an attachment. Optional.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getHasAttachment() {
        return this.backingStore.get("hasAttachment");
    }
    /**
     * Gets the items property value. The types of items to include in the search. Optional.
     * @return a {@link java.util.List<GranularRestoreItems>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<GranularRestoreItems> getItems() {
        return this.backingStore.get("items");
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
     * Gets the recipients property value. The recipient email addresses to filter by. Optional.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getRecipients() {
        return this.backingStore.get("recipients");
    }
    /**
     * Gets the senders property value. The sender email addresses to filter by. Optional.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getSenders() {
        return this.backingStore.get("senders");
    }
    /**
     * Gets the subjects property value. The subject lines to filter by. Optional.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getSubjects() {
        return this.backingStore.get("subjects");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("hasAttachment", this.getHasAttachment());
        writer.writeCollectionOfEnumValues("items", this.getItems());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeCollectionOfPrimitiveValues("recipients", this.getRecipients());
        writer.writeCollectionOfPrimitiveValues("senders", this.getSenders());
        writer.writeCollectionOfPrimitiveValues("subjects", this.getSubjects());
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
     * Sets the hasAttachment property value. Indicates whether the artifact has an attachment. Optional.
     * @param value Value to set for the hasAttachment property.
     */
    public void setHasAttachment(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("hasAttachment", value);
    }
    /**
     * Sets the items property value. The types of items to include in the search. Optional.
     * @param value Value to set for the items property.
     */
    public void setItems(@jakarta.annotation.Nullable final java.util.List<GranularRestoreItems> value) {
        this.backingStore.set("items", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the recipients property value. The recipient email addresses to filter by. Optional.
     * @param value Value to set for the recipients property.
     */
    public void setRecipients(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("recipients", value);
    }
    /**
     * Sets the senders property value. The sender email addresses to filter by. Optional.
     * @param value Value to set for the senders property.
     */
    public void setSenders(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("senders", value);
    }
    /**
     * Sets the subjects property value. The subject lines to filter by. Optional.
     * @param value Value to set for the subjects property.
     */
    public void setSubjects(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("subjects", value);
    }
}
