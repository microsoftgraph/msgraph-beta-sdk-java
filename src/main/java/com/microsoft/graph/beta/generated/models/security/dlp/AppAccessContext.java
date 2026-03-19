package com.microsoft.graph.beta.models.security.dlp;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AppAccessContext implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link AppAccessContext} and sets the default values.
     */
    public AppAccessContext() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AppAccessContext}
     */
    @jakarta.annotation.Nonnull
    public static AppAccessContext createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AppAccessContext();
    }
    /**
     * Gets the aadSessionId property value. The aadSessionId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAadSessionId() {
        return this.backingStore.get("aadSessionId");
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
     * Gets the apiId property value. The apiId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getApiId() {
        return this.backingStore.get("apiId");
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
     * Gets the clientAppId property value. The clientAppId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getClientAppId() {
        return this.backingStore.get("clientAppId");
    }
    /**
     * Gets the clientAppName property value. The clientAppName property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getClientAppName() {
        return this.backingStore.get("clientAppName");
    }
    /**
     * Gets the correlationId property value. The correlationId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCorrelationId() {
        return this.backingStore.get("correlationId");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(8);
        deserializerMap.put("aadSessionId", (n) -> { this.setAadSessionId(n.getStringValue()); });
        deserializerMap.put("apiId", (n) -> { this.setApiId(n.getStringValue()); });
        deserializerMap.put("clientAppId", (n) -> { this.setClientAppId(n.getStringValue()); });
        deserializerMap.put("clientAppName", (n) -> { this.setClientAppName(n.getStringValue()); });
        deserializerMap.put("correlationId", (n) -> { this.setCorrelationId(n.getStringValue()); });
        deserializerMap.put("issuedAtDate", (n) -> { this.setIssuedAtDate(n.getLocalDateValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("uniqueTokenId", (n) -> { this.setUniqueTokenId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the issuedAtDate property value. The issuedAtDate property
     * @return a {@link LocalDate}
     */
    @jakarta.annotation.Nullable
    public LocalDate getIssuedAtDate() {
        return this.backingStore.get("issuedAtDate");
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
     * Gets the uniqueTokenId property value. The uniqueTokenId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUniqueTokenId() {
        return this.backingStore.get("uniqueTokenId");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("aadSessionId", this.getAadSessionId());
        writer.writeStringValue("apiId", this.getApiId());
        writer.writeStringValue("clientAppId", this.getClientAppId());
        writer.writeStringValue("clientAppName", this.getClientAppName());
        writer.writeStringValue("correlationId", this.getCorrelationId());
        writer.writeLocalDateValue("issuedAtDate", this.getIssuedAtDate());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("uniqueTokenId", this.getUniqueTokenId());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the aadSessionId property value. The aadSessionId property
     * @param value Value to set for the aadSessionId property.
     */
    public void setAadSessionId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("aadSessionId", value);
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the apiId property value. The apiId property
     * @param value Value to set for the apiId property.
     */
    public void setApiId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("apiId", value);
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
     * Sets the clientAppId property value. The clientAppId property
     * @param value Value to set for the clientAppId property.
     */
    public void setClientAppId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("clientAppId", value);
    }
    /**
     * Sets the clientAppName property value. The clientAppName property
     * @param value Value to set for the clientAppName property.
     */
    public void setClientAppName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("clientAppName", value);
    }
    /**
     * Sets the correlationId property value. The correlationId property
     * @param value Value to set for the correlationId property.
     */
    public void setCorrelationId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("correlationId", value);
    }
    /**
     * Sets the issuedAtDate property value. The issuedAtDate property
     * @param value Value to set for the issuedAtDate property.
     */
    public void setIssuedAtDate(@jakarta.annotation.Nullable final LocalDate value) {
        this.backingStore.set("issuedAtDate", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the uniqueTokenId property value. The uniqueTokenId property
     * @param value Value to set for the uniqueTokenId property.
     */
    public void setUniqueTokenId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("uniqueTokenId", value);
    }
}
