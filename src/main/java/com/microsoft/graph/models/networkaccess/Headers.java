package com.microsoft.graph.models.networkaccess;

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
public class Headers implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new Headers and sets the default values.
     */
    public Headers() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Headers
     */
    @jakarta.annotation.Nonnull
    public static Headers createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Headers();
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
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("origin", (n) -> { this.setOrigin(n.getStringValue()); });
        deserializerMap.put("referrer", (n) -> { this.setReferrer(n.getStringValue()); });
        deserializerMap.put("xForwardedFor", (n) -> { this.setXForwardedFor(n.getStringValue()); });
        return deserializerMap;
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
     * Gets the origin property value. Represents the origin or source from which the request is being made.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOrigin() {
        return this.backingStore.get("origin");
    }
    /**
     * Gets the referrer property value. Represents the referring URL or the URL of the web page that the current request originates from.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getReferrer() {
        return this.backingStore.get("referrer");
    }
    /**
     * Gets the xForwardedFor property value. Represents the information about the client original IP address when the request passes through one or more proxy servers or load balancers.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getXForwardedFor() {
        return this.backingStore.get("xForwardedFor");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("origin", this.getOrigin());
        writer.writeStringValue("referrer", this.getReferrer());
        writer.writeStringValue("xForwardedFor", this.getXForwardedFor());
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
     * Sets the origin property value. Represents the origin or source from which the request is being made.
     * @param value Value to set for the origin property.
     */
    public void setOrigin(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("origin", value);
    }
    /**
     * Sets the referrer property value. Represents the referring URL or the URL of the web page that the current request originates from.
     * @param value Value to set for the referrer property.
     */
    public void setReferrer(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("referrer", value);
    }
    /**
     * Sets the xForwardedFor property value. Represents the information about the client original IP address when the request passes through one or more proxy servers or load balancers.
     * @param value Value to set for the xForwardedFor property.
     */
    public void setXForwardedFor(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("xForwardedFor", value);
    }
}
