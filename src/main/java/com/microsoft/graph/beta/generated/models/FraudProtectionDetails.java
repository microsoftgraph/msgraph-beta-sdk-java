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
public class FraudProtectionDetails implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link FraudProtectionDetails} and sets the default values.
     */
    public FraudProtectionDetails() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link FraudProtectionDetails}
     */
    @jakarta.annotation.Nonnull
    public static FraudProtectionDetails createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new FraudProtectionDetails();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(8);
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("providerErrorMessages", (n) -> { this.setProviderErrorMessages(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("providerHttpStatusCodes", (n) -> { this.setProviderHttpStatusCodes(n.getCollectionOfPrimitiveValues(Integer.class)); });
        deserializerMap.put("providerName", (n) -> { this.setProviderName(n.getStringValue()); });
        deserializerMap.put("providerResponseTimes", (n) -> { this.setProviderResponseTimes(n.getCollectionOfPrimitiveValues(Integer.class)); });
        deserializerMap.put("providerSessionId", (n) -> { this.setProviderSessionId(n.getStringValue()); });
        deserializerMap.put("reason", (n) -> { this.setReason(n.getStringValue()); });
        deserializerMap.put("verdict", (n) -> { this.setVerdict(n.getStringValue()); });
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
     * Gets the providerErrorMessages property value. The providerErrorMessages property
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getProviderErrorMessages() {
        return this.backingStore.get("providerErrorMessages");
    }
    /**
     * Gets the providerHttpStatusCodes property value. The providerHttpStatusCodes property
     * @return a {@link java.util.List<Integer>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Integer> getProviderHttpStatusCodes() {
        return this.backingStore.get("providerHttpStatusCodes");
    }
    /**
     * Gets the providerName property value. The providerName property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getProviderName() {
        return this.backingStore.get("providerName");
    }
    /**
     * Gets the providerResponseTimes property value. The providerResponseTimes property
     * @return a {@link java.util.List<Integer>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Integer> getProviderResponseTimes() {
        return this.backingStore.get("providerResponseTimes");
    }
    /**
     * Gets the providerSessionId property value. The providerSessionId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getProviderSessionId() {
        return this.backingStore.get("providerSessionId");
    }
    /**
     * Gets the reason property value. The reason property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getReason() {
        return this.backingStore.get("reason");
    }
    /**
     * Gets the verdict property value. The verdict property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getVerdict() {
        return this.backingStore.get("verdict");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeCollectionOfPrimitiveValues("providerErrorMessages", this.getProviderErrorMessages());
        writer.writeCollectionOfPrimitiveValues("providerHttpStatusCodes", this.getProviderHttpStatusCodes());
        writer.writeStringValue("providerName", this.getProviderName());
        writer.writeCollectionOfPrimitiveValues("providerResponseTimes", this.getProviderResponseTimes());
        writer.writeStringValue("providerSessionId", this.getProviderSessionId());
        writer.writeStringValue("reason", this.getReason());
        writer.writeStringValue("verdict", this.getVerdict());
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
     * Sets the providerErrorMessages property value. The providerErrorMessages property
     * @param value Value to set for the providerErrorMessages property.
     */
    public void setProviderErrorMessages(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("providerErrorMessages", value);
    }
    /**
     * Sets the providerHttpStatusCodes property value. The providerHttpStatusCodes property
     * @param value Value to set for the providerHttpStatusCodes property.
     */
    public void setProviderHttpStatusCodes(@jakarta.annotation.Nullable final java.util.List<Integer> value) {
        this.backingStore.set("providerHttpStatusCodes", value);
    }
    /**
     * Sets the providerName property value. The providerName property
     * @param value Value to set for the providerName property.
     */
    public void setProviderName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("providerName", value);
    }
    /**
     * Sets the providerResponseTimes property value. The providerResponseTimes property
     * @param value Value to set for the providerResponseTimes property.
     */
    public void setProviderResponseTimes(@jakarta.annotation.Nullable final java.util.List<Integer> value) {
        this.backingStore.set("providerResponseTimes", value);
    }
    /**
     * Sets the providerSessionId property value. The providerSessionId property
     * @param value Value to set for the providerSessionId property.
     */
    public void setProviderSessionId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("providerSessionId", value);
    }
    /**
     * Sets the reason property value. The reason property
     * @param value Value to set for the reason property.
     */
    public void setReason(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("reason", value);
    }
    /**
     * Sets the verdict property value. The verdict property
     * @param value Value to set for the verdict property.
     */
    public void setVerdict(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("verdict", value);
    }
}
