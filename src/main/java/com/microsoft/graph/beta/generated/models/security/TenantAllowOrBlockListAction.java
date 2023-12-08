package com.microsoft.graph.beta.models.security;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TenantAllowOrBlockListAction implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new TenantAllowOrBlockListAction and sets the default values.
     */
    public TenantAllowOrBlockListAction() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a TenantAllowOrBlockListAction
     */
    @jakarta.annotation.Nonnull
    public static TenantAllowOrBlockListAction createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TenantAllowOrBlockListAction();
    }
    /**
     * Gets the action property value. Specifies whether the tenant allow-or-block list is an allow or block. The possible values are: allow, block, and unkownFutureValue.
     * @return a TenantAllowBlockListAction
     */
    @jakarta.annotation.Nullable
    public TenantAllowBlockListAction getAction() {
        return this.backingStore.get("action");
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
     * Gets the backingStore property value. Stores model information.
     * @return a BackingStore
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * Gets the expirationDateTime property value. Specifies when the tenant allow-block-list expires in date time.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getExpirationDateTime() {
        return this.backingStore.get("expirationDateTime");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("action", (n) -> { this.setAction(n.getEnumValue(TenantAllowBlockListAction::forValue)); });
        deserializerMap.put("expirationDateTime", (n) -> { this.setExpirationDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("note", (n) -> { this.setNote(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("results", (n) -> { this.setResults(n.getCollectionOfObjectValues(TenantAllowBlockListEntryResult::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the note property value. Specifies the note added to the tenant allow-or-block list entry in the format of string.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getNote() {
        return this.backingStore.get("note");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the results property value. Contains the result of the submission that lead to the tenant allow-block-list entry creation.
     * @return a java.util.List<TenantAllowBlockListEntryResult>
     */
    @jakarta.annotation.Nullable
    public java.util.List<TenantAllowBlockListEntryResult> getResults() {
        return this.backingStore.get("results");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("action", this.getAction());
        writer.writeOffsetDateTimeValue("expirationDateTime", this.getExpirationDateTime());
        writer.writeStringValue("note", this.getNote());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeCollectionOfObjectValues("results", this.getResults());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the action property value. Specifies whether the tenant allow-or-block list is an allow or block. The possible values are: allow, block, and unkownFutureValue.
     * @param value Value to set for the action property.
     */
    public void setAction(@jakarta.annotation.Nullable final TenantAllowBlockListAction value) {
        this.backingStore.set("action", value);
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
     * Sets the expirationDateTime property value. Specifies when the tenant allow-block-list expires in date time.
     * @param value Value to set for the expirationDateTime property.
     */
    public void setExpirationDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("expirationDateTime", value);
    }
    /**
     * Sets the note property value. Specifies the note added to the tenant allow-or-block list entry in the format of string.
     * @param value Value to set for the note property.
     */
    public void setNote(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("note", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the results property value. Contains the result of the submission that lead to the tenant allow-block-list entry creation.
     * @param value Value to set for the results property.
     */
    public void setResults(@jakarta.annotation.Nullable final java.util.List<TenantAllowBlockListEntryResult> value) {
        this.backingStore.set("results", value);
    }
}
