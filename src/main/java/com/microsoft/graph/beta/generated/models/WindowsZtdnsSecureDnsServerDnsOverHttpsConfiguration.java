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
/**
 * Configuration settings for DNS over HTTPS (DoH) service
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WindowsZtdnsSecureDnsServerDnsOverHttpsConfiguration implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link WindowsZtdnsSecureDnsServerDnsOverHttpsConfiguration} and sets the default values.
     */
    public WindowsZtdnsSecureDnsServerDnsOverHttpsConfiguration() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link WindowsZtdnsSecureDnsServerDnsOverHttpsConfiguration}
     */
    @jakarta.annotation.Nonnull
    public static WindowsZtdnsSecureDnsServerDnsOverHttpsConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsZtdnsSecureDnsServerDnsOverHttpsConfiguration();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("httpsPort", (n) -> { this.setHttpsPort(n.getIntegerValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("queryUrl", (n) -> { this.setQueryUrl(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the httpsPort property value. Port for DoH queries (0-65535). Valid values 0 to 65535
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getHttpsPort() {
        return this.backingStore.get("httpsPort");
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
     * Gets the queryUrl property value. URL template for DoH queries
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getQueryUrl() {
        return this.backingStore.get("queryUrl");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("httpsPort", this.getHttpsPort());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("queryUrl", this.getQueryUrl());
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
     * Sets the httpsPort property value. Port for DoH queries (0-65535). Valid values 0 to 65535
     * @param value Value to set for the httpsPort property.
     */
    public void setHttpsPort(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("httpsPort", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the queryUrl property value. URL template for DoH queries
     * @param value Value to set for the queryUrl property.
     */
    public void setQueryUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("queryUrl", value);
    }
}
