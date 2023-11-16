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
public class CorsConfiguration implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    private BackingStore BackingStore;
    /**
     * Instantiates a new CorsConfiguration and sets the default values.
     */
    public CorsConfiguration() {
        this.BackingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a CorsConfiguration
     */
    @jakarta.annotation.Nonnull
    public static CorsConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CorsConfiguration();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.BackingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the allowedHeaders property value. The request headers that the origin domain may specify on the CORS request. The wildcard character * indicates that any header beginning with the specified prefix is allowed.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getAllowedHeaders() {
        return this.BackingStore.get("allowedHeaders");
    }
    /**
     * Gets the allowedMethods property value. The HTTP request methods that the origin domain may use for a CORS request.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getAllowedMethods() {
        return this.BackingStore.get("allowedMethods");
    }
    /**
     * Gets the allowedOrigins property value. The origin domains that are permitted to make a request against the service via CORS. The origin domain is the domain from which the request originates. The origin must be an exact case-sensitive match with the origin that the user age sends to the service.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getAllowedOrigins() {
        return this.BackingStore.get("allowedOrigins");
    }
    /**
     * Gets the BackingStore property value. Stores model information.
     * @return a BackingStore
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.BackingStore;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("allowedHeaders", (n) -> { this.setAllowedHeaders(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("allowedMethods", (n) -> { this.setAllowedMethods(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("allowedOrigins", (n) -> { this.setAllowedOrigins(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("maxAgeInSeconds", (n) -> { this.setMaxAgeInSeconds(n.getIntegerValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("resource", (n) -> { this.setResource(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the maxAgeInSeconds property value. The maximum amount of time that a browser should cache the response to the preflight OPTIONS request.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getMaxAgeInSeconds() {
        return this.BackingStore.get("maxAgeInSeconds");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.BackingStore.get("odataType");
    }
    /**
     * Gets the resource property value. Resource within the application segment for which CORS permissions are granted. / grants permission for whole app segment.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getResource() {
        return this.BackingStore.get("resource");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("allowedHeaders", this.getAllowedHeaders());
        writer.writeCollectionOfPrimitiveValues("allowedMethods", this.getAllowedMethods());
        writer.writeCollectionOfPrimitiveValues("allowedOrigins", this.getAllowedOrigins());
        writer.writeIntegerValue("maxAgeInSeconds", this.getMaxAgeInSeconds());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("resource", this.getResource());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.BackingStore.set("additionalData", value);
    }
    /**
     * Sets the allowedHeaders property value. The request headers that the origin domain may specify on the CORS request. The wildcard character * indicates that any header beginning with the specified prefix is allowed.
     * @param value Value to set for the allowedHeaders property.
     */
    public void setAllowedHeaders(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.BackingStore.set("allowedHeaders", value);
    }
    /**
     * Sets the allowedMethods property value. The HTTP request methods that the origin domain may use for a CORS request.
     * @param value Value to set for the allowedMethods property.
     */
    public void setAllowedMethods(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.BackingStore.set("allowedMethods", value);
    }
    /**
     * Sets the allowedOrigins property value. The origin domains that are permitted to make a request against the service via CORS. The origin domain is the domain from which the request originates. The origin must be an exact case-sensitive match with the origin that the user age sends to the service.
     * @param value Value to set for the allowedOrigins property.
     */
    public void setAllowedOrigins(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.BackingStore.set("allowedOrigins", value);
    }
    /**
     * Sets the BackingStore property value. Stores model information.
     * @param value Value to set for the BackingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.BackingStore = value;
    }
    /**
     * Sets the maxAgeInSeconds property value. The maximum amount of time that a browser should cache the response to the preflight OPTIONS request.
     * @param value Value to set for the maxAgeInSeconds property.
     */
    public void setMaxAgeInSeconds(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("maxAgeInSeconds", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("odataType", value);
    }
    /**
     * Sets the resource property value. Resource within the application segment for which CORS permissions are granted. / grants permission for whole app segment.
     * @param value Value to set for the resource property.
     */
    public void setResource(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("resource", value);
    }
}
