package com.microsoft.graph.beta.models.security;

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
public class AnalyzedEmailSenderDetail implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link AnalyzedEmailSenderDetail} and sets the default values.
     */
    public AnalyzedEmailSenderDetail() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AnalyzedEmailSenderDetail}
     */
    @jakarta.annotation.Nonnull
    public static AnalyzedEmailSenderDetail createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AnalyzedEmailSenderDetail();
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
        deserializerMap.put("fromAddress", (n) -> { this.setFromAddress(n.getStringValue()); });
        deserializerMap.put("ipv4", (n) -> { this.setIpv4(n.getStringValue()); });
        deserializerMap.put("mailFromAddress", (n) -> { this.setMailFromAddress(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the fromAddress property value. The fromAddress property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFromAddress() {
        return this.backingStore.get("fromAddress");
    }
    /**
     * Gets the ipv4 property value. The ipv4 property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getIpv4() {
        return this.backingStore.get("ipv4");
    }
    /**
     * Gets the mailFromAddress property value. The mailFromAddress property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMailFromAddress() {
        return this.backingStore.get("mailFromAddress");
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("fromAddress", this.getFromAddress());
        writer.writeStringValue("ipv4", this.getIpv4());
        writer.writeStringValue("mailFromAddress", this.getMailFromAddress());
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
     * Sets the fromAddress property value. The fromAddress property
     * @param value Value to set for the fromAddress property.
     */
    public void setFromAddress(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("fromAddress", value);
    }
    /**
     * Sets the ipv4 property value. The ipv4 property
     * @param value Value to set for the ipv4 property.
     */
    public void setIpv4(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("ipv4", value);
    }
    /**
     * Sets the mailFromAddress property value. The mailFromAddress property
     * @param value Value to set for the mailFromAddress property.
     */
    public void setMailFromAddress(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("mailFromAddress", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
}
