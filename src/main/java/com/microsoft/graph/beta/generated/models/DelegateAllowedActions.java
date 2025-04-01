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
public class DelegateAllowedActions implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link DelegateAllowedActions} and sets the default values.
     */
    public DelegateAllowedActions() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link DelegateAllowedActions}
     */
    @jakarta.annotation.Nonnull
    public static DelegateAllowedActions createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DelegateAllowedActions();
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
        deserializerMap.put("joinActiveCalls", (n) -> { this.setJoinActiveCalls(n.getBooleanValue()); });
        deserializerMap.put("makeCalls", (n) -> { this.setMakeCalls(n.getBooleanValue()); });
        deserializerMap.put("manageCallAndDelegateSettings", (n) -> { this.setManageCallAndDelegateSettings(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("pickUpHeldCalls", (n) -> { this.setPickUpHeldCalls(n.getBooleanValue()); });
        deserializerMap.put("receiveCalls", (n) -> { this.setReceiveCalls(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the joinActiveCalls property value. Indicates whether the delegator or delegate allows participation in active calls.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getJoinActiveCalls() {
        return this.backingStore.get("joinActiveCalls");
    }
    /**
     * Gets the makeCalls property value. Indicates whether the delegator or delegate allows calls to be made on their behalf.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getMakeCalls() {
        return this.backingStore.get("makeCalls");
    }
    /**
     * Gets the manageCallAndDelegateSettings property value. Indicates whether the delegator or delegate allows the management of call and delegation settings.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getManageCallAndDelegateSettings() {
        return this.backingStore.get("manageCallAndDelegateSettings");
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
     * Gets the pickUpHeldCalls property value. Indicates whether the delegator or delegate allows held calls to be picked up.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getPickUpHeldCalls() {
        return this.backingStore.get("pickUpHeldCalls");
    }
    /**
     * Gets the receiveCalls property value. Indicates whether the delegator or delegate allows calls to be received on their behalf.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getReceiveCalls() {
        return this.backingStore.get("receiveCalls");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("joinActiveCalls", this.getJoinActiveCalls());
        writer.writeBooleanValue("makeCalls", this.getMakeCalls());
        writer.writeBooleanValue("manageCallAndDelegateSettings", this.getManageCallAndDelegateSettings());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeBooleanValue("pickUpHeldCalls", this.getPickUpHeldCalls());
        writer.writeBooleanValue("receiveCalls", this.getReceiveCalls());
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
     * Sets the joinActiveCalls property value. Indicates whether the delegator or delegate allows participation in active calls.
     * @param value Value to set for the joinActiveCalls property.
     */
    public void setJoinActiveCalls(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("joinActiveCalls", value);
    }
    /**
     * Sets the makeCalls property value. Indicates whether the delegator or delegate allows calls to be made on their behalf.
     * @param value Value to set for the makeCalls property.
     */
    public void setMakeCalls(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("makeCalls", value);
    }
    /**
     * Sets the manageCallAndDelegateSettings property value. Indicates whether the delegator or delegate allows the management of call and delegation settings.
     * @param value Value to set for the manageCallAndDelegateSettings property.
     */
    public void setManageCallAndDelegateSettings(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("manageCallAndDelegateSettings", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the pickUpHeldCalls property value. Indicates whether the delegator or delegate allows held calls to be picked up.
     * @param value Value to set for the pickUpHeldCalls property.
     */
    public void setPickUpHeldCalls(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("pickUpHeldCalls", value);
    }
    /**
     * Sets the receiveCalls property value. Indicates whether the delegator or delegate allows calls to be received on their behalf.
     * @param value Value to set for the receiveCalls property.
     */
    public void setReceiveCalls(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("receiveCalls", value);
    }
}
