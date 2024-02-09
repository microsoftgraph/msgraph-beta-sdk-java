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
public class CommentAction implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link CommentAction} and sets the default values.
     */
    public CommentAction() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CommentAction}
     */
    @jakarta.annotation.Nonnull
    public static CommentAction createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CommentAction();
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
        deserializerMap.put("isReply", (n) -> { this.setIsReply(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("parentAuthor", (n) -> { this.setParentAuthor(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("participants", (n) -> { this.setParticipants(n.getCollectionOfObjectValues(IdentitySet::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the isReply property value. If true, this activity was a reply to an existing comment thread.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsReply() {
        return this.backingStore.get("isReply");
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
     * Gets the parentAuthor property value. The identity of the user who started the comment thread.
     * @return a {@link IdentitySet}
     */
    @jakarta.annotation.Nullable
    public IdentitySet getParentAuthor() {
        return this.backingStore.get("parentAuthor");
    }
    /**
     * Gets the participants property value. The identities of the users participating in this comment thread.
     * @return a {@link java.util.List<IdentitySet>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<IdentitySet> getParticipants() {
        return this.backingStore.get("participants");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("isReply", this.getIsReply());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeObjectValue("parentAuthor", this.getParentAuthor());
        writer.writeCollectionOfObjectValues("participants", this.getParticipants());
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
     * Sets the isReply property value. If true, this activity was a reply to an existing comment thread.
     * @param value Value to set for the isReply property.
     */
    public void setIsReply(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isReply", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the parentAuthor property value. The identity of the user who started the comment thread.
     * @param value Value to set for the parentAuthor property.
     */
    public void setParentAuthor(@jakarta.annotation.Nullable final IdentitySet value) {
        this.backingStore.set("parentAuthor", value);
    }
    /**
     * Sets the participants property value. The identities of the users participating in this comment thread.
     * @param value Value to set for the participants property.
     */
    public void setParticipants(@jakarta.annotation.Nullable final java.util.List<IdentitySet> value) {
        this.backingStore.set("participants", value);
    }
}
