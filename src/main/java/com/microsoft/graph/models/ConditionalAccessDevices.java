package com.microsoft.graph.models;

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
public class ConditionalAccessDevices implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new ConditionalAccessDevices and sets the default values.
     */
    public ConditionalAccessDevices() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ConditionalAccessDevices
     */
    @jakarta.annotation.Nonnull
    public static ConditionalAccessDevices createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ConditionalAccessDevices();
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
     * Gets the deviceFilter property value. Filter that defines the dynamic-device-syntax rule to include/exclude devices. A filter can use device properties (such as extension attributes) to include/exclude them. Cannot be set if includeDevices or excludeDevices is set.
     * @return a ConditionalAccessFilter
     */
    @jakarta.annotation.Nullable
    public ConditionalAccessFilter getDeviceFilter() {
        return this.backingStore.get("deviceFilter");
    }
    /**
     * Gets the excludeDevices property value. States excluded from the scope of the policy. Possible values: Compliant, DomainJoined. Cannot be set if deviceFIlter is set.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getExcludeDevices() {
        return this.backingStore.get("excludeDevices");
    }
    /**
     * Gets the excludeDeviceStates property value. The excludeDeviceStates property
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getExcludeDeviceStates() {
        return this.backingStore.get("excludeDeviceStates");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("deviceFilter", (n) -> { this.setDeviceFilter(n.getObjectValue(ConditionalAccessFilter::createFromDiscriminatorValue)); });
        deserializerMap.put("excludeDevices", (n) -> { this.setExcludeDevices(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("excludeDeviceStates", (n) -> { this.setExcludeDeviceStates(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("includeDevices", (n) -> { this.setIncludeDevices(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("includeDeviceStates", (n) -> { this.setIncludeDeviceStates(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the includeDevices property value. States in the scope of the policy. All is the only allowed value. Cannot be set if deviceFilter is set.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getIncludeDevices() {
        return this.backingStore.get("includeDevices");
    }
    /**
     * Gets the includeDeviceStates property value. The includeDeviceStates property
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getIncludeDeviceStates() {
        return this.backingStore.get("includeDeviceStates");
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("deviceFilter", this.getDeviceFilter());
        writer.writeCollectionOfPrimitiveValues("excludeDevices", this.getExcludeDevices());
        writer.writeCollectionOfPrimitiveValues("excludeDeviceStates", this.getExcludeDeviceStates());
        writer.writeCollectionOfPrimitiveValues("includeDevices", this.getIncludeDevices());
        writer.writeCollectionOfPrimitiveValues("includeDeviceStates", this.getIncludeDeviceStates());
        writer.writeStringValue("@odata.type", this.getOdataType());
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
     * Sets the deviceFilter property value. Filter that defines the dynamic-device-syntax rule to include/exclude devices. A filter can use device properties (such as extension attributes) to include/exclude them. Cannot be set if includeDevices or excludeDevices is set.
     * @param value Value to set for the deviceFilter property.
     */
    public void setDeviceFilter(@jakarta.annotation.Nullable final ConditionalAccessFilter value) {
        this.backingStore.set("deviceFilter", value);
    }
    /**
     * Sets the excludeDevices property value. States excluded from the scope of the policy. Possible values: Compliant, DomainJoined. Cannot be set if deviceFIlter is set.
     * @param value Value to set for the excludeDevices property.
     */
    public void setExcludeDevices(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("excludeDevices", value);
    }
    /**
     * Sets the excludeDeviceStates property value. The excludeDeviceStates property
     * @param value Value to set for the excludeDeviceStates property.
     */
    public void setExcludeDeviceStates(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("excludeDeviceStates", value);
    }
    /**
     * Sets the includeDevices property value. States in the scope of the policy. All is the only allowed value. Cannot be set if deviceFilter is set.
     * @param value Value to set for the includeDevices property.
     */
    public void setIncludeDevices(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("includeDevices", value);
    }
    /**
     * Sets the includeDeviceStates property value. The includeDeviceStates property
     * @param value Value to set for the includeDeviceStates property.
     */
    public void setIncludeDeviceStates(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("includeDeviceStates", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
}
