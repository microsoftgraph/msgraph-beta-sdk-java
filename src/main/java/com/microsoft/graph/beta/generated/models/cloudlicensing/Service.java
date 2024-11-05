package com.microsoft.graph.beta.models.cloudlicensing;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Service implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link Service} and sets the default values.
     */
    public Service() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Service}
     */
    @jakarta.annotation.Nonnull
    public static Service createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Service();
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
     * Gets the assignableTo property value. The assignableTo property
     * @return a {@link EnumSet<AssigneeTypes>}
     */
    @jakarta.annotation.Nullable
    public EnumSet<AssigneeTypes> getAssignableTo() {
        return this.backingStore.get("assignableTo");
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
        deserializerMap.put("assignableTo", (n) -> { this.setAssignableTo(n.getEnumSetValue(AssigneeTypes::forValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("planId", (n) -> { this.setPlanId(n.getUUIDValue()); });
        deserializerMap.put("planName", (n) -> { this.setPlanName(n.getStringValue()); });
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
     * Gets the planId property value. The unique identifier of the service plan that is equal to the servicePlanId property on the related servicePlanInfo objects.
     * @return a {@link UUID}
     */
    @jakarta.annotation.Nullable
    public UUID getPlanId() {
        return this.backingStore.get("planId");
    }
    /**
     * Gets the planName property value. The name of the service plan that is equal to the servicePlanName property on the related servicePlanInfo objects.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPlanName() {
        return this.backingStore.get("planName");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumSetValue("assignableTo", this.getAssignableTo());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeUUIDValue("planId", this.getPlanId());
        writer.writeStringValue("planName", this.getPlanName());
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
     * Sets the assignableTo property value. The assignableTo property
     * @param value Value to set for the assignableTo property.
     */
    public void setAssignableTo(@jakarta.annotation.Nullable final EnumSet<AssigneeTypes> value) {
        this.backingStore.set("assignableTo", value);
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
     * Sets the planId property value. The unique identifier of the service plan that is equal to the servicePlanId property on the related servicePlanInfo objects.
     * @param value Value to set for the planId property.
     */
    public void setPlanId(@jakarta.annotation.Nullable final UUID value) {
        this.backingStore.set("planId", value);
    }
    /**
     * Sets the planName property value. The name of the service plan that is equal to the servicePlanName property on the related servicePlanInfo objects.
     * @param value Value to set for the planName property.
     */
    public void setPlanName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("planName", value);
    }
}
